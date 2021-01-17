package paul.host.iquii.common.data

import io.reactivex.Flowable
import io.reactivex.FlowableEmitter
import io.reactivex.schedulers.Schedulers
import paul.host.iquii.common.applySchedulers
import paul.host.iquii.common.createFlowable

class TopImagesDataSource {
    private lateinit var keyWordEmitter: FlowableEmitter<String>
    private val keyWordFlowable: Flowable<String> =
        createFlowable("android") { keyWordEmitter = it }.applySchedulers()

    fun setKeyWard(keyWard: String) = keyWordEmitter.onNext(keyWard)

    fun getTopImages(): Flowable<List<String>> =
        keyWordFlowable.flatMap(::getTop)
            .distinctUntilChanged()
            .map { response -> response.getImages().filter { it.isNotEmpty() && it[0] == 'h' } }

    private fun getTop(keyWard: String) = API.getTop(keyWard)
        .subscribeOn(Schedulers.io())
        .onErrorResumeNext { _: Throwable -> Flowable.just(Response()) }
}

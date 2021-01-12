package paul.host.iquii.common.data

import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import io.reactivex.subjects.BehaviorSubject

class TopImagesDataSource {
    private val keyWordSubject: BehaviorSubject<String> = BehaviorSubject.createDefault("android")

    fun setKeyWard(keyWard: String) = keyWordSubject.onNext(keyWard)

    fun getTopImages(): Flowable<List<String>> =
        keyWordSubject.toFlowable(BackpressureStrategy.LATEST)
            .flatMapSingle(API::getTop)
            .distinctUntilChanged()
            .map { response -> response.getImages().filter { it[0] == 'h' } }
}
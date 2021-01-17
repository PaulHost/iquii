package paul.host.iquii.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import paul.host.iquii.common.data.TopImagesDataSource
import timber.log.Timber

class MainViewModel : ViewModel() {
    private val topImagesDataSource = TopImagesDataSource()
    private val disposable: Disposable

    val imagesLifeData = MutableLiveData<List<String>>()

    init {
        disposable = topImagesDataSource.getTopImages()
            .subscribeOn(Schedulers.io())
            .subscribe(imagesLifeData::postValue, Timber::e)
    }

    fun setKeyWord(keyWord: String) = topImagesDataSource.setKeyWard(keyWord)

    override fun onCleared() {
        super.onCleared()
        disposable.dispose()
    }

}
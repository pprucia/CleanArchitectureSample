package pl.prucia.piotr.cleanarchitecturesample.gallery

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData

class GalleryViewModel(application: Application) : AndroidViewModel(application) {

    private val galleryUseCase = GalleryUseCase()

    fun loadPhotos(): LiveData<List<Any>> {
        return MutableLiveData<List<Any>>()
    }

}
package pl.prucia.piotr.cleanarchitecturesample.gallery

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.os.Bundle
import pl.prucia.piotr.cleanarchitecturesample.BaseFragment
import pl.prucia.piotr.cleanarchitecturesample.R

class GalleryFragment : BaseFragment() {

    private lateinit var galleryViewModel: GalleryViewModel

    override fun provideLayout() = R.layout.fragment_gallery

    override fun setupLayout(savedInstanceState: Bundle?) {
        
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        galleryViewModel = ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        galleryViewModel.loadPhotos().observe(this, Observer { photos -> onPhotosLoaded(photos) })
    }

    private fun onPhotosLoaded(photos: List<Any>?) {

    }
}

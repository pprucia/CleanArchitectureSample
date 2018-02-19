package pl.prucia.piotr.cleanarchitecturesample.gallery

import android.os.Bundle
import pl.prucia.piotr.cleanarchitecturesample.BaseActivity
import pl.prucia.piotr.cleanarchitecturesample.R

class FullscreenPhotoActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fullscreen_photo)

    }
}

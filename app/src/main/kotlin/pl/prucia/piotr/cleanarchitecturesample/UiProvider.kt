package pl.prucia.piotr.cleanarchitecturesample

import android.os.Bundle
import android.support.annotation.LayoutRes

interface UiProvider {

    @LayoutRes
    fun provideLayout(): Int

    fun setupLayout(savedInstanceState: Bundle?)

}

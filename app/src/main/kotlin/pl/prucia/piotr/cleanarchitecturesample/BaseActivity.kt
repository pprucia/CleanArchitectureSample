package pl.prucia.piotr.cleanarchitecturesample

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

@SuppressLint("Registered")
abstract class BaseActivity : AppCompatActivity(), UiProvider {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(provideLayout())
        setupLayout(savedInstanceState)
    }

    override fun setupLayout(savedInstanceState: Bundle?) {
    }
}

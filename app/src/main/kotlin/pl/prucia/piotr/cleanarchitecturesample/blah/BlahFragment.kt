package pl.prucia.piotr.cleanarchitecturesample.blah

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pl.prucia.piotr.cleanarchitecturesample.BaseFragment
import pl.prucia.piotr.cleanarchitecturesample.R

class BlahFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_blah, container, false)
    }
}
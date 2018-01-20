package pl.prucia.piotr.cleanarchitecturesample.map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pl.prucia.piotr.cleanarchitecturesample.BaseFragment
import pl.prucia.piotr.cleanarchitecturesample.R

class MapFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_map, container, false)
    }
}
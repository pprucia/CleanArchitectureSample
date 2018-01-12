package pl.prucia.piotr.cleanarchitecturesample.contacts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pl.prucia.piotr.cleanarchitecturesample.BaseFragment
import pl.prucia.piotr.cleanarchitecturesample.R

class ContactsFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_contacts, container, false)
    }
}
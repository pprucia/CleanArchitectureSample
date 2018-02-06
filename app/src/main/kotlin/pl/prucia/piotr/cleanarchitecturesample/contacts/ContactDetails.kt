package pl.prucia.piotr.cleanarchitecturesample.contacts

import android.os.Bundle
import android.os.PersistableBundle
import pl.prucia.piotr.cleanarchitecturesample.BaseActivity
import pl.prucia.piotr.cleanarchitecturesample.R

class ContactDetails : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_contact_details)
    }

}

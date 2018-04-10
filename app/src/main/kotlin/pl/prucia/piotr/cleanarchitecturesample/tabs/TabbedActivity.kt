package pl.prucia.piotr.cleanarchitecturesample.tabs

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import kotlinx.android.synthetic.main.activity_tabbed.*
import pl.prucia.piotr.cleanarchitecturesample.BaseActivity
import pl.prucia.piotr.cleanarchitecturesample.R
import pl.prucia.piotr.cleanarchitecturesample.map.MapFragment
import pl.prucia.piotr.cleanarchitecturesample.contacts.ContactsFragment
import pl.prucia.piotr.cleanarchitecturesample.gallery.GalleryFragment

class TabbedActivity : BaseActivity() {

    override fun provideLayout() = R.layout.activity_tabbed

    override fun setupLayout(savedInstanceState: Bundle?) {
        pager.adapter = SectionsPagerAdapter(supportFragmentManager)
        pager.addOnPageChangeListener(onPageChangeListener)
        navigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }

    private class SectionsPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
        private val pagerFragments = listOf(ContactsFragment(), GalleryFragment(), MapFragment())

        override fun getItem(position: Int): Fragment {
            return pagerFragments[position]
        }

        override fun getCount(): Int {
            return pagerFragments.size
        }
    }

    private val onPageChangeListener = object : ViewPager.OnPageChangeListener {
        override fun onPageScrollStateChanged(state: Int) = Unit
        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) = Unit
        override fun onPageSelected(position: Int) {
            navigation.selectedItemId = navigation.menu.getItem(position).itemId
        }
    }

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_contacts -> {
                pager.currentItem = 0
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_gallery -> {
                pager.currentItem = 1
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_map -> {
                pager.currentItem = 2
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}

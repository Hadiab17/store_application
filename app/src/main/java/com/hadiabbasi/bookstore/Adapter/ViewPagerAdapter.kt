package com.hadiabbasi.bookstore.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


//this class is for adding title and fragments to our viewPager

class ViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {

    val names: ArrayList<String> = arrayListOf()
    val fragments: ArrayList<Fragment> = arrayListOf()

    fun setData(name: String, fragment: Fragment): Unit{
        names.add(name)
        fragments.add(fragment)
    }

    override fun getItemCount(): Int {
        return names.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}
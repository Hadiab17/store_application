package com.hadiabbasi.bookstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import com.google.android.material.tabs.TabLayoutMediator
import com.hadiabbasi.bookstore.Adapter.ViewPagerAdapter
import com.hadiabbasi.bookstore.Fragments.*
import com.hadiabbasi.bookstore.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    val adapter = ViewPagerAdapter(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)




        //set data adapter
        setDataAdapter()


        //set on click listener for qr button

        binding.qrButton.setOnClickListener {
            val bottom_sheet = FragmentQr()
            bottom_sheet.show(supportFragmentManager, null)
        }

        //set on click listener for notification button
        binding.notificationBtn.setOnClickListener {
            val alert = FragmentMessage()
            alert.show(supportFragmentManager, null)
        }

        //set toggle for tool bar menu item
        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            binding.toolBar,
            R.string.open_drawer,
            R.string.close_drawer
        )

        //set toggle to drawer
        binding.drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

    }

    //set tabs title and viewPagers fragment
    private fun setDataAdapter(): Unit{
        adapter.setData("Bussiness", FragmentBussines())
        adapter.setData("Design", FragmentDesign())
        binding.viewPager.adapter = adapter
        TabLayoutMediator(binding.tabs, binding.viewPager, {tab, pos ->
            tab.text = adapter.names[pos]
        }).attach()
    }


}
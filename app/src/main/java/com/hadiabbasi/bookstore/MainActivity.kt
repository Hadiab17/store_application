package com.hadiabbasi.bookstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hadiabbasi.bookstore.databinding.ActivityHomeBinding
import com.hadiabbasi.bookstore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //set listener for button to take us to next activity
        binding.loginBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, HomeActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or  Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }

    }
}
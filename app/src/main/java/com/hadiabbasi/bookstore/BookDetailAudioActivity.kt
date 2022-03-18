package com.hadiabbasi.bookstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hadiabbasi.bookstore.databinding.ActivityBookAudioDetailBinding
import com.squareup.picasso.Picasso

class BookDetailAudioActivity : AppCompatActivity() {
    lateinit var binding: ActivityBookAudioDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookAudioDetailBinding.inflate(layoutInflater)
        setContentView( binding.root )


        //set data on book detail audio book activity
        setData()

    }

    //set data from fragment
    private fun setData(): Unit {
        binding.bookName.text = intent.getStringExtra("book_name")
        binding.authorName.text = intent.getStringExtra("book_author")
        Picasso.get()
            .load(intent.getStringExtra("book_image"))
            .fit()
            .into(binding.bookImage)
        Picasso.get()
            .load(intent.getStringExtra("book_image"))
            .fit()
            .into(binding.cardBookImage)

        binding.forwardBtn.setOnClickListener {
            onBackPressed()
        }

    }
}
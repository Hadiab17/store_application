package com.hadiabbasi.bookstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hadiabbasi.bookstore.databinding.ActivityBookDetailBinding
import com.squareup.picasso.Picasso

class BookDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBookDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //when click on forward button , onBackPressed invoke
        binding.forwardBtn.setOnClickListener {
            onBackPressed()
        }
        //set data from fragment (Home activity) to Book detail activity
        setData()
    }

    private fun setData(){
        binding.bookName.text = intent.getStringExtra("book_name")
        binding.authorName.text = intent.getStringExtra("book_author")
        binding.bookPageNumber.text = intent.getStringExtra("book_page")
        binding.bookRatingNumber.text = intent.getStringExtra("book_rate")
        binding.bookPrice.text = intent.getStringExtra("book_price")
        Picasso.get()
            .load(intent.getStringExtra("book_image"))
            .fit()
            .into(binding.bookImage)
        Picasso.get()
            .load(intent.getStringExtra("book_image"))
            .fit()
            .into(binding.cardBookImage)
    }

}
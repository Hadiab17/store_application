package com.hadiabbasi.bookstore.Model

data class Book(
    val book_name: String,
    val book_author: String,
    val book_dsc: String,
    val book_rate: String,
    val book_price: String,
    val page_number: Int,
    val image_url: String
)

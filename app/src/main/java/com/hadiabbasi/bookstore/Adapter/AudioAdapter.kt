package com.hadiabbasi.bookstore.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hadiabbasi.bookstore.BookDetailActivity
import com.hadiabbasi.bookstore.BookDetailAudioActivity
import com.hadiabbasi.bookstore.Model.Book
import com.hadiabbasi.bookstore.R
import com.squareup.picasso.Picasso

class AudioAdapter(val data: ArrayList<Book>, val context: Context): RecyclerView.Adapter<AudioAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val book_image = itemView.findViewById<ImageView>(R.id.book_image)
        val book_name = itemView.findViewById<TextView>(R.id.book_name)
        val author_name = itemView.findViewById<TextView>(R.id.author_name)
        val rating_bar = itemView.findViewById<RatingBar>(R.id.rating_bar)


        //set data for each recyclerView items
        fun setData(): Unit{
            Picasso.get()
                .load(data[adapterPosition].image_url)
                .fit()
                .error(R.drawable.ic_launcher_background)
                .into(book_image)
            book_name.text = data[adapterPosition].book_name
            author_name.text = data[adapterPosition].book_author
            rating_bar.rating = data[adapterPosition].book_rate.toFloat()

            //send data to book detail activity from home activity
            itemView.setOnClickListener {
                val intent = Intent(context, BookDetailAudioActivity::class.java)
                intent.putExtra("book_name", data[adapterPosition].book_name)
                intent.putExtra("book_author", data[adapterPosition].book_author)
                intent.putExtra("book_price", data[adapterPosition].book_price)
                intent.putExtra("book_rate", data[adapterPosition].book_rate)
                intent.putExtra("book_page", data[adapterPosition].page_number.toString())
                intent.putExtra("book_dsc", data[adapterPosition].book_dsc)
                intent.putExtra("book_image", data[adapterPosition].image_url)
                context.startActivity(intent)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_book_audio, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData()
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
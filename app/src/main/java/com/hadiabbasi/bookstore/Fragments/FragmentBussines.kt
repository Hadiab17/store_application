package com.hadiabbasi.bookstore.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hadiabbasi.bookstore.Adapter.AudioAdapter
import com.hadiabbasi.bookstore.Adapter.BookAdapter
import com.hadiabbasi.bookstore.Model.Book
import com.hadiabbasi.bookstore.databinding.BusinessFragmentBinding

class FragmentBussines(): Fragment() {

    lateinit var binding: BusinessFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = BusinessFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        //set Books to recyclerView
        setBookRecData(setBookData())

        //set audio books to audio book recyclerView
        setAudioRecData(setAudioBookData())

        super.onViewCreated(view, savedInstanceState)
    }

    //set audio book adapter
    private  fun setAudioRecData(audioBookList: ArrayList<Book>): Unit{
        val audioAdapter =  AudioAdapter(audioBookList,requireContext())
        binding.audioBookRec.adapter = audioAdapter
        binding.audioBookRec.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)

    }

    //create audio book list
    private fun setAudioBookData(): ArrayList<Book>{
        val audioBookList: ArrayList<Book> = arrayListOf()
        audioBookList.add(Book("Rich Dad Poor Dad","Robert T.Kiosaky","","4.5","$12",241,"https://files.virgool.io/upload/users/16930/posts/rb8pjnxz4zjj/ihihqutheff9.jpeg"))
        audioBookList.add(Book("The Learn Startup","Eric Rics","","4.2","$18",297,"https://m.media-amazon.com/images/I/81j0RhrgNNL._AC_UY218_.jpg"))
        audioBookList.add(Book("The 4-Hour Work Week","Timothy Ferriss ","","4.8","$14",327,"https://m.media-amazon.com/images/I/81rk6ArxUbL._AC_UY218_.jpg"))
        audioBookList.add(Book("Think and Grow Rich","Napoleon Hill ","","4.2","$6",254,"https://m.media-amazon.com/images/I/81xwDfU-LNL._AC_UY218_.jpg"))
        audioBookList.add(Book("Exploring the Power of Habit","Campbell Charity","","3.9","$5",163,"https://m.media-amazon.com/images/I/61FTRW7EQqL._AC_UY218_.jpg"))
        return audioBookList
    }


    //set book adapter
    fun setBookRecData(bookList: ArrayList<Book>): Unit{
        val book_adpter = BookAdapter(bookList, requireContext())
        binding.bookRec.adapter = book_adpter
        binding.bookRec.layoutManager = GridLayoutManager(requireContext(),2)
    }

    //create book list
    private fun setBookData(): ArrayList<Book>{
        var bookList: ArrayList<Book> = arrayListOf()
        bookList.add(Book("Rich Dad Poor Dad","Robert T.Kiosaky","","4.5","$12",241,"https://files.virgool.io/upload/users/16930/posts/rb8pjnxz4zjj/ihihqutheff9.jpeg"))
        bookList.add(Book("The Learn Startup","Eric Rics","","4.2","$18",297,"https://m.media-amazon.com/images/I/81j0RhrgNNL._AC_UY218_.jpg"))
        bookList.add(Book("The 4-Hour Work Week","Timothy Ferriss ","","4.8","$14",327,"https://m.media-amazon.com/images/I/81rk6ArxUbL._AC_UY218_.jpg"))
        bookList.add(Book("Think and Grow Rich","Napoleon Hill ","","4.2","$6",254,"https://m.media-amazon.com/images/I/81xwDfU-LNL._AC_UY218_.jpg"))
        bookList.add(Book("Exploring the Power of Habit","Campbell Charity","","3.9","$5",163,"https://m.media-amazon.com/images/I/61FTRW7EQqL._AC_UY218_.jpg"))
        bookList.add(Book("The Subtle Art of Not Giving a F*ck"," Mark Manson, Roger Wayne, et al.","","4.8","$6",347,"https://m.media-amazon.com/images/I/61pX4Vpr9VL._AC_UY218_.jpg"))
        return bookList
    }


}


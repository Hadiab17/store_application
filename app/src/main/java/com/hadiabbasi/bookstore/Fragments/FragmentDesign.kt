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
import com.hadiabbasi.bookstore.databinding.DesignFragmentBinding

class FragmentDesign(): Fragment() {

    lateinit var binding: DesignFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DesignFragmentBinding.inflate(layoutInflater)
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
    private fun setAudioRecData(audioBookList: ArrayList<Book>){
        val audioAdapter =  AudioAdapter(audioBookList, requireContext())
        binding.audioBookRec.adapter = audioAdapter
        binding.audioBookRec.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)

    }

    //create audio book list
    private fun setAudioBookData(): ArrayList<Book>{
        var audioBookList: ArrayList<Book> = arrayListOf()
        audioBookList.add(Book("To engineer is human","Henry Petroski","","4.5","$12",241,"https://m.media-amazon.com/images/I/31x+XYlbUWL.jpg"))
        audioBookList.add(Book("Inspired","Marty Cagan ","","4.2","$18",297,"https://m.media-amazon.com/images/I/41iRRYgWxYL._SL500_.jpg"))
        audioBookList.add(Book("How Innovation Works","Matt Ridley","","4.8","$14",327,"https://m.media-amazon.com/images/I/41+9XUzKxaL._SL500_.jpg"))
        audioBookList.add(Book("The Lean Product Playbook","Dan Olsen","","4.2","$6",254,"https://m.media-amazon.com/images/I/51iUVNqw0pL._SL500_.jpg"))
        return audioBookList
    }


    //set book adapter
    fun setBookRecData(bookList: ArrayList<Book>){
        val book_adpter = BookAdapter(bookList, requireContext())
        binding.bookRec.adapter = book_adpter
        binding.bookRec.layoutManager = GridLayoutManager(context,2)
    }

    //create book list
    private fun setBookData(): ArrayList<Book>{
        var bookList: ArrayList<Book> = arrayListOf()
        var audioBookList: ArrayList<Book> = arrayListOf()
        bookList.add(Book("Designer Maker User","The Design Museum ","","4.5","$14.95",241,"https://www.phaidon.com/images/9780714872520/listing-desktop-x1-webp/9780714872520.webp"))
        bookList.add(Book("Universal Design Studio"," Edward Barber","","4.2","$59",297,"https://www.phaidon.com/images/9781838663056/main-desktop-x1-webp/9781838663056.webp"))
        bookList.add(Book("By Design","Phaidon editors ","","4.8","$14",327,"https://www.phaidon.com/images/9781838661878/main-desktop-x1-webp/9781838661878.webp"))
        bookList.add(Book("California: Designing Freedom","Justin McGuirk","","4.2","$25",254,"https://www.phaidon.com/images/9780714874234/main-desktop-x1-webp/9780714874234.webp"))
        bookList.add(Book("Partners in Design","Alfred H. Barr Jr. and Philip Johnson ","","3.9","$40",163,"https://www.phaidon.com/images/9781580934336c/main-desktop-x1-webp/9781580934336c.webp"))
        bookList.add(Book("The Design Book","Phaidon Editors","","4.8","$16",347,"https://www.phaidon.com/images/9781838661434/main-desktop-x1-webp/9781838661434.webp"))
        return bookList
    }
}
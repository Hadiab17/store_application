package com.hadiabbasi.bookstore.Fragments

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.hadiabbasi.bookstore.R
import com.hadiabbasi.bookstore.databinding.MessageAlertDialogBinding

class FragmentMessage(): DialogFragment() {

    //use view Binding
    private lateinit var messageBinding: MessageAlertDialogBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        //create message alert dialog
        messageBinding = MessageAlertDialogBinding.inflate(layoutInflater, null, false)
        val alert = AlertDialog.Builder(context)
        alert.setView(messageBinding.root)
        messageBinding.closeButton.setOnClickListener {
            Toast.makeText(context, "hello", Toast.LENGTH_SHORT).show()
            dismiss()
        }
        return alert.create()
    }

}
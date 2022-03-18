package com.hadiabbasi.bookstore.Fragments

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.hadiabbasi.bookstore.databinding.QrBottomSheetBinding

class FragmentQr() : BottomSheetDialogFragment() {

    lateinit var binding: QrBottomSheetBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = QrBottomSheetBinding.inflate(layoutInflater, null, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.forwardBtn.setOnClickListener {
            dismiss()
        }
        super.onViewCreated(view, savedInstanceState)
    }
}
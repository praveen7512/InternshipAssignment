package com.example.internshipassignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheet2:BottomSheetDialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= LayoutInflater.from(context).inflate(R.layout.bottonsheet2,container,false)
        return view
    }

    override fun getTheme(): Int {
        return R.style.AppBottomSheetDialogTheme
    }
}
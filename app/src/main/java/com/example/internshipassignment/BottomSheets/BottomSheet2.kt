package com.example.internshipassignment.BottomSheets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.internshipassignment.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class BottomSheet2:BottomSheetDialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //this will inflate the fragmentlaqyout
        val view= LayoutInflater.from(context).inflate(R.layout.bottomsheet2_additional,container,false)
        return view
    }


    //this function will set the background of bottomsheet
    override fun getTheme(): Int {
        return R.style.AppBottomSheetDialogTheme
    }
}
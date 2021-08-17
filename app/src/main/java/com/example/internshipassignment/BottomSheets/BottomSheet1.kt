package com.example.internshipassignment.BottomSheets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.internshipassignment.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottomsheet1.view.*

class BottomSheet1: BottomSheetDialogFragment() {



    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        //this will inflate the fragmentlaqyout
       val view= LayoutInflater.from(context).inflate(R.layout.bottomsheet1,container,false)

        view.bottomsheetbtn.setOnClickListener {


            val bottomSheet2= BottomSheet2()
            bottomSheet2.show((activity as AppCompatActivity).supportFragmentManager,"HIII")

        }

        return view
    }


   //this function will set the background of bottomsheet
    override fun getTheme(): Int {
        return R.style.AppBottomSheetDialogTheme
    }






}
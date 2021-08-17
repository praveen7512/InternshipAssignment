package com.example.internshipassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


      // this function will set the click on the mainactivty button
        setbutton()




    }

    fun setbutton(){

        Openbtn.setOnClickListener {


            val bottomSheet1=BottomSheet1()
            bottomSheet1.show(supportFragmentManager,"hi imthe bottom sheet")

        }
    }
}
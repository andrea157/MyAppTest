package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData

class MainActivity : AppCompatActivity() {

    val liveData: MutableLiveData<String?> = MutableLiveData()

    var label: CharSequence? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        liveData.observe(this, ::label.setter)

        liveData.value = "Test"
    }

}

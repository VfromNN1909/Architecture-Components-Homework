package com.epam.navigationproject.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.epam.navigationproject.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.firstName
import kotlinx.android.synthetic.main.activity_main.lastName
import kotlinx.android.synthetic.main.fragment_create_profile.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Profile"


        firstName.text = intent.getStringExtra("first_name")
        lastName.text = intent.getStringExtra("last_name")
        phone.text = intent.getStringExtra("phone_number")
    }
}
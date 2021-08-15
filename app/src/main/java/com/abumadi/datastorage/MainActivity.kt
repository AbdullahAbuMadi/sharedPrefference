package com.abumadi.datastorage

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sharedPreferencesName = getSharedPreferences("MyUserName", Context.MODE_PRIVATE)
        var sharedPreferencesPassword = getSharedPreferences("MyPassword", Context.MODE_PRIVATE)
        Toast.makeText(this, "Data successfully Loaded ", Toast.LENGTH_SHORT).show()

        textView.text = sharedPreferencesName.getString("user_name","None")
        textView2.text = sharedPreferencesPassword.getString("pass_word","None")




    }
}
package com.abumadi.datastorage

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        /////test test test

        SignIn_Btn.setOnClickListener {

            var sharedPreferencesName = getSharedPreferences("MyUserName", Context.MODE_PRIVATE)
            var sharedPreferencesPassword = getSharedPreferences("MyPassword", Context.MODE_PRIVATE)

            Toast.makeText(this, "Data successfully saved ", Toast.LENGTH_SHORT).show()

            sharedPreferencesName.edit().putString("user_name", editTextLogIn.text.toString())
                .apply()//or . commit
            sharedPreferencesPassword.edit().putString("pass_word", editTextPassWord.text.toString())
                .apply()

            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}

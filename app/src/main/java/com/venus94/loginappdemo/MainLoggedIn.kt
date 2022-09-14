package com.venus94.loginappdemo

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.venus94.loginappdemo.databinding.ActivityMainLoggedInBinding


class MainLoggedIn : AppCompatActivity() {
    lateinit var binding: ActivityMainLoggedInBinding
    lateinit var prefences: SharedPreferences

    prefences = getSharedPreferences("bilgiler",MODE_PRIVATE)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainLoggedInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var loggedInuser = prefences.getString("userId", "")
        var loggedInPsswrd = prefences.getString("password", "")

        /*loggenIntextUserId ve loggenIntextPsswrd*/

        binding.LoggenIntextUserId.text = "User ID + $loggedInuser".toString()
        binding.LoggenIntextPsswrd.text = "User password + $loggedInPsswrd".toString()


        binding.LoggedInbttnBack.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
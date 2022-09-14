package com.venus94.loginappdemo

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.venus94.loginappdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var prefences: SharedPreferences

    prefences = getSharedPreferences ("bilgiler",MODE_PRIVATE)

    override fun onCreate(savedInstanceState: Bundle?) {
        val onCreate = super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.LoginbttnLogin.setOnClickListener {
            var userdata = prefences.getString("userId", "")
            var userPdata = prefences.getString("password", "")

            var loginiddata = binding.LogintexteditUserId.text.toString()
            var loginPassworddata = binding.LogintexteditPsswrd.text.toString()

            if (loginiddata == userdata && loginPassworddata == userPdata) {
                val intent = Intent(this, MainLoggedIn::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Your id or password is wrong", Toast.LENGTH_LONG).show()
            }
        }
        binding.Loginbttnsignup.setOnClickListener {
            intent = Intent(this, MainSignUp::class.java)
            startActivity(intent) }

    }
}

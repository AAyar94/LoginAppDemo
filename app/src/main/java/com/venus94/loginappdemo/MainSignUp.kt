package com.venus94.loginappdemo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.venus94.loginappdemo.databinding.ActivityMainSignUpBinding

class MainSignUp : AppCompatActivity() {
    lateinit var binding: ActivityMainSignUpBinding
    @SuppressLint("CommitPrefEdits")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainSignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.signupbttnsignup.setOnClickListener {
            var userId = binding.signuptexteditUserId.text.toString()
            var password = binding.signuptexteditPsswrd.text.toString()
            var sharedPreferences = getSharedPreferences("bilgiler", MODE_PRIVATE)
            var editor = sharedPreferences.edit()

            editor.putString("userIdkayıt","$userId").apply()
            editor.putString("passwordkayıt","$password").apply()
            Toast.makeText(applicationContext,"You are signed now!",Toast.LENGTH_LONG).show()
            binding.signuptexteditUserId .text.clear()
            binding.signuptexteditPsswrd.text.clear()

        }

        binding.signupbttnback.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }

}
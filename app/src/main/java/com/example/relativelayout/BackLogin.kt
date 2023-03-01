package com.example.relativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.relativelayout.databinding.ActivityBackLoginBinding
import com.example.relativelayout.databinding.ActivityMainBinding

class BackLogin : AppCompatActivity() {

    lateinit var binding: ActivityBackLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBackLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            if(binding.etEmail.text.isEmpty())
            {
                binding.etEmail.setError("Enter Email")

            }
            else if(binding.etPass.text.isEmpty())
            {
                binding.etPass.setError("Enter Password")
            }
            else
            {
                Toast.makeText(applicationContext,"Login", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}
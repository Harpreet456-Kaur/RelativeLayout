package com.example.relativelayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.EditText
import com.example.relativelayout.databinding.ActivityBackLoginBinding
import com.example.relativelayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegister.setOnClickListener {
            if (binding.etName.text.isEmpty()) {
                binding.etName.error = "Enter your name"
            } else if (binding.etPhone.text.isEmpty()) {
                binding.etPhone.error = "Enter your Contact"
            } else if (binding.etPass.text.isEmpty()) {
                binding.etPass.error = "Enter your Password"
            } else if (binding.etConfirm.text.isEmpty()) {
                binding.etConfirm.error = "Enter your Confirm Password"
            } else if (binding.tvGender.text.isEmpty()) {
                binding.tvGender.error = "Select Gender"
            }
            else if(binding.etConfirm.text.toString().equals(binding.etPass.text.toString())==false){
                binding.etConfirm.error="Confirm password is not same"
            }else {
                intent=Intent(this,BackLogin::class.java)
                startActivity(intent)
            }
        }
    }
}
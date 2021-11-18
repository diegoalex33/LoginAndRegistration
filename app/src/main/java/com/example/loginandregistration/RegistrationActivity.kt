package com.example.loginandregistration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginandregistration.databinding.ActivityLoginBinding
import com.example.loginandregistration.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_login)

        val username = intent.getStringExtra(LoginActivity.EXTRA_USERNAME)
        val password = intent.getStringExtra(LoginActivity.EXTRA_PASSWORD)
        Toast.makeText(this, "user:$username pwd:$password", Toast.LENGTH_SHORT).show()

    }
}
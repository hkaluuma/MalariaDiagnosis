package com.example.malariadiagnosis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.malariadiagnosis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //my new variables
    private lateinit var binding:ActivityMainBinding
    lateinit var username: EditText
    lateinit var password: EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //new codes start here
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener(View.OnClickListener {
            if(binding.username.text.toString()=="user"&& binding.password.text.toString()=="1234"){
                Toast.makeText(this,"Login Successful", Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this, "Login failed.", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
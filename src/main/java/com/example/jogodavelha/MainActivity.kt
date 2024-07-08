package com.example.jogodavelha


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jogodavelha.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSinglePlayer.setOnClickListener {
            val intent = Intent(this, GameActivity ::class.java)
            startActivity(intent)
        }

        binding.btnVsComputer.setOnClickListener {
            val intent = Intent(this, MaquinaActivity::class.java)
            startActivity(intent)



        }
    }
}

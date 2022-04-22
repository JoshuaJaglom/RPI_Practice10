package com.zhukov.practice3_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhukov.practice3_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var viewModel = MainViewModel.getMyViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
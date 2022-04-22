package com.zhukov.rpi_practice10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.zhukov.rpi_practice10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val provider = ViewModelProvider(this)
        viewModel = provider.get(MainViewModel::class.java)

        viewModel.check.observe(this) {
            if (it == true) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.blueFragmentFrame, RedFragment())
                    .commit()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.redFragmentFrame, BlueFragment())
                    .commit()
            } else {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.blueFragmentFrame, BlueFragment())
                    .commit()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.redFragmentFrame, RedFragment())
                    .commit()
            }
        }

        binding.swapFragment.setOnClickListener {
            viewModel.changeValue()
        }
    }
}
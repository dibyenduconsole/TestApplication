package com.dotexe.app.testapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.dotexe.app.testapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(">>MainActivity","--onCreate")
        viewModel = ViewModelProvider(this, MainViewModelFactory()).get(MainViewModel::class.java)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        viewModel.counterLiveData.observe(this, Observer {
            binding.tvCounter.text  = "$it"
        })

        binding.btnCounter.setOnClickListener {
            viewModel.updateCounter()
        }

    }




    override fun onStart() {
        super.onStart()
        Log.d(">>MainActivity","--onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(">>MainActivity","--onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(">>MainActivity","--onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(">>MainActivity","--onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(">>MainActivity","--onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(">>MainActivity","--onDestroy")
    }
}
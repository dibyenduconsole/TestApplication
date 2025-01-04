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
import com.dotexe.app.testapplication.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding
    lateinit var viewModel: SecondViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this, SecondViewModelFactory()).get(SecondViewModel::class.java)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(">>SecondActivity","--onCreate")

        viewModel.counterLiveData.observe(this, Observer {
            binding.tvCounter.text  = "$it"
        })

        binding.btnCounter.setOnClickListener {
            viewModel.updateCounter()
        }


    }




    override fun onStart() {
        super.onStart()
        Log.d(">>SecondActivity","--onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(">>SecondActivity","--onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(">>SecondActivity","--onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(">>SecondActivity","--onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(">>SecondActivity","--onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(">>SecondActivity","--onDestroy")
    }
}
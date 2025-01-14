package com.dotexe.app.testapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dotexe.app.testapplication.databinding.FragmentCBinding

class FragmentC : Fragment() {
    
    
    lateinit var binding: FragmentCBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(">>","FragmentC-  onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d(">>","FragmentC-  onCreateView")
        binding = FragmentCBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(">>","FragmentC-  onViewCreated")

    }

    override fun onStart() {
        super.onStart()
        Log.d(">>","FragmentC-  onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(">>","FragmentC-  onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(">>","FragmentC-  onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(">>","FragmentC-  onStop")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(">>","FragmentC-  onAttach")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(">>","FragmentC-  onDetach")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(">>","FragmentC-  onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(">>","FragmentC-  onDestroyView")
    }
}
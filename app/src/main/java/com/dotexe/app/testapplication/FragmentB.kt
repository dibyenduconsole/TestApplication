package com.dotexe.app.testapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.dotexe.app.testapplication.databinding.FragmentBBinding

class FragmentB : Fragment() {
   
    lateinit var binding: FragmentBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(">>","FragmentB-  onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d(">>","FragmentB-  onCreateView")
        binding = FragmentBBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(">>","FragmentB-  onViewCreated")


        binding.btnNext.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragmentB_to_fragmentC)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(">>","FragmentB-  onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(">>","FragmentB-  onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(">>","FragmentB-  onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(">>","FragmentB-  onStop")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(">>","FragmentB-  onAttach")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(">>","FragmentB-  onDetach")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(">>","FragmentB-  onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(">>","FragmentB-  onDestroyView")
    }
    
}
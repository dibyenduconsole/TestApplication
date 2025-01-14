package com.dotexe.app.testapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.dotexe.app.testapplication.databinding.FragmentABinding

class FragmentA : Fragment() {


    lateinit var binding: FragmentABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(">>","FragmentA-  onCreate")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d(">>","FragmentA-  onCreateView")
        binding = FragmentABinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(">>","FragmentA-  onViewCreated")


        binding.btnNext.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragmentA_to_fragmentB)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(">>","FragmentA-  onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(">>","FragmentA-  onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(">>","FragmentA-  onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(">>","FragmentA-  onStop")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(">>","FragmentA-  onAttach")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(">>","FragmentA-  onDetach")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(">>","FragmentA-  onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(">>","FragmentA-  onDestroyView")
    }


}
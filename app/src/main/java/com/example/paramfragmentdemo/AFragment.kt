package com.example.paramfragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.paramfragmentdemo.databinding.FragmentABinding

class AFragment : Fragment() {

    private lateinit var binding:FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_a, container, false)

        binding.btnSend.setOnClickListener(){
            val name = binding.tfName.text.toString()

            val action = AFragmentDirections.actionAFragmentToBFragment(name)

            Navigation.findNavController(it).navigate(action)

        }

        return binding.root
    }
}
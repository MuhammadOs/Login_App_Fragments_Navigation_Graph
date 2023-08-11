package com.example.loginapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class First_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first_, container, false)

        val button = view.findViewById<Button>(R.id.SignUp_Btn)

        button.setOnClickListener {
         findNavController().navigate(R.id.action_first_Fragment_to_second_Fragment)
        }
        return view
    }
}
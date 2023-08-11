package com.example.loginapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class Second_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_second_, container, false)

        val loginButton = view.findViewById<Button>(R.id.Login_Btn)

        loginButton.setOnClickListener{
            findNavController().navigate(R.id.action_second_Fragment_to_first_Fragment)
        }


        val backButton = view.findViewById<Button>(R.id.back_btn)

        backButton.setOnClickListener{
            findNavController().navigate(R.id.action_second_Fragment_to_first_Fragment)
        }


        return view
    }

}
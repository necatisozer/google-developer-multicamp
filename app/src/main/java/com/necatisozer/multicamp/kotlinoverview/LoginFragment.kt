package com.necatisozer.multicamp.kotlinoverview

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.activity_login.*

class LoginFragment : Fragment(R.layout.fragment_login) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonLogin.setOnClickListener {
            val name = editTextUsername.text.toString()
            val destination = LoginFragmentDirections.actionLoginFragmentToHomeFragment(name)
            findNavController().navigate(destination)
        }
    }
}
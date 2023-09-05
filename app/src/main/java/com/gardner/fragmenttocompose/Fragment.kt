package com.gardner.fragmenttocompose

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Fragment : Fragment(R.layout.fragment) {
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        val button: Button = view.findViewById(R.id.navigateButton)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_to_composableScreenFragment)
        }
    }
}

package com.example.qa.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.qa.R

class LastFragment : Fragment(R.layout.fragment_bolo){

    lateinit var finish1 : TextView
    lateinit var finish2 : TextView
    lateinit var finish3 : TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        finish1 = view.findViewById(R.id.last3)
        finish2 = view.findViewById(R.id.last2)
        finish3 = view.findViewById(R.id.last1)

        finish1.text = LastFragmentArgs.fromBundle(requireArguments()).number.toString()
        finish2.text = LastFragmentArgs.fromBundle(requireArguments()).number2.toString()
        finish3.text = LastFragmentArgs.fromBundle(requireArguments()).number3.toString()

    }

}


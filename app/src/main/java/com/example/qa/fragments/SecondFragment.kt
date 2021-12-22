package com.example.qa.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.qa.R

class SecondFragment : Fragment(R.layout.fragment_meoregverdi) {

    lateinit var question2 : TextView
    lateinit var answer2 : EditText
    lateinit var button2 : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        question2 = view.findViewById(R.id.sworiPasuxi3)
        answer2 = view.findViewById(R.id.answer2)
        button2 = view.findViewById(R.id.nextQuestion2)
        val navController = Navigation.findNavController(view)
        button2.setOnClickListener{
            val answer = answer2.text.toString()
            if (answer.isEmpty()){
                return@setOnClickListener
            }
            val answer4 = answer.toString()
            val android1 = SecondFragmentArgs.fromBundle(requireArguments()).erti.toString()
            val android2 = SecondFragmentArgs.fromBundle(requireArguments()).ori.toString()
            val action = SecondFragmentDirections.actionQuestionFragment2ToFinalFragment(answer4, android1, android2)
            navController.navigate(action)
        }

    }

}
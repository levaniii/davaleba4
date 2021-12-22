package com.example.qa.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.qa.R

class FirstFragment : Fragment(R.layout.fragment_pirveligverdi){

    lateinit var question1 : TextView
    lateinit var answer1 : EditText
    lateinit var question3 : TextView
    lateinit var answer3 : EditText
    lateinit var button1 : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        question1 = view.findViewById(R.id.sworiPasuxi2)
        answer1 = view.findViewById(R.id.answer)
        question3 = view.findViewById(R.id.kitxva3)
        answer3 = view.findViewById(R.id.answer3)
        button1 = view.findViewById(R.id.nextQuestion)

        val navController = Navigation.findNavController(view)

        button1.setOnClickListener {

            val answer = answer1.text.toString()

            val android = answer3.text.toString()

            if (answer.isEmpty()){

                return@setOnClickListener

            }

            if (android.isEmpty()){

                return@setOnClickListener

            }

            val answer2 = answer.toString()

            val android2 = android.toString()

            val action = FirstFragmentDirections.actionQuestionFragment1ToQuestionFragment2(answer2, android2)

            navController.navigate(action)

        }

    }

}
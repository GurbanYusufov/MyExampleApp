package com.yusufov.myexampleapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment

class DialogQuestion:DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View?{
        val view = inflater.inflate(R.layout.dialog_question,container,false)

        val button = view.findViewById<Button>(R.id.btnBagisla)
        button.setOnClickListener{
            dismiss()
        }
        return view
    }

}
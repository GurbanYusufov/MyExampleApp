package com.yusufov.myexampleapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment

class DialogQuestion:DialogFragment() {
    private lateinit var osiris : OsirisActivity

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View?{

        val view = inflater.inflate(R.layout.dialog_question,container,false)
        osiris = (requireActivity() as OsirisActivity)
        val button = view.findViewById<Button>(R.id.btnBagisla)

        button.setOnClickListener{

            val name = view.findViewById<EditText>(R.id.etName).text.toString()
            val age = view.findViewById<EditText>(R.id.etAge).text.toString().toInt()
            var user=Users(name,age)

            osiris.setUser(user)
            dismiss()
        }
        return view
    }

    interface DialogInterface{
        fun onDialogButtonPress(data:String)
    }

}

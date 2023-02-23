package com.yusufov.myexampleapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment

class DialogQuestion:DialogFragment() {
    private lateinit var listener:DialogInterface
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View?{
        val view = inflater.inflate(R.layout.dialog_question,container,false)
        val button = view.findViewById<Button>(R.id.btnBagisla)

///////////////////////////// Button for sending data /////////////////////

        button.setOnClickListener{
            val nameText = view.findViewById<EditText>(R.id.etName)
            val ageText = view.findViewById<EditText>(R.id.etAge)
            var name:String? = nameText.text!!.toString().trim()
            var age:Int? = ageText.text!!.toString().toIntOrNull()
            if(name!!.isEmpty()){
                nameText.error = "Ad yaz ale"
                nameText.requestFocus()
                return@setOnClickListener
            }
            if(age==null){
                ageText.error = "Yas lazimdi"
                ageText.requestFocus()
                return@setOnClickListener
            }


            var user=Users(name, age)
            listener.onDialogButtonPress(user)
            dismiss()
        }
        return view
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as DialogInterface
    }
    interface DialogInterface{
        fun onDialogButtonPress(data:Users)
    }

}

package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var doneButton: Button
    lateinit var nickNameEditText: EditText
    lateinit var nickNameText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        doneButton = binding.doneButton
        nickNameEditText = binding.nicknameEdit
        nickNameText = binding.nicknameText
        doneButton.setOnClickListener{
            addNickname(it)
        }

    }

    private fun addNickname(view: View) {

        nickNameText.text = nickNameEditText.text
        nickNameEditText.visibility = View.GONE
        view.visibility = View.GONE
        nickNameText.visibility = View.VISIBLE
        // Hide the keyboard
        val imn = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imn.hideSoftInputFromWindow(view.windowToken, 0)
    }

}
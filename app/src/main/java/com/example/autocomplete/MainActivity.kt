package com.example.autocomplete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.MultiAutoCompleteTextView
import com.example.autocomplete.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var items = arrayOf("CSI-뉴욕", "CSI-라스베가스", "CSI-마이애미",
            "Friends", "Fringe", "Lost")

        var auto = binding.autoCompleteTextView1
        var adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, items)
        auto.setAdapter(adapter)

        var multi = binding.multiAutoCompleteTextView1
        var token = MultiAutoCompleteTextView.CommaTokenizer()
        multi.setTokenizer(token)
        multi.setAdapter(adapter)
    }
}


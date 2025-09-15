package com.example.lab_week_03

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_detail, container, false)

        val titleView: TextView = view.findViewById(R.id.detail_title)
        val descView: TextView = view.findViewById(R.id.detail_description)
        val backButton: Button = view.findViewById(R.id.back_button)

        arguments?.let {
            titleView.text = it.getString("title")
            descView.text = it.getString("description")
        }

        backButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ListFragment())
                .commit()
        }

        return view
    }
}

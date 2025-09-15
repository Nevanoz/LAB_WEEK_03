package com.example.lab_week_03

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        // Clickable items
        view.findViewById<View>(R.id.affogato).setOnClickListener {
            openDetail(getString(R.string.affogato_title), getString(R.string.affogato_desc))
        }

        view.findViewById<View>(R.id.americano).setOnClickListener {
            openDetail(getString(R.string.americano_title), getString(R.string.americano_desc))
        }

        view.findViewById<View>(R.id.latte).setOnClickListener {
            openDetail(getString(R.string.latte_title), getString(R.string.latte_desc))
        }

        view.findViewById<View>(R.id.espresso).setOnClickListener {
            openDetail(getString(R.string.espresso_title), getString(R.string.espresso_desc))
        }

        view.findViewById<View>(R.id.cappuccino).setOnClickListener {
            openDetail(getString(R.string.cappuccino_title), getString(R.string.cappuccino_desc))
        }

        return view
    }

    private fun openDetail(title: String, description: String) {
        val bundle = Bundle().apply {
            putString("title", title)
            putString("description", description)
        }

        val detailFragment = DetailFragment().apply {
            arguments = bundle
        }

        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, detailFragment)
            .commit()
    }
}

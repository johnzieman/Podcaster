package com.johnzieman.podcaster.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.johnzieman.podcaster.R

private const val TAG = "MAINSCREEN"

class MainScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_screen, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        try {
            val navBar: BottomNavigationView =
                requireActivity().findViewById(R.id.bottom_navigation)
            navBar.visibility = View.VISIBLE
        } catch (e: NullPointerException) {
            Log.d(TAG, e.message.toString())
        }
    }

}
package com.beyzanuraydemir.navigationexamplewithviewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.beyzanuraydemir.navigationexamplewithviewbinding.databinding.FragmentYBinding

class YFragment : Fragment() {
    private lateinit var tasarim:FragmentYBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentYBinding.inflate(inflater, container, false)
        tasarim.buttonHome.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_YFragment_to_homePageFragment)
        }

        return tasarim.root

    }

}
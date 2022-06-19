package com.beyzanuraydemir.navigationexamplewithviewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.beyzanuraydemir.navigationexamplewithviewbinding.databinding.FragmentABinding
import com.beyzanuraydemir.navigationexamplewithviewbinding.databinding.FragmentHomePageBinding


class HomePageFragment : Fragment() {
    private lateinit var tasarim:FragmentHomePageBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentHomePageBinding.inflate(inflater, container, false)

        tasarim.buttonA.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_homePageFragment_to_AFragment)
        }

        tasarim.buttonX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_homePageFragment_to_XFragment)
        }
        return tasarim.root


    }

}
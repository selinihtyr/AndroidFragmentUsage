package com.selin.androidfragmentusage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.selin.androidfragmentusage.databinding.FragmentHomepageBinding

class HomepageFragment : Fragment() {
    private lateinit var binding: FragmentHomepageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomepageBinding.inflate(inflater, container, false)

        binding.btnHomepage1.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.goA)
        }

        binding.btnHomepage2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.goX)
        }

        return binding.root
    }

}
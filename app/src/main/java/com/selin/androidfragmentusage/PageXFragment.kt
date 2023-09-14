package com.selin.androidfragmentusage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.selin.androidfragmentusage.databinding.FragmentPageXBinding

class PageXFragment : Fragment() {
    private lateinit var binding: FragmentPageXBinding
     override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPageXBinding.inflate(inflater, container, false)

         binding.btnX.setOnClickListener {
             Navigation.findNavController(it).navigate(R.id.goYfromX)
         }
        return binding.root
    }
}
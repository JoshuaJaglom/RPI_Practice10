package com.zhukov.practice3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class ColorFragment : Fragment() {
    private var viewModel = MainViewModel.getMyViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fr: View? = view.findViewById(R.id.fragmentF2)
        viewModel.currentColor.observe(viewLifecycleOwner) {
            fr?.setBackgroundColor(it)
        }
    }
}
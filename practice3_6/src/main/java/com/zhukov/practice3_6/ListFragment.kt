package com.zhukov.practice3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private var viewModel = MainViewModel.getMyViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val colorNames: Array<String> = resources.getStringArray(R.array.colorNames)
        val colorValues: IntArray = resources.getIntArray(R.array.colorValues)

        recyclerView = view.findViewById(R.id.recyclerViewGgs)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = CustomAdapter(colorNames,colorValues,viewModel)

        super.onViewCreated(view, savedInstanceState)
    }
}
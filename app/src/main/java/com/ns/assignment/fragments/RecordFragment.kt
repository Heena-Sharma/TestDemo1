package com.ns.assignment.fragments

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ns.assignment.adapters.RecordListAdapter
import com.ns.assignment.baseclass.MainActivity
import com.ns.assignment.databinding.FragmentRecordsBinding
import com.ns.assignment.viewmodals.RecordListViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import java.io.IOException
import java.io.InputStream

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */


@AndroidEntryPoint
class RecordFragment : Fragment() {

    private var _binding: FragmentRecordsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val viewModel: RecordListViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentRecordsBinding.inflate(inflater, container, false)
        context ?: return binding.root

        val adapter = RecordListAdapter()
       val mLinearLayoutManager = LinearLayoutManager(activity)
        mLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL)
        binding.rvRecords.layoutManager = mLinearLayoutManager
        binding.rvRecords.adapter = adapter
        subscribeUi(adapter)
        setHasOptionsMenu(true)
        return binding.root

    }
    private fun subscribeUi(adapter: RecordListAdapter) {
        viewModel.records.observe(viewLifecycleOwner) { records ->
            Log.e("Result=", records.toString())
           adapter.submitList(records)

        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


package com.example.product_withfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import com.example.product_withfragments.data.Datasource
import com.example.product_withfragments.databinding.FragmentProductListBinding
import com.example.product_withfragments.model.ItemAdapter


class ProductList : Fragment() {


    private var _binding: FragmentProductListBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentProductListBinding.inflate(inflater)
        setHasOptionsMenu(true)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.adapter = ItemAdapter(requireContext(), Datasource().loadProduct())
        binding.recyclerView.setHasFixedSize(true)



    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
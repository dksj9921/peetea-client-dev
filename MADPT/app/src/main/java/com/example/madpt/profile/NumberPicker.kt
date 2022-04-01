package com.example.madpt.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.example.madpt.databinding.FragmentNumberPickerBinding

class NumberPicker : BottomSheetDialogFragment() {

    private var _binding: FragmentNumberPickerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentNumberPickerBinding.inflate(inflater, container, false)
        binding.IntegerStature.maxValue = 250
        binding.IntegerStature.minValue = 0
        binding.IntegerStature.value = 160
        binding.DecimalStature.maxValue = 99
        binding.DecimalStature.minValue = 0
        binding.DecimalStature.value = 0

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        const val TAG = "NumberPicker"
    }
}
package com.velaphi.footgear.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.velaphi.footgear.MainViewModel
import com.velaphi.footgear.R
import com.velaphi.footgear.databinding.FragmentAddShoeBinding
import com.velaphi.footgear.isEmailValid
import com.velaphi.footgear.models.Shoe
import com.velaphi.footgear.validateString

class AddShoeFragment : Fragment() {

    private lateinit var fragmentViewBinding: FragmentAddShoeBinding
    private lateinit var mainViewModel: MainViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        fragmentViewBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_add_shoe, container, false
        )

        mainViewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        fragmentViewBinding.mainViewModel = mainViewModel
        fragmentViewBinding.shoe = Shoe("", "", 0, "", 0)
        return fragmentViewBinding.root
    }
}

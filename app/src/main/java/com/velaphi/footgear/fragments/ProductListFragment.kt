package com.velaphi.footgear.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.velaphi.footgear.MainViewModel
import com.velaphi.footgear.R
import com.velaphi.footgear.databinding.FragmentProductListBinding
import com.velaphi.footgear.databinding.LayoutShoeItemBinding

class ProductListFragment : Fragment() {

    private lateinit var fragmentViewBinding: FragmentProductListBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        fragmentViewBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_product_list, container, false
        )
        setupViewModel()
        setAddShoes()
        return fragmentViewBinding.root
    }

    private fun setupViewModel() {
        mainViewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        mainViewModel.shoes.observe(viewLifecycleOwner, {
            for (shoe in it) {
                DataBindingUtil.inflate<LayoutShoeItemBinding>(
                    layoutInflater,
                    R.layout.layout_shoe_item,
                    fragmentViewBinding.shoeListLinearLayout,
                    true
                ).apply {
                    this.shoe = shoe
                }
            }
        })
    }

    private fun setAddShoes() {
        fragmentViewBinding.floatingActionButton.setOnClickListener {
            this.findNavController()
                .navigate(R.id.action_productList_to_addShoeFragment)
        }
    }
}
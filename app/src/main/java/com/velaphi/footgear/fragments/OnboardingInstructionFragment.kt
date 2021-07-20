package com.velaphi.footgear.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.velaphi.footgear.R
import com.velaphi.footgear.databinding.FragmentOnboardingInstructionsBinding

class OnboardingInstructionFragment : Fragment() {

    private lateinit var fragmentViewBinding: FragmentOnboardingInstructionsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        fragmentViewBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_onboarding_instructions, container, false
        )
        setupView()
        return fragmentViewBinding.root
    }

    private fun setupView() {
        fragmentViewBinding.getStartedButton.setOnClickListener {
            this.findNavController()
                .navigate(R.id.action_Instruction_to_productListFragment)

        }
    }
}
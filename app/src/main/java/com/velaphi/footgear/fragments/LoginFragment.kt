package com.velaphi.footgear.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.velaphi.footgear.R
import com.velaphi.footgear.databinding.FragmentLoginBinding
import com.velaphi.footgear.utils.isEmailValid
import com.velaphi.footgear.utils.validateString

class LoginFragment : Fragment(){

    private lateinit var fragmentViewBinding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        fragmentViewBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false
        )
        setupView()
        return fragmentViewBinding.root
    }

    private fun setupView() {
        fragmentViewBinding.loginButton.setOnClickListener {
            if (validateCredentials()) {
                this.findNavController().navigate(R.id.action_loginFragment_to_onboardingWelcomeFragment)
            }
        }
    }

    private fun validateCredentials(): Boolean {
        return fragmentViewBinding.emailTextInput.validateString() &&
                fragmentViewBinding.emailTextInput.isEmailValid() &&
                fragmentViewBinding.passwordTextInput.validateString()
    }
}
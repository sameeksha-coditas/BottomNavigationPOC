package com.example.bottomnavigation.formScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigation.R
import com.example.bottomnavigation.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    private var mBinding: FragmentRegisterBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentRegisterBinding.inflate(inflater, container, false).apply {
            mBinding = this
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding?.btnAbout?.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_registeredFragment)
        }
    }
}
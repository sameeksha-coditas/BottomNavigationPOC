package com.example.bottomnavigation.listsScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigation.R
import com.example.bottomnavigation.databinding.FragmentLeaderBoardBinding

class LeaderBoardFragment : Fragment() {
    private var mBinding: FragmentLeaderBoardBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentLeaderBoardBinding.inflate(inflater, container, false).apply {
            mBinding = this
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding?.btnAbout?.setOnClickListener {
            findNavController().navigate(R.id.action_leaderBoardFragment_to_userProfileFragment)
        }
    }
}
package com.example.mymvp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mymvp.databinding.FragmentUserListBinding

import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter

class UserFragment: MvpAppCompatFragment(), UserView, OnBackPressListener {

    private lateinit var viewBinding: FragmentUserListBinding
    private val adapter = UserAdapter()
    private val presenter: UserPresenter by moxyPresenter {
        UserPresenter(UserRepoImpl(), CourseApp.instance.router)
    }
    companion object {
        fun getInstance(): UserFragment {
            return UserFragment()
        }
    }



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentUserListBinding.inflate(inflater, container, false).also {
            viewBinding = it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(viewBinding) {
            usersRv.layoutManager = LinearLayoutManager(requireContext())
            usersRv.adapter = adapter
        }
    }

    override fun initList(list: List<User>) {
        adapter.users = list
    }

    override fun onBackPressed() = presenter.onBackPressed()


}
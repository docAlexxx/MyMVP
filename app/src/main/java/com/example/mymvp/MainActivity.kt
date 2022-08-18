package com.example.mymvp

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mymvp.databinding.ActivityMainBinding
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter

class MainActivity : MvpAppCompatActivity(), MainView {

    private lateinit var binding: ActivityMainBinding
    private val adapter =UserAdapter()
    private val presenter by moxyPresenter { CounterPresenter(UserRepoImpl()) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            userRv.layoutManager=LinearLayoutManager(this@MainActivity)
            userRv.adapter=adapter
        }

    }

    override fun initList(list: List<User>) {
        adapter.users=list
    }


}
package com.example.mymvp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mymvp.databinding.ActivityMainBinding
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter

class MainActivity : MvpAppCompatActivity(), MainView {

    private lateinit var binding: ActivityMainBinding
    private val presenter by moxyPresenter { CounterPresenter(CounterModel()) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        with(binding) {
            buttonOneBtn.setOnClickListener {
                presenter.onButtonOneClick()
            }
            buttonTwoBtn.setOnClickListener {
                presenter.onButtonTwoClick()
            }
            buttonThreeBtn.setOnClickListener {
                presenter.onButtonThreeClick()
            }
        }

    }


    override fun setTextOne(counter: String) {
        binding.textOneTv.text = counter
    }

    override fun setTextTwo(counter: String) {
        binding.textTwoTv.text = counter
    }

    override fun setTextThree(counter: String) {
        binding.textThreeTv.text = counter
    }

}
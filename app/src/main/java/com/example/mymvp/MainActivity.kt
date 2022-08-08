package com.example.mymvp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mymvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var binding: ActivityMainBinding
    private lateinit var presenter: CounterPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initPresenter()

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

    private fun initPresenter() {
        presenter = CounterPresenter(this)
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
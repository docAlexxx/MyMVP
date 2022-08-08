package com.example.mymvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
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
               presenter.onCounterClick(R.id.button_one_btn)
            }
            buttonTwoBtn.setOnClickListener {
                presenter.onCounterClick(R.id.button_two_btn)
            }
            buttonThreeBtn.setOnClickListener {
                presenter.onCounterClick(R.id.button_three_btn)
            }
        }

    }

    private fun initPresenter() {
        presenter= CounterPresenter(this)
    }

    override fun setText(counter: String,pos:Int) {
        with(binding){
            when (pos) {
                0-> textOneTv.text=counter
                1-> textTwoTv.text=counter
                2-> textThreeTv.text=counter
            }
        }
    }

}
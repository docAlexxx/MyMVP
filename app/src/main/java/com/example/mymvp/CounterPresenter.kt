package com.example.mymvp

import moxy.MvpPresenter

class CounterPresenter(private val model : CounterRepo): MvpPresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

    }


    fun onButtonOneClick() {
        viewState.setTextOne(model.nextItem(0).toString())
    }

    fun onButtonTwoClick() {
        viewState.setTextTwo(model.nextItem(1).toString())
    }

    fun onButtonThreeClick() {
        viewState.setTextThree(model.nextItem(2).toString())
    }

}
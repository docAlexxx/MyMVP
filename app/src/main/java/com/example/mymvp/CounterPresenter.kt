package com.example.mymvp

class CounterPresenter(private val view:MainView) {

    val model=CounterModel()

    fun onButtonOneClick (){
        view.setTextOne(model.nextItem(0).toString())
    }

    fun onButtonTwoClick (){
        view.setTextTwo(model.nextItem(1).toString())
    }

    fun onButtonThreeClick (){
        view.setTextThree(model.nextItem(2).toString())
    }

}
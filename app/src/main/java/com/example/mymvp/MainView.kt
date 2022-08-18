package com.example.mymvp

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType


@StateStrategyType(AddToEndSingleStrategy::class)
interface MainView : MvpView
 {
    fun setTextOne(counter: String) {
    }

    fun setTextTwo(counter: String) {
    }

    fun setTextThree(counter: String) {
    }

}
package com.example.mymvp

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType


@StateStrategyType(AddToEndSingleStrategy::class)
interface MainView : MvpView
 {
   fun initList(list: List<User>)

  // fun updateList(list: List<User>)

 }
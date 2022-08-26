package com.example.mymvp.main

import com.example.mymvp.core.UsersScreen
import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter

class MainPresenter( private val router: Router): MvpPresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        router.replaceScreen(UsersScreen)
    }

    fun onBackPressed() {
        router.exit()
    }



}
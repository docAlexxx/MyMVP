package com.example.mymvp

import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter

class UserPresenter (
    private val repository: UserRepo,
    private val router: Router
) : MvpPresenter<UserView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.initList(repository.getUsers())
    }

    fun onBackPressed(): Boolean {
        router.exit()
        return true
    }
}

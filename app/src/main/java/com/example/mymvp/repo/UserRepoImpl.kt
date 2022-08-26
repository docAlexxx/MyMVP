package com.example.mymvp.repo

import com.example.mymvp.model.User

class UserRepoImpl: UserRepo {

    private val repositories = listOf(
        User("First User"),
        User("Second User"),
        User("Third User"),
        User("Fourth User"),
        User("Fifth User")
    )

    override fun getUsers(): List<User> {
        return repositories
    }

}
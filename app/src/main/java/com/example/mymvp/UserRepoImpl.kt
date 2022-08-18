package com.example.mymvp

class UserRepoImpl:UserRepo {

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
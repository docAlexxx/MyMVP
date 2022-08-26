package com.example.mymvp.repo

import com.example.mymvp.model.User

interface UserRepo {
    fun getUsers(): List<User>
}
package com.example.mymvp

interface UserRepo {
    fun getUsers(): List<User>
}
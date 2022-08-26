package com.example.mymvp.repo

class CounterRepo {
    private val counter = mutableListOf(0, 0, 0)

    fun getItem(pos: Int): Int {
        return counter[pos]
    }

    fun nextItem(pos: Int): Int {
        return ++counter[pos]
    }

    fun setItem(pos: Int, value: Int) {
        counter[pos] = value
    }

}
package com.example.mymvp.main

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mymvp.R
import com.example.mymvp.model.User

class UserAdapter () :RecyclerView.Adapter<UserViewHolder>(){

    var users: List<User> = emptyList()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(users[position])
    }

    override fun getItemCount() = users.size
}

class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val tvLogin by lazy { itemView.findViewById<TextView>(R.id.user_login_tv) }

    fun bind(item: User) = with(item) {
        tvLogin.text = login
    }

}
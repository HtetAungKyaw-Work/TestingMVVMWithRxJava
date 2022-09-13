package com.haker.testingmvvmwithrxjava.data.api

import com.haker.testingmvvmwithrxjava.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}
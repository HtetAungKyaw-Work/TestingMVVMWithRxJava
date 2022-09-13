package com.haker.testingmvvmwithrxjava.data.repository

import com.haker.testingmvvmwithrxjava.data.api.ApiHelper
import com.haker.testingmvvmwithrxjava.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {
    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}
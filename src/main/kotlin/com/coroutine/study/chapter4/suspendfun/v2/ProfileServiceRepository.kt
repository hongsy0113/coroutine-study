package com.coroutine.study.chapter4.suspendfun.v2

import kotlinx.coroutines.runBlocking

interface ProfileServiceRepository {
    suspend fun fetchByName(name: String): Profile
    suspend fun fetchById(id: Long): Profile
}

class ProfileServiceClient : ProfileServiceRepository {
    override suspend fun fetchById(id: Long): Profile {
        return Profile(id, "name", 28)
    }

    override suspend fun fetchByName(name: String): Profile {
        return Profile(1, name, 20)
    }
}


fun main(args: Array<String>) = runBlocking {
    val repository: ProfileServiceRepository = ProfileServiceClient()
    val profile = repository.fetchById(12)

    println(profile)
}
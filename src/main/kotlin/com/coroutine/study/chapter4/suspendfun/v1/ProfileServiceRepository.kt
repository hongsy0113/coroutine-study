package com.coroutine.study.chapter4.suspendfun.v1

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

interface ProfileServiceRepository {
    fun asyncFetchByName(name: String): Deferred<Profile>
    fun asyncFetchById(id: Long): Deferred<Profile>
}


class ProfileServiceClient : ProfileServiceRepository {
    override fun asyncFetchByName(name: String): Deferred<Profile> = GlobalScope.async {
        Profile(1, name, 28)
    }


    override fun asyncFetchById(id: Long): Deferred<Profile> = GlobalScope.async {
        Profile(id, "Susan", 28)
    }

}

fun main(args: Array<String>) = runBlocking {
    val client: ProfileServiceRepository = ProfileServiceClient()
    val profile = client.asyncFetchById(12).await()

    println(profile)
}
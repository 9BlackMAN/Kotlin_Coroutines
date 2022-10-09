package com.ckc.kotlin_coroutines
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    var userName = ""
    var userAge = 0

    runBlocking {

        val downloadedName = async {
            downloadName() //fun kullanabilmemiz için fun suspend olması gerekir
        }

        val downloadedAge = async {
            downloadAge()
        }

        userName = downloadedName.await()
        userAge = downloadedAge.await()

        println("${userName} ${userAge}")

    }


}

 suspend fun downloadName() : String {
    delay(2000)
    val userName = "blackMan "
    println("username download Name")
    return userName
}

 suspend fun downloadAge() : Int {
    delay(4000)
    val userAge = 24
    println("userage download Age")
    return userAge
}
package com.ckc.kotlin_coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Coroutines büyük veriler ile çalışırken veya yapacağımız işlemleri
        // hangi trehad da yapmak istiyor isek kullanılması gereken bir teknoloji
        // RxJava altarnatifi




        //Global Scop
        // RunBlocking
        // CoroutineScope


        //runBlocking

        //once start sonra run ve stop çalışır
        //run blocking içindekiler bitmeden sonrasındaki kotları çalıştırmaz


     /*   println("run blocking START")
        runBlocking {
        launch {
            delay(5000)
            println("run blocking RUN")
        }
        }
        println("run blocking STOP")

      */


        //GlobalScope

        /*
        println("globalScope START")
        GlobalScope.launch {
            launch {
                    delay(5000)
                    println("globalScope RUN")
            }
        }
        println("GlobalScope STOP")

         */

        //CoroutineScope
        //coroutineScope global scoplardan farklı olarak çalışacağı yeri belirleyebilirsiniz
        println("coroutine scope start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("coroutine scope")
        }
        println("coroutine scope end")



    }
}
























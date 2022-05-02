package com.mg.dicepractice

import android.graphics.Color
import android.graphics.Color.BLUE
import android.graphics.Color.RED
import androidx.core.graphics.component1
import androidx.core.graphics.component2
import java.io.Serializable

 class JavaToKotlin(val name: String ,val age: Int) {
     fun updateWeather(degrees: Int){
         val (description:String, color: Int) =
             if (degrees < 10) {
                 Pair("cold",BLUE)
             } else if (degrees <25) {
                 Pair("mild",RED)
             } else {
                 Pair("hot", RED)
             }
     }


}
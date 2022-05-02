package com.mg.dicepractice

class Dice(val numSides:Int) {

    fun roll(): Int = (1..numSides).random()



}
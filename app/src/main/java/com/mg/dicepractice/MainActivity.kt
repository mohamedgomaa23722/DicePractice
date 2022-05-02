package com.mg.dicepractice

import android.annotation.SuppressLint
import android.graphics.Color.RED
import android.hardware.camera2.params.RggbChannelVector.BLUE
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private val TAG = "MainActivity"
    lateinit var img: ImageView
    lateinit var txtButton: MaterialButton
    lateinit var myFirstDice: Dice
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myFirstDice = Dice(6)
        img = findViewById(R.id.rollTxt)
        txtButton = findViewById(R.id.roll)

        txtButton.setOnClickListener(this)

        val javaToKotlin = JavaToKotlin("mohamed Ahmed", 24)
        Toast.makeText(this,
            "welcome Mr." + javaToKotlin.name + " it's your " + (javaToKotlin.age + 1) + " th birthday",
            Toast.LENGTH_SHORT).show()
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onClick(p0: View?) {
        val diceRoll = myFirstDice.roll()
        val drawableResource= when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        img.setImageResource(drawableResource)
        img.contentDescription = diceRoll.toString()

    }

    private fun displayToast(Number: Int, Message: String) =
        Toast.makeText(this, "Number=" + Number + " So " + Message, Toast.LENGTH_SHORT).show()

    fun updateWeather(degrees: Int) {
        val (description: String, color: Int) =
            if (degrees < 10)
                Pair("cold", BLUE)
            else if (degrees < 25)
                Pair("mild", RED)
            else
                Pair("hot", RED)
    }

}
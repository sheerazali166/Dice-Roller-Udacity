package com.example.rollerdice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    // TODO: Use lateinit to extract the image view variable
    lateinit var diceImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        //rollButton.text = "Let's Roll"

        rollButton.setOnClickListener {

            // TODO: Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            // TODO: This should be roll mice
            rollDice()
        }

        // TODO: This statement is still ??

        // TODO: Initialize the image view variable
        diceImage = findViewById(R.id.dice_image)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun rollDice() {

        // TODO: val resultText: TextView = findViewById(R.id.result_text)

        // TODO: resultText.text = "Dice Rolled!"
        // TODO: val randomInt = Random().nextInt(6) + 1
        // TODO: this Don't have parenthesis or that didn't have paranthesis

        val randomInt = Random.nextInt(6) + 1

        // TODO: resultText.text = randomInt.toString()

        // TODO Replace reference to the TextView with the ImageView
        // TODO val diceImage:ImageView = findViewById(R.id.dice_image)

        // TODO: Choose the right drawable resource based on the value of randomInt
        var drawableResource = when(randomInt) {

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }

        // TODO: Finally, assign the drawableResource from above to diceImage
        diceImage.setImageResource(drawableResource)

    }
}
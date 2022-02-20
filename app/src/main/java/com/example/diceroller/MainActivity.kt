package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Line below gets the layout UI through findViewById and stores in and val rollButton
        // and type Button(Button.class) val rollButton
        // public class AppCompatActivity extends FragmentActivity implements AppCompatCallback,
        // TaskStackBuilder.SupportParentable, ActionBarDrawerToggle.DelegateProvider {
        val rollButton: Button = findViewById(R.id.roll_button)

        /**
        * View.setOnClickListener Interface
        * Instance creation of anonymous class implements in the curly braces body
        * new View.OnClickListener()
        * Any class that implements View.OnClickListener must
        * implement the methods declared in it (e.g. onClick)
        *
        * setOnClickListener just saves the reference to the
        * View.OnClickListener instance you supplied, and when
        * someone clicks the button, the onClick method of the
        * listener you set is getting called.
        */
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)

        val randomInt = Random().nextInt(6)+1

        // .text = SetText method from TextView class
        resultText.text = randomInt.toString()
    }
}
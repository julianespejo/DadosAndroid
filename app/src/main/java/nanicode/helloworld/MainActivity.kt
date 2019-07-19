package nanicode.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { tirarDados() }


        //resultText.text = "Dados tirados!!"
    }

    private fun tirarDados() {

        val randomInt = Random().nextInt(6)+1


        val diceImage: ImageView = findViewById(R.id.dice_image)
        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        diceImage.setImageResource(drawableResource)

        // -----------------Codigo anterior--------------------
       /*Toast.makeText(this, "Dados tirados y tu resultado es ??",
            Toast.LENGTH_SHORT).show()

        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = Random().nextInt(6)+1
        resultText.text = randomInt.toString()
       */


    }
}

package com.example.hw1_guessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlin.random.Random
import android.widget.Toast.makeText as makeText1

class NumberGuessActivity : AppCompatActivity() {

    //SE DEFINEN VARIABLES INCIALES
    val randomNumber = Random

    var numeroAleatorio = randomNumber.nextInt(0, 1000)

    var intentos = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_guess)
    }

    fun clickJugar(view: View){

        //CAPTURA EL VALOR ESCRITO EN LA BARRA DE NUMERO DE LA APP
        val number = findViewById<EditText>(R.id.editTextNumber).getText().toString().toInt()

        //SI EL NUMERO INGRESADO ES MENOR
        if (number < numeroAleatorio){
                Toast.makeText(this,"el numero que ingresaste es menor!!",Toast.LENGTH_LONG).show()
            intentos += 1
            Toast.makeText(this,"el numero de intentos que llevas es: $intentos",Toast.LENGTH_LONG).show()
            }
        //SI EL NUMERO INGRESADO ES MAYOR
        else if (number > numeroAleatorio){
                Toast.makeText(this,"el numero que ingresaste es mayor!!",Toast.LENGTH_LONG).show()
            intentos += 1
            Toast.makeText(this,"el numero de intentos que llevas es: $intentos",Toast.LENGTH_LONG).show()
            }

        //SI EL NUMERO INGRESADO ES IGUAL AL CALCULADO
        else if(number == numeroAleatorio){
            Toast.makeText(this,"¡EUREKA! has adivinado el numero que estaba pensando",Toast.LENGTH_LONG).show()
            Toast.makeText(this,"el numero de intentos ha sido: $intentos",Toast.LENGTH_LONG).show()
            Toast.makeText(this, "el numero pensado es $numeroAleatorio", Toast.LENGTH_LONG).show()
        }






    }

    fun clickReiniciar(view: View) {

        setContentView(R.layout.activity_number_guess)

        fun valores(intentos :Int, numeroAleatorio :Int):Int{

            this.numeroAleatorio = randomNumber.nextInt(0,1000)
            this.intentos =0

            return intentos;numeroAleatorio
        }

        //REALIZA EL CALCULO DE UN NUEVO VALOR ALEATORIO Y REINICIA LOS INTENTOS A 0
        valores(intentos,numeroAleatorio)

    }

}

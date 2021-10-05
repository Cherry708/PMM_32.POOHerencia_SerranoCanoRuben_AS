package com.example.pmm_32pooherencia_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Problema3Propuesto1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema3_propuesto1)

        val dado = Dado()
        val recuadro = recuadroDado()

        val tvResult = findViewById<TextView>(R.id.tvResult30)
        val resultado = "${recuadro.generarRecuadro()}\n${dado.valor}\n${recuadro.generarRecuadro()}"
        tvResult.text = resultado
    }


}

open class Dado(){
    var valor:Int = (1..6).random()
}
class recuadroDado():Dado(){
    fun generarRecuadro():String{
        val recuadro = "*"
        return recuadro.repeat(valor)
    }
}
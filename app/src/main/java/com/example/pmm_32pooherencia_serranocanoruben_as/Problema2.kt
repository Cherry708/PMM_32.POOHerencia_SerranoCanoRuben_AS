package com.example.pmm_32pooherencia_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_32pooherencia_serranocanoruben_as.databinding.ActivityProblema2Binding
import kotlin.math.sqrt

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)

        val binding = ActivityProblema2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val calculadora = Calculadora(2.0,2.0)
        val calculadoraCientifica = CalculadoraCientifica(3.0,3.0)

        val suma = "Suma: ${calculadora.sumar()}"
        binding.tvSuma20.text = suma
        val resta = "Resta: ${calculadora.restar()}"
        binding.tvResta20.text = resta
        val multiplicacion = "Multiplicación: ${calculadora.multiplicar()}"
        binding.tvMultiplicacion20.text = multiplicacion
        val cuadrado = "Cuadrado: ${calculadoraCientifica.cuadradoValor0()}"
        binding.tvCuadrado20.text = cuadrado
        val raiz = "Raiz cuadrada: ${calculadoraCientifica.raizCuadradaValor0()}"
        binding.tvRaiz20.text = raiz
    }
}

open class Calculadora(var valor0:Double, var valor1:Double){
    fun sumar():Double{
        return valor0+valor1
    }
    fun restar():Double{
        return valor0-valor1
    }
    fun multiplicar():Double{
        return valor0*valor1
    }
    fun dividir():Double{
        return valor0/valor1
    }
}

class CalculadoraCientifica(valor0: Double,valor1: Double):Calculadora(valor0,valor1){
    fun cuadradoValor0():Double{
        return valor0*valor0
    }
    fun raizCuadradaValor0():Double{
        return sqrt(valor0)
    }
}
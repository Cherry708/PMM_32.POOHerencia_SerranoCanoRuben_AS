package com.example.pmm_32pooherencia_serranocanoruben_as

import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_32pooherencia_serranocanoruben_as.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val persona = Persona("Rubén", 19)
        val empleado = Empleado("Juan", 21, 1100.0)
        val pagaImpuestos = if (empleado.pagaImpuestos())
            "Paga impuestos"
        else "No debe pagar impuestos"

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvPersona10.text = persona.toString()
        binding.tvEmpleado10.text = empleado.toString().plus("\n$pagaImpuestos")



    }
}

open class Persona(var nombre:String, var edad:Int){
    override fun toString(): String {
        return "Persona $nombre, $edad años"
    }
}

class Empleado(nombre:String, edad:Int, var sueldo:Double):Persona(nombre,edad){

    fun pagaImpuestos():Boolean{
        return sueldo >= 3000.0
    }

    override fun toString(): String {
        return "Empleado $nombre, $edad años, sueldo: $sueldo"
    }
}
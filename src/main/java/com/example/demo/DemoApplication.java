package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
public abstract class Automovil  
{  
  protected String modelo;  
  protected String color;  
  protected int potencia;  
  protected double espacio;  
  
  public Automovil(String modelo, String color, int  
    potencia, double espacio)  
  {  
    this.modelo = modelo;  
    this.color = color;  
    this.potencia = potencia;  
    this.espacio = espacio;  
  }  
  
  public abstract void mostrarCaracteristicas();  
}  
  

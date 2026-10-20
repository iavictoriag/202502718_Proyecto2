/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._proyecto2;

import java.util.Scanner;
import modelo.Usuario;
import modelo.Vehiculo;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   REGISTRO DE USUARIO Y VEHÍCULO");
        System.out.println("==========================================");

        // 1. Pedir los datos del usuario por consola
        System.out.print("Ingrese ID del usuario: ");
        String id = scanner.nextLine();

        System.out.print("Ingrese nombre completo: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese número de casa: ");
        String numeroCasa = scanner.nextLine();

        System.out.print("Ingrese teléfono: ");
        String telefono = scanner.nextLine();

        // Crear el objeto Usuario con los datos ingresados
        Usuario usuario1 = new Usuario(id, nombre, numeroCasa, telefono);

        System.out.println("\n--- Datos del Usuario Registrado ---");
        System.out.println(usuario1.toString());

        // 2. Pedir los datos del vehículo por consola
        System.out.println("\n==========================================");
        System.out.println("   INGRESO DE VEHÍCULO DE PRUEBA");
        System.out.println("==========================================");

        System.out.print("Ingrese la placa: ");
        String placa = scanner.nextLine();

        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese el modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese el color: ");
        String color = scanner.nextLine();

        System.out.print("Ingrese el tipo de vehículo: ");
        String tipo = scanner.nextLine();

        // Crear el objeto Vehículo con los datos ingresados
        Vehiculo miVehiculo = new Vehiculo(placa, marca, modelo, color, tipo);

        System.out.println("\n--- Vehículo Registrado con Éxito ---");
        System.out.println("Placa: " + miVehiculo.getPlaca());
        System.out.println("Marca: " + miVehiculo.getMarca());

        System.out.println("==========================================");

        scanner.close();
    }
}
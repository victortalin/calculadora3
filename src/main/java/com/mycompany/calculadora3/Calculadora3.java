/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora3;

import javax.swing.JOptionPane;

public class Calculadora3 {
public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digita el numero 1"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digita el numero 2"));
        
      operaciones op = new operaciones();
      int suma=op.sumar(n1, n2);
      int resta=op.restar(n1, n2);
      int multiplicacion=op.multiplicar(n1, n2);
      int division=op.division(n1, n2);
      int porcentaje=op.porcentaje(n1, n2);
      op.mostarResusltados(suma, resta, multiplicacion, division, porcentaje);
      
    }
}

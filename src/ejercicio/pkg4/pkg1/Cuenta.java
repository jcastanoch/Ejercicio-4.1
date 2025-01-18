/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4.pkg1;
public class Cuenta {
  protected float saldo;
  protected int numeroConsignaciones = 0;
  protected int numeroRetiros = 0;
  protected float tasaAnual;
  protected float comisionMensual = 0;

  public Cuenta(float saldo, float tasaAnual){
    this.saldo = saldo;
    this.tasaAnual = tasaAnual;
  }

  public void consignar(float cantidad){
    saldo = saldo + cantidad;
    numeroConsignaciones = numeroConsignaciones +1;
  }

  public void retirar(float cantidad){
    float nuevoSaldo = saldo - cantidad;
    if (nuevoSaldo >= 0){
      saldo -= cantidad;
      numeroRetiros = numeroRetiros +1;
    }
    else {
      System.out.println("No se puede retirar esa cantidad");
    }
  }

  public void calcularInteres(){
    float tasaMensual = tasaAnual / 12;
    float interesMensual = (saldo * tasaMensual);
    saldo = saldo + interesMensual;
  }

  public void extractoMensual(){
    saldo -= comisionMensual;
    calcularInteres();
  }

}
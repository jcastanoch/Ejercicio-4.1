/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4.pkg1;
public class CuentaAhorros extends Cuenta{
  private boolean activa;
  public CuentaAhorros(float saldo, float tasaAnual){
    super(saldo,tasaAnual);
    if (saldo < 10000){
      activa = false;
    }
    else {
      activa = true;
    }
  }
  public void retirar(float cantidad){
    if (activa){
      super.retirar(cantidad);
    }
  }

  public void consignar(float cantidad){
    if (activa){
       super.consignar(cantidad);
         }  
}
public void extractoMensual(){
  if (numeroRetiros > 4){
    comisionMensual += (numeroRetiros - 4) * 1000;
  }
super.extractoMensual();
  if (saldo<10000){
    activa = false;
  }
}
public void imprimir(){
  System.out.println("Saldo: $" + saldo);
  System.out.println("Comision mensual: $" + comisionMensual);
  System.out.println("Numero de transacciones: " + (numeroConsignaciones + numeroRetiros));
  System.out.println();
  }  
}
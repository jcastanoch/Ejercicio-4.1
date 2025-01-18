/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4.pkg1;
public class CuentaCorriente extends Cuenta {
  float sobregiro;
  public CuentaCorriente(float saldo, float tasaAnual){
    super(saldo,tasaAnual);
    sobregiro = 0;
  }

  public void retirar(float cantidad){
    float resultado = saldo - cantidad;
    if (resultado < 0){
      sobregiro = sobregiro - resultado;
      saldo = 0;
    }
    else{
      super.retirar(cantidad);
    }
  }

  public void consignar(float cantidad){
    float residuo = sobregiro - cantidad;

    if (sobregiro > 0){
      sobregiro =0;
      saldo = residuo;
    }
    else{
    super.consignar(cantidad);
    }
  }
}

package plibreria;
import paqueteUtilidades.Validar;
import circulo.Circulo;
import cadrado.Cadrado;
public class Plibreria {

   
    public static void main(String[] args) {
       int num =5;
      num = Validar.validaInt(num);
        System.out.println("numero = "+ num);
       num = -3;
      num = Validar.validaInt(num);
       System.out.println("numero = "+ num);
    Circulo.areaCirculo(num);
    Cadrado.areaCadrado(num);
    
      
    }
    
}

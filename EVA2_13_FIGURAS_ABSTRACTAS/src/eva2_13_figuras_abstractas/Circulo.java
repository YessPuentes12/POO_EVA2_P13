/*

 */
package eva2_13_figuras_abstractas;


public class Circulo extends Figura{
    
 private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
//------------------------------------------------------------------------------   
    

 @Override
 
 public double calcularAr(){
 return Math.PI*(radio*radio);    
 }
//------------------------------------------------------------------------------
 
 @Override
 
 public double calcularPer(){
 return Math.PI*(radio*2);    
 }
//------------------------------------------------------------------------------ 
 
 @Override    
    
  public String toString(){
    
   String cade="\nDatos del círculo:\n"
           + "\nÁrea del círculo: " +calcularAr()
           + "\nPerímetro del círculo: " +calcularPer() ;   
    return cade;    
}    
  
}

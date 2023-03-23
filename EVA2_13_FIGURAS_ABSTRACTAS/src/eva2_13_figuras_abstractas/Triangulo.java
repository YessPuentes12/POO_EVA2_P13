/*

 */
package eva2_13_figuras_abstractas;


public class Triangulo extends Figura{
    
private double base;
private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
//------------------------------------------------------------------------------  
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

//------------------------------------------------------------------------------   
    

 @Override
 
 public double calcularAr(){
 return (base*altura)/2;    
 }
//------------------------------------------------------------------------------
 
 @Override
 
 public double calcularPer(){
 return base*3;    
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

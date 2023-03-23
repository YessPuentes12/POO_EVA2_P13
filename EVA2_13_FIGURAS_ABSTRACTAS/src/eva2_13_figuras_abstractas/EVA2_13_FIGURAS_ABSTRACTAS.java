/*

 */
package eva2_13_figuras_abstractas;


public class EVA2_13_FIGURAS_ABSTRACTAS {


    public static void main(String[] args) {
     
     Circulo circ = new Circulo();
     circ.setRadio(18);
     System.out.println(circ);
     
     Triangulo tri = new Triangulo();
     tri.setBase(12);
     tri.setAltura(45);
     System.out.println(tri);
     
    }
    
}

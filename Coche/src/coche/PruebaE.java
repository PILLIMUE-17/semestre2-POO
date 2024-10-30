
package coche;


public class PruebaE {
    public static void main(String[] args) {
        CocheEncapsulado ce= new CocheEncapsulado();
        //ce.marca="byd";
        ce.setMarca("byd");
        System.out.println("marca: "+ce.getMarca());
    }
    
}

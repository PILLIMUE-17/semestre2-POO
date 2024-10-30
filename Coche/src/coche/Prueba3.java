
package coche;

public class Prueba3 {
    public static void main(String[] args) {
        CocheV2 cv2=new CocheV2("mazda","rojo",1400,1.2,2021);
        System.out.println(cv2.toString());
        cv2.anadirKm(10);
        System.out.println(cv2.toString());
        cv2.anadirKm(-10);
        System.out.println(cv2.toString());
    }
    
}

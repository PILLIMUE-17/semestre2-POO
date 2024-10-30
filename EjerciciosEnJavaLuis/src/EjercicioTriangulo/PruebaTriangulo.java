
package EjercicioTriangulo;


public class PruebaTriangulo {
    public static void main(String[] args) {
            Triangulo equilatero1=new Triangulo(2,9);
            Triangulo equilatero2=new Triangulo(3,12);
            Triangulo equilatero3=new Triangulo(4,16);
            
            
            System.out.println("Triangulo 1 : Base= "+equilatero1.base+" Altura= "+equilatero1.altura);
            System.out.println("Triangulo 2 : Base= "+equilatero2.base+" Altura= "+equilatero2.altura);
            System.out.println("Triangulo 3 : Base= "+equilatero3.base+" Altura= "+equilatero3.altura);
            System.out.println("----------- cambios de atributos -------------");
            equilatero1.setBase(3);
            equilatero1.setAltura(10);
            
            System.out.println("Triangulo 1: Base= "+equilatero1.base+" Altura= "+equilatero1.altura);
            System.out.println("Area="+equilatero1.areaTriangulo());
    }
  
    
}

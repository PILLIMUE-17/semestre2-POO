/*Crear una clase Triangulo que representa un triángulo equilátero, con los atributos enteros base y
altura. Crear métodos para dar valor y poder consultar los atributos, un método constructor, y un
método para calcular el área del triángulo.
    Crear una clase Prueba que en su main cree varios objetos de Triángulo, consulte sus atributos, cambie
el valor nuevamente de los atributos y pruebe su método.*/
package EjercicioTriangulo;


public class Triangulo {
    
    public int base;
    public int altura;
    
    public double areaTriangulo(){
        return(base*altura)/2;
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}


package EjercicioForma;


public class PruebaForma {
    
    public static void main(String[] args) {
        Triangulo Triangulo1= new Triangulo(5,2,"Triangulo",3.2,2.1,"ROSADO",3);
        Cuadrado Cuadrado1= new Cuadrado (5,"Cuadrado",2.4,1.3,"VERDE");
        
        System.out.println(Triangulo1);
        System.out.println("NOMBRE= "+Triangulo1.getNombre());
        System.out.println("POSICION EN X= "+Triangulo1.getPosicionX());
        System.out.println("POSICION EN Y= "+Triangulo1.getPosicionY());
        System.out.println("COLOR= "+Triangulo1.getColor());
        System.out.println("----CALCULAR AREA----");
        System.out.println("AREA= "+Triangulo1.CalcularArea());
        
        System.out.println("------------------------");
        
        System.out.println(Cuadrado1);
        System.out.println("NOMBRE= "+Cuadrado1.getNombre());
        System.out.println("POSICION EN X= "+Cuadrado1.getPosicionX());
        System.out.println("POSICION EN Y= "+Cuadrado1.getPosicionY());
        System.out.println("COLOR= "+Cuadrado1.getColor());
        System.out.println("----CALCULAR AREA----");
        System.out.println("AREA= "+Cuadrado1.CalcularArea());
        System.out.println("----CALCULAR PERIMETRO-----");
        System.out.println("PERIMETRO= "+Cuadrado1.CalcularPerimetro());

        System.out.println("------------------------");
        
        
        System.out.println("------MEJORA 1------");
        Cuadrado cuadradoM1=  new Cuadrado(3,"Cuadrado1",5.1,2.5,"MORADO");
        Cuadrado cuadradoM2=  new Cuadrado(4,"Cuadrado2",1.1,7.3,"ROJO");
        
        Rectangulo rectanguloM1= new Rectangulo(5,3,"Rectangulo1",6.3,4.1,"NARANJA"); 
        Rectangulo rectanguloM2= new Rectangulo(6,4,"Rectangulo2",4.9,4.6,"AZUL"); 
        
        Forma array[]=new Forma[4];
        array[0]=cuadradoM1;
        array[1]=cuadradoM2;
        array[2]=rectanguloM1;
        array[3]=rectanguloM2;
        int area=0;
        int totalArea=0;
        int mediaArea=0;
        for(int i=0;i<array.length;i++){
             area=(int)array[i].CalcularArea();
             totalArea += area; 
        }
        System.out.println("SUMA TOTAL DE AREAS -CUDRADOS-RECTANGULO= "+totalArea);
        
        System.out.println("-----MEDIA-----");
        
        mediaArea=totalArea/array.length;
        System.out.println("MEDIA AREA= "+mediaArea);
        
       System.out.println("------------------------");
       
        System.out.println("-----MEJORA 2-------");
        Triangulo TrianguloIsoceles= new Triangulo(6,2,"Triangulo ISOCELES",4.1,8.4,"NEGRO",4);
        System.out.println("----CALCULAR AREA TRIANGULO----");
        System.out.println("AREA= "+TrianguloIsoceles.CalcularArea());
        System.out.println("----INTERFAZ PERIMETRO TRIANGULO---");
        System.out.println("PERIMETRO= "+TrianguloIsoceles.calcularPerimetro());
        
        
        
    }
    
    
    
    
}

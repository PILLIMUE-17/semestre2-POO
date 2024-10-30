
package coche;


public class Coche {
    //ATRIBUTOS 
    public String marca;
    public String color;
    public String matricula;
    public int cilindrada;
    
    // constructores
    public Coche(String marca,String color,String matricula, int cilindrada){
        this.marca=marca;
        this.color=color;
        this.matricula=matricula;
        this.cilindrada=cilindrada;
    }
    public Coche(){
        
    }
    
    
    
    
    
    
    
    
    //metodos
   //visibilidad restorno nombremetofo (argumentos) opcionales los argumentos
    public void decirSiEsMetalizado(){
        
    
    if (color.equals("NEGRO")){
            System.out.println("es metalizado");
    }else{
    
            System.out.println("no es metalizado");          
}
    }
    public int decirCilindrada(){
        return cilindrada;
    }
    public void cambiarColor(String color){
        this.color=color;
    }


  
   
}

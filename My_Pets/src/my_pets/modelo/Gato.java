package my_pets.modelo;

public class Gato extends Mascota implements Domesticable {
    
    public Gato (String nombre){

        super(nombre);
    }
    
    @Override
    public void alimentar() {
        
        System.out.println(nombre + " está comiendo atún.");
        
        hambre -= 8;
        felicidad += 4;
        
        if (hambre < 0)
            
            hambre = 0;
        
        if (felicidad  > 100)
            
            felicidad = 100;
    }

    @Override
    public void jugar() {
        
        System.out.println(nombre + " está jugando con un ovillo de lana.");
        
        felicidad += 12;
        energia -= 6;
        
        if (energia < 0)
            
            energia = 0;
        
        if (felicidad  > 100)
            
            felicidad = 100;
    }


    public void jugar(String juguete) {
        
        System.out.println(nombre + " está jugando con un " + juguete + ".");
        
        felicidad += 14;
        energia -= 7;
        
        if (energia < 0)
            
            energia = 0;
        
        if (felicidad  > 100)
            
            felicidad = 100;
    }

    @Override
    public void dormir() {
        
        System.out.println(nombre + " está durmiendo en la ventana.");
        
        energia += 12;
        hambre += 4;
        
        if (energia > 100)
            
            energia = 100;
        
        if (hambre  > 100)
            
            hambre = 100;
    }

    @Override
    public void mostrarCarino() {
        
        System.out.println(nombre + " se frota contra tu pierna.");
    }
    
}

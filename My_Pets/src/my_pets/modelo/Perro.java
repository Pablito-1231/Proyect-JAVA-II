package my_pets.modelo;

public class Perro extends Mascota implements Domesticable {
    
    public Perro (String nombre){
    
        super(nombre);
        
    }
    
    @Override
    public void alimentar() {
        
        System.out.println(nombre + " está comiendo croquetas.");
        
        hambre -= 10;
        felicidad += 5;
        
        if (hambre < 0)
            
            hambre = 0;
        
        if (felicidad  > 100)
            
            felicidad = 100;

    }
    
    @Override
    public void jugar() {
        
        System.out.println(nombre + " está jugando con la pelota.");
        
        felicidad += 10;
        energia -= 5;
        
        if (energia < 0)
            
            energia = 0;
        
        if (felicidad  > 100)
            
            felicidad = 100;
        
    }

    public void jugar(String juguete) {
        
        System.out.println(nombre + " está jugando con un " + juguete + ".");
        
        felicidad += 15;
        energia -= 8;
        
        if (energia < 0)

            energia = 0;
        
        if (felicidad  > 100)
            
            felicidad = 100;
    }

    @Override
    public void dormir() {
        
        System.out.println(nombre + " está durmiendo en su cama.");
        
        energia += 15;
        hambre += 5;
        
        if (energia > 100)

            energia = 100;
        
        if (hambre  > 100)
            
            hambre = 100;
    }

    @Override
    public void mostrarCarino() {
        
        System.out.println(nombre + " esta moviendo la cola felizmente.");
    }
    
}

package my_pets.modelo;

// Clase abstracta para representar una mascota virtual.
public abstract class Mascota {

    protected String nombre;
    protected int felicidad;
    protected int hambre;
    protected int energia;

    public Mascota(String nombre) {

        this.nombre = nombre;
        this.felicidad = 50;
        this.hambre = 50;
        this.energia = 50;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFelicidad() {
        return felicidad;
    }

    public void setFelicidad(int felicidad) {
        this.felicidad = felicidad;
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    //Metodo de consulta de estado de la mascota.
    public void mostrarEstado(){
    
        System.out.println("Nombre: " + nombre);
        System.out.println("Felicidad: " + felicidad);
        System.out.println("Hambre: " + hambre);
        System.out.println("Energía: " + energia);
        
    }
    
    public abstract void alimentar();
    public abstract void jugar();
    public abstract void dormir();
    
}

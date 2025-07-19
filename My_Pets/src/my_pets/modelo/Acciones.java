package my_pets.modelo;

public class Acciones {
    
    private String accion;

    // Constructor que recibe la descripción de la acción.
    public Acciones(String accion) {

        this.accion = accion;
    }

    // Getter
    public String getAccion() {
        return accion;
    }

    // Setter
    public void setAccion(String accion) {
        this.accion = accion;
    }

    // Método para mostrar la acción (opcional)
    public void mostrarAccion() {
        
        System.out.println("Acción: " + accion);
 
    }
    
}

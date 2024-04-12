
package ejercicioHerenciaDos;

import javax.swing.JOptionPane;


public class Cliente extends Persona {
    private String direccion; 

    public Cliente(String direccion, String nombre, int edad) {
        super(nombre, edad);
        this.direccion = direccion;
        
        
    }

    public String getDireccion() {
        return direccion;
    }
    
    public void mostrarCliente(){
        JOptionPane.showMessageDialog(null, "EL NOMRE DEL CLIENTE ES: " + getNombre() +
                                       "\nLA EDAD ES:" + getEdad() +
                                       "\n LA DIRECCION ES: \n " + getDireccion());
                        
                                      
                                
                            
}
}

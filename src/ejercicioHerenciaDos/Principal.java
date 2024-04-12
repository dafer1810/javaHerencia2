package ejercicioHerenciaDos;
import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        String opciones = JOptionPane.showInputDialog("SELECCIONE UNA OPCION \n" +
                                                       "1. Agregar empleado \n " +
                                                       "2. Agregar clientes\n " +
                                                       "3. Salir del programa");
    
        
        
     int aux = Integer.parseInt(opciones);
        switch (aux) {
            case 1:
                String nombre1 = JOptionPane.showInputDialog("INGRESE SU NOMBRE: ");
                String aux1 = JOptionPane.showInputDialog("INGRESE SU EDAD: ");
                int edad = Integer.parseInt(aux1);
                String aux2= JOptionPane.showInputDialog("INGRESE SU SALARIO: ");
                double salario = Double.parseDouble(aux2);
                
                
               Empleado empleado = new Empleado (salario, nombre1, edad);
               empleado.mostrarEmpleado();
               
                break;
                
                
              
            case 2: 
                String nombre2 = JOptionPane.showInputDialog("INGRESE SU NOMBRE: ");
                String aux3= JOptionPane.showInputDialog("INGRESE SU EDAD: ");
                int edad2 = Integer.parseInt(aux3);
                String direccion = JOptionPane.showInputDialog("INGRESE SU DIRECCION: ");
                
                Cliente cliente = new Cliente (direccion, nombre2, edad2);
                cliente.mostrarCliente();
              
                break;
            
            case 3:
                break;
                
        }
                
                
                
    }
}


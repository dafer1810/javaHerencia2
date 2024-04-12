
package ejercicioHerenciaDos;

import javax.swing.JOptionPane;


public class Empleado extends Persona {
     private double salario; 

    public Empleado(double salario, String nombre, int edad) {
        super(nombre, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
      public void mostrarEmpleado (){
          JOptionPane.showMessageDialog(null, "EL NOMBRE ES: "+ getNombre()+ 
                                        "\nLA EDAD ES: "+ getEdad()+
                                        "\nEL SALARIO ES: "+ getSalario()); 
          
        
      }
     
}

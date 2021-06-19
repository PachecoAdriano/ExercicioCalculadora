
package exerciciocalculadora;

import javax.swing.JOptionPane;

public class ExercicioCalculadora {

    public static void main(String[] args) {
        try{
            Calculadora calc = new Calculadora();
            calc.calcular();
            JOptionPane.showMessageDialog(null, "O valor encontrado é " + calc.getResult());
          
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Algo deu errado. Tente novamente.");
        }        
    }    
}


package Exercicios;
import javax.swing.*;
public class CaixaDagua {
    public static void main(String[] args){
        
      double altura, raio,volume,soma;
      final double PI = 3.141592;
      final double M_cubo = 1000;
      
      
    altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a Altura:\n"));
    raio = Integer.parseInt(JOptionPane.showInputDialog("Digite o Raio:"));
    
    volume = PI * ((raio * raio) * altura);
    soma = volume * M_cubo;
    
    JOptionPane.showMessageDialog(null,"Essa Caixa Comporta: \n" + soma + "m³" );
    
    }
    
}

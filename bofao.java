package bofao;

import javax.swing.JOptionPane;


public class Bofao {

    public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("digite seu nome");
    JOptionPane.showMessageDialog(null, "bem vindo"+nome);
    String idade = JOptionPane.showInputDialog("digite sua idade");
    String msg = "que legal"+nome+",voce tem"+idade+"anos";
    JOptionPane.showMessageDialog(null, msg);
    String r1 = JOptionPane.showInputDialog("qual o contrario de papelada");
    if(r1.equals("pavestida")) {
        JOptionPane.showInputDialog(null, "acertou");
          
    }
    else{
        JOptionPane.showInputDialog(null,"errou");
    }
{   
    
}         

            }
    
}

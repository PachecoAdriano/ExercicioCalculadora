
package exerciciocalculadora;

import javax.swing.JOptionPane;

public class Calculadora {
    private int n1;
    private int n2;
    private String sinal;
    private float result;

    public double getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public String getSinal() {
        return sinal;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }

    Calculadora() {
        this.n1 = 0;
        this.n2 = 0;
        this.sinal = "";        
    }
    
    public float calcular(){
        this.n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        this.sinal = JOptionPane.showInputDialog("Digite a operação");
        this.n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        
        
        if(null != this.sinal)switch (this.sinal) {
            case "+":
                this.result = this.getN1() + this.getN2();
                break;
            case "-":
                this.result = this.getN1() - this.getN2();
                break;
            case "*":
                this.result = this.getN1() * this.getN2();
                break;
            case "/":
                if (this.getN2() == 0){
                    JOptionPane.showMessageDialog(null, "Esta operação não é possível de ser realizada.");
                    System.exit(0);
                }else{this.result = this.getN1() / this.getN2();
                break;
                }                
            default: 
                JOptionPane.showMessageDialog(null, "Operação não reconhecida. Tente novamente.");                
                System.exit(0);               
        }         
        return this.result;
    }
}

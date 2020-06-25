
package revisãotecnico04;

import javax.swing.JOptionPane;

/**
 *
 * @author samuc
 */
public class Revisãotecnico04 {

    /*
    *Elabore um algoritmo que calcule o que deve ser pago por um produto, 
    considerando o preço normal de etiqueta e a escolha da condição de 
    pagamento. Utilize os códigos da tabela a seguir para ler qual a condição 
    de pagamento escolhida e efetuar o cálculo adequado.Código Condição de
    pagamento - Código: 1 -> À vista em dinheiro ou cheque, recebe 10% de 
    desconto;-Código: 2 -> À vista no cartão de crédito, recebe 15% de desconto;
    - Código: 3 -> Em duas vezes, preço normal de etiqueta sem juros; - 
    Código: 4 -> Em duas vezes, preço normal de etiqueta mais juros de 10%.   * 
     */
    public static void main(String[] args) {
        
        double valordoproduto, valorpagamento, valordesconto, valorjuros, vezes;
        int codigo;
        
        
        valordoproduto = Double.parseDouble(JOptionPane.showInputDialog("insira o valor do produto: "));
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Inisra o código do pagamento: "));
        
        if(codigo == 1){
            valordesconto = valordoproduto * 0.1;
            valorpagamento = valordoproduto - valordesconto;
            
            JOptionPane.showMessageDialog(null, "O código inserido foi 1, então o pagamento sera em dinheiro ou cheque\n"
                    + "O valor do produto é de: R$"+valordoproduto+"\n seu desconto sera de: R$"+valordesconto+
                    "\n E o valor total do pagamento será de: R$"+valorpagamento);
        }
        else if(codigo == 2){
            valordesconto = valordoproduto * 0.15;
            valorpagamento = valordoproduto - valordesconto;
            
            JOptionPane.showMessageDialog(null, "O código inserido foi 2, então o pagamento sera à vista no cartão de crédito\n"
                    + "O valor do produto é de: R$"+valordoproduto+"\n seu desconto sera de: R$"+valordesconto+
                    "\n E o valor total do pagamento será de: R$"+valorpagamento);
        }
        else if(codigo == 3){
            valordesconto = 0;
            valorpagamento = valordoproduto - valordesconto;
            vezes = valorpagamento / 2;
            
            JOptionPane.showMessageDialog(null, "O código inserido foi 3, então o pagamento sera em duas vezes sem juros.\n"
                    + "O valor do produto é de: R$"+valordoproduto+"\n seu desconto sera de: R$"+valordesconto+
                    "\n E o valor total do pagamento será de: R$"+valorpagamento+ "\n E o valor que será pago em 2 vezes é de: R$"+vezes);
        }
        else if(codigo == 4){
            valordesconto = 0;
            valorjuros = valordoproduto * 0.1;
            valorpagamento = valordoproduto + valorjuros;
            vezes = valorpagamento / 2 ;
            
            JOptionPane.showMessageDialog(null, "O código inserido foi 4, então o pagamento sera em duas vezes com juros de 10%"
                    + "\n O preço do juros sera de: R$"+valorjuros+"\nO valor do produto é de: R$"+valordoproduto+"\n seu desconto sera de: R$"+valordesconto+
                    "\n O valor total do pagamento será de: R$"+valorpagamento+ "\n E o valor que será pago em 2 vezes é de: R$"+vezes);
        }
        else{
            JOptionPane.showMessageDialog(null, "Seu código foi inválido, não existe este código");
        }
        
        
        
    }
    
}

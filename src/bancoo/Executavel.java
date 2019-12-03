/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoo;

/**
 *
 * @author carol
 */
public class Executavel {

    ContaBancaria Contaa = new ContaCorrente();

    ContaBancaria Contap = new ContaPoupanca();

    Scanner scan = new Scanner(System.in);

    System.out.println (
    "Digite o valor do depósito inicial **Conta corrente");
        double quantia = scan.nextDouble();

    cConta.depositar (quantia);

    System.out.println (
    "Digite o valor do saque **Conta corrente");
        quantia  = scan.nextDouble();

    cConta.sacar (quantia);

    System.out.println (
    "Digite o valor do depósito inicial **Conta poupança");
        quantia  = scan.nextDouble();

    pConta.depositar (quantia);

    System.out.println (
    "Digite o valor do saque **Conta poupança");
        quantia  = scan.nextDouble();

    pConta.sacar (quantia);

    Relatorio nRelatorio = new Relatorio();

    nRelatorio.gerarRelatorio (

    (Imprimivel) cConta);
        
    nRelatorio.gerarRelatorio (
    (Imprimivel) pConta);

*/
            
}
    
}

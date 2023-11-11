/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caixaeletronico;
import model.conta;
import java.util.Scanner;
/**
 *
 * @author aaron
 */
public class tranacoes {
    String extrato[];
    conta c1  = new conta( "","", 0);
        Scanner scanner = new Scanner(System.in);
    
    public void depositar(float valor){
        System.out.println("Digite o Valor a Ser Depositado");
        valor  = scanner.nextFloat();
        valor = c1.getSaldo() + valor;
        c1.setSaldo(valor);
         extrato[0] = "Depoito realizado";
    }
    
    public void sacar(float valor){
        System.out.println("Digite o Valor a Ser Depositado");
        valor  = scanner.nextFloat();
         if(valor>0&&valor<=c1.getSaldo()){
             System.out.println("Concluido ");
         }
    
    }
    
}

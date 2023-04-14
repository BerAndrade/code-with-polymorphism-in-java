package com.mycompany.principal;
public class Principal {

    public static void main(String[] args) {
        
        Cliente [] cliente = {new Rural ("Maria da Silva", "Rua 123", 220, 240), new Urbano("José da Silva ", "Rua abc", 30, 35)};
        for (Cliente c: cliente){ 
            c.aplicaraliquota();
            c.calcularvalorconta();                      
            System.out.println("\nNome do cliente...: " + c.getNome());
            System.out.println("Valor da conta....: " + c.getValorconta());
        }
    }
}

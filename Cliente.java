package com.mycompany.principal;
public class Cliente {
    
    
    protected String nome;
    protected String endereco;
    protected double qtdaguaconsumida;
    protected double qtdesgotoproduzido;
    protected double valorconta;

    public Cliente(String nome, String endereco, double qtdaguaconsumida, double qtdesgotoproduzido) {
        this.nome = nome;
        this.endereco = endereco;
        this.qtdaguaconsumida = qtdaguaconsumida;
        this.qtdesgotoproduzido = qtdesgotoproduzido;
        this.valorconta = valorconta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getQtdaguaconsumida() {
        return qtdaguaconsumida;
    }

    public void setQtdaguaconsumida(double qtdaguaconsumida) {
        this.qtdaguaconsumida = qtdaguaconsumida;
    }

    public double getQtdesgotoproduzido() {
        return qtdesgotoproduzido;
    }

    public void setQtdesgotoproduzido(double qtdesgotoproduzido) {
        this.qtdesgotoproduzido = qtdesgotoproduzido;
    }
    
    public double getValorconta(){
        return valorconta;
    }
    
    public void calcularvalorconta(){
        
    }
    
    public double aplicaraliquota(){
        return  0 ;
    }
}

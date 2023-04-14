package com.mycompany.principal;
public class Urbano extends Cliente{
    
     public Urbano (String nome, String endereco, double qtdaguaconsumida, double qtdesgotoproduzido) {
        super(nome, endereco, qtdaguaconsumida, qtdesgotoproduzido);
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

    public double getValorconta() {
        return valorconta;
    }
    
    @Override
    public void calcularvalorconta(){
        valorconta = (qtdaguaconsumida + qtdesgotoproduzido) * 3.5 * (1 + aplicaraliquota());
    }
    
    @Override
    public double aplicaraliquota(){
        double aux;
        if(qtdaguaconsumida <= 20){
            aux = 0.03;
        }
        else{
            aux = 0.15;
        }
        return aux;
    }
}

package br.fiap.cliente;

import br.fiap.desconto.Desconto;

import java.util.Random;

public class PessoaJuridica extends Cliente implements Desconto {
    private String cnpj;

    public PessoaJuridica(String nome, String contato, String cnpj) {
        super(nome, contato);
        this.cnpj = cnpj;
    }

    public String toString() {
        String aux = super.toString();
        aux += "CNPJ: " + cnpj + "\n";
        return aux;
    }

    @Override
    public double aplicarDesconto(double valorOriginal) {
        Random random = new Random();
        double porcentagem = random.nextDouble(10) + 1;
        double desconto = valorOriginal * porcentagem/100;
        return valorOriginal - desconto;
    }

    public String getIdentificador() {
        return this.cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova_pratica_2;

import java.util.ArrayList;

/**
 *
 * @author 1648052
 */
public class AluguelBasico extends Aluguel{
    private int quilometragem;

    public AluguelBasico(int quilometragem, String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status, ArrayList<Veiculo> listaVeiculos) {
        super(nomeCliente, quantidadeDias, valorTotal, status, listaVeiculos);
        this.quilometragem = quilometragem;
    }

    

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }
    
    @Override
    public void exibirDetalhes(){
        System.out.println("Detalhes desse plano");
    }
    
    @Override
    public boolean possuiSeguroIncluso(){
        return false;
    }
}

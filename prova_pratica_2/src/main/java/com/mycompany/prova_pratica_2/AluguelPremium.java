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
public class AluguelPremium extends Aluguel{

    public AluguelPremium(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status, ArrayList<Veiculo> listaVeiculos) {
        super(nomeCliente, quantidadeDias, valorTotal, status, listaVeiculos);
    }
    
    @Override
    public void exibirDetalhes(){
        System.out.println("Detalhes desse plano");
    }
    
    @Override
    public boolean possuiSeguroIncluso(){
        return true;
    }
}

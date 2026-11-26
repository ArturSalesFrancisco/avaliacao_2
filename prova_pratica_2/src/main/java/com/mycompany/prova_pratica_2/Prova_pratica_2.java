/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_pratica_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1648052
 */
public class Prova_pratica_2 {
    ArrayList<Veiculo> veiculosIniciais;
    ArrayList<Aluguel> alugueisIniciais;
    Iterator<Veiculo> it = veiculosIniciais.iterator();
    Scanner entrada;
    
    public ArrayList adicionarVeiculo(Veiculo veiculo, Aluguel aluguel){
        ArrayList<Veiculo> listaVeiculos = aluguel.getListaVeiculos();
        listaVeiculos.add(veiculo);
        
        return listaVeiculos;
    }

    public void exibirVeiculos(ArrayList<Veiculo> lista){
        for(Veiculo v : lista){
            v.exibirDetalhes();
        }
    }
    
    public void exibirAlugueis(ArrayList<Aluguel> lista){
        for(Aluguel a : lista){
            a.exibirDetalhes();
        }
    }
    
    public void veiculosDisponiveis(ArrayList<Veiculos> lista){
        for(Veiculo v : lista){
            if(v.getStatus() == StatusVeiculo.DISPONIVEL){
                v.exibirDetalhes();
            }
        }
    }
    
    public void avaliar(Carro c, int nota){
        c.avaliar(nota);
    }
    
    public void avaliar(Van v, int nota){
        v.avaliar(nota);
    }
    
    public void inspecionar(Moto m){
        m.realizarInspecao();
    }
    
    public void inspecionar(Van v){
        v.realizarInspecao();
    }
    
    public void removerVeiculosManutencao(ArrayList<Veiculo> lista){
        while(it.hasNext()){
            StatusVeiculo s = it.next();
            if(s == StatusVeiculo.MANUTENCAO){
                it.remove();
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.print("MENU: \n");

    }
}

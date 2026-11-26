/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova_pratica_2;

/**
 *
 * @author 1648052
 */
public class Van extends Veiculo implements Avaliavel, Inspecionavel{
    private int maxPassageiros;

    public Van(int maxPassageiros, String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem, StatusVeiculo status) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.maxPassageiros = maxPassageiros;
    }

    public int getMaxPassageiros() {
        return maxPassageiros;
    }

    public void setMaxPassageiros(int maxPassageiros) {
        this.maxPassageiros = maxPassageiros;
    }
    
    @Override
    public void exibirDetalhes(){
        System.out.println("Detalhes dessa van");
    }
    
    @Override
    public boolean possuiSeguroEspecial(){
        return true;
    }
    
    @Override
    public void avaliar(int nota){
        System.out.println("Van avaliada! Nota: " + nota);
    }
    
    @Override
    public void realizarInspecao(){
        System.out.println("Inspeção realizada");
    }
}

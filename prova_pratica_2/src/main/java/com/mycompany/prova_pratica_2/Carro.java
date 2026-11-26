/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova_pratica_2;

/**
 *
 * @author 1648052
 */
public class Carro extends Veiculo implements Avaliavel{
    private int qntPortas;

    public Carro(int qntPortas, String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem, StatusVeiculo status) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.qntPortas = qntPortas;
    }

    public int getQntPortas() {
        return qntPortas;
    }

    public void setQntPortas(int qntPortas) {
        this.qntPortas = qntPortas;
    }
    
    @Override
    public void exibirDetalhes(){
        System.out.println("Detalhes desse carro");
    }
    
    @Override
    public boolean possuiSeguroEspecial(){
        return true;
    }
    
    @Override
    public void avaliar(int nota){
        System.out.println("Carro avaliado! Nota: " + nota);
    }
}

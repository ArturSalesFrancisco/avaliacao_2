/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova_pratica_2;

/**
 *
 * @author 1648052
 */
public class Moto extends Veiculo implements Inspecionavel{
    private String cilindrada;

    public Moto(String cilindrada, String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem, StatusVeiculo status) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    @Override
    public void exibirDetalhes(){
        System.out.println("Detaçhes dessa moto");
    }
    
    @Override
    public boolean possuiSeguroEspecial(){
        return true;
    }
    
    @Override
    public void realizarInspecao(){
        System.out.println("Inspeção realizada");
    }
}

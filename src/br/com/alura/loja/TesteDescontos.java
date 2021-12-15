package br.com.alura.loja;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;

/**
 *
 * @author robson-pc
 */
public class TesteDescontos {

    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo  = new Orcamento(new BigDecimal("1000"), 1);
        Orcamento terceiro = new Orcamento(new BigDecimal("100"), 4);

        CalculadoraDeDesconto Calculadora = new CalculadoraDeDesconto();
        System.out.println(Calculadora.calcular(primeiro));
        System.out.println(Calculadora.calcular(segundo));
        System.out.println(Calculadora.calcular(terceiro));
    }
}

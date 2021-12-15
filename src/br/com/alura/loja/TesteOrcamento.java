/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.loja;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.situacao.Aprovado;
import java.math.BigDecimal;

/**
 *
 * @author robson-pc
 */
public class TesteOrcamento {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("500"), 10);
        orcamento.aprovar();
        System.out.println(orcamento.getValor());
    }
}

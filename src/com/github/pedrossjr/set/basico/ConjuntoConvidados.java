package com.github.pedrossjr.set.basico;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionadrConvidado(String nome, int codigoConvite) {
        convidadoSet.add((new Convidado(nome, codigoConvite)));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }

        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados(s) dentro do Set de Convidados");

        conjuntoConvidados.adicionadrConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionadrConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionadrConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionadrConvidado("Convidado 4", 1236);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados(s) dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados(s) dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author fernanda.nunes
 */
class Aluno {

    String nome;
    int ra, anoNascimento;

    public Aluno(String nome, int ra, int anoNascimento) {
        this.nome = nome;
        this.ra = ra;
        this.anoNascimento = anoNascimento;
    }

    public String GetNome() {
        return nome;
    }

    public void SetNome(String NovoNome) {
        nome = NovoNome;
    }

    public int GetRa() {
        return ra;
    }

    public void SetRa(int NovoRa) {
        ra = NovoRa;
    }

    public int GetAnoNascimento() {
        return anoNascimento;
    }

    public void SetAnoNascimento(int NovoAno) {
        anoNascimento = NovoAno;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " R.A: " + ra + " Ano: " + anoNascimento;
    }
}

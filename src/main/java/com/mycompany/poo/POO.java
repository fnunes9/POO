/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author fernanda.nunes
 */
public class POO {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fernanda", 321, 2000);
        MostraAluno(aluno1);
        aluno1.SetAnoNascimento(2010);
        MostraAluno(aluno1);

    }

    static void MostraAluno(Aluno aluno) {
        int idade = Metodos.CalculaIdade(aluno.GetAnoNascimento());
        System.out.println(aluno.toString() + "\nIdade do aluno: " + idade);
    }
}

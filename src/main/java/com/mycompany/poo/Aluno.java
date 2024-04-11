/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author fernanda.nunes
 */
public class Aluno {
    String nome;
    int ra, anoNascimento;
    
    public  Aluno(String nome, int ra, int anoNascimento){
        this.nome=nome;
        this.ra=ra;
        this.anoNascimento=anoNascimento;
    }
    
    public String GetNome(){
        return nome;
    }
    public int  GetRa(){
        return ra;
    }
    public int GetIdade(){
        return anoNascimento;
    }
}

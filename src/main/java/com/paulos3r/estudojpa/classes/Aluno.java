package com.paulos3r.estudojpa.classes;

import javax.persistence.*;

@Entity
public class Aluno {
    //gerar um id do tipo identity
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nome;
    @Column
    private int idade;
//    @Column
//    private int estado_id;
    //EAGER(ANSIOSO) LAZY (PREGUICOSO) toda vez que carregar o alugo carrega tambem o estado que ele ta
    @ManyToOne(fetch = FetchType.LAZY)
    private Estado estado;

    public Aluno(){}

    public Aluno(String nome,int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome,int idade,Estado estado){
        this.nome = nome;
        this.idade = idade;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}

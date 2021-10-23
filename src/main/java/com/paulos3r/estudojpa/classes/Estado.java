package com.paulos3r.estudojpa.classes;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String sigla;
    @Column
    private String nome;
    @OneToMany(
            mappedBy = "estado",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Aluno> alunos = new ArrayList<>();

    public Estado(){}

    public Estado(String sigla,String nome){
        this.sigla = sigla;
        this.nome = nome;
    }
    public Estado(String sigla,String nome, List<Aluno> alunos){
        this.sigla = sigla;
        this.nome = nome;
        this.alunos = alunos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

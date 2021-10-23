package com.paulos3r.estudojpa;

import com.paulos3r.estudojpa.classes.Aluno;
import com.paulos3r.estudojpa.classes.Estado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

// este projeto e somente a interface do JPA
public class index {
    public static void main(String[] args) {
        //criando uma conexão
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudo");
            EntityManager em = emf.createEntityManager();

            //--------JPQL-------

//            String sql = "SELECT a FROM aluno a WHERE a.nome = :nome";
//
//            String sqlLista= "SELECT a FROM Aluno a";
//
//            List<Aluno> aluno = em
//                    .createQuery(sqlLista, Aluno.class)
//                    .getResultList();
//
//            aluno.forEach( Aluno -> System.out.println(Aluno.getNome() + " " + Aluno.getIdade() + " " + Aluno.getEstado()));

            //---------------ADICIONANDO NO BANCO DE DADOS -----------------------

//            Estado estado = new Estado("DF","DISTRITO FEDERAL");
//            Aluno aluno = new Aluno("Raquel",29, estado);
//
//            //e obrigatorio o uso quando utiliza algum método que realiza alteração no banco
//            em.getTransaction().begin();
//            //persistindo os dados selecionados no banco
//            em.persist(estado);
//            em.persist(aluno);
//            //subindo para o banco
//            em.getTransaction().commit();

            //---------------  CONSULTADO NO BANCO DE DADOS -----------------------

//            Estado estado1 = em.find(Estado.class, 1);
//            Aluno aluno1 = em.find(Aluno.class, 6);
//            //imprimindo aluno
//            System.out.println(estado1.getNome());
//            System.out.println(aluno1.getNome());

            //-------------- ALTERAÇÃO -------------------------

//            //começa a obter transação
//            em.getTransaction().begin();
//
//            //consulta no banco
//            Aluno aluno = em.find(Aluno.class, 6);
//            //passando os parametros que vao ser alterados
//            aluno.setNome("Paulão Ricardo");
//            aluno.setIdade(40);
//
//            //sobe a alteração
//            em.getTransaction().commit();

            //-----------REMOVER------------------------

//            // obitive uma transação
//            em.getTransaction().begin();
//
//            //buscando o aluno
//            Aluno aluno = em.find(Aluno.class, 6);
//
//            //removendo ele do banco
//            em.remove(aluno);
//
//            //subindo a alteração
//            em.getTransaction().commit();
//
//            //-----FECHANDO A CONEXÃO----

            em.close();
            emf.close();

        }catch (Exception e){
            System.err.println("tratando class Factory" + e.getMessage());
            e.printStackTrace();
        }
    }
}
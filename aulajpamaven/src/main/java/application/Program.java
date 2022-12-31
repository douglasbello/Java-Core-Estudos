package application;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main (String[] args) {
//        Pessoa p1 = new Pessoa(null,"Carlos da Silva","carlos@gmail.com");
//        Pessoa p2 = new Pessoa(null,"Joaquim Torres","joaquim@gmail.com");
//        Pessoa p3 = new Pessoa(null,"Ana Maria","ana@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

//        em.getTransaction().begin(); // inicia uma trocação com o banco de dados.
//        em.persist(p1); // 'em.persist' -> salva os objetos no banco de dados
//        em.persist(p2);
//        em.persist(p3);
//        em.getTransaction().commit(); // finaliza a trocação com o banco de dados.

//        Pessoa p = em.find(Pessoa.class,2); // em.find busca uma class pessoa no banco de dados, cujo id é 2
//
//        System.out.println(p);

//        Pessoa p = new Pessoa(2,null,null); // está é uma entidade não monitorada, em.remove não funciona nesse objeto

        Pessoa p = em.find(Pessoa.class,2); // está é uma entidade monitorada, em.remove funciona nesse objeto

        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        System.out.println("Pronto!");
        em.close();
        emf.close();
    }
}

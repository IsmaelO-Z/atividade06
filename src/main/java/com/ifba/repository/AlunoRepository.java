package com.ifba.repository;

import com.ifba.hibernate.Aluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class AlunoRepository implements AlunoInterface {

    private EntityManagerFactory emf = FabricaConexao.getFabrica();
    private EntityManager em = emf.createEntityManager();

    @Override
    public void salvar(Aluno aluno) {
        em.getTransaction().begin();
        em.persist(aluno);
        em.getTransaction().commit();
        em.close();

        System.out.println("Salvo com sucesso!");
    }


    @Override
    public void apagar(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'apagar'");
    }

    @Override
    public void atualizar(Aluno aluno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public Aluno buscarPorId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

}

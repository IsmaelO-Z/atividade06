package com.ifba.repository;

import com.ifba.hibernate.Matricula;
import jakarta.persistence.EntityManager;

public class MatriculaRepository implements MatriculaInterface {

    private EntityManager em = FabricaConexao.getFabrica().createEntityManager();

    @Override
    public void salvar(Matricula matricula) {
        em.getTransaction().begin();
        em.persist(matricula);
        em.getTransaction().commit();
    }

    @Override
    public void apagar(int id) {
        em.getTransaction().begin();
        Matricula matricula = em.find(Matricula.class, id);
        if (matricula != null) {
            em.remove(matricula);
            em.getTransaction().commit();
        }
    }

    @Override
    public void atualizar(Matricula matricula) {
        em.getTransaction().begin();
        em.merge(matricula);
        em.getTransaction().commit();
    }

    @Override
    public Matricula buscarPorId(int id) {
        return em.find(Matricula.class, id);
    }
}

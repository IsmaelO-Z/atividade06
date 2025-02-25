package com.ifba.repository;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FabricaConexao {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");

    public static EntityManagerFactory getFabrica(){
        return emf;
    }
}

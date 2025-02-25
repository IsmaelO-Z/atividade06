package com.ifba.repository;

import com.ifba.hibernate.Matricula;

public interface MatriculaInterface {
    void salvar(Matricula matricula);
    void apagar(int id);
    void atualizar(Matricula matricula);
    Matricula buscarPorId(int id);
}

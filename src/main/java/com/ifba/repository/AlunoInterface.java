package com.ifba.repository;

import com.ifba.hibernate.Aluno;

public interface AlunoInterface {
    void salvar(Aluno aluno);
    void apagar(int id);
    void atualizar(Aluno aluno);
    Aluno buscarPorId(int id);
}

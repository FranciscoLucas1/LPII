package com.example.projetojavafx.model.dao;

import com.example.projetojavafx.model.entities.Aluno;

public interface AlunoDao {

    void inserir(Aluno a);

    Aluno exibirPorId(int id);

    void deletar(int id);

    Aluno atualizar(int id);



}

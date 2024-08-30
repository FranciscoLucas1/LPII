package com.example.projetojavafx.model.dao.impl;

import com.example.projetojavafx.db.DB;
import com.example.projetojavafx.model.dao.AlunoDao;
import com.example.projetojavafx.model.entities.Aluno;

import java.sql.*;

public class AlunoDaoJDBC implements AlunoDao {

    private Connection conn;
    public AlunoDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void inserir(Aluno a) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("insert into aluno(nome, cpf, datanascimento, foto) values (?,?,?,?)");
            st.setString(1, a.getNome());
            st.setString(2, a.getCpf());
            st.setDate(3, new Date(a.getDataNascimento().getTime()));
            st.setBytes(4, a.getFoto());
            st.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            DB.closeStatement(st);
        }
    }

    @Override
    public Aluno exibirPorId(int id) {
        return null;
    }

    @Override
    public void deletar(int id) {

    }

    @Override
    public Aluno atualizar(int id) {
        return null;
    }
}

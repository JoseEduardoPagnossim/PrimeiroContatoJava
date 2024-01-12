package oo.composiçao;

import java.util.ArrayList;

public class Curso {

    String nomeCurso;
    ArrayList<Aluno> alunos = new ArrayList<>();

    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(aluno);
        aluno.cursos.add(this);
    }
}

import java.util.ArrayList;

public class Turma {

    ArrayList<Aluno> alunos = new ArrayList<>();

    void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    void imprimirAlunos() {
        for (Aluno aluno : alunos) {
            System.out.printf("%s (%d anos)%n ",aluno.nome,aluno.idade);
        }
    }

}

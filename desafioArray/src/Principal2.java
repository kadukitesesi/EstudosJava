import java.util.ArrayList;

public class Principal2 {
    public static void main(String[] args) {

        Turma turmas = new Turma();

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Joãozinho";
        aluno1.idade = 12;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Laura";
        aluno2.idade = 4;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Miguel";
        aluno3.idade = 3;

        turmas.adicionarAluno(aluno1);
        turmas.adicionarAluno(aluno2);
        turmas.adicionarAluno(aluno3);

        turmas.imprimirAlunos();
    }
    }


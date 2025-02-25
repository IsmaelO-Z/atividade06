import com.ifba.hibernate.Aluno;
import com.ifba.repository.AlunoRepository;

public class TesteCamadas {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(0, "Roberto", "23242526");

        AlunoRepository alunoRepository = new AlunoRepository();
        alunoRepository.salvar(aluno);
        
        //Criando uma matrícula para o aluno
        //Matricula matricula = new Matricula(0, "Engenharia de Software", aluno, null);

        //MatriculaRepository matriculaRepository = new MatriculaRepository();
        //matriculaRepository.salvar(matricula);

        //Matricula matriculaEncontrada = matriculaRepository.buscarPorId(1);
        //if (matriculaEncontrada != null) {
        //    System.out.println("Matrícula encontrada: " + matriculaEncontrada);
        //}

        //matriculaEncontrada.setCurso("Informática Básica");
        //matriculaRepository.atualizar(matriculaEncontrada);

        // Apagando a matrícula
        //matriculaRepository.apagar(matriculaEncontrada.getId());
    }
}

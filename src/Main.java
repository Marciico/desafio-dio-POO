import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public  static void  main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso de Java");
        curso.setDescricao("Curso de Java para iniciantes");
        curso.setCargaHoraria(8);
        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria para tirar dúvidas sobre Java");
        mentoria.setData(java.time.LocalDate.now());

        System.out.println(mentoria);
    }
}

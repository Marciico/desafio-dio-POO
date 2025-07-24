import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public  static void  main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso de Java");
        curso.setDescricao("Curso de Java para iniciantes");
        curso.setCargaHoraria(8);
        System.out.println(curso);

        Conteudo conteudo = new Curso(); // Polimorfismo: Conteudo é a classe Mãe e Curso é a classe Filha
        Conteudo conteudo2 = new Mentoria(); // Polimorfismo: Conteudo é a classe Mãe e Mentoria é a classe Filha

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria para tirar dúvidas sobre Java");
        mentoria.setData(java.time.LocalDate.now());

        System.out.println(mentoria);
    }
}

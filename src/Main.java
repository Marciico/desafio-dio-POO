import br.com.dio.desafio.dominio.*;

public class Main {
    public  static void  main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso de Java");
        curso.setDescricao("Curso de Java para iniciantes");
        curso.setCargaHoraria(8);
        System.out.println(curso);

        System.out.println("------------------------");

        Conteudo conteudo = new Curso(); // Polimorfismo: Conteudo é a classe Mãe e Curso é a classe Filha
        Conteudo conteudo2 = new Mentoria(); // Polimorfismo: Conteudo é a classe Mãe e Mentoria é a classe Filha

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria para tirar dúvidas sobre Java");
        mentoria.setData(java.time.LocalDate.now());
        System.out.println(mentoria);

        System.out.println("------------------------");

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Bootcamp para se tornar um desenvolvedor Java");
        bootCamp.getConteudos().add(curso);
        bootCamp.getConteudos().add(mentoria);
        System.out.println("Conteúdos do Bootcamp: " + bootCamp.getConteudos());


        System.out.println("------------------------");

        Dev devMarcio = new Dev();
        devMarcio.setNome("Márcio");
        devMarcio.inscreverBootcamp(bootCamp);
        devMarcio.progredir();


        System.out.println("Conteúdos Inscritos Márcio: " + devMarcio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Márcio: " + devMarcio.getConteudosConcluidos());
        System.out.println("XP Márcio: " + devMarcio.calcularTotalXp());
    }
}

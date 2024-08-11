import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = criarCurso("curso java", "descrição curso java", 8);
        Curso curso2 = criarCurso("curso js", "descrição curso js", 4);
        Mentoria mentoria = criarMentoria("mentoria de java", "descrição mentoria java", LocalDate.now());

        Bootcamp bootcamp = criarBootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        adicionarConteudo(bootcamp, curso1);
        adicionarConteudo(bootcamp, curso2);
        adicionarConteudo(bootcamp, mentoria);

        Dev devCamila = criarDev("Camila");
        inscreverBootcamp(devCamila, bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        progredir(devCamila);
        progredir(devCamila);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = criarDev("João");
        inscreverBootcamp(devJoao, bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        progredir(devJoao);
        progredir(devJoao);
        progredir(devJoao);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }

    private static Curso criarCurso(String titulo, String descricao, int cargaHoraria) {
        Curso curso = new Curso();
        curso.setTitulo(titulo);
        curso.setDescricao(descricao);
        curso.setCargaHoraria(cargaHoraria);
        return curso;
    }

    private static Mentoria criarMentoria(String titulo, String descricao, LocalDate data) {
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(titulo);
        mentoria.setDescricao(descricao);
        mentoria.setData(data);
        return mentoria;
    }

    private static Bootcamp criarBootcamp(String nome, String descricao) {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome(nome);
        bootcamp.setDescricao(descricao);
        return bootcamp;
    }

    private static void adicionarConteudo(Bootcamp bootcamp, Object conteudo) {
        bootcamp.getConteudos().add((Conteudo) conteudo);
    }

    private static Dev criarDev(String nome) {
        Dev dev = new Dev();
        dev.setNome(nome);
        return dev;
    }

    private static void inscreverBootcamp(Dev dev, Bootcamp bootcamp) {
        dev.inscreverBootcamp(bootcamp);
    }

    private static void progredir(Dev dev) {
        dev.progredir();
    }
}

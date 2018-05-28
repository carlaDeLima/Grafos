package disciplinas;

import java.util.ArrayList;
import java.util.List;

public class PreencherMatrizCurricular {

    protected static List<Disciplina> disciplinas = new ArrayList<>();

    public static List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public static void setDisciplinas(List<Disciplina> disciplinas) {
        PreencherMatrizCurricular.disciplinas = disciplinas;
    }

    public static void criarDisciplinas() {
        semestre1();
        semestre2();
        semestre3();
        semestre4();
        semestre5();
        semestre6();
        semestre7();
        semestre8();
    }

    private static void semestre8() {
        //8º Semestre (5)
        disciplinas.add(new Disciplina("N525", 8, "COMPILADORES I", getDisciplina("N587")));
        disciplinas.add(new Disciplina("N534", 8, "GERENCIA DE PROJETOS", getDisciplina("N562")));
        disciplinas.add(new Disciplina("N589", 8, "PROCESSAMENTO DE IMAGENS", getDisciplina("N094"), getDisciplina("N512")));
        disciplinas.add(new Disciplina("N597", 8, "TRABALHO CONCLUSAO DE CURSO II", getDisciplina("N596")));
        disciplinas.add(new Disciplina("N598", 8, "SISTEMAS DISTRIBUIDOS", getDisciplina("N562"), getDisciplina("T958")));
    }

    private static void semestre7() {
        //7º Semestre (6)
        disciplinas.add(new Disciplina("N517", 7, "ENGENHARIA DE SOFTWARE", getDisciplina("N562")));
        disciplinas.add(new Disciplina("N519", 7, "INTELIGENCIA ARTIFICIAL", getDisciplina("N097"), getDisciplina("N593"), getDisciplina("N584")));
        disciplinas.add(new Disciplina("N521", 7, "COMPUTACAO GRAFICA", getDisciplina("N617"), getDisciplina("N524")));
        disciplinas.add(new Disciplina("N588", 7, "COMPUTABILIDADE", getDisciplina("N587")));
        disciplinas.add(new Disciplina("N595", 7, "REDES DE COMPUTADORES II", getDisciplina("T958")));
        disciplinas.add(new Disciplina("N596", 7, "TRABALHO CONCLUSAO CURSO I", getDisciplina("N421"), getDisciplina("N592"), getDisciplina("T958"), getDisciplina("N672")));
    }

    private static void semestre6() {
        //6º Semestre (5)
        disciplinas.add(new Disciplina("N562", 6, "ANALISE E PROJETO SISTEMAS II", getDisciplina("N672")));
        disciplinas.add(new Disciplina("N564", 6, "PESQUISA OPERACIONAL", getDisciplina("N617")));
        disciplinas.add(new Disciplina("N587", 6, "TEORIA DOS AUT E LING FORMAIS", getDisciplina("N097"), getDisciplina("N583")));
        disciplinas.add(new Disciplina("N593", 6, "PARADIGMAS DE LING PROGRAMACAO", getDisciplina("N512")));
        disciplinas.add(new Disciplina("T958", 6, "REDES DE COMPUTADORES", getDisciplina("T952")));
    }

    private static void semestre5() {
        //5º Semestre (6)
        disciplinas.add(new Disciplina("N421", 5, "PRODUÇÃO DE TRAB CIENTÍFICOS"));
        disciplinas.add(new Disciplina("N565", 5, "GESTAO DA TECN DA INFORMACAO", getDisciplina("N620")));
        disciplinas.add(new Disciplina("N584", 5, "PROJ ANALISE DE ALGORITMOS", getDisciplina("N618"), getDisciplina("N583")));
        disciplinas.add(new Disciplina("N592", 5, "TEC DE IMPL DE SISTEMAS DE BD", getDisciplina("N673")));
        disciplinas.add(new Disciplina("N672", 5, "ENG REQUISITOS TESTE SOFTWARE", getDisciplina("N579"), getDisciplina("N524")));
        disciplinas.add(new Disciplina("T952", 5, "SISTEMAS OPERACIONAIS", getDisciplina("N607"), getDisciplina("T922")));
    }

    private static void semestre4() {
        //4º Semestre (5)
        disciplinas.add(new Disciplina("N554", 4, "TECNOLOGIAS INTERNET I", getDisciplina("N524")));
        disciplinas.add(new Disciplina("N583", 4, "TEORIA DOS GRAFOS", getDisciplina("N512")));
        disciplinas.add(new Disciplina("N617", 4, "CÁLCULO NUMÉRICO", getDisciplina("N094"), getDisciplina("N611"), getDisciplina("N573")));
        disciplinas.add(new Disciplina("N618", 4, "PROBABILIDADE E ESTATÍSTICA"));
        disciplinas.add(new Disciplina("N673", 4, "FUNDAMENTOS DE BANCO DE DADOS", getDisciplina("N512")));
    }

    private static void semestre3() {
        //3º Semestre (5)
        disciplinas.add(new Disciplina("N097", 3, "LOGICA MATEMATICA", getDisciplina("N096")));
        disciplinas.add(new Disciplina("N524", 3, "TECNICAS DE PROGRAMACAO", getDisciplina("T922")));
        disciplinas.add(new Disciplina("N607", 3, "ARQUIT E ORG DE COMPUTADORES", getDisciplina("N532")));
        disciplinas.add(new Disciplina("N620", 3, "ADMIN, EMPREEND E INOVAÇÃO"));
        disciplinas.add(new Disciplina("N512", 3, "ESTRUTURA DE DADOS", getDisciplina("T922")));
    }

    private static void semestre2() {
        //2º Semestre (5)
        disciplinas.add(new Disciplina("N094", 2, "ALG LINEAR E GEOM ANALÍTICA"));
        disciplinas.add(new Disciplina("N532", 2, "SISTEMAS LOGICOS E DIGITAIS", getDisciplina("N096")));
        disciplinas.add(new Disciplina("N579", 2, "PROJETO DE INTERFACE", getDisciplina("N573")));
        disciplinas.add(new Disciplina("N611", 2, "CÁLCULO II", getDisciplina("N610")));
        disciplinas.add(new Disciplina("T922", 2, "PROG ORIENTADA A OBJETOS", getDisciplina("N573")));
    }

    private static void semestre1() {
        //1º Semestre (5)
        disciplinas.add(new Disciplina("N096", 1, "MATEMATICA DISCRETA"));
        disciplinas.add(new Disciplina("N501", 1, "INTRODUCAO A COMPUTACAO"));
        disciplinas.add(new Disciplina("N573", 1, "LOGICA DE PROGRAMACAO"));
        disciplinas.add(new Disciplina("N605", 1, "INFORMÁTICA E SOCIEDADE"));
        disciplinas.add(new Disciplina("N610", 1, "CÁLCULO I"));
    }

    private static Disciplina getDisciplina(String codigo) {
        for (Disciplina disciplina : disciplinas) {
            if (codigo.equals(disciplina.getCodigo())) {
                return disciplina;
            }
        }
        return null;
    }

    public static void imprimirMatrizCurricular() {
        for (Disciplina disciplina : disciplinas) {
            System.out.printf("Semestre: %d\tCodigo: %s\tNome: %s\n", disciplina.getSemestre(), disciplina.getCodigo(), disciplina.getNome());
            if (disciplina.getPreRequisitos().length > 0) {
                System.out.println("Pre-Requisito");
                for (Disciplina preRequisito : disciplina.getPreRequisitos()) {
                    System.err.printf("Semestre: %d\tCodigo: %s\tNome: %s\n", preRequisito.getSemestre(), preRequisito.getCodigo(), preRequisito.getNome());
                }
            }
        }
    }

}

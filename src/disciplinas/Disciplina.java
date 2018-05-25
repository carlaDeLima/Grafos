package disciplinas;

public class Disciplina {
    private String codigo;
    private Integer semestre;
    private String nome;
    private Disciplina[] preRequisitos;

    public Disciplina() {
    }

    public Disciplina(String codigo, Integer semestre, String nome, Disciplina... preRequisitos) {
        this.codigo = codigo;
        this.semestre = semestre;
        this.nome = nome;
        this.preRequisitos = preRequisitos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina[] getPreRequisitos() {
        return preRequisitos;
    }

    public void setPreRequisitos(Disciplina[] preRequisitos) {
        this.preRequisitos = preRequisitos;
    }
}

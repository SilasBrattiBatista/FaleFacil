package falefacil.model;

import jakarta.persistence.*;

@Entity
@Table(name = "CategoriaChamado")
public class CategoriaChamado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "setor_id")
    private Setor setor;

    public CategoriaChamado(String nome, Setor setor) {
        this.nome = nome;
        this.setor = setor;
    }
    protected CategoriaChamado() {}

    public String getNome() {
        return nome;
    }

    public Setor getSetor() {
        return setor;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Setor: " + getSetor();
    }
}

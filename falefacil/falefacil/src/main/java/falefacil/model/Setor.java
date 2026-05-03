package falefacil.model;

import jakarta.persistence.*;

@Entity
@Table(name = "setores")
public class Setor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeDoSetor;

    protected Setor() {}

    public Setor(String nomeDoSetor) {
        this.nomeDoSetor = nomeDoSetor;
    }

    public int getId() {
        return id;
    }

    public String getNomeDoSetor() {
        return nomeDoSetor;
    }

    @Override
    public String toString() {
        return "Setor: " + getNomeDoSetor() + "\n" +
                "Id:" + getId();
    }
}

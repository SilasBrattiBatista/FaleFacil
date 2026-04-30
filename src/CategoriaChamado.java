public class CategoriaRelatorio {
    private static int incrementador = 1;
    private int id;
    private String nome;
    private Setor setor;

    public CategoriaRelatorio(String nome, Setor setor) {
        this.nome = nome;
        this.setor = setor;
        this.id = incrementadorId();
    }

    public int incrementadorId() {
        return incrementador++;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Setor getSetor() {
        return setor;
    }
}

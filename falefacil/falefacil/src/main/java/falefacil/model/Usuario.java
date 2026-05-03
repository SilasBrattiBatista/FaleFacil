package falefacil.model;

import jakarta.persistence.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cargo;
    private String email;
    private String nomeDeUsuario;
    private String senha;

    @ManyToOne
    @JoinColumn(name = "setor_id")
    private Setor setor;
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";

    protected Usuario() {}

    public Usuario(String nome, String cargo, String email, String nomeDeUsuario, String senha, Setor setor) {
        this.nome = nome;
        this.cargo = cargo;
        this.email = email;
        this.nomeDeUsuario = nomeDeUsuario;
        this.setor = setor;

        if(!validaSenha(senha)) {
            throw new IllegalArgumentException("Senha não atendeu aos requisitos");
        }

        this.senha = senha;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getEmail() {
        return email;
    }

    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    private boolean validaSenha(String senha) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(senha);

        return matcher.matches();
    }

    public String getSenha() {
        return senha;
    }

    public Setor getSetor() {
        return setor;
    }

    @Override
    public String toString() {
        return  "Id: " + getId() + "\n" +
                "Usuário: " + getNomeDeUsuario() + "\n" +
                "Cargo: " + getCargo() + "\n"
                + "Email: " + getEmail() + "\n"
                + "Setor: " + getSetor();
    }

}

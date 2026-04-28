import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {
    private int id = 0;
    private String nome;
    private String cargo;
    private String email;
    private String nomeDeUsuario;
    private String senha;
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";




    public Usuario(String nome, String cargo, String email, String nomeDeUsuario, String senha) {
        setId();
        this.nome = nome;
        this.cargo = cargo;
        this.email = email;
        this.nomeDeUsuario = nomeDeUsuario;

        if(validaSenha(senha)) {
            this.senha = senha;
        } else {
            System.out.println("Senha não atendeu aos requisitos");
        }
    }

    private void setId() {
        this.id = id + 1;
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
}

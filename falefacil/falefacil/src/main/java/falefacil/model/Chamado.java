package falefacil.model;


import jakarta.persistence.*;

@Entity
@Table(name = "chamado")
public class Chamado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String data = "DATA DE HOJE";
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuarioAbertura;
    private String status;

    @ManyToOne
    @JoinColumn(name = "responsavel_id")
    private Usuario usuarioResponsavel;

    protected Chamado() {}

    public Chamado(String data, String descricao, Usuario usuarioAbertura, String status,  Usuario usuarioResponsavel) {
        this.data = data;
        this.descricao = descricao;
        this.usuarioAbertura = usuarioAbertura;
        this.status = status;
        this.usuarioResponsavel = usuarioResponsavel;
    }

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public  Usuario getUsuarioAbertura() {
        return usuarioAbertura;
    }

    public Usuario getUsuarioResponsavel() {
        return usuarioResponsavel;
    }

    public String getStatus() {
        return status;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setUsuarioResponsavel(Usuario usuarioResponsavel) {
        this.usuarioResponsavel = usuarioResponsavel;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return  "Id: " + getId() + "\n" +
                "Data: " + getData() + "\n" +
                "Descrição: " + getDescricao() + "\n"
                + "Usuario Abertura: " + getUsuarioAbertura() + "\n"
                + "Usuario Reponsável: " + getUsuarioResponsavel() + "\n"
                + "Status: " + getStatus();
    }
}

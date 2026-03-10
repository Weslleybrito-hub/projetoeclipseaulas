package gestaobiblioteca.model;

public abstract class Usuario implements Autenticavel {
    private long id;
    private String nome;
    private String email;
    private String senha;
    private String login;
    private boolean primeiroAcesso;
    private Perfil perfil;

    public Usuario(long id, String nome, String email, String senha, Perfil perfil, String login, boolean primeiroAcesso) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.login = login;
        this.primeiroAcesso = primeiroAcesso;
        this.perfil = Perfil.ALUNO; // Define o perfil como ALUNO

    
}
public void setId(long id) {
    if (id<=0 ) {
        throw new IllegalArgumentException("ID deve ser um número positivo.");
    }
    this.id = id;
}
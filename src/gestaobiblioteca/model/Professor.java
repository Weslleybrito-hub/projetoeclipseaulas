package gestaobiblioteca.model;

public class Professor extends Usuario {
    public Professor(long id, String nome, String email, String senha, String login, boolean primeiroAcesso) {
        super(id, nome, email, senha, Perfil.PROFESSOR, login, primeiroAcesso);
    }
}

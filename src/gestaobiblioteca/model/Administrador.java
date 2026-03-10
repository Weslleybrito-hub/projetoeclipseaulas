package gestaobiblioteca.model;

public class Administrador  extends Usuario {
    public Administrador(long id, String nome, String email, String senha, String login, boolean primeiroAcesso) {
        super(id, nome, email, senha, Perfil.ADMINISTRADOR, login, primeiroAcesso);
    }
    
}
                
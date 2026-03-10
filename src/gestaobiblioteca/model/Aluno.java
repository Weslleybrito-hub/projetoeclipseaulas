package gestaobiblioteca.model;

public class Aluno extends Usuario {
    public Aluno(long id, String nome, String email, String senha, String login, boolean primeiroAcesso) {
        super(id, nome, email, senha, Perfil.ALUNO, login, primeiroAcesso);
    }



    
}

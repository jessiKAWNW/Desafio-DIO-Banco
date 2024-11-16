import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contaslista = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContaslista() {
        return contaslista;
    }

    public void setContaslista(List<Conta> contaslista) {
        this.contaslista = contaslista;
    }
}

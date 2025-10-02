import java.util.*;

class Secao implements ComponenteCadastro {
    private String nome;
    private List<ComponenteCadastro> filhos;

    public Secao(String nome) {
        this.nome = nome;
        this.filhos = new ArrayList<>();
    }

    @Override
    public void adicionar(ComponenteCadastro c) {
        filhos.add(c);
    }

    @Override
    public void remover(ComponenteCadastro c) {
        filhos.remove(c);
    }

    @Override
    public String exibir(int nivel) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(nivel)).append(nome).append("\n");
        for (ComponenteCadastro c : filhos)
            sb.append(c.exibir(nivel + 1));
        return sb.toString();
    }

    private String indent(int nivel) {
        return "  ".repeat(Math.max(0, nivel));
    }
}
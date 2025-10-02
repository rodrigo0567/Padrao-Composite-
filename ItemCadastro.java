class ItemCadastro implements ComponenteCadastro {
    private String chave;
    private String valor;

    public ItemCadastro(String chave, String valor) {
        this.chave = chave;
        this.valor = valor;
    }

    @Override
    public String exibir(int nivel) {
        return indent(nivel) + "- " + chave + ": " + valor + "\n";
    }

    private String indent(int nivel) {
        return "  ".repeat(Math.max(0, nivel));
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ItemCadastro))
            return false;
        ItemCadastro ic = (ItemCadastro) o;
        return chave.equals(ic.chave) && valor.equals(ic.valor);
    }

    @Override
    public int hashCode() {
        return chave.hashCode() + valor.hashCode();
    }
}

class Colaborador extends Secao {
    private String nomeCompleto;

    public Colaborador(String nomeCompleto) {
        super("Colaborador: " + nomeCompleto);
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
}

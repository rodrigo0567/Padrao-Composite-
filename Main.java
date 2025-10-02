public class Main {
    public static void main(String[] args) {
        Colaborador c = new Colaborador("João da Silva");

        Secao dadosPessoais = new Secao("Dados Pessoais");
        Secao dependentes = new Secao("Dependentes");
        dependentes.adicionar(new ItemCadastro("Maria", "Filha, 8 anos"));
        ItemCadastro pedro = new ItemCadastro("Pedro", "Filho, 5 anos");
        dependentes.adicionar(pedro);

        Secao contatos = new Secao("Contatos");
        contatos.adicionar(new ItemCadastro("Email", "joao@email.com"));
        contatos.adicionar(new ItemCadastro("Telefone", "(83) 99999-9999"));

        dadosPessoais.adicionar(dependentes);
        dadosPessoais.adicionar(contatos);

        Secao dadosAdmissional = new Secao("Dados Admissional");
        dadosAdmissional.adicionar(new ItemCadastro("Cargo", "Analista"));
        dadosAdmissional.adicionar(new ItemCadastro("Data de Admissão", "01/01/2020"));
        dadosAdmissional.adicionar(new ItemCadastro("Salário", "R$ 5.000,00"));

        Secao endereco = new Secao("Endereço");
        endereco.adicionar(new ItemCadastro("Residencial", "Rua A, 123, Bairro X"));
        endereco.adicionar(new ItemCadastro("Comercial", "Av. B, 456, Centro"));

        Secao documentos = new Secao("Documentos");
        documentos.adicionar(new ItemCadastro("RG", "12.345.678-9"));
        documentos.adicionar(new ItemCadastro("CPF", "111.222.333-44"));
        documentos.adicionar(new ItemCadastro("CNH", "99999999"));

        c.adicionar(dadosPessoais);
        c.adicionar(dadosAdmissional);
        c.adicionar(endereco);
        c.adicionar(documentos);

        System.out.println(c.exibir());

        dependentes.remover(pedro);

        System.out.println("\n--- Após remoção dinâmica do dependente Pedro ---\n");
        System.out.println(c.exibir());
    }
}

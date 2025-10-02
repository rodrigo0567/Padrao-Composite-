# 📌 Sistema de Cadastro de Colaborador (Com Padrão Composite)

## Grupo
DAVI HENRIQUE TEIXEIRA DE BARROS
FERNANDO DAVILA LINS BEZERRA CAVALCATI FILHO
RHONNYE WENDELL LOURENCO SOARES MARTINS
RODRIGO VERISSIMO DA SILVA
VINICIUS GERMANO DE BARROS

## 📝 Descrição
Este projeto implementa um **sistema de cadastro de colaborador** utilizando o **padrão de projeto Composite**. Ele permite estruturar seções, subseções e itens de forma hierárquica e uniforme, facilitando a manutenção e a expansão do sistema.


## 📂 Estrutura de Arquivos
- **ComponenteCadastro.java** → Interface comum para seções e itens.
- **Secao.java** → Classe Composite que pode conter outras seções ou itens.
- **ItemCadastro.java** → Classe Folha representando um campo simples (ex: Email, CPF).
- **Colaborador.java** → Classe raiz que representa o colaborador.
- **Main.java** → Classe principal com exemplo de uso.


## 🚀 Funcionalidades
- Adicionar/remover seções e itens dinamicamente.
- Exibir a estrutura hierárquica completa do cadastro.
- Tratar seções e itens de forma uniforme (mesma interface).
- Demonstrar remoção dinâmica (ex: dependente removido).

## ⚙️ Como Executar
```bash
javac Main.java
java Main
```

## 📐 Diagrama UML
```mermaid
classDiagram
    direction TB
    
    class ComponenteCadastro {
        <<abstract>>
        <<interface>>
        +exibir()*
        +adicionar(ComponenteCadastro)*
        +remover(ComponenteCadastro)*
    }
    
    class Secao {
        <<composite>>
        -nome: String
        -filhos: List~ComponenteCadastro~
        +adicionar(ComponenteCadastro)
        +remover(ComponenteCadastro)
        +exibir()
    }
    
    class ItemCadastro {
        <<leaf>>
        -chave: String
        -valor: String
        -colaborador: Colaborador
        +exibir()
        +equals(Object) boolean
        +hashCode() int
    }
    
    class Colaborador {
        -nomeCompleto: String
        +getNomeCompleto() String
        +setNomeCompleto(String)
    }
    
    %% Relacionamentos
    ComponenteCadastro <|-- Secao
    ComponenteCadastro <|-- ItemCadastro
    Secao o-- ComponenteCadastro : filhos
    ItemCadastro --> Colaborador : colaborador
    
    %% Estilos
    class ComponenteCadastro {
        fill: #f9f9f9
        stroke: #666
    }
    class Secao {
        fill: #e1f5fe
    }
    class ItemCadastro {
        fill: #f3e5f5
    }
```

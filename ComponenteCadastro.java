import java.util.*;

interface ComponenteCadastro {
    default void adicionar(ComponenteCadastro c) {
        throw new UnsupportedOperationException("Operação não suportada");
    }

    default void remover(ComponenteCadastro c) {
        throw new UnsupportedOperationException("Operação não suportada");
    }

    String exibir(int nivel);

    default String exibir() {
        return exibir(0);
    }
}
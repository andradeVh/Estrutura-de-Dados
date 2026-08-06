public class Agenda {
    private Contato[] contatos;
    private int tamanho;

    public Agenda(int tamanhoMaximo) {
        contatos = new Contato[tamanhoMaximo];
        this.tamanho = 0;
    }

    public void addContato(Contato contato) {
        // antes de add, checar se o nome ou telefone sao repetidos ja
        if (isNomeRepetido(contato.getNome()) || isTelefoneRepetido(contato.getTelefone())) {
            System.out.println("Contato com nome ou telefone repetido.");
            return;
        } else {
            if (tamanho < contatos.length) {
                contatos[tamanho] = contato;
                tamanho++;
            }
        }

    }

    // remover pelo indice. Ex 2
    public void remover(int indice) {
        if (indice < 0 || indice >= tamanho) {
            System.out.println("Indice inválido");
            return;
        }

        for (int i = indice; i < tamanho; i++) {
            contatos[i] = contatos[i + 1];
        }
        contatos[tamanho - 1] = null;
        tamanho--;
    }

    // func removerContato
    public void removeContato(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().equals(nome)) {
                remover(i);
                return;
            }
        }
    }

    // func para checar se telefone eh repetido
    private boolean isTelefoneRepetido(String telefone) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getTelefone().equals(telefone)) {
                return true;
            }
        }
        return false;
    }

    // func para checar se nome eh repetido
    private boolean isNomeRepetido(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    // func buscarContato
    public void buscarContato(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().equals(nome)) {
                System.out.println("Contato encontrado: " + contatos[i].toString());
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    // func atualizarContato (modificar os dados de um contato existente)
    public void atualizarContato(String nome, Contato novoContato) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().equals(nome)) {
                contatos[i] = novoContato;
                return;
            }
        }
    }

    // func listarContatos
    @Override
    public String toString() {
        if (tamanho == 0) {
            return "Agenda vazia.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("########## MINHA AGENDA ##########\n");
        for (int i = 0; i < tamanho; i++) {
            sb.append("Índice: ").append(i).append("\n");
            sb.append(contatos[i].toString()).append("\n\n");
        }
        return sb.toString();
    }

    public void imprimir() {
        System.out.print("[");
        for (int i = 0; i < contatos.length; i++) {
            System.out.print(contatos[i]);
            if (i < contatos.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // func manipulacao em lote (inserir varios contatos de uma vez)

    // func busca por prefixo (ex: todos nomes que comecam com "Ana", usar método
    // startsWith da classe String)
    public void buscarPorPrefixo(String prefixo) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().startsWith(prefixo)) {
                System.out.println("Contato encontrado: " + contatos[i].toString());
            }
        }
        System.out.println("Contato não encontrado.");
    }
}

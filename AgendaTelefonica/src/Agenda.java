public class Agenda {
    private Contato[] contatos;
    private int tamanho;

    public Agenda(int tamanhoMaximo) {
        contatos = new Contato[tamanhoMaximo];
        this.tamanho = 0;
    }

    public void addContato(Contato contato){
        // antes de add, checar se o nome ou telefone sao repetidos ja

        if (tamanho < contatos.length){
            contatos[tamanho] = contato;
            tamanho++;
        }
    }

    // func para checar se telefone eh repetido

    // func para checar se nome eh repetido

    // func removerContato

    // func buscarContato

    // func atualizarContato (modificar os dados de um contato existente)

    // func listarContatos

    // func manipulacao em lote (inserir varios contatos de uma vez)

    // func busca por prefixo (ex: todos nomes que comecam com "Ana", usar método startsWith da classe String)

    

}

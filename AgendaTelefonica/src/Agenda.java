public class Agenda {
    private Contato[] contatos;
    private int tamanho;

    public Agenda(int tamanhoMaximo) {
        contatos = new Contato[tamanhoMaximo];
        this.tamanho = 0;
    }

    public void addContato(Contato contato){
        if (tamanho < contatos.length){
            contatos[tamanho] = contato;
            tamanho++;
        }
    }



}

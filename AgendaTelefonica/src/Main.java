public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(10);
        agenda.addContato(new Contato("Alice", "123456789"));
        agenda.addContato(new Contato("Bob D", "987654321"));
        agenda.addContato(new Contato("Charlie Brown", "555555555"));

        agenda.imprimir();

        agenda.atualizarContato("Bob D", new Contato("Bob D", "111222333"));
        agenda.buscarPorPrefixo("Charlie");
        agenda.buscarPorPrefixo("Bob");

        agenda.imprimir();

        agenda.removeContato("Alice");
        
        agenda.imprimir();

    }
}
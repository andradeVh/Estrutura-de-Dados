public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(10);
        agenda.addContato(new Contato("Alice", "123456789"));
        agenda.addContato(new Contato("Bob", "987654321"));

        agenda.removeContato("Alice");

        agenda.atualizarContato("Bob", new Contato("Bob", "111222333"));

        agenda.buscarContato("Bob");

    }
}
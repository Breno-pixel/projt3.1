public class TesteCadastroCliente {
    public static void main(String[] args) {
        try {
            // Criação de um novo cliente
            Cliente cliente = new Cliente();
            cliente.setNome("João Silva");
            cliente.setCpf(12345678901L);
            cliente.setTel(987654321L);
            cliente.setEnd("Rua Principal");
            cliente.setNumero(100);
            cliente.setCidade("São Paulo");
            cliente.setEstado("SP");
            cliente.setEmail("joao.silva@email.com");  // Novo campo

            // Instância do DAO
            IClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.cadastrar(cliente);

            // Mensagem de confirmação
            System.out.println("Cliente cadastrado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


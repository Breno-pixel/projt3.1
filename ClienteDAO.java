public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {
    public ClienteDAO() {
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setCidade(entity.getCidade());
        entityCadastrado.setCpf(entity.getCpf());
        entityCadastrado.setEnd(entity.getEnd());
        entityCadastrado.setEstado(entity.getEstado());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setNumero(entity.getNumero());
        entityCadastrado.setTel(entity.getTel());
        entityCadastrado.setEmail(entity.getEmail()); // Novo campo
    }


    @Override
    protected String getQueryInsercao() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO CLIENTE (");
        sb.append("CIDADE, CPF, END, ESTADO, NOME, NUMERO, TEL, EMAIL"); // Incluído EMAIL
        sb.append(") VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
        return sb.toString();
    }
}


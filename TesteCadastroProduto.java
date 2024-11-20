public class TesteCadastroProduto {
    public static void main(String[] args) {
        try {
            // Criação de um novo produto
            Produto produto = new Produto();
            produto.setNome("Smartphone");
            produto.setPreco(1200.00);
            produto.setCategoria("Eletrônicos");

            // Instância do DAO
            IProdutoDAO produtoDAO = new ProdutoDAO();
            produtoDAO.cadastrar(produto);

            // Mensagem de confirmação
            System.out.println("Produto cadastrado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


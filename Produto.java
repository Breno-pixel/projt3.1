@Tabela("TB_PRODUTO")
public class Produto implements Persistente {
    @ColunaTabela(dbName = "id", setJavaName = "setId")
    private Long id;

    @ColunaTabela(dbName = "nome", setJavaName = "setNome")
    private String nome;

    @ColunaTabela(dbName = "preco", setJavaName = "setPreco")
    private Double preco;

    // Novo campo para categoria
    @ColunaTabela(dbName = "categoria", setJavaName = "setCategoria")
    private String categoria;

    // Getters e Setters
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Demais getters e setters...
}

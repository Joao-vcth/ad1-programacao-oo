/* Abstração: Classe abastrata da qual todas as outras classes herdam atributos e métodos.
                por ser uma classe abstrata, esta não pode ser instânciada.
 */

public abstract class Item {
    protected String descricao; /*Encapuslamento: Esses atributos só podem ser acessados por classes 'filhas' desta. */
    protected Double preco;
    protected String identificador;

    public Double getPreco() {
        return this.preco;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getIdentificador() {
        return identificador;
    }


}
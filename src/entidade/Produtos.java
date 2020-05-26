package entidade;

public class Produtos {
	
	public String nome;
	public double preco;
	public int qtd;
	
	public double valor_total_estoque(){
		return preco * qtd;
	}
		
	public void add_produto_estoque(int qtd) {
		this.qtd += qtd;
	}
	
	public  void remove_produtos(int qtd) {
		this.qtd -= qtd;
	}
	
	public String toString() {
		return nome
			+ ", " + "$ "
			+ String.format("%.2f", preco)
			+ ", "
			+ qtd
			+ " unidades, Total: $ "
			+ String.format(", " valor_total_estoque());
			
	}
}



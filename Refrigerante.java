
public class Refrigerante extends Modelo {
	public int garrafa_15;
	public int garrafa_2;
	public int garrafa_3;

	public Refrigerante() {
		
		this.garrafa_15 = 0;
		this.garrafa_2 = 0;
		this.garrafa_3 = 0;
		
	}
	public Refrigerante cadastarRefrigerante(String nome, double preco_L, int q355, int q600, int q1, int q15, int q2, int q3) {
		Refrigerante refri = new Refrigerante();
		
		refri.nome = nome;
		refri.preco_L = preco_L;
		refri.garrafa_355 = q355;		
		refri.garrafa_600 = q600;
		refri.garrafa_1 = q1;
		refri.garrafa_15 = q15;
		refri.garrafa_2 = q2;
		refri.garrafa_3 = q3;		

		return refri;
	}
	public Refrigerante editarRefrigerante(String nome, double preco_L, int q355, int q600, int q1, int q15, int q2, int q3) {
		Refrigerante refri = new Refrigerante();
		
		refri.nome = nome;
		refri.preco_L = preco_L;
		refri.garrafa_355 = q355;		
		refri.garrafa_600 = q600;
		refri.garrafa_1 = q1;
		refri.garrafa_15 = q15;
		refri.garrafa_2 = q2;
		refri.garrafa_3 = q3;

		return refri;
	}
	public Refrigerante excluirRefri(int i) {
		return null;
	}
	public void preco15 (double preco,int qnt) {
		this.total += preco * qnt* 1.5;
	}
	public void preco2 (double preco,int qnt) {
		this.total += preco * qnt * 2;
	}
	public void preco3 (double preco,int qnt) {
		this.total += preco * qnt * 3;
	}
	public int compra15(int qnt_15, int qnt_cliente) {
		int aux = qnt_15 - qnt_cliente;
		return aux;
	}
	public int compra2(int qnt_2, int qnt_cliente) {
		int aux = qnt_2 - qnt_cliente;
		return aux;
	}
	public int compra3(int qnt_3, int qnt_cliente) {
		int aux = qnt_3 - qnt_cliente;
		return aux;
	}
	

}

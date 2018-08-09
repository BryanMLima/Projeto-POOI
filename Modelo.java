public class Modelo {
	public int garrafa_355;
	public int garrafa_600;
	public int garrafa_1;
	public double preco_L;
	public double qnt_litro;
	public double total;
	public String nome;

	public Modelo() {
		this.preco_L = 0;
		this.nome = null;
		this.garrafa_355 = 0;
		this.garrafa_600 = 0;
		this.garrafa_1 = 0;
	}
	

	public void Compra() {

		this.total = 0;
		this.qnt_litro = 0;
		
	}
	public void Compra(double total) {
		this.total += total;
	}

	public Modelo cadastarCerveja(String nome, double preco_L, int q355, int q600, int q1) {
		Modelo cerveja = new Modelo();
		cerveja.nome = nome;
		cerveja.preco_L = preco_L;
		cerveja.garrafa_355 = q355;		
		cerveja.garrafa_600 = q600;
		cerveja.garrafa_1 = q1;

		return cerveja;

	}
	public double total () {
		return this.total;
	}

	public int compra355(int qnt_355, int qnt_cliente) {
		int aux = qnt_355 - qnt_cliente;
		return aux;
	}
	public void preco355 (double preco, int qnt) {
		this.total += (preco * 0.355* qnt);
	}
	public void preco600 (double preco, int qnt) {
		this.total += (preco * 0.600* qnt);
	}
	public void preco1 (double preco,int qnt) {
		this.total += preco * qnt;
	}
	public int compra600(int qnt_600, int qnt_cliente) {
		int aux = qnt_600 - qnt_cliente;
		return aux;
	}
	public int compra1(int qnt_1, int qnt_cliente) {
		int aux = qnt_1 - qnt_cliente;
		return aux;
	}

	public Modelo editarCerveja(String nome, double preco_L, int q355, int q600, int q1) {
		Modelo cerveja = new Modelo();

		cerveja.nome = nome;
		cerveja.preco_L = preco_L;
		cerveja.garrafa_1 = q1;
		cerveja.garrafa_355 = q355;
		cerveja.garrafa_600 = q600;

		return cerveja;
	}

	public Modelo excluirCerveja(int i) {
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Modelo(double preco_L) {
		this.preco_L = preco_L;
	}

	public int getGarrafa_355() {
		return garrafa_355;
	}

	public void setGarrafa_355(int garrafa_355) {
		this.garrafa_355 = garrafa_355;
	}

	public int getGarrafa_600() {
		return garrafa_600;
	}

	public void setGarrafa_600(int garrafa_600) {
		this.garrafa_600 = garrafa_600;
	}

	public int getGarrafa_1() {
		return garrafa_1;
	}

	public void setGarrafa_1(int garrafa_1) {
		this.garrafa_1 = garrafa_1;
	}

	public double getPreco_L() {
		return preco_L;
	}

	public void setPreco_L(double preco) {
		this.preco_L = preco;
	}

}

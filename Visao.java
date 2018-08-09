import javax.swing.JOptionPane;

public class Visao {

	public String getNome() {
		String nome = JOptionPane.showInputDialog("Digite o nome da bebida:");
		return nome;
	}

	public int get600() {
		String input = JOptionPane.showInputDialog("Digite a quantidade de garrafas de 600ml:");
		int aux = Integer.parseInt(input);
		return aux;
	}
	public int escolhaBebida() {
		Object[] options = {"Cerveja",
        "Refrigerante"};
		int n = JOptionPane.showOptionDialog(null,
		"Você deseja cadastrar: ",
		null,
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null,     
		options,
		options[0]);
		
		return n;
		
	}

	public void sair() {
		JOptionPane.showMessageDialog(null, "Saindo...");
	}

	public int get1() {
		String input = JOptionPane.showInputDialog("Digite a quantidade de garrafas de 1L:");
		int aux = Integer.parseInt(input);
		return aux;
	}
	public int get15() {
		String input = JOptionPane.showInputDialog("Digite a quantidade de garrafas de 1,5L:");
		int aux = Integer.parseInt(input);
		return aux;
	}
	public int get2() {
		String input = JOptionPane.showInputDialog("Digite a quantidade de garrafas de 2L:");
		int aux = Integer.parseInt(input);
		return aux;
	}
	public int get3() {
		String input = JOptionPane.showInputDialog("Digite a quantidade de garrafas de 3L:");
		int aux = Integer.parseInt(input);
		return aux;
	}

	public int get355() {
		String input = JOptionPane.showInputDialog("Digite a quantidade de garrafas de 355ml:");
		int aux = Integer.parseInt(input);
		return aux;
	}

	public double getPreco() {
		String input = JOptionPane.showInputDialog("Digite o preco por litro da bebida:");
		double preco = Double.parseDouble(input);
		return preco;
	}

	public int Menu() {
		String input = JOptionPane.showInputDialog(null,
				"MENU: \n1. Cadastrar bebida. \n2. Editar dados da(s) bebida(s) cadastrada(s). \n3. Comprar bebidas. \n4. Relatorio do estoque. \n5. Excluir bebida cadastrada.  \n6. Sair.");
		int key = Integer.parseInt(input);

		return key;
	}

	public void Total(double total) {
		JOptionPane.showMessageDialog(null, "Total da compra é de : R$" + total);
	}

	public int YesNo() {
		int aux = JOptionPane.showConfirmDialog(null, "Deseja alterar os dados desta bebida?");
		return aux;
	}
	public int YesNoCOMPRAR() {
		int aux = JOptionPane.showConfirmDialog(null, "Deseja comprar esta bebida?");
		return aux;
	}
	

	public int excluir() {
		int aux = JOptionPane.showConfirmDialog(null, "Deseja excluir esta opcao de bebida?");
		System.out.println(aux);
		return aux;
	}

	public int qntAlta(int aux) {
		int key = JOptionPane.showConfirmDialog(null,
				"O estoque só possui " + aux + " garrafa(s). Deseja comprar apenas " + aux + " garrafa(s)?");
		return key;
	}

	public int qnt_355() {
		String input = JOptionPane.showInputDialog("Quantas garrafas de 355ml o cliente deseja comprar ?");
		int aux = Integer.parseInt(input);
		return aux;
	}

	public int qnt_1() {
		String input = JOptionPane.showInputDialog("Quantas garrafas de 1L o cliente deseja comprar ?");
		int aux = Integer.parseInt(input);
		return aux;
	}
	public int qnt_15() {
		String input = JOptionPane.showInputDialog("Quantas garrafas de 1,5L o cliente deseja comprar ?");
		int aux = Integer.parseInt(input);
		return aux;
	}
	public int qnt_2() {
		String input = JOptionPane.showInputDialog("Quantas garrafas de 2L o cliente deseja comprar ?");
		int aux = Integer.parseInt(input);
		return aux;
	}
	public int qnt_3() {
		String input = JOptionPane.showInputDialog("Quantas garrafas de 3L o cliente deseja comprar ?");
		int aux = Integer.parseInt(input);
		return aux;
	}

	public int qnt_600() {
		String input = JOptionPane.showInputDialog("Quantas garrafas de 600ml o cliente deseja comprar ?");
		int aux = Integer.parseInt(input);
		return aux;
	}

	public void EstoqueCheio() {
		JOptionPane.showMessageDialog(null, "Estoque Cheio.");
	}

	public void erro() {
		JOptionPane.showMessageDialog(null, "Opcao errada.Tente novamente.");
	}

	public void showEstoque(String nome, double preco, int q355, int q600, int q1) {
		JOptionPane.showMessageDialog(null,
				"Tipo de bebida: Cerveja. \nNome da bebida: " + nome + "\nPreco por litro: " + preco + "\nQuantidade de garrafas de 355mL: "
						+ q355 + "\nQuantidade de garrafas de 600mL: " + q600 + "\nQuantidade de garrafas de 1L: "
						+ q1);
	}
	public void showEstoque(String nome, double preco, int q355, int q600, int q1,int q15, int q2,int q3) {
		JOptionPane.showMessageDialog(null,
				"Tipo de bebida: Refrigerante.\nNome da bebida: " + nome + "\nPreco por litro: R$" + preco + "\nQuantidade de garrafas de 355mL: "
						+ q355 + "\nQuantidade de garrafas de 600mL: " + q600 + "\nQuantidade de garrafas de 1L: "
						+ q1+"\nQuantidade de garrafas de 1,5L: "+q15+"\nQuantidade de garrafas de 2L:"+q2+
						"\nQuantidade de garrafas de 3L:"+q3);
	}
	

	public int tamanhoArrayRefri() {
		String input = JOptionPane.showInputDialog("Digite a quantidade de refrigerantes diferentes: ");
		int b = Integer.parseInt(input);
		return b;
	}
	public int tamanhoArrayCerveja() {
		String input = JOptionPane.showInputDialog("Digite a quantidade de cervejas diferentes: ");
		int b = Integer.parseInt(input);
		return b;
	}
	

	public int trocarNome() {
		int aux = JOptionPane.showConfirmDialog(null, "Deseja alterar o nome deste produto?");

		return aux;
	}

	public int trocarPreco() {
		int aux = JOptionPane.showConfirmDialog(null, "Deseja alterar o preco deste produto?");
		return aux;
	}

	public int trocar355() {
		int aux = JOptionPane.showConfirmDialog(null, "Deseja alterar o estoque de garrafa de 355mL?");
		return aux;
	}

	public int trocar1() {
		int aux = JOptionPane.showConfirmDialog(null, "Deseja alterar o estoque de garrafa(s) de 1L?");
		return aux;
	}
	public void showCEVA() {
		JOptionPane.showMessageDialog(null, "ESTOQUE DE CERVEJA", "", 1);
	}
	public void showREFRI() {
		JOptionPane.showMessageDialog(null, "ESTOQUE DE REFRIGERANTE", "", 1);
	}

	public int trocar600() {
		int aux = JOptionPane.showConfirmDialog(null, "Deseja alterar o estoque de garrafa(s) de 600mL?");
		System.out.println(aux);
		return aux;
	}
	public int trocar15() {
		int aux = JOptionPane.showConfirmDialog(null, "Deseja alterar o estoque de garrafa(s) de 1,5L?");
		System.out.println(aux);
		return aux;
	}
	public int trocar2() {
		int aux = JOptionPane.showConfirmDialog(null, "Deseja alterar o estoque de garrafa(s) de 2L?");
		System.out.println(aux);
		return aux;
	}
	public int trocar3() {
		int aux = JOptionPane.showConfirmDialog(null, "Deseja alterar o estoque de garrafa(s) de 3L?");
		System.out.println(aux);
		return aux;
	}

	public void estoqueVazio() {
		JOptionPane.showMessageDialog(null, "Estoque vazio.", "Alerta", 0);
	}

}

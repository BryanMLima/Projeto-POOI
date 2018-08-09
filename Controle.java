public class Controle {

	public static void main(String[] args) {
		Visao interacao = new Visao();
		int key = 0;
		int n0 = 0;
		int n1 = 0;
		int b = interacao.tamanhoArrayRefri();
		int a = interacao.tamanhoArrayCerveja();
		Modelo[] estoque = new Modelo[b];
		Refrigerante[] estoqueR = new Refrigerante[a];

		do {
			key = interacao.Menu();

			switch (key) {
			case 1:

				int bebida = interacao.escolhaBebida();

				if (bebida == 0) {

					for (int i = 0; i < estoque.length; i++) {
						if (estoque[i] == null) {
							n0++;

							Modelo cerveja = new Modelo();
							String nome = interacao.getNome();
							double preco_L = interacao.getPreco();
							int q355 = interacao.get355();
							int q600 = interacao.get600();
							int q1 = interacao.get1();

							estoque[i] = cerveja.cadastarCerveja(nome, preco_L, q355, q600, q1);
							break;

						}
						if (n0 == estoque.length) {

							interacao.EstoqueCheio();
							break;
						}

					}

				} else {
					// refri

					for (int i = 0; i < estoqueR.length; i++) {
						if (estoqueR[i] == null) {
							n1++;

							Refrigerante refri = new Refrigerante();
							String nome = interacao.getNome();
							double preco_L = interacao.getPreco();
							int q355 = interacao.get355();
							int q600 = interacao.get600();
							int q1 = interacao.get1();
							int q15 = interacao.get15();
							int q2 = interacao.get2();
							int q3 = interacao.get3();

							estoqueR[i] = refri.cadastarRefrigerante(nome, preco_L, q355, q600, q1, q15, q2, q3);
							break;

						}
						if (n1 == estoqueR.length) {

							interacao.EstoqueCheio();
							break;
						}

					}

				}

				break;

			case 2:
				// ------------------------------------------------------------------CERVEJA----------------------------------------------------
				for (int i = 0; i < estoque.length; i++) {
					if (estoque[i] != null) {
						interacao.showEstoque(estoque[i].nome, estoque[i].preco_L, estoque[i].garrafa_355,
								estoque[i].garrafa_600, estoque[i].garrafa_1);
						int aux = interacao.YesNo();
						if (aux == 0) {

							Modelo cerveja = new Modelo();
							aux = interacao.trocarNome();
							String nome;
							if (aux == 0) {
								nome = interacao.getNome();
							} else {
								nome = estoque[i].nome;
							}
							// preco da cerveja
							double precoL;
							aux = interacao.trocarPreco();
							if (aux == 0) {
								precoL = interacao.getPreco();
							} else {
								precoL = estoque[i].preco_L;
							}
							// garrafa 355
							int q355;
							aux = interacao.trocar355();
							if (aux == 0) {
								q355 = interacao.get355();
							} else {
								q355 = estoque[i].garrafa_355;
							}
							// garrafa 600
							int q600;
							aux = interacao.trocar600();
							if (aux == 0) {
								q600 = interacao.get600();
							} else {
								q600 = estoque[i].garrafa_600;
							}
							// garrafa 1 litro
							int q1;
							aux = interacao.trocar1();
							if (aux == 0) {
								q1 = interacao.get1();
							} else {
								q1 = estoque[i].garrafa_1;
							}

							estoque[i] = cerveja.cadastarCerveja(nome, precoL, q355, q600, q1);
						}
					}
				}
				// -----------------------------------------------------------------------------REFRIGERANTE------------------------------------------------
				for (int i = 0; i < estoqueR.length; i++) {
					if (estoqueR[i] != null) {
						interacao.showEstoque(estoqueR[i].nome, estoqueR[i].preco_L, estoqueR[i].garrafa_355,
								estoqueR[i].garrafa_600, estoqueR[i].garrafa_1, estoqueR[i].garrafa_15,
								estoqueR[i].garrafa_2, estoqueR[i].garrafa_3);
						int aux = interacao.YesNo();
						if (aux == 0) {

							Refrigerante refri = new Refrigerante();
							aux = interacao.trocarNome();
							String nome;
							if (aux == 0) {
								nome = interacao.getNome();
							} else {
								nome = estoqueR[i].nome;
							}
							// preco da cerveja
							double precoL;
							aux = interacao.trocarPreco();
							if (aux == 0) {
								precoL = interacao.getPreco();
							} else {
								precoL = estoqueR[i].preco_L;
							}
							// garrafa 355
							int q355;
							aux = interacao.trocar355();
							if (aux == 0) {
								q355 = interacao.get355();
							} else {
								q355 = estoqueR[i].garrafa_355;
							}
							// garrafa 600
							int q600;
							aux = interacao.trocar600();
							if (aux == 0) {
								q600 = interacao.get600();
							} else {
								q600 = estoqueR[i].garrafa_600;
							}
							// garrafa 1 litro
							int q1;
							aux = interacao.trocar1();
							if (aux == 0) {
								q1 = interacao.get1();
							} else {
								q1 = estoqueR[i].garrafa_1;
							}
							// garrafa 1,5 litro
							int q15;
							aux = interacao.trocar15();
							if (aux == 0) {
								q15 = interacao.get15();
							} else {
								q15 = estoqueR[i].garrafa_15;
							}
							// garrafa 2 litro

							int q2;
							aux = interacao.trocar2();
							if (aux == 0) {
								q2 = interacao.get2();
							} else {
								q2 = estoqueR[i].garrafa_2;
							}
							// garrafa 3 litros

							int q3;
							aux = interacao.trocar3();
							if (aux == 0) {
								q3 = interacao.get3();
							} else {
								q3 = estoqueR[i].garrafa_3;
							}

							estoqueR[i] = refri.cadastarRefrigerante(nome, precoL, q355, q600, q1, q15, q2, q3);
						}
					}
				}

				break;

			case 3:

				// ---------------------------------------------------------CERVEJA-----------------------------------------------------
				
					for (int j = 0; j < estoque.length; j++) {
						if (estoque[j] != null) {
							interacao.showEstoque(estoque[j].nome, estoque[j].preco_L, estoque[j].garrafa_355,
									estoque[j].garrafa_600, estoque[j].garrafa_1);
							int option = interacao.YesNoCOMPRAR();
							System.out.println(option);
							
							if (option == 0) {
								
								estoque[j].Compra();
	
								int aux1 = interacao.qnt_355();
	
								int diferenca = (estoque[j].compra355(estoque[j].garrafa_355, aux1));
								if (diferenca < 0) {
									int aux = interacao.qntAlta(estoque[j].garrafa_355);
									if (aux == 0) {
										estoque[j].garrafa_355 = 0;
										estoque[j].preco355(estoque[j].preco_L, aux1);
									} else {
	
									}
	
								} else {
									estoque[j].garrafa_355 = diferenca;
									estoque[j].preco355(estoque[j].preco_L, aux1);
	
								}
								System.out.println(diferenca);
								int aux2 = interacao.qnt_600();
	
								int diferenca2 = (estoque[j].compra600(estoque[j].garrafa_600, aux2));
								System.out.println(diferenca2);
								if (diferenca2 < 0) {
									int aux = interacao.qntAlta(estoque[j].garrafa_600);
									if (aux == 0) {
										estoque[j].garrafa_600 = 0;
										estoque[j].preco600(estoque[j].preco_L, aux2);
	
									} else {
	
									}
	
								} else {
									estoque[j].garrafa_600 = diferenca2;
									estoque[j].preco600(estoque[j].preco_L, aux2);
								}
	
								int aux3 = interacao.qnt_1();
	
								int diferenca3 = (estoque[j].compra1(estoque[j].garrafa_1, aux3));
								if (diferenca3 < 0) {
									int aux = interacao.qntAlta(estoque[j].garrafa_1);
									if (aux == 0) {
										estoque[j].garrafa_1 = 0;
										estoque[j].preco1(estoque[j].preco_L, aux3);
									} else {
	
									}
	
								} else {
									estoque[j].garrafa_1 = diferenca3;
									estoque[j].preco1(estoque[j].preco_L, aux3);
								}
								double total = estoque[j].total;
								interacao.Total(total);
	
							}
							
						}
					}
				// ----------------------------------------------------------------REFRIGERANTE---------------------------

				for (int j = 0; j < estoqueR.length; j++) {
					if (estoqueR[j] != null) {
						interacao.showEstoque(estoqueR[j].nome, estoqueR[j].preco_L, estoqueR[j].garrafa_355,
								estoqueR[j].garrafa_600, estoqueR[j].garrafa_1, estoqueR[j].garrafa_15,
								estoqueR[j].garrafa_2, estoqueR[j].garrafa_3);
						int option2 = interacao.YesNoCOMPRAR();
						if (option2 == 0) {

							estoque[j].Compra();

							int aux1 = interacao.qnt_355();

							int diferenca = (estoqueR[j].compra355(estoqueR[j].garrafa_355, aux1));
							if (diferenca < 0) {
								int aux = interacao.qntAlta(estoqueR[j].garrafa_355);
								if (aux == 0) {
									estoqueR[j].garrafa_355 = 0;
									estoqueR[j].preco355(estoqueR[j].preco_L, aux1);
								} else {

								}

							} else {
								estoqueR[j].garrafa_355 = diferenca;
								estoqueR[j].preco355(estoqueR[j].preco_L, aux1);

							}
							System.out.println(diferenca);
							int aux2 = interacao.qnt_600();

							int diferenca2 = (estoqueR[j].compra600(estoqueR[j].garrafa_600, aux2));
							System.out.println(diferenca2);
							if (diferenca2 < 0) {
								int aux = interacao.qntAlta(estoqueR[j].garrafa_600);
								if (aux == 0) {
									estoqueR[j].garrafa_600 = 0;
									estoqueR[j].preco600(estoqueR[j].preco_L, aux2);

								} else {

								}

							} else {
								estoqueR[j].garrafa_600 = diferenca2;
								estoqueR[j].preco600(estoqueR[j].preco_L, aux2);
							}

							int aux3 = interacao.qnt_1();

							int diferenca3 = (estoqueR[j].compra1(estoqueR[j].garrafa_1, aux3));
							if (diferenca3 < 0) {
								int aux = interacao.qntAlta(estoqueR[j].garrafa_1);
								if (aux == 0) {
									estoqueR[j].garrafa_1 = 0;
									estoqueR[j].preco1(estoqueR[j].preco_L, aux3);
								} else {

								}

							} else {
								estoqueR[j].garrafa_1 = diferenca3;
								estoqueR[j].preco1(estoqueR[j].preco_L, aux3);
							}

							int aux4 = interacao.qnt_15();

							int diferenca4 = (estoqueR[j].compra15(estoqueR[j].garrafa_15, aux4));
							if (diferenca4 < 0) {
								int aux = interacao.qntAlta(estoqueR[j].garrafa_15);
								if (aux == 0) {
									estoqueR[j].garrafa_15 = 0;
									estoqueR[j].preco15(estoqueR[j].preco_L, aux4);
								} else {

								}

							} else {
								estoqueR[j].garrafa_15 = diferenca4;
								estoqueR[j].preco15(estoqueR[j].preco_L, aux4);
							}

							int aux5 = interacao.qnt_2();

							int diferenca5 = (estoqueR[j].compra2(estoqueR[j].garrafa_2, aux5));
							if (diferenca5 < 0) {
								int aux = interacao.qntAlta(estoqueR[j].garrafa_2);
								if (aux == 0) {
									estoqueR[j].garrafa_2 = 0;
									estoqueR[j].preco2(estoqueR[j].preco_L, aux5);
								} else {

								}

							} else {
								estoqueR[j].garrafa_2 = diferenca5;
								estoqueR[j].preco2(estoqueR[j].preco_L, aux5);
							}
							int aux6 = interacao.qnt_3();

							int diferenca6 = (estoqueR[j].compra3(estoqueR[j].garrafa_3, aux6));
							if (diferenca6 < 0) {
								int aux = interacao.qntAlta(estoqueR[j].garrafa_3);
								if (aux == 0) {
									estoqueR[j].garrafa_3 = 0;
									estoqueR[j].preco3(estoqueR[j].preco_L, aux6);
								} else {

								}

							} else {
								estoqueR[j].garrafa_3 = diferenca6;
								estoqueR[j].preco3(estoqueR[j].preco_L, aux6);
							}
							
							double total = estoqueR[j].total;
							interacao.Total(total);
						}						
					}
				}

				break;

			case 4:
				interacao.showCEVA();
				for (int i = 0; i < estoque.length; i++) {

					if (estoque[i] != null) {
						interacao.showEstoque(estoque[i].nome, estoque[i].preco_L, estoque[i].garrafa_355,
								estoque[i].garrafa_600, estoque[i].garrafa_1);

					} else {
						interacao.estoqueVazio();
					}

				}
				interacao.showREFRI();
				for (int i = 0; i < estoqueR.length; i++) {

					if (estoqueR[i] != null) {
						interacao.showEstoque(estoqueR[i].nome, estoqueR[i].preco_L, estoqueR[i].garrafa_355,
								estoqueR[i].garrafa_600, estoqueR[i].garrafa_1, estoqueR[i].garrafa_15,
								estoqueR[i].garrafa_2, estoqueR[i].garrafa_3);

					} else {
						interacao.estoqueVazio();
					}

				}

				break;

			case 5:
				for (int i = 0; i < estoque.length; i++) {
					if (estoque[i] != null) {
						interacao.showEstoque(estoque[i].nome, estoque[i].preco_L, estoque[i].garrafa_355,
								estoque[i].garrafa_600, estoque[i].garrafa_1);
						int aux = interacao.excluir();
						if (aux == 0) {
							Modelo cerveja = new Modelo();
							estoque[i] = cerveja.excluirCerveja(i);
							n0 = n0 - 1;
						}
					}

				}

				for (int i = 0; i < estoqueR.length; i++) {
					if (estoqueR[i] != null) {
						interacao.showEstoque(estoqueR[i].nome, estoqueR[i].preco_L, estoqueR[i].garrafa_355,
								estoqueR[i].garrafa_600, estoqueR[i].garrafa_1, estoqueR[i].garrafa_15,
								estoqueR[i].garrafa_2, estoqueR[i].garrafa_3);
						int aux = interacao.excluir();
						if (aux == 0) {
							Refrigerante refri = new Refrigerante();
							estoqueR[i] = refri.excluirRefri(i);
							n1 = n1 - 1;
						}
					} else {
						break;
					}

				}

				break;
			case 6:
				interacao.sair();
				break;
			default:
				interacao.erro();
				break;
			}

		} while (key != 6);
	}
}

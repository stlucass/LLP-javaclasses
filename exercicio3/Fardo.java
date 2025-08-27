package exercicio3;

public class Fardo {
	private String material;
	private double peso;
	private double capacidade;

	public Fardo(String material, double peso, double capacidade) {
		this.material = material;
		this.peso = peso;
		this.capacidade = capacidade;
	}

	public void carregar_itens() {
		System.out.println("Fardo carregou itens");
	}

	private double getCapacidade() {
		return capacidade;
	}

	private void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}

	private double getPeso() {
		return peso;
	}

	private void setPeso(double peso) {
		this.peso = peso;
	}

	private String getMaterial() {
		return material;
	}

	private void setMaterial(String material) {
		this.material = material;
	}
}

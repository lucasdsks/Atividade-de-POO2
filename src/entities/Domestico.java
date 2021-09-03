package entities;

public class Domestico extends Animal {
	
	private String carteiraVacinacao;

	public Domestico(Integer idAnimal, String descricao, String habitat, String carteiraVacinacao) {
		super(idAnimal, descricao, habitat);
		this.carteiraVacinacao = carteiraVacinacao;
	}

	public String getCarteiraVacinacao() {
		return carteiraVacinacao;
	}

	public void setCarteiraVacinacao(String carteiraVacinacao) {
		this.carteiraVacinacao = carteiraVacinacao;
	}
	

}

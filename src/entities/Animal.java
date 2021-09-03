package entities;

public abstract class Animal {
	
	protected Integer idAnimal;
	protected String descricao;
	protected String habitat;
	public Animal(Integer idAnimal, String descricao, String habitat) {
		super();
		this.idAnimal = idAnimal;
		this.descricao = descricao;
		this.habitat = habitat;
	}
	public Integer getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(Integer idAnimal) {
		this.idAnimal = idAnimal;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	
}

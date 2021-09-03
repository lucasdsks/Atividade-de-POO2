package entities;

public class Silvestre extends Animal {
	
	private String permissaoIbama;

	public Silvestre(Integer idAnimal, String descricao, String habitat, String permissaoIbama) {
		super(idAnimal, descricao, habitat);
		this.permissaoIbama = permissaoIbama;
	}

	public String getPermissaoIbama() {
		return permissaoIbama;
	}

	public void setPermissaoIbama(String permissaoIbama) {
		this.permissaoIbama = permissaoIbama;
	}
	
	

}

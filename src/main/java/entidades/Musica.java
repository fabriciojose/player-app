package entidades;

public class Musica {
	
	String musNome, musLocal;
	
	public Musica (String musNome, String musLocal) {
		this.musNome = musNome;
		this.musLocal = musLocal;
	}
	

	public String getMusNome() {
		return musNome;
	}

	public void setMusNome(String musNome) {
		this.musNome = musNome;
	}

	public String getMusLocal() {
		return musLocal;
	}

	public void setMusLocal(String musLocal) {
		this.musLocal = musLocal;
	}
	
	
	

}

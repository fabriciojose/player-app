package entidades;

import java.util.ArrayList;
import java.util.List;

public class Artista {
	
	String artNome;
	String artEstilo;
	
	
	public Artista (String artNome, String artEstilo) {
		
		this.artNome = artNome;
		this.artEstilo = artEstilo;
	
		
	}

	public String getArtNome() {
		return artNome;
	}

	public void setArtNome(String artNome) {
		this.artNome = artNome;
	}

	public String getArtEstilo() {
		return artEstilo;
	}

	public void setArtEstilo(String artEstilo) {
		this.artEstilo = artEstilo;
	}

	

}

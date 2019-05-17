package entidades;

import java.util.ArrayList;
import java.util.List;

public class Album {
	
	String albNome;
	
	Artista albArtista;
	
	List<Musica> albListMusicas = new ArrayList<>();
	
	public Album (String albNome, Artista albArtista, List<Musica> albListMusicas ) {
		
		this.albNome = albNome;
		this.albArtista = albArtista;
		this.albListMusicas = albListMusicas;
		
	}

	public String getAlbNome() {
		return albNome;
	}

	public void setAlbNome(String albNome) {
		this.albNome = albNome;
	}

	public Artista getAlbArtista() {
		return albArtista;
	}

	public void setAlbArtista(Artista albArtista) {
		this.albArtista = albArtista;
	}

	public List<Musica> getAlbListMusicas() {
		return albListMusicas;
	}

	public void setAlbListMusicas(List<Musica> albListMusicas) {
		this.albListMusicas = albListMusicas;
	}
	
	
	


}

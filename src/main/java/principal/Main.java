package principal;

import java.util.ArrayList;
import java.util.List;

import entidades.Album;
import entidades.Artista;
import entidades.Musica;
import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
	
		List<Musica> listPinkFloyd = new ArrayList<>();
		
		musica = new Musica("Hey You", "/audio/pink_floyd/pink_floyd_hey_you.mp3");
		listPinkFloyd.add(musica);
		
		musica = new Musica("Hey You", "/audio/pink_floyd/The_Wall.mp3");
		listPinkFloyd.add(musica);
		
		musica = new Musica("Hey You", "/audio/pink_floyd/UsAndThem.mp3");
		listPinkFloyd.add(musica);
		
		artista = new Artista("Pink Floyd", "Rock Progressivo");

		album = new Album("The Wall" , artista, listPinkFloyd);
		
		
		Media  media = new Media(getClass().getResource(
				album.getAlbListMusicas().get(0).getMusLocal()).toString());

		MediaPlayer mediaPlayer = new MediaPlayer(media);

		MediaView mediaView = new MediaView(mediaPlayer);
		
		mediaPlayer.play();
		

	}
	Artista artista;
	Album album;
	Musica musica;


}

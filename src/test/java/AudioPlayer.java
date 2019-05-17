import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class AudioPlayer extends Application  {
	
	public static void main(String[] args) {

		launch(args);


	}



	@Override
	public void start(Stage stage) throws Exception {

		//AUDIO
		String AUDIO_URL = getClass().getResource(
				   "/audio/Track 01.mp3").toString();

		AudioClip clip = new AudioClip(AUDIO_URL);
		
		
		//TELA DE VISUALIZACAO MUSICA TOCADA 
		Label lbl_Tocando_Artista = new Label("TOCANDO O ARTISTA");
		Label lbl_Nome_Artista1 = new Label("BIA SOCEK");

		
		Image img_Album = new Image(getClass().getResourceAsStream("/images/biaSocek.jpeg"));
		ImageView imgView_Album = new ImageView(img_Album);
		
		Image PlayButtonImage = new Image(getClass().getResourceAsStream("/icons/icon-play.png"));
		ImageView imageViewPlay = new ImageView(PlayButtonImage);
		
		Image img_Voltar_Musica = new Image(getClass().getResourceAsStream("/icons/icon-skip-previous.png"));
		ImageView imgView_Voltar_Musica = new ImageView(img_Voltar_Musica);
		
		Image img_Adiantar_Musica = new Image(getClass().getResourceAsStream("/icons/icon-skip-next.png"));
		ImageView imgView_Adianta_Musica = new ImageView(img_Adiantar_Musica);
		
		Image img_Stop_Musica = new Image(getClass().getResourceAsStream("/icons/icon-stop.png"));
		ImageView imgView_Stop_Musica = new ImageView(img_Stop_Musica);
		
		
		
		Label lbl_Nome_Musica = new Label("TOCANDO O ARTISTA");
		Label lbl_Nome_Artista2 = new Label("BIA SOCEK");
		
		Button btn_Mais_Musica = new Button("+");
		Button btn_Detalhes_Musica = new Button("...");
		
		Slider sl_Tempo_Musica = new Slider();
		
		Button btn_Aleatoria_Musica = new Button();
		Button btn_Voltar_Musica = new Button();
		Button btn_Adiantar_Musica = new Button();
		Button btn_Play_Musica = new Button();
		Button btn_Repete_Musica = new Button();
		

		btn_Play_Musica.setGraphic(imageViewPlay);
		btn_Play_Musica.setPrefSize(45, 45);
		
		lbl_Tocando_Artista.setPrefSize(200, 20);
		lbl_Tocando_Artista.setTextAlignment(TextAlignment.CENTER);
		lbl_Tocando_Artista.setLayoutX(50.0);
		lbl_Tocando_Artista.setLayoutY(0.0);
		
		lbl_Nome_Artista1.setPrefSize(200, 20);
		lbl_Nome_Artista1.setTextAlignment(TextAlignment.CENTER);
		lbl_Nome_Artista1.setLayoutX(50.0);
		lbl_Nome_Artista1.setLayoutY(20.0);
		
		imgView_Album.setLayoutX(18.0);
		imgView_Album.setLayoutY(50.0);
		
		lbl_Nome_Musica.setPrefSize(150, 20);
		lbl_Nome_Musica.setTextAlignment(TextAlignment.CENTER);
		lbl_Nome_Musica.setLayoutX(76.0);
		lbl_Nome_Musica.setLayoutY(313.0);
		
		lbl_Nome_Artista2.setPrefSize(150, 20);
		lbl_Nome_Artista2.setTextAlignment(TextAlignment.CENTER);
		lbl_Nome_Artista2.setLayoutX(76.0);
		lbl_Nome_Artista2.setLayoutY(333.0);
		
		sl_Tempo_Musica.setPrefSize(265, 20);

		sl_Tempo_Musica.setLayoutX(18.0);
		sl_Tempo_Musica.setLayoutY(353.0);
		
		btn_Voltar_Musica.setPrefSize(25, 25);
		btn_Voltar_Musica.setLayoutX(93.0);
		btn_Voltar_Musica.setLayoutY(391.0);
		btn_Voltar_Musica.setGraphic(imgView_Voltar_Musica);
	
		btn_Play_Musica.setLayoutX(128.0);
		btn_Play_Musica.setLayoutY(381.0);
		
		btn_Adiantar_Musica.setPrefSize(25, 25);
		btn_Adiantar_Musica.setLayoutX(183.0);
		btn_Adiantar_Musica.setLayoutY(391.0);
		btn_Adiantar_Musica.setGraphic(imgView_Adianta_Musica);
		
		Pane raiz = new Pane();
		raiz.setPrefSize(300, 500);
		
		raiz.getChildren().addAll(lbl_Tocando_Artista, lbl_Nome_Artista1, imgView_Album, 
									lbl_Nome_Musica, lbl_Nome_Artista2, sl_Tempo_Musica,
									btn_Voltar_Musica, btn_Play_Musica, btn_Adiantar_Musica
				
				);
		
		Scene cena = new Scene(raiz, 300, 500);
		stage.setTitle("Áudio Player");
		stage.setScene(cena);
		stage.show();


		btn_Play_Musica.setOnAction((event) -> {
			clip.play(); 
		});
		
		

	}
	

}

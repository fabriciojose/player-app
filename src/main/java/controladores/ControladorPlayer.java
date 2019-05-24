package controladores;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.media.MediaPlayer.Status;
import principal.Componentes;

public class ControladorPlayer implements Initializable {

	@FXML Pane pPlayer;
	
	Button btnTelaPrincipal;
	Button btnListaMusicas;
	
	Label lblInformacao;
	Label lblNomeArtista1;
	ImageView imgViewAlbum;
	
	Label lblNomeMusica;
	Label lblNomeArtista2;
	
	Button btnAdicionaMusica;
	Button btnInformacaoMusica;
	
	Slider slTempoMusica;
	
	Button btnAleatoria;
	Button btnProxima;
	Button btnAnterior;
	Button btnTocarPausar;
	Button btnRepete;
	
	
	
	Double[][] prefSizeWHeLayXY;
	ArrayList <Node> listComponentes;
	
	@Override
	public void initialize(URL url, ResourceBundle arg) {
		

		Image PlayButtonImage = new Image(getClass().getResourceAsStream("/icons/icon-play.png"));
		ImageView imageViewPlay = new ImageView(PlayButtonImage);
		
		Image img_Pause_Musica = new Image(getClass().getResourceAsStream("/icons/icon-pause.png"));
		ImageView imgView_Pause_Musica = new ImageView(img_Pause_Musica);
		
		pPlayer.setStyle("-fx-background-color: white");
			
		
		btnTelaPrincipal = new Button("<");
		btnListaMusicas = new Button(".");
		
		lblInformacao = new  Label("TOCANDO O ARTISTA");
		lblInformacao.setAlignment(Pos.CENTER);
		lblNomeArtista1 = new Label("BIA SOCEK");
		lblNomeArtista1.setAlignment(Pos.CENTER);
		
		Image img_Album = new Image(getClass().getResourceAsStream("/images/biaSocek.jpeg"));
		imgViewAlbum = new ImageView(img_Album);
		imgViewAlbum.setLayoutX(18.0);
		imgViewAlbum.setLayoutY(50.0);
		
		
		btnAdicionaMusica = new Button("+");
		
		lblNomeMusica = new  Label("Mal de Amor");
		lblNomeMusica.setAlignment(Pos.CENTER);
		lblNomeArtista2 = new Label("BIA SOCEK");
		lblNomeArtista2.setAlignment(Pos.CENTER);
		
		btnInformacaoMusica = new Button("...");
		
		slTempoMusica = new Slider();
		slTempoMusica.setMin(0);
		slTempoMusica.setMax(100);
		//slTempoMusica.setValue(40);
		//slTempoMusica.setShowTickLabels(true);
		//slTempoMusica.setShowTickMarks(true);
		//slTempoMusica.setMajorTickUnit(50);
		//slTempoMusica.setMinorTickCount(5);
		//slTempoMusica.setBlockIncrement(10);
		
		
		btnAleatoria = new  Button();
		btnAnterior = new  Button();
		btnTocarPausar = new  Button();
			btnTocarPausar.setGraphic(imageViewPlay);
		btnProxima = new  Button();
		btnRepete = new  Button();
		
		prefSizeWHeLayXY = new Double[][] { 

			{25.0,25.0,18.0,18.0}, 
			{180.0,20.0,61.0,11.0}, 
			{180.0,20.0,61.0,31.0}, 
			{25.0,25.0,260.0,18.0}, 
			
		
			{25.0,25.0,18.0,320.0}, 
			{150.0,20.0,76.0,313.0}, 
			{150.0,20.0,76.0,333.0}, 
			{25.0,25.0,259.0,320.0}, 
			
			{265.0,25.0,18.0,353.0}, 
			
			{25.0,25.0,18.0,391.0}, 
			{25.0,25.0,93.0,391.0}, 
			{45.0,45.0,128.0,381.0}, 
			{25.0,25.0,183.0,391.0},  
			{25.0,25.0,260.0,391.0}, 
	
		}; 

		listComponentes  = new ArrayList<>();
		
		listComponentes.add(btnTelaPrincipal);
		
		listComponentes.add(lblInformacao);
		listComponentes.add(lblNomeArtista1);
		
		listComponentes.add(btnListaMusicas);
		
		listComponentes.add(btnAdicionaMusica);
		listComponentes.add(lblNomeMusica);
		listComponentes.add(lblNomeArtista2);
		listComponentes.add(btnInformacaoMusica);
		listComponentes.add(slTempoMusica);
		

		listComponentes.add(btnAleatoria);
		listComponentes.add(btnAnterior);
		listComponentes.add(btnTocarPausar);
		listComponentes.add(btnProxima);
		listComponentes.add(btnRepete);
		
		
		Componentes com = new Componentes();
		com.posicionarComponentes(listComponentes, prefSizeWHeLayXY);
		

		pPlayer.getChildren().addAll(
				btnTelaPrincipal, lblInformacao, lblNomeArtista1, btnListaMusicas,
				imgViewAlbum, 
				btnAdicionaMusica, lblNomeMusica, lblNomeArtista2, btnInformacaoMusica,
					slTempoMusica,
					btnAleatoria, btnAnterior, btnTocarPausar, btnProxima, btnRepete
					);
		
		
		Media  media = new Media(getClass().getResource(
				   "/audio/Track 01.mp3").toString());

		MediaPlayer mediaPlayer = new MediaPlayer(media);

		//mediaPlayer.setAutoPlay(true);
		//MediaView mediaView = new MediaView(mediaPlayer);
		
		btnTocarPausar.setOnAction((event) -> {
			
			Status status = mediaPlayer.getStatus();
			
			if (status == Status.PAUSED || status == Status.READY || status == Status.STOPPED) { 
				mediaPlayer.play();
				btnTocarPausar.setGraphic(imageViewPlay);
				
			} else {
				mediaPlayer.pause();
				btnTocarPausar.setGraphic(imgView_Pause_Musica);
			}
			
		});
		
		btnTelaPrincipal.setOnAction((event) -> {
			
			/*
        	dblTranslacao =  p.getTranslateY();

			if(dblTranslacao.equals(0.0)){
				translacao.subirNode();
			} else {
				translacao.baixarNode();
			}
			*/
			
			
		});
		
		
		
	}

}

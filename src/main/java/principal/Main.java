package principal;

import java.util.ArrayList;
import java.util.List;

import controladores.ControladorPlayer;
import entidades.Album;
import entidades.Artista;
import entidades.Musica;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	

	Double[][] prefSizeWHeLayXY;
	ArrayList <Node> listComponentes;

	
	Pane p;
	Double dblTranslacao;
	
	Translacao translacao;
	
	
	@Override
	public void start(Stage stage) throws Exception {
	
		Label lbl_Inicio = new Label("Início");
		lbl_Inicio.setTextAlignment(TextAlignment.CENTER);
		
		ScrollPane sp_Albuns = new ScrollPane();
		
		sp_Albuns.setStyle("-fx-background-color: red");

		Pane pPlayer = new  Pane();
		
		Label lbl_Autor_Musica = new Label("Risquei seu nome - Bia Socek");
		lbl_Autor_Musica.setTextAlignment(TextAlignment.CENTER);
		
		Button btn_Player = new Button("Play");

		Pane pInferior = new  Pane();

		Button btn_1 = new Button("1");
		Button btn_2 = new Button("2");
		Button btn_3 = new Button("3");
		Button btn_4 = new Button("4");
		Button btn_5 = new Button("5");

		prefSizeWHeLayXY = new Double[][] { 

			{200.0,20.0,130.0,5.0}, 
			{300.0,395.0,0.0,25.0}, 

			{300.0,40.0,0.0,420.0}, 

			{200.0,20.0,26.0,10.0}, 
			{45.0,25.0,236.0,6.0}, 

			{300.0,40.0,0.0,460.0}, 

			{25.0,25.0,64.0,8.0}, 
			{25.0,25.0,101.0,8.0}, 
			{25.0,25.0,138.0,8.0}, 
			{25.0,25.0,175.0,8.0}, 
			{25.0,25.0,211.0,8.0}, 

		}; 


		listComponentes  = new ArrayList<>();
		listComponentes.add(lbl_Inicio);
		listComponentes.add(sp_Albuns);

		listComponentes.add(pPlayer);
		listComponentes.add(lbl_Autor_Musica);
		listComponentes.add(btn_Player);

		listComponentes.add(pInferior);

		listComponentes.add(btn_1);
		listComponentes.add(btn_2);
		listComponentes.add(btn_3);
		listComponentes.add(btn_4);
		listComponentes.add(btn_5);
		
		
		Componentes com = new Componentes();
		com.posicionarComponentes(listComponentes, prefSizeWHeLayXY);
		

		pPlayer.getChildren().addAll(lbl_Autor_Musica, btn_Player);

		pInferior.getChildren().addAll(btn_1, btn_2, btn_3, btn_4, btn_5);

		Pane raiz = new Pane();
		raiz.setPrefSize(300, 500);

		raiz.getChildren().addAll(
				lbl_Inicio, sp_Albuns, pPlayer, pInferior
				);
		
		btn_Player.setOnAction(new EventHandler<ActionEvent>() {

	        @Override
	        public void handle(ActionEvent event) {
	            // \fxml\Player.fxml

	        	if (p == null) {
	        		
	        		p = new Pane();
		        	
		        	translacao = new Translacao(p);
		        	translacao.subirDescerNode(800.0, 0.0);
		        	
		        	//p.setTranslateY(880.0);
		        	
		        	
		        	LeitorFXML leitorFXML = new LeitorFXML(raiz, p , new ControladorPlayer(), "/fxml/Player.fxml");
		        	leitorFXML.abrirFXML();
		        	
	        		
	        	}
	        	
	        	
	        	
	        }
	    });

		Scene cena = new Scene(raiz, 300, 500);
		stage.setTitle("Áudio Player");
		stage.setScene(cena);
		stage.show();

		

	}


}


/*
 	Artista artista;
	Album album;
	Musica musica;


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
		
*/

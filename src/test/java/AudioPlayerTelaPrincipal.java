import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class AudioPlayerTelaPrincipal extends Application  {

	public static void main(String[] args) {
		launch(args);
	}

	Double[][] prefSizeWHeLayXY;
	ArrayList <Node> listComponentes;

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

		Pane pJanelas = new  Pane();

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

		listComponentes.add(pJanelas);

		listComponentes.add(btn_1);
		listComponentes.add(btn_2);
		listComponentes.add(btn_3);
		listComponentes.add(btn_4);
		listComponentes.add(btn_5);
		
		posicionarComponentes(listComponentes, prefSizeWHeLayXY);

		pPlayer.getChildren().addAll(lbl_Autor_Musica, btn_Player);

		pJanelas.getChildren().addAll(btn_1, btn_2, btn_3, btn_4, btn_5);

		Pane raiz = new Pane();
		raiz.setPrefSize(300, 500);

		raiz.getChildren().addAll(
				lbl_Inicio, sp_Albuns, pPlayer, pJanelas
				);

		Scene cena = new Scene(raiz, 300, 500);
		stage.setTitle("Áudio Player");
		stage.setScene(cena);
		stage.show();


	}

	public void posicionarComponentes (ArrayList<Node> listNodes, Double [][] prefSizeWHeLayXY) {

		for (int i = 0; i<prefSizeWHeLayXY.length; i++) {

			((Region)listNodes.get(i)).setPrefSize(prefSizeWHeLayXY[i][0], prefSizeWHeLayXY[i][1]);
			((Region)listNodes.get(i)).setLayoutX(prefSizeWHeLayXY[i][2]);
			((Region)listNodes.get(i)).setLayoutY(prefSizeWHeLayXY[i][3]);

		}

	}

}

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class VideoPlayerTeste extends Application {


	private String VIDEO_URL = getClass().getResource(
			"/videos/lula moro nao e nada meu.mp4").toString();


	public static void main(String[] args) {

		launch(args);


	}



	@Override
	public void start(Stage stage) throws Exception {


		Media media = new Media(VIDEO_URL); // 1

		MediaPlayer mediaPlayer = new MediaPlayer(media); // 2

		MediaView mediaView = new MediaView(mediaPlayer); // 3

		Button btn_Play = new Button("Play");
		btn_Play.setPrefSize(70, 30);
		btn_Play.setLayoutX(0.0);
		btn_Play.setLayoutY(150.0);

		Button btn_Stop = new Button("Stop");
		btn_Stop.setPrefSize(70, 30);
		btn_Stop.setLayoutX(70.0);
		btn_Stop.setLayoutY(150.0);

		Button btn_Adianta = new Button("Adianta");
		btn_Adianta.setPrefSize(70, 30);
		btn_Adianta.setLayoutX(140.0);
		btn_Adianta.setLayoutY(150.0);

		Button btn_Atrasa = new Button("Atrasa");
		btn_Atrasa.setPrefSize(70, 30);
		btn_Atrasa.setLayoutX(210.0);
		btn_Atrasa.setLayoutY(150.0);

		Pane raiz = new Pane();
		raiz.getChildren().addAll(mediaView, btn_Play, btn_Stop, btn_Adianta, btn_Atrasa); // 4
		Scene cena = new Scene(raiz, 600, 400);
		stage.setTitle("Tocando Video em JavaFX");
		stage.setScene(cena);
		stage.show();


		btn_Play.setOnAction((event) -> {
			mediaPlayer.play();
		});
		
		btn_Stop.setOnAction((event) -> {
			mediaPlayer.stop();
		});
		
		btn_Adianta.setOnAction((event) -> {
			System.out.println("total durantion property " + mediaPlayer.totalDurationProperty());
		});
		
		btn_Atrasa.setOnAction((event) -> {
			System.out.println("get start time ");
			
			System.out.println(mediaPlayer.getStartTime());
		
		});




	}

}

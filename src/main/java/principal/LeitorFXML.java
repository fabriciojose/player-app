package principal;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class LeitorFXML {
	
	Pane pPrincipal;
	Pane p;
	Object o;
	String strFXML;
	
	public LeitorFXML (Pane pPrincipal, Pane p , Object o, String strFXML) {
		
		this.pPrincipal = pPrincipal;
		this.p = p;
		this.o = o;
		this.strFXML = strFXML;
	
	}
	
	public void abrirFXML () {
		
    	FXMLLoader loader = new FXMLLoader(getClass().getResource(strFXML));
		
		loader.setRoot(p);
		loader.setController(o);
		try {
			loader.load();
		} catch (IOException e) {
			System.out.println("erro na abertura do pane");
			e.printStackTrace();
		}
		
		pPrincipal.getChildren().add(p);
		
	}

}

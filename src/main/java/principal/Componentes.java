package principal;

import java.util.ArrayList;

import javafx.scene.Node;
import javafx.scene.layout.Region;

public class Componentes {
	
	ArrayList<Node> listNodes;
	Double [][] prefSizeWHeLayXY;
	
	public Componentes () {
	
	}
	
	public void posicionarComponentes (ArrayList<Node> listNodes, Double [][] prefSizeWHeLayXY) {

		for (int i = 0; i<prefSizeWHeLayXY.length; i++) {

			((Region)listNodes.get(i)).setPrefSize(prefSizeWHeLayXY[i][0], prefSizeWHeLayXY[i][1]);
			((Region)listNodes.get(i)).setLayoutX(prefSizeWHeLayXY[i][2]);
			((Region)listNodes.get(i)).setLayoutY(prefSizeWHeLayXY[i][3]);

		}

	}
	

}

package principal;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Translacao {
	
	TranslateTransition translacao1;
	TranslateTransition translacao2;
	
	Double dblTranslacao;
	
	Node n;
	
	
	public Translacao (Node n) {
		
		this.n = n;
		
	}
	
	public void subirDescerNode(Double d1, Double d2) {
		
		if (translacao1 == null) {
			
			translacao1 = new TranslateTransition(new Duration(d1), n);
			translacao1.setToY(d1);

			translacao2 = new TranslateTransition(new Duration(d2), n);
			translacao1.setToY(d2);
			
		}
		
    	dblTranslacao =  n.getTranslateY();

		if(dblTranslacao.equals(0.0)){
			translacao1.play();
	
		} else {
			translacao2.play();

		}
		
			
	}
	
  public void baixarNode () {
	  
	  dblTranslacao =  n.getTranslateY();

		if(dblTranslacao.equals(0.0)){
			translacao1.play();
	
		} else {
			translacao2.play();

		}
		
  }

  

}

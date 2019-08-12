package soft;

import javafx.animation.Animation;
import javafx.animation.ScaleTransition;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class circle_class {
		public static void createnew(Color xColor, double d, double e){
			Circle cir2 = new Circle();
			cir2.setRadius(50.0);
			cir2.setFill(xColor);
			window_class.layout.getChildren().addAll(cir2);
			cir2.setLayoutX(d);
			cir2.setLayoutY(e);
			ScaleTransition tranCir = new ScaleTransition(); 
			tranCir.setDuration(Duration.seconds(4));
			tranCir.setByX(0.5f);
			tranCir.setByY(0.5f);
			tranCir.setCycleCount(Animation.INDEFINITE);
			tranCir.setAutoReverse(true);
			tranCir.setNode(cir2);
			tranCir.play();
		}
		circle_class(){
		//constructor
		System.out.println("This Created A Circle 'o'");
		}
}

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Scanner;

public class JavaFXpractice extends Application{

  public void start(Stage stage){
    Scanner input = new Scanner(System.in);
    System.out.println("choose the texts X");
    double textX = input.nextDouble();
    System.out.println("choose the texts Y");
    double textY = input.nextDouble();
    System.out.println("choose the rectangles height");
    double rectangleH = input.nextDouble();
    System.out.println("choose the rectangles width");
    double rectangleW = input.nextDouble();
    System.out.println("choose the rectangles X");
    double rectangleX = input.nextDouble();
    System.out.println("choose the rectangles Y");
    double rectangleY = input.nextDouble();
    System.out.println("choose the circles X");
    double circleX = input.nextDouble();
    System.out.println("choose the circles Y");
    double circleY = input.nextDouble();
    System.out.println("choose the cirles radius");
    double circleR = input.nextDouble();
    System.out.println("choose the triangles first X");
    double TX1 = input.nextDouble();
    System.out.println("choose the triangles first Y");
    double TY1 = input.nextDouble();
    System.out.println("choose the triangles second X");
    double TX2 = input.nextDouble();
    System.out.println("choose the triangles second Y");
    double TY2 = input.nextDouble();
    System.out.println("choose the triangles third X");
    double TX3 = input.nextDouble();
    System.out.println("choose the triangles third Y");
    double TY3 = input.nextDouble();

    Text yo = new Text(textX,textY,"Yo");
    Rectangle box = new Rectangle(rectangleH,rectangleW, rectangleX, rectangleY);
    Circle circle = new Circle(circleX,circleY,circleR);
    Polygon polygon = new Polygon(TX1,TY1,TX2,TY2,TX3,TY3);

    box.setStroke(Color.BLUE);
    box.setFill(null);
    yo.setStroke(Color.ORANGE);
    circle.setStroke(Color.PURPLE);
    circle.setFill(null);
    polygon.setStroke(Color.YELLOW);
    polygon.setFill(null);

    Group root = new Group(yo, box, circle, polygon);
    Scene scene = new Scene(root, 300, 120, Color.BROWN);

    stage.setTitle("javaFXpractice");
    stage.setScene(scene);
    stage.show();
  }
}

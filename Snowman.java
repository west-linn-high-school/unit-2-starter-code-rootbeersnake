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

public class Snowman extends Application{

  public void start(Stage stage){


    Rectangle box = new Rectangle(0,500, 600, 200);
    Circle circle1 = new Circle(300,200,100);
    Circle circle2 = new Circle(300,300,70);
    Circle circle3 = new Circle(300,360,60);
    Rectangle arm1 = new Rectangle(370,300,100,20);
    Rectangle arm2 = new Rectangle(130,300,100,20);
    Rectangle hat1 = new Rectangle(250,400,100,20);
    Rectangle hat2 = new Rectangle(275,420,50,100);
    Circle eye1 = new Circle(270,360,7);
    Circle eye2 = new Circle(330,360,7);
    Polygon nose = new Polygon(300,360,310,350,290,350);

    box.setStroke(Color.WHITE);
    box.setFill(Color.WHITE);
    circle1.setStroke(Color.WHITE);
    circle1.setFill(Color.WHITE);
    circle2.setStroke(Color.WHITE);
    circle2.setFill(Color.WHITE);
    circle3.setStroke(Color.WHITE);
    circle3.setFill(Color.WHITE);
    arm1.setStroke(Color.BROWN);
    arm1.setFill(Color.BROWN);
    arm2.setStroke(Color.BROWN);
    arm2.setFill(Color.BROWN);
    hat1.setStroke(Color.BLACK);
    hat1.setFill(Color.BLACK);
    hat2.setStroke(Color.BLACK);
    hat2.setFill(Color.BLACK);
    eye1.setStroke(Color.BLACK);
    eye1.setFill(Color.BLACK);
    eye2.setStroke(Color.BLACK);
    eye2.setFill(Color.BLACK);
    nose.setFill(Color.ORANGE);
    nose.setStroke(Color.ORANGE);


    Group root = new Group(box, circle1,circle2,circle3,arm1,arm2,hat1,hat2,eye1,eye2,nose);
    Scene scene = new Scene(root, 600, 600, Color.LIGHTBLUE);

    stage.setTitle("javaFXpractice");
    stage.setScene(scene);
    stage.show();
  }
}

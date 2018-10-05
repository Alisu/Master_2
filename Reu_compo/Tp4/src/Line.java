
public class Line extends Figure{
private Point p1, p2;
Point getP1(){return p1;}
Point getP2(){return p2;}
void setP1(Point p1){p1=p1;}
void setP2(Point p2){p2=p2;}

public static void  main(String[] args){
	Line l1 = new Line();
	Point p1 = new Point();
	Point p2 = new Point();
	Point p3 = new Point();
	Line l2 = new Line();
	
	l1.setP1(p1);
	l1.setP2(p2);
	l2.setP1(p2);
	l2.setP1(p3);
	
}

}

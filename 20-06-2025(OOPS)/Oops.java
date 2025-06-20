// pen class have colour, tip, setColor() , and setTip();

public class Oops
{
	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.setColor("Blue");
		
		System.out.println("Pen color is " + p1.color +".");
		p1.setTip(5);
		
		System.out.println("Pen tip is "+ p1.tip +"mm.");
	}
}
class Pen{
    String color;
    int tip;
    
    void setColor(String newcolor){
        color = newcolor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

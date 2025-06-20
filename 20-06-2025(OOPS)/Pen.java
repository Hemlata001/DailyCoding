public class Pen
{
    String color;
    int tip;
	public static void main(String[] args) {
		Pen p = new Pen();
		p.color = "red";
		p.tip = 5;
		System.out.println("Pen is " + p.color  + " and has " + p.tip + "mm tip.");
	}
}

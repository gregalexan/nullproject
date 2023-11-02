package nullproject;

public class Start {
    public void show() {
        System.out.println("Hello");
	Start1 s1 = new Start1();
	s1.show1();
    }
    public static void main(String[] args) {
        Start obj = new Start();
        obj.show();
    }
}
class Start1 {
	void show1() {
		System.out.println("Hi!");
	}
}


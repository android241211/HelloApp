import javax.swing.JFrame;

public class Hello extends JFrame {
	public Hello() {
		super("Hello");
		this.setSize(500, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Hello();
	}
}
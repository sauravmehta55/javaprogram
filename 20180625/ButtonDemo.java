import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JButton;

class ButtonDemo
{
	//Frame awtFrame;
	JFrame swingFrame;
	JButton btnClick, btnCancel;

	ButtonDemo() {
		//awtFrame = new Frame();
		swingFrame = new JFrame();
		swingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnClick = new JButton("click");
		btnCancel = new JButton("cancel");
	}

	void showFrame() {
		//awtFrame.setVisible(true);
		swingFrame.setSize(400,200);
		swingFrame.setLocation(100,100);
		swingFrame.setVisible(true);
		swingFrame.setResizable(false);
	}

	void addComponents() {
		swingFrame.add(btnClick);
		swingFrame.add(btnCancel);
		
	}

}

class MainClass{
	public static void main(String[] args) {
		ButtonDemo buttonDemo = new ButtonDemo();
		buttonDemo.showFrame();
		buttonDemo.addComponents();
	}
}
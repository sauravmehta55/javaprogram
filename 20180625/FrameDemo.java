import java.awt.Frame;
import javax.swing.JFrame;

class FrameDemo
{
	//Frame awtFrame;
	JFrame swingFrame;

	FrameDemo() {
		//awtFrame = new Frame();
		swingFrame = new JFrame();
		swingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void showFrame() {
		//awtFrame.setVisible(true);
		swingFrame.setSize(400,200);

		swingFrame.setLocation(100,100);
		

		swingFrame.setVisible(true);
		swingFrame.setResizable(false);

	}

}

class MainClass{
	public static void main(String[] args) {
		FrameDemo frameDemo = new FrameDemo();
		frameDemo.showFrame();
	}
}
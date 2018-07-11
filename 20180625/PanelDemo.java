import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

class PanelDemo
{
	//Frame awtFrame;
	JFrame swingFrame;
	JPanel panel;
	JButton btnClick, btnCancel;
	JLabel lblName;
	JTextField txtName;

	PanelDemo() {
		//awtFrame = new Frame();
		swingFrame = new JFrame();
		swingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();//transparent container

		btnClick = new JButton("click");
		btnCancel = new JButton("cancel");
		lblName = new JLabel("NAME");
		txtName = new JTextField(20);

	}

	void showFrame() {
		//awtFrame.setVisible(true);
		swingFrame.setSize(400,200);
		swingFrame.setLocation(100,100);
		swingFrame.setVisible(true);
		//swingFrame.setResizable(false);
	}

	void addComponents() {
		panel.add(lblName);
		panel.add(txtName);
		panel.add(btnClick);
		panel.add(btnCancel);
		
		swingFrame.add(panel);

	}

}

class MainClass{
	public static void main(String[] args) {
		PanelDemo panelDemo = new PanelDemo();
		panelDemo.showFrame();
		panelDemo.addComponents();
	}
}
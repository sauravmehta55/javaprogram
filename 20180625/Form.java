
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
class Form
{
	JFrame swingFrame;
	JPanel panel;
	JButton btnSubmit, btnCancel;
	JLabel lblName;
	JLabel lblPassword;
	JTextField txtName;
	JPasswordField txtPassword;

	Form() {
		swingFrame = new JFrame();
		swingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		//panel = new JPanel();//transparent container

		btnSubmit = new JButton("submit");
		btnCancel = new JButton("cancel");
		lblName = new JLabel("NAME");
		txtName = new JTextField(20);
		lblPassword = new JLabel("PASSWORD");
		txtPassword = new JPasswordField(20);
		

	}

	void showForm() {
		swingFrame.setSize(400,200);
		swingFrame.setLocation(100,100);
		swingFrame.setVisible(true);
		}

	void addComponents() {
	    panel.add(lblName);
		panel.add(txtName);
		panel.add(lblPassword);
		panel.add(txtPassword);
		panel.add(btnSubmit);
		panel.add(btnCancel);
		
		swingFrame.add(panel);

	}

}

class MainClass{
	public static void main(String[] args) {
		Form form = new Form();
		form.showForm();
		form.addComponents();
	}
}



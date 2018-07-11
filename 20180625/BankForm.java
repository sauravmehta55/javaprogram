import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.awt.event;

class BankForm implements ActionListener, MouseClick,MouselongClick
{
	JFrame swingFrame;
	JButton button;
	JButton1 exit;
	JTextField txtName;
	JLabel lblName;
	JPasswordField = txtPassword;
	JPanel panel;

	class(){
		frame = new JFrame("BankForm");
		panel = new JPanel;
		lblName = new JLabel("NAME");
		txtName = new JTextField(20);
		lblPassword = new JLabel("Password");
		txtName = new JPasswordField(20);
		button = new JButton("submit");
		button1 = new JButton1("cancell");
		label = new JLabel("succcesfully clicked");
		button.addActionListener(this);
		frame.addMouseListener(this);
		
	}
	
	
	

	

}
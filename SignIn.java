package bankApp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

class SignIn extends JFrame implements ActionListener {

    private Container c;
    private JLabel title;
    private JLabel username;
    private JTextField tusername;
    private JLabel password;
    private JButton login;
    private JTextField tpassword;
    private JLabel welcome;
    private JLabel loremipsum;
    private JLabel subText;

    public SignIn() {
    	setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
    	setType(Type.UTILITY);
    	getContentPane().setEnabled(false);
    	setForeground(Color.WHITE);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	getContentPane().setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        setTitle("Banking Company Login");
        setBounds(300, 90, 671, 600);

        c = getContentPane();
        c.setLayout(null);

        username = new JLabel("Username");
        username.setFont(new Font("Tamil MN", Font.PLAIN, 15));
        username.setSize(500, 20);
        username.setLocation(373, 195);
        c.add(username);

        tusername = new JTextField();
        tusername.setFont(new Font("Arial", Font.PLAIN, 15));
        tusername.setSize(270, 30);
        tusername.setLocation(373, 235);
        c.add(tusername);

        login = new JButton("Login");
        login.setForeground(UIManager.getColor("Button.foreground"));
        login.setBackground(SystemColor.desktop);
        login.setFont(new Font("Tamil MN", Font.PLAIN, 15));
        login.setSize(138, 39);
        login.setLocation(433, 399);
        login.addActionListener(this);
        c.add(login);
        
        subText = new JLabel("Enjoy Your Stay.");
        subText.setBackground(Color.WHITE);
        subText.setForeground(Color.WHITE);
        subText.setFont(new Font("Tamil MN", Font.PLAIN, 15));
        subText.setSize(500, 50);
        subText.setLocation(110, 175);
        c.add(subText);
        
        tpassword = new JTextField();
        tpassword.setFont(new Font("Arial", Font.PLAIN, 15));
        tpassword.setBounds(373, 319, 270, 30);
        getContentPane().add(tpassword);
        
        welcome = new JLabel("Welcome Back");
        welcome.setForeground(Color.WHITE);
        welcome.setFont(new Font("STIX Two Text", Font.PLAIN, 37));
        welcome.setSize(500, 48);
        welcome.setLocation(43, 135);
        c.add(welcome);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(0, -29, 337, 750);
        getContentPane().add(panel);
        
        subText = new JLabel("Enjoy Your Stay");
        subText.setForeground(Color.WHITE);
        panel.add(subText);
        
        
        JLabel lblNewLabel = new JLabel("SignUp?");
        lblNewLabel.setFont(new Font("Lao MN", Font.ITALIC, 11));
        lblNewLabel.setBounds(482, 457, 61, 16);
        getContentPane().add(lblNewLabel);
        
                password = new JLabel("Password");
                password.setBounds(373, 283, 87, 24);
                getContentPane().add(password);
                password.setFont(new Font("Tamil MN", Font.PLAIN, 15));
                
                        title = new JLabel("BiBo.");
                        title.setBounds(421, 64, 164, 86);
                        getContentPane().add(title);
                        title.setForeground(Color.BLACK);
                        title.setFont(new Font("STIX Two Text", Font.PLAIN, 68));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            String username = tusername.getText();
            String password = tpassword.getText();
            // Add login logic here
            JOptionPane.showMessageDialog(this, "Login successful!");
        } else if (e.equals(e)) {
            tusername.setText("");
            tpassword.setText("");
        }
    }

 
}
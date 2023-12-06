import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class RegistrationForm extends JDialog {
    private JTextField tfname;
    private JTextField tfmail;
    private JTextField tfphone;
    private JTextField tfaddress;
    private JTextField tfpassword;
    private JTextField tfconfirmpassword;
    private JButton register;
    private JButton cancel;
    private JPanel registerPanel;

    public RegistrationForm(JFrame parent) {
        super(parent);
        setTitle("create new account");
        setContentPane(registerPanel);
        setMinimumSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

            }
        });
        setVisible(true);
    }


    private void registerUser() {

        String Name = tfname.getText();
        String email = tfmail.getText();
        String phone = tfphone.getText();
        String address = tfaddress.getText();
        String password = String.valueOf(tfpassword.getText());
        String confirmpassword = String.valueOf(tfconfirmpassword.getText());

        if (Name.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty() || password.isEmpty() || confirmpassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all the fields",
                    "Try again", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!password.equals(confirmpassword)) {
            JOptionPane.showMessageDialog(this, "Confirm password Does not match",
                    "Try again", JOptionPane.ERROR_MESSAGE);
            return;
        }

        user = addUserToDatabase(Name, email, phone, address, password);
        if (user != null) {
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Field to register new match",
                    "Try again", JOptionPane.ERROR_MESSAGE);
        }
    }

    public User user;

    private User addUserToDatabase(String Name, String email, String phone, String address, String password) {
        User user = null;
        final String DB_URL = "jdbc:mysql://localhost/testdb";
        final String USERNAME = "root";
        final String PASSWORD = "nithi17DEV$";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            //connection to the database

            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO forms(Name,email,phone,address,password)" + "VALUES(?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, Name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, phone);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, password);

            int addRows = preparedStatement.executeUpdate();
            if (addRows > 0) {
                user = new User();
                user.Name = Name;
                user.email = email;
                user.phone = phone;
                user.address = address;
                user.password = password;
            }
            stmt.close();
            conn.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public static void main(String[] args) {
        RegistrationForm myForm = new RegistrationForm(null);
        User user=myForm.user;
        if(user!=null){
            System.out.println("Registration Successful");
        }
        else{
            System.out.println("Registration Cancelled");
        }
    }
}

import scala.util.Random

object example extends App{
  val list = List(1,2,3,4)
  println(list.head)
  //map
  println(list.map(_+1))
  println(list.map(_+" is a number"))
  //filter
  println(list.filter(_%2 == 0))
  //pattern matching
  val random = new Random
  val x=random.nextInt(10)

  val description = x match {
    case 1 => "The One"
    case 2 => "Double"
    case _ => "Nothing"
  }
  println(x)
  println(description)
  
























//
//  import java.awt.{Dimension, event}
//  import java.awt.event.{ActionEvent, ActionListener}
//  import java.sql.{Connection, DriverManager, PreparedStatement, Statement}
//  import javax.swing.{JButton, JDialog, JFrame, JPanel, JOptionPane, JTextField}
//
//  class RegistrationForm(parent: JFrame) extends JDialog(parent) {
//    private val tfname: JTextField = new JTextField()
//    private val tfmail: JTextField = new JTextField()
//    private val tfphone: JTextField = new JTextField()
//    private val tfaddress: JTextField = new JTextField()
//    private val tfpassword: JTextField = new JTextField()
//    private val tfconfirmpassword: JTextField = new JTextField()
//    private val register: JButton = new JButton("Register")
//    private val cancel: JButton = new JButton("Cancel")
//    private val registerPanel: JPanel = new JPanel()
//
//    private var user: User = _
//
//    setTitle("Create New Account")
//    setContentPane(registerPanel)
//    setMinimumSize(new Dimension(450, 474))
//    setModal(true)
//    setLocationRelativeTo(parent)
//    //setDefaultCloseOperation(DISPOSE_ON_CLOSE)
//    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE)
//
//
//    register.addActionListener(new ActionListener {
//      override def actionPerformed(e: ActionEvent): Unit = {
//        registerUser()
//      }
//    })
//    cancel.addActionListener(new ActionListener {
//      override def actionPerformed(e: ActionEvent): Unit = {
//        dispose()
//      }
//    })
//    setVisible(true)
//
//    private def registerUser(): Unit = {
//      val Name: String = tfname.getText
//      val email: String = tfmail.getText
//      val phone: String = tfphone.getText
//      val address: String = tfaddress.getText
//      val password: String = tfpassword.getText
//      val confirmpassword: String = tfconfirmpassword.getText
//
//      if (Name.isEmpty || email.isEmpty || phone.isEmpty || address.isEmpty || password.isEmpty || confirmpassword.isEmpty) {
//        JOptionPane.showMessageDialog(this, "Please enter all the fields", "Try again", JOptionPane.ERROR_MESSAGE)
//        return
//      }
//
//      if (password != confirmpassword) {
//        JOptionPane.showMessageDialog(this, "Confirm password does not match", "Try again", JOptionPane.ERROR_MESSAGE)
//        return
//      }
//
//      user = addUserToDatabase(Name, email, phone, address, password)
//      if (user != null) {
//        dispose()
//      } else {
//        JOptionPane.showMessageDialog(this, "Failed to register new user", "Try again", JOptionPane.ERROR_MESSAGE)
//      }
//    }
//
//    private def addUserToDatabase(Name: String, email: String, phone: String, address: String, password: String): User = {
//      var user: User = null
//      val DB_URL: String = "jdbc:mysql://localhost/testdb"
//      val USERNAME: String = "root"
//      val PASSWORD: String = "nithi17DEV$"
//
//      try {
//        Class.forName("com.mysql.cj.jdbc.Driver")
//        val conn: Connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD)
//        val stmt: Statement = conn.createStatement()
//        val sql: String = "INSERT INTO forms(Name,email,phone,address,password) VALUES(?, ?, ?, ?, ?)"
//        val preparedStatement: PreparedStatement = conn.prepareStatement(sql)
//        preparedStatement.setString(1, Name)
//        preparedStatement.setString(2, email)
//        preparedStatement.setString(3, phone)
//        preparedStatement.setString(4, address)
//        preparedStatement.setString(5, password)
//
//        val addRows: Int = preparedStatement.executeUpdate()
//        if (addRows > 0) {
//          user = new User(Name, email, phone, address, password)
//        }
//        stmt.close()
//        conn.close()
//      } catch {
//        case e: Exception =>
//          e.printStackTrace()
//      }
//      user
//    }
//  }
//
//  case class User(Name: String, email: String, phone: String, address: String, password: String)
//
//  object RegistrationForm {
//    def main(args: Array[String]): Unit = {
//      val myForm: RegistrationForm = new RegistrationForm(null)
//      val user: User = myForm.user
//      if (user != null) {
//        println("Registration Successful")
//      } else {
//        println("Registration Cancelled")
//      }
//    }
//  }
//
//
 }
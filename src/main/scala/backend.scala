//import java.sql.{Connection,DriverManager}
//
//object ScalaJdbcConnectSelect extends App {
//
//  // connect to the database named "mysql" on port 3306 of localhost
//  val url = "jdbc:mysql://localhost:3306/testdb"
//  val driver = "com.mysql.cj.jdbc.Driver"
//  val username = "root"
//  val password = "nithi17DEV$"
//  var connection:Connection = _
//  try {
//    Class.forName(driver)
//    connection = DriverManager.getConnection(url, username, password)
//    val statement = connection.createStatement
//    val rs = statement.executeQuery("SELECT * FROM user")
//    while (rs.next) {
//      val id = rs.getString("id")
//      val name = rs.getString("name")
//      val email = rs.getString("email")
//      val phone = rs.getString("phone")
//      val salary = rs.getString("salary")
//      println("id = %s,name = %s,email = %s,phone = %s,salary = %s".format(id,name,email,phone,salary))
//    }
//  } catch {
//    case e: Exception => e.printStackTrace
//  }
//  connection.close
//}
//
//
//
//
import java.sql.*;

/**
 * File : MySQLPersonDAO.java
 * Deskripsi : Implementasi PersonDAO untuk MySQL
 * Pembuat : Umar Faqih / 24060123120003
 * Tanggal : 15 Mei 2025
 */

public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception{
        String name = person.getName();

        // membuat koneksi, nama db, user, password menyesuaikan
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/pbo","root","umarfaqih.3004");

        //kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println("query");
        Statement s = con.createStatement();
        s.executeUpdate(query);

        // tutup database
        con.close();
    }
}

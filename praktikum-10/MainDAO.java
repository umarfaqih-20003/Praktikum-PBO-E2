/**
 * File : MainDAO.java
 * Deskripsi : Main program untuk akses DAO
 * Pembuat : Umar Faqih / 24060123120003
 * Tanggal : 15 Mei 2025
 */

public class MainDAO {
    public static void main(String[] args) {
        Person person  = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

/* Nama File    : Student.java
 * Deskripsi    : Implementasi dari class Student
 * Pembuat      : Umar Faqih / 24060123120003
 * Tanggal      : 25 April 2025
 */

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    public boolean isAsleep(int hr) { // override
        return 2 < hr && 8 > hr;
    }
}

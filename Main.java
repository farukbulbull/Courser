
public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT", 0.2); // Sözlü notu %20
        Course fizik = new Course("Fizik", "FZK101", "FZK", 0.25); // Sözlü notu %25
        Course kimya = new Course("Kimya", "KMY101", "KMY", 0.3); // Sözlü notu %30

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50, 20, 40);
        s1.addVerbalNote(80, 90, 70); // Sözlü notları ekleyelim
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100, 50, 40);
        s2.addVerbalNote(90, 80, 85); // Sözlü notları ekleyelim
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50, 20, 40);
        s3.addVerbalNote(60, 70, 80); // Sözlü notları ekleyelim
        s3.isPass();
    }
}

public class Exemplul3 {
    public static void main (String [] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student(25);
        
        
        s2.varsta=20;
        System.out.println (s2.varsta);
        System.out.println (s1.varsta);
        System.out.println(s3.varsta);
    }
}
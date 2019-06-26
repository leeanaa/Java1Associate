public class StringEx {
    public static void main (String [] args){
        System.out.println ("Java".charAt(2));
        System.out.println("Java".compareToIgnoreCase("JAVA"));
        System.out.println("Java".concat("8"));
        System.out.println("Java".contains("j"));
        
        System.out.println("Java".equals("JAVA"));
        System.out.println("Java".indexOf("a"));
        System.out.println("Java".substring(2));
        System.out.println("Java".substring(0,2));
        System.out.println(" Ja va ".trim());
        System.out.println(" Ja va ".replace(" ", "").trim());
        //merge pt ca imi creaza un string fiecare meroda
        //->aplic trim tot unui string
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb.reverse());
        System.out.println(sb);
        
    }
}
import java.util.Arrays;

public class Pracc {
    public static void main(String[] args) {
        String s1 = "Strings are awesome are";
        String s2 = "Methods are cool";
        System.out.println("Example for length : " + s1.length());
        System.out.println("Example for substring : " + s1.substring(8));
        System.out.println("Example for substring : " + s1.substring(8, 12));
        System.out.println("Example for replace : " + s1.replace("are", "is"));
        System.out.println("Example for charAt : " + s1.charAt(0));
        System.out.println("Example for equals : " + s1.equals(s2));
        System.out.println("Example for compareTo : " + s1.compareTo(s2));
        System.out.println("Example for toLowerCase : " + s1.toLowerCase());
        System.out.println("Example for toUpperCase : " + s1.toUpperCase());
        System.out.println("Example for contains : " + s1.contains("awesome"));
        System.out.println("Example for endsWith : " + s1.endsWith("are"));
        System.out.println("Example for startsWith : " + s1.startsWith("S"));
        System.out.println("Example for indexOf : " + s1.indexOf("are"));
        System.out.println("Example for lastIndexOf : " + s1.lastIndexOf("are"));

        String email = "Csigacsabi@example.com";
        String[] emailData;
        emailData = email.split("@");
        System.out.println(Arrays.toString(emailData));
    }
}

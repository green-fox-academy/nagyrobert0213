import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"
        List<String> line = new ArrayList<>();
        line.add("Robi");
        try{
            Path myName = Paths.get("my-file.txt");
            Files.write(myName,line);
            System.out.println(line);
            //Files.write("my-file.txt","Robert Nagy");
        }
        catch (Exception e){
            System.out.println("asd");

        }

    }
}

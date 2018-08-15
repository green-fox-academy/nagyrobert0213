import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

        Path countLines = Paths.get("assets/document.txt");
        counting(countLines);
        System.out.println(countLines);

    }
    public static int counting (Path countLines){
        int a;
        try {

            List<String> lines = Files.readAllLines(countLines);
            a = lines.size();
        }
        catch (Exception e){
            System.out.println("0");

        }
        return ;
    }
}

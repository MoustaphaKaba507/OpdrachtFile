import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Oefening1 {
    public static void main(String[] args) {


        Path pathMessage = Paths.get("C:\\Users\\MediMonster\\Documents\\Kaba\\Animal.txt");
        Path pathAnimal =Paths.get("C:\\Users\\MediMonster\\Documents\\Kaba\\Message.txt");

        System.out.println(pathMessage);
        System.out.println(pathAnimal);

        File aDirectory = pathAnimal.toFile();


    }
}

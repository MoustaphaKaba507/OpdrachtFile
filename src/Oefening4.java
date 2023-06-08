import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class Oefening4 {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\MediMonster\\Documents\\Kaba\\Animal.txt"));
            reader.lines().forEach(System.out::println);
            reader.close();

        }catch (IOException ioexc){
            ioexc.printStackTrace();
        }

        try {
            BufferedReader reader =new BufferedReader(new FileReader("C:\\Users\\MediMonster\\Documents\\Kaba\\Message.txt"));
            reader.lines().forEach(System.out::println);
            reader.close();

        }catch (IOException ioexc){
            ioexc.printStackTrace();
        }
    }
}

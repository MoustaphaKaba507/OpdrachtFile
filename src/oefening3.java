import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class oefening3 {
    public static void main(String[] args) {

        FavAnimal lion = new FavAnimal("Mufasa",false);

        try {
            BufferedWriter writer2 = new BufferedWriter(new FileWriter("C:\\Users\\MediMonster\\Documents\\Kaba\\Animal.txt"));
            writer2.write("Name " + lion.getName() + ", Edible " + lion.isEdible());
            writer2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\MediMonster\\Documents\\Kaba\\Message.txt"));

            writer.write("Java is interessting but complicated ");
            writer.write("\nWorking out is good for the health");
            writer.close();



        }catch (IOException ioexc){
            ioexc.printStackTrace();
        }


    }
}

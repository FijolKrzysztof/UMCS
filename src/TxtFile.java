import java.io.*;

public class TxtFile {
    public void write(String text1, String text2) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
            writer.write(text1);
            writer.newLine();
            writer.write(text2);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String read() {
        String output = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            output = output.concat(reader.readLine());
            output = output.concat("\n");
            output = output.concat(reader.readLine());
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return output;
    }
}

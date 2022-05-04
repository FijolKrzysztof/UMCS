import java.io.*;
import java.util.StringTokenizer;

public class CsvFile {
    public void write() {
        String line1 = "a1; b1; c1;";
        String line2 = "a2; b2; c2;";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file.csv"));
            writer.write(line1);
            writer.newLine();
            writer.write(line2);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String read() {
        String output = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, ";");
                while (tokenizer.hasMoreTokens()) {
                    output = output.concat(tokenizer.nextToken());
                    output = output.concat(" ");
                }
                output = output.concat("\n");
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return output;
    }
}

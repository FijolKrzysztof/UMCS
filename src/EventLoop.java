import java.io.*;
import java.util.StringTokenizer;

public class EventLoop {
    BufferedReader reader;
    BufferedWriter writer;

    EventLoop(InputStream in, OutputStream out) {
        this.reader = new BufferedReader(new InputStreamReader(in));
        this.writer = new BufferedWriter(new OutputStreamWriter(out));
    }

    public void eventLoop() {
        while (true) {
            try {
                command(reader.readLine());
                writer.flush();
            } catch (IOException e) {
                break;
            }

        }
    }

    public void command(String command) throws IOException {
        StringTokenizer tokenizer = new StringTokenizer(command, " ");

        switch (tokenizer.nextToken()) {
            case "print-default" -> writer.write("default printed message");
            case "print" -> writer.write("printed message: " + (tokenizer.hasMoreTokens() ? tokenizer.nextToken() : ""));
            case "exit" -> {
                writer.write("exiting...");
                writer.close();
            }
            default -> writer.write("unknown command");
        }
        writer.write("\n");
    }
}

import java.io.*;

public class practical_28 {
    public static void main(String[] args) {

        int lines = 0, words = 0, chars = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;

                String[] w = line.split("\\s+");
                words += w.length;

                chars += line.replace(" ", "").length();
            }

            br.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters (no spaces): " + chars);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

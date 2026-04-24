import java.io.*;

public class practical_26 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Provide file name");
            return;
        }

        int chars = 0, words = 0, lines = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;
                chars += line.length();

                String[] w = line.split("\\s+");
                words += w.length;
            }

            br.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

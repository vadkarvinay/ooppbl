import java.io.*;

public class practical_27 {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));

            bw.write("101 Rachit 85\n");
            bw.write("102 Aman 78\n");
            bw.write("103 Priya 90\n");

            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String line;

            System.out.println("Student Records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}

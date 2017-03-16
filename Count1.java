import java.io.*;

public class Count1 {
    static int n = 0;

    public static void main(String[] args) {
        File out = new File("C:\\1/input.txt");
        try {
            BufferedReader buf = new BufferedReader(new FileReader(out));
            while (buf.ready()){
                String line  = buf.readLine();
                char[] numbers = line.toCharArray();

                for (int i = 0; i < 99; i++) {
                    for (int j = i+1; j < 100; j++) {
                        if(numbers[i] == numbers[j]){
                            n++;
                        }
                    }
                }
                File output = new File("C:\\ouput.txt");
                BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(output));
                writer.write(n);
                writer.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

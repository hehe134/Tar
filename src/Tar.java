import java.io.*;

/**
 * Created by 中奇 on 2017/4/5.
 */

public class Tar {
    public static void main(String args[]) {
        try {
            int
            //1
            String pathname = "C:\\biancheng\\Input\\Input1.txt";
            File filename = new File(pathname);
            InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
            String line = "";
            BufferedReader br = new BufferedReader(reader);
            File writename = new File("C:\\biancheng\\Input\\output.txt");
            writename.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(writename));

            line = br.readLine();
            out.write("Input1:\r\n");
            while (line != null) {
                out.write(line);
                line = br.readLine();
                out.write("\r\n");
            }

            //2
            String pathname2 = "C:\\biancheng\\Input\\Input2.txt";
            File filename2 = new File(pathname2);
            InputStreamReader reader2 = new InputStreamReader(new FileInputStream(filename2));
            line = "";
            br = new BufferedReader(reader2);

            line = br.readLine();
            out.write("Input2:\r\n");
            while (line != null) {
                out.write(line);
                line = br.readLine();
                out.write("\r\n");
            }
            //3
            pathname = "C:\\biancheng\\Input\\Input3.txt";
            filename = new File(pathname);
            reader = new InputStreamReader(new FileInputStream(filename));
            line = "";
            br = new BufferedReader(reader);

            line = br.readLine();
            out.write("Input3:\r\n");
            while (line != null) {
                out.write(line);
                line = br.readLine();
                out.write("\r\n");
            }

            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

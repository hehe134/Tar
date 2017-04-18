import sun.plugin.javascript.navig.Array;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 中奇 on 2017/4/5.
 */

public class Tar {
    public static void main(String args[]) {
        try {

//            String pathname = "C:\\biancheng\\Input\\file1.txt";
//            File filename = new File(pathname);
            List<String> cmdLine = Arrays.asList(args);

            File rootDictory = new File(new File("").getAbsolutePath());

            String path = rootDictory.getAbsolutePath() + "\\-out\\";
            File file = new File(path);
            File[] tempList = file.listFiles();
//                File writename = new File(path+"output.txt");
            File writename = new File(path + args[args.length - 1]);
            writename.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(writename));

            if (cmdLine.contains("-out")) {
                // System.out.println(rootDictory.getAbsolutePath());
                for (int i = 0; i < tempList.length; i++) {
                    for (int n = 0; n < (args.length - 2); n++) {
                        if (args[n].equals(tempList[i].getName())) {

                            File filename = new File(path + args[n]);
                            InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
                            String line;
                            BufferedReader br = new BufferedReader(reader);

//                            reader = new InputStreamReader(new FileInputStream(tempList[i]));
//                            br = new BufferedReader(reader);

                            line = br.readLine();
                            out.write(args[n] + ":\r\n");
                            while (line != null) {
                                out.write(line);
                                line = br.readLine();
                                out.write("\r\n");


                            }
                        }
                    }
                }

                out.flush();
                out.close();

            } else if (cmdLine.contains("-u")) {
                path = rootDictory.getAbsolutePath() + "\\-u\\";

                InputStreamReader reader = new InputStreamReader(new FileInputStream(path + args[args.length - 1]));
                BufferedReader br = new BufferedReader(reader);
                String line = br.readLine();

//                out.write("Input2:\r\n");
                int i = 1;
                while (line != null) {
                    writename = new File(path + "Output" + i+".txt");
                    writename.createNewFile();
                    out = new BufferedWriter(new FileWriter(writename));
                    out.write(line);
                    line = br.readLine();
//                    out.write("\r\n");
                    out.flush();
                    out.close();
                    i++;
                }
            }


            /*
            String line;
            BufferedReader br = new BufferedReader(reader);
            File writename = new File("C:\\biancheng\\Input\\output.txt");
            writename.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(writename));

            System.out.println(args[1]);

            String path = "C:\\biancheng\\Input\\";
//            String[] fileN = {"Input1.txt", "Input2.txt"};
                       for (int i = 0; i < tempList.length; i++) {
                for (int n=0;n<(args.length-2);n++){
                    if(args[n].equals(tempList[i].getName())){
                        reader = new InputStreamReader(new FileInputStream(tempList[i]));
                        br = new BufferedReader(reader);

                        line = br.readLine();
                        out.write(args[n]+":\r\n");
                        while (line != null) {
                            out.write(line);
                            line = br.readLine();
                            out.write("\r\n");
                        }
                    }
                }
            }

            //1

//            line = br.readLine();
//            out.write("Input1:\r\n");
//            while (line != null) {
//                out.write(line);
//                line = br.readLine();
//                out.write("\r\n");
//            }
//
//            //2
//            String pathname2 = "C:\\biancheng\\Input\\Input2.txt";
//            File filename2 = new File(pathname2);
//            InputStreamReader reader2 = new InputStreamReader(new FileInputStream(filename2));
//            br = new BufferedReader(reader2);
//
//            line = br.readLine();
//            out.write("Input2:\r\n");
//            while (line != null) {
//                out.write(line);
//                line = br.readLine();
//                out.write("\r\n");
//            }
//            //3
//            pathname = "C:\\biancheng\\Input\\Input3.txt";
//            filename = new File(pathname);
//            reader = new InputStreamReader(new FileInputStream(filename));
//            br = new BufferedReader(reader);
//
//            line = br.readLine();
//            out.write("Input3:\r\n");
//            while (line != null) {
//                out.write(line);
//                line = br.readLine();
//                out.write("\r\n");
//            }

*/
//            out.flush();
//            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
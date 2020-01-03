package helper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileHelper {

    public static void main(String[] args) {
//        FileHelper fileHelper = new FileHelper();
//        String[] listString = { "Haha", "HUhu" };
//        fileHelper.writeFromList("data.txt", listString);

//        ArrayList<String> result = fileHelper.readToArrayList("data.txt");
//        result.forEach((String str) -> System.out.println(str));
    }

    public static String read(String path) {
        FileReader f = null;
        try {
            f = new FileReader(path);
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        BufferedReader buffer = null;
        String result = "";
        buffer = new BufferedReader(f);
        try {
            while (true) {
                String line = null;

                line = buffer.readLine();

                if (line == null || line == "")
                    break;
                result += line + "\n";
            }
            buffer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    public static ArrayList<String> readToArrayList(String path){
        FileReader f = null;
        try {
            f = new FileReader(path);
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        BufferedReader buffer = null;
        ArrayList<String> result  = new ArrayList<String>();
        buffer = new BufferedReader(f);
        try {
            while (true) {
                String line = null;

                line = buffer.readLine();

                if (line == null || line == "")
                    break;
                result.add(line);
            }
            buffer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    public static void write(String path, String data) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        PrintWriter printer = null;

        printer = new PrintWriter(fileWriter);

        printer.println(data);

        printer.close();
    }

    public static void writeFromList(String path, String[] stringArray) {
        String data = "";
        for (String string : stringArray) {
            data += string + "\n";
        }
        write(path, data);
    }

}

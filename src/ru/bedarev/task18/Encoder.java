package ru.bedarev.task18;

import java.io.*;

public class Encoder {
    public static void main(String[] args) throws IOException {
        String str = "Good news everyone! \nAnd have nice day \nHello World!";

        saveToFile("koi8.txt", str, "koi8");
        encode("koi8.txt", "UTF-8");

    }

    private static void saveToFile(String outFile, String str, String charsetName) {
        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(outFile), charsetName)) {
            osw.write(str);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void encode(String filename, String encoding) {
        String result = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename), encoding))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                result += line + "\n";
            }
            saveToFile("newFile.txt", result, "UTF-8");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


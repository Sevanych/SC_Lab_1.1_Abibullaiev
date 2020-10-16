package com.company;

import java.io.*;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String file = "C:\\Users\\DELL\\IdeaProjects\\SC_Lab_1.1_Abibullaiev\\src\\com\\company\\txt.txt";
        String line = "";
        try(FileInputStream fis = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(fis);
            BufferedReader read = new BufferedReader(reader)){
            line = read.readLine();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        String str = "";
        String[] words = line.split(" ");
        for (String word : words){
            if (Pattern.matches("L[a-z]+", word)){
                word = "Lala";
            }
            str += (word + " ");
        }

        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println(str);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}

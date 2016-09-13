/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roshan.fileio;

import com.roshan.fileio.command.DosCommand;
import com.roshan.fileio.command.DosFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Aasick
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = "";
            File file = new File(".");
            String path = file.getAbsolutePath();
            System.out.print(path + ">");
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {

                String[] tokens = line.split(" ");
                DosCommand cmd = DosFactory.get(tokens[0]);

                if (cmd != null) {

                    cmd.execute(tokens);
                } else {
                    System.out.println("Invalid Command");
                }

                System.out.print(path + ">");
            }

        } catch (IOException ioe) {

        }

    }

    private static void StringBuilder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

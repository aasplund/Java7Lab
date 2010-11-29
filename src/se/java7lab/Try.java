/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.java7lab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author anders
 */
public class Try {

    public static void main(String args[]) throws Throwable {
        Try tryInJava7 = new Try();
        System.out.println("*****  Automatic Resource Management *****");
        tryInJava7.automaticResourceManagement();
        System.out.println("*****  Diamond Operator *****");
        tryInJava7.diamondOperator();
        System.out.println("*****  Underscore In Numerics *****");
        tryInJava7.underscoresInNumerics();
        System.out.println("*****  String In Switch *****");
        tryInJava7.stringInSwitch("foo");
        tryInJava7.stringInSwitch("bar");
        tryInJava7.stringInSwitch("Foo");
        System.out.println("*****  Binary Literals *****");
        tryInJava7.binaryLiterals();
        
    }

    public void automaticResourceManagement() throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/anders/rss.xml"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public void diamondOperator() {
        Map<Integer, String> diamond = new HashMap<>();
        diamond.put(1, "One");
        diamond.put(2, "Two");
        System.out.println(diamond);
    }

    public void underscoresInNumerics() {
        int one_million = 1_000_000;
        System.out.println("1_000_000 = " + one_million);
    }

    public void stringInSwitch(String val) {
        switch (val) {
            case "foo":
                System.out.println("Foo case");
                break;
            case "bar":
                System.out.println("Bar case");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }

    public void binaryLiterals() {
        int binary = 0b1001_1001;
        System.out.println("0b1001_1001 = " + binary);
    }


}

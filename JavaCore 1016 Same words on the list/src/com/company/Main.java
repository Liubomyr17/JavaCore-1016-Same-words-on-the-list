package com.company;

/*

1016 Same words on the list
Enter 20 words from the keyboard into the list.
You need to count the number of identical words in the list.
The result should be presented in the form of a dictionary Map <String, Integer>, where the first parameter is a unique string, and the second is a number, how many times this string was found in the list.
Display the contents of the dictionary.
In tests, case (capital / small letter) affects the result.
Requirements:
1. The countWords method must declare and initialize a HashMap with an element type.
2. The countWords method should return the created dictionary.
3. The countWords method should add keys corresponding to unique strings to the dictionary, and values ​​for these keys that show how many times a string has been encountered.
4. The program should display the resulting dictionary.
5. The main method should call the countWords method.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> words = new ArrayList<String>();
    for (int i=0; i<20; i++) {
        words.add(reader.readLine());
    }
    Map<String, Integer> map = countWords(words);
    for (Map.Entry<String, Integer> pair : map.entrySet()) {
        System.out.println(pair.getKey() + " " + pair.getValue());
    }
    }
    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for (String s : list) {
            result.merge(s, 1, (v1, v2) -> v1 + v2);
        }
        return result;
    }
}



















package net.mindview.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rafal on 02017-04-16.
 */
public class Finding {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
        while (m.find())
            System.out.print(m.group()+" ");
        System.out.println();
        int i = 0 ;
        while (m.find(i)){
            System.out.print(m.group()+ " ");
            i++;
        }
    }
}
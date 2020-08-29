package com.company;

import java.io.FileInputStream;

public class Datalode {
    Members data;
    Members load(){
        try {
            FileInputStream fin = new FileInputStream("D:\\userdata.csv");
            int i = 0;
            int t = 0;
            String a="X";
            String b="X";
            String c="X";
            String text = new String();
            while ((i = fin.read()) != -1) {
                if (i != 59) text = text + ((char) i);
                else {
                    t++;
                    switch (t){
                        case 1: a= text;
                        break;
                        case 2: b=text;
                        break;
                        case 3:
                            c=text;
                            data=new Members(a,b,c);
                            return data;
                    }
                    text = "";
                }
            }
            fin.close();
            return data;
        } catch (Exception e) {System.out.println(e);}
        return data;
    }

}

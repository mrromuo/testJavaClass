package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class savestrm {

    String FileName = "D:\\std.csv";
    void save(Student s1) {
        //Creating the object
        //Student s1 = new Student(211, "ravi");

        try {
            //Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream(FileName);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    Student load(){
        Student student= new Student(0,"no namefound");
        try{
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream(FileName));
            Student s=(Student)in.readObject();
            //printing the data of the serialized object
            //System.out.println(s.id+" "+s.name);
            student=s;
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
        return student;
    }
}


package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String path="D:\\userdata.scv";
        Members user= new Members("Raeed2","zxc1232","UZER50002");
        System.out.println(user.getusername());
        ArrayList<Members> userdata=new ArrayList<>();
        userdata.add(user);

        datasave sv=new datasave(user);
        boolean ss = sv.save();
        if (ss) {
            Datalode newdata = new Datalode();
            Members usdata;
            usdata = newdata.load();
            try {
                System.out.println(usdata.getusername());
                System.out.println(usdata.getpassword());
                System.out.println(usdata.getid());
            }catch (Exception e) {
                System.out.println(e);
            }


        } else System.out.println("Saving data filled");

        // Serializable test
        Student student=new Student(1,"Talal Kumar");
        Student student2=new Student(2,"Masoor Assram");
        Student outputst;
        savestrm savestrmx=new savestrm();
        savestrmx.save(student);
        savestrmx.save(student2);
        outputst=savestrmx.load();
        System.out.println(outputst.id+" "+outputst.name);
    }
}

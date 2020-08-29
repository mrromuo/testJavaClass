package com.company;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class datasave {
    Members data;
    public datasave(Members data){
        this.data = data;
    }
   public boolean save (){
       String a1= data.getusername();
       String a2= data.getpassword();
       String a3= data.getid();
       try{
           FileOutputStream fout=new FileOutputStream("D:\\userdata.csv");
           //converting string into byte array
           byte b1[]=a1.getBytes();
           byte b2[]=a2.getBytes();
           byte b3[]=a3.getBytes();
           // write to file and close it
           //fout.write(b1);
           fout.write(b1);
           fout.write(59); // new line
           fout.write(b2);
           fout.write(59);
           fout.write(b3);
           fout.write(59);
           fout.close();

           return true;
       }catch(Exception e){System.out.println(e);}
        return false;
   }
}

package com.company;

public class Members {
    private String username = new String();
    private String password = new String();
    private String id= new String();

    public Members(String username , String password, String id){
        this.username = username;
        this.password = password;
        this.id = id;
    }

    public void setusername(String username){
        this.username  = username;
    }
    public String getusername(){
        return username;
    }

    public void setpassword(String password){
        this.password  = password;
    }
    public String getpassword(){
        return password;
    }

    public void setid(String id){
        this.id = id;
    }
    public String getid(){
        return id;
    }

}
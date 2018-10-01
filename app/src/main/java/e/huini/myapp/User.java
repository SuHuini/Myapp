package e.huini.myapp;

public class User {
    int id;
    String Fname;
    String Sname;
    char email;
    char password;

    public User(int id, String Fname, char email){

    }
    public void  setId(int i){
        i = id;
    }
    public void  getId(int i){
        i = id;
    }
    public void  setEmail(char e){
        e = email;
    }
    public void  getEmail(char e){
        e = email;
    }
    protected void  setPass(char p){
        p = password;
    }
    protected void  getPass(char p){
        p = password;
    }
    public void setFname (String f){
        f = Fname;
    }
    public void setSname(String s){
        s = Sname;
    }
    public void getName(String n){
        n = Fname + Sname;
    }

}

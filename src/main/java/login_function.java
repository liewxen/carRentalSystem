
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khaixenliew
 */
public class login_function {
    public String username;
    public String password;
    
    public login_function(){}
    public login_function(String A, String B){username =A;password=B;}
    public String toString(){return "Username = "+username + "Password = "+password; }
    public void write_data(){
        try{
            File file = new File("customer_info");
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            String my_data = username + " " + password;
            pw.write(my_data);
            pw.close();
        }
        catch(IOException E){}
    }
}

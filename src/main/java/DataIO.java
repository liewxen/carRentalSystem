
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khaixenliew
 */
public class DataIO {
    public static ArrayList<Admin> allAdmins = new ArrayList<Admin>();
    public static void readFromTextFile(){
        try{
            Scanner s1 = new Scanner(new File("customer.txt"));
            while(s1.hasNext()){
                String a = s1.nextLine();
                String b = s1.nextLine();
                s1.nextLine();
                Admin c = new Admin(a,b);
                allAdmins.add(c);
            }
        }
        catch(Exception e){
            System.out.println("Error in read ......");
        }
    }
    
    public static void writeToTextFile(){
        try{
            PrintWriter pw = new PrintWriter("customer.txt");
            for(Admin c: allAdmins){
                pw.println(c.getUsername());
                pw.println(c.getPassword());
                pw.println();
            }
            pw.close();
        }
        catch(Exception e){
            System.out.println("Error in read ......");
        }
    }
    
    public static Admin checkUsername(String username){
        Admin found = null;
        for(Admin c: allAdmins){
            if(username.equals(c.getUsername())){
                found = c;
                break;
            }
        }
        return found;
    }
}

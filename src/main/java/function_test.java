
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class function_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
    Scanner Sc = new Scanner(System.in);
    int i =0 ;
    while(i<5){
        System.out.println("Enter option:(1-login,2-register) ");
        int inputOption = Sc.nextInt();
        Sc.nextLine();
        if(inputOption==1){
            for(Admin a : DataIO.allAdmins){
                System.out.println(a.getUsername());
                System.out.println(a.getPassword());
            }
        }
        else if(inputOption==2){
            String inputPassword;
            System.out.println("Enter username: ");
            String inputUsername = Sc.nextLine();
            if(!validation.username_validation(inputUsername)){continue;}
            else{
                System.out.println("Enter password: ");
                inputPassword = Sc.nextLine();
                if(!validation.password_validation(inputPassword)){continue;}
                else{}
            }
            System.out.println(inputUsername + " " +inputPassword);

            Admin found  = DataIO.checkUsername(inputUsername);
            if(found == null){
                Admin c = new Admin(inputUsername,inputPassword);
                DataIO.allAdmins.add(c);
                }
            else{System.out.println("Username repeated!");}
            }
        }
    }
}

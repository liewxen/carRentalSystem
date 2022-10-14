
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khaixenliew
 */
public class validation {
    public static boolean username_validation(String A){
        return Pattern.matches("^[a-zA-z ]*$",A);
    }
    
    public static boolean password_validation(String password){
        boolean isValid = true;
        // check upper case
        String upperCaseChars = "(.*[A-Z].*)";
        //check lower case
        String lowerCaseChars = "(.*[a-z].*)";
        //check numbers
        String numbers = "(.*[0-9].*)";
        //check special case
        String specialChars = "(.*[!,@,#,$,%,.].*$)";
        if (password.length() > 15 || password.length() < 8)
        {
            JOptionPane.showMessageDialog(null,"Password must be less than 20 and more than 8 characters in length.");
            isValid = false;
        }
        else if (!password.matches(upperCaseChars ))
        {
            JOptionPane.showMessageDialog(null,"Password must have atleast one uppercase character");
            isValid = false;
        }
        else if (!password.matches(lowerCaseChars ))
        {
            JOptionPane.showMessageDialog(null,"Password must have atleast one lowercase character");
            isValid = false;
        }
        else if (!password.matches(numbers ))
        {
            JOptionPane.showMessageDialog(null,"Password must have atleast one number");
            isValid = false;
        }
        else if (!password.matches(specialChars ))
        {
            JOptionPane.showMessageDialog(null,"Password must have atleast one special character among @#$%");
            isValid = false;
        }
        return isValid;
    }
    
    public static boolean phone_validation(String A){
        String pattern  = "[0]+[1]+[0-9]+[-]+[0-9]{3}+[ ]?+[0-9]{4,5}||[0]+[1]+[0-9]+[-]+[0-9]{4}+[ ]?+[0-9]{4}";
        return Pattern.matches(pattern,A);
    }
    
    public static boolean mail_validation(String A){
    String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    Pattern emailPat = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
    Matcher matcher = emailPat.matcher(A);
    return matcher.find();
    }
    
    public static boolean home_address_validation(String A){
        return true;
    } 
    
}

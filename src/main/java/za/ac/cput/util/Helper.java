/**Entity for the User
 Author: Athini Mbiko (213196379)
 MileStone Date: 28 March 2022s
 */

package za.ac.cput.util;

import java.util.UUID;
import java.util.regex.*;

public class Helper {

    public static boolean isNotempty(String s){
        return (s == null || s.equals("")|| s.equalsIgnoreCase("null"));
    }

    public static boolean isValidPassword(String password) {
        // Regex to check valid password.
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the password is empty
        // return false
        if (password == null) {
            return false;
        }
        Matcher m = p.matcher(password);
        return m.matches();



    }


    }

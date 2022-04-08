package za.ac.cput.factory;

import za.ac.cput.Entity.Log;
import za.ac.cput.util.Helper;

public class LogFactory {
    public static Log createLog(String userName, String passWord){
        if(Helper.isNotempty(userName))
            return null;
        Helper.isValidPassword(passWord);
        return new Log.Builder().setuserName(userName)
                                .setPassWord(passWord)
                                .builder();

    }
}

package com.promact.akansh.theshoppespaceapp.LoginModule;

import android.content.Context;
import com.promact.akansh.theshoppespaceapp.LoginCheckClass;

/**
 * Created by Akansh on 11-10-2017.
 */

public class LoginPresenter implements LoginContract.LoginPresenter {
    @Override
    public void checkCredentials(String username, String password, Context context) {
        new LoginCheckClass(username, password, context).execute();
    }
}

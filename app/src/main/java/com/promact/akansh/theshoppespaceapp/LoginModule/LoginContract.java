package com.promact.akansh.theshoppespaceapp.LoginModule;

import android.app.ProgressDialog;
import android.content.Context;

import com.promact.akansh.theshoppespaceapp.Model.Users;

public class LoginContract {
    interface LoginView {
        void showMessage(String msg);
    }

    public interface LoginPresenter {
        void checkCredentials(String username, String password, Context context);
    }
}

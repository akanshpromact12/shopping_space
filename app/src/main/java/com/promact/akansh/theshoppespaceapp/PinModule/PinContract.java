package com.promact.akansh.theshoppespaceapp.PinModule;

import android.content.Context;

import com.promact.akansh.theshoppespaceapp.Model.Users;

/**
 * Created by Akansh on 13-10-2017.
 */

public class PinContract {
    interface RegisterView {
        void showMessage(String msg);
    }

    interface RegisterPresenter {
        void RegisterUser(Context context, Users users);
    }
}

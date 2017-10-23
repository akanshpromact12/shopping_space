package com.promact.akansh.theshoppespaceapp.HomeModule;

import android.content.Context;

import com.promact.akansh.theshoppespaceapp.Model.Product;

import java.util.ArrayList;

class HomeContract {
    interface HomeView {
        void showProducts(ArrayList<Product> productList);
        //For Delete
        void showMessage(String msg);
    }

    interface HomePresenter {
        void showAllProducts(Context context);
        void addProducts(Context context);
        void updtProducts(Context context, Product products);
        void delProducts(Context context, Product products);
    }
}

package com.promact.akansh.theshoppespaceapp.AddProductsModule;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;

import com.promact.akansh.theshoppespaceapp.APIClient;
import com.promact.akansh.theshoppespaceapp.APIInterface;
import com.promact.akansh.theshoppespaceapp.HomeModule.HomeActivity;
import com.promact.akansh.theshoppespaceapp.Model.Product;

import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddProductsPresenter implements AddProductsContract.addProductActions {

    private final AddProductsContract.addProductsView view;

    @Override
    public void addProducts(Context context, Product product) {
        Random random = new Random();
        int number = random.nextInt(1081) + 2000;

        APIInterface apiInterface = APIClient.getClient()
                .create(APIInterface.class);

        final ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Please wait...");
        progressDialog.setTitle("Adding the product");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.show();

        Call<Product> products = apiInterface.addProducts(number, product);
        if (products != null) {
            products.enqueue(new Callback<Product>() {
                @Override
                public void onResponse(Call<Product> call, Response<Product> response) {
                    view.showMessage("Product was added successfully");
                    progressDialog.dismiss();
                }

                @Override
                public void onFailure(Call<Product> call, Throwable t) {
                    view.showMessage("Product wasn't added due to some error.");
                    progressDialog.dismiss();
                }
            });
        }
    }

    AddProductsPresenter(AddProductsContract.addProductsView view) {
        this.view = view;
    }

    @Override
    public void goBackToHomePage(Context context) {
        Intent intent = new Intent(context, HomeActivity.class);
        context.startActivity(intent);
    }
}

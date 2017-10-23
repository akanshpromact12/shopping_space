package com.promact.akansh.theshoppespaceapp.DeleteProduct;

import com.promact.akansh.theshoppespaceapp.Model.Product;

class DeleteProductContract {
    interface deleteView{
        void showMessage(String msg);
    }

    interface deletePresenter {
        void deleteProduct(Product product);
    }
}

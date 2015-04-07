package shopbook.rmart;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import shopbook.rmart.model.Product;


public class ProductListActivity extends BaseActivity {

  ProductListAdapter productListAdapter;
  private ArrayList<Product> products;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.products_list);
  }

  @Override
  protected void onStart() {
    super.onStart();
    initializeProducts();
    productListAdapter = new ProductListAdapter(products, this);
    ListView productsListView = (ListView) findViewById(R.id.products_list);
    productsListView.setAdapter(productListAdapter);
  }

  private void initializeProducts() {
    Product product1 = new Product("A", "20$");
    Product product2 = new Product("B", "4000$");
    Product product3 = new Product("C", "500$");
    Product product4 = new Product("D", "5$");
    products = new ArrayList<>();
    products.add(product1);
    products.add(product2);
    products.add(product3);
    products.add(product4);
  }
}

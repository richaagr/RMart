package shopbook.rmart;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import shopbook.rmart.model.Product;


public class ProductListAdapter extends BaseAdapter {

  List<Product> productList;
  Activity context;

  ProductListAdapter(List<Product> products, Activity context){
    productList = products;
    this.context = context;
  }

  @Override
  public int getCount() {
    return productList.size();
  }

  @Override
  public Product getItem(int position) {
    return productList.get(position);
  }

  @Override
  public long getItemId(int position) {
    return position;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    if(convertView == null){
      LayoutInflater inflater = context.getLayoutInflater();
      convertView= inflater.inflate(R.layout.products_list_item, parent, false);
    }
    TextView productNameTextView = (TextView) convertView.findViewById(R.id.product_name);
    TextView productPriceTextView = (TextView) convertView.findViewById(R.id.product_price);
    productNameTextView.setText(productList.get(position).getName());
    productPriceTextView.setText(productList.get(position).getPrice());
    return convertView;
  }
}

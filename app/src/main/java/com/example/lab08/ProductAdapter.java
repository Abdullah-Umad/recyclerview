package com.example.lab08;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends
        RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {


    //this context we will use to inflate the layout
     Context mCtx;

    //we are storing all the products in a list
     ArrayList<Object> productList;

    //getting the context and product list with constructor
    public ProductAdapter(Context mCtx, ArrayList<Object> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder
            (ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.items, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        //getting the product of the specified position
        Product product = (Product) productList.get(position);

        //binding the data with the viewholder views
        holder.textViewTitle.setText(product.title);

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));

    }


    @Override
    public int getItemCount() {

        return productList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle;
        ImageView imageView;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.rv1txt);
            imageView = itemView.findViewById(R.id.rv1img);
        }
    }}

//package com.example.lab08;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//import android.widget.ImageView;
//
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//public class ProductAdapter2 extends RecyclerView.Adapter<ProductAdapter2.ProductViewHolder2> {
//
//    Context mCtx2;
//    ArrayList<Object> productList2;
//
//    public ProductAdapter2(Context mCtx2, ArrayList<Object> productList2) {
//        this.mCtx2 = mCtx2;
//        this.productList2 = productList2;
//    }
//
//    @Override
//    public ProductViewHolder2 onCreateViewHolder(ViewGroup parent, int viewType) {
//        LayoutInflater inflater2 = LayoutInflater.from(mCtx2);
//        View view2 = inflater2.inflate(R.layout.inspired, parent, false);
//        return new ProductViewHolder2(view2);
//    }
//
//    @Override
//    public void onBindViewHolder(ProductViewHolder2 holder2, int position) {
//        Product2 product2 = (Product2) productList2.get(position);
//
//        holder2.textViewTitle.setText(product2.title);
//        holder2.textViewDescription.setText(product2.description);
//        holder2.textViewFade.setText(product2.fade);
//        holder2.imageView.setImageDrawable(mCtx2.getResources().getDrawable(product2.getImage()));
//    }
//
//    @Override
//    public int getItemCount() {
//        return productList2.size();
//    }
//
//    class ProductViewHolder2 extends RecyclerView.ViewHolder {
//        TextView textViewTitle;
//        TextView textViewDescription;
//        TextView textViewFade;
//        ImageView imageView;
//
//        public ProductViewHolder2(View itemView2) {
//            super(itemView2);
//
//            textViewTitle = itemView2.findViewById(R.id.rv2txt1);
//            textViewDescription = itemView2.findViewById(R.id.rv2txt2);
//            textViewFade = itemView2.findViewById(R.id.rv2txt3);
//            imageView = itemView2.findViewById(R.id.rv1img);
//        }
//    }
//}

package com.example.lab08;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     RecyclerView recyclerView;
    ArrayList<Object> productList;

//    ArrayList<Object> productList2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the recyclerview from xml
        recyclerView = findViewById(R.id.recycle1);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        productList = new ArrayList<>();

//        //getting the recyclerview from xml2
//        recyclerView =(RecyclerView) findViewById(R.id.recycle2);
//
//        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this); // 'this' should refer to your activity or context
//
//// Set the LinearLayoutManager for the RecyclerView
//        recyclerView.setLayoutManager(layoutManager2);
//
//        productList2 = new ArrayList<>();

        //adding some items to our list

        productList.add(
                new Product("Nutrition",
                        R.drawable.watermelon));


        productList.add(
                new Product("Organic",
                        R.drawable.rice));

        productList.add(
                new Product("Meditation",
                        R.drawable.leaf));

        productList.add(
                new Product("Nutrition",
                        R.drawable.bed));
        productList.add(
                new Product("Nutrition",
                        R.drawable.watermelon));


        productList.add(
                new Product("Organic",
                        R.drawable.rice));

        productList.add(
                new Product("Meditation",
                        R.drawable.leaf));

        productList.add(
                new Product("Nutrition",
                        R.drawable.bed));



//        productList2.add(
//                new Product2(
//                        "7 Nutrition Tips to Lose",
//                        "Weight Faster",
//                        "Nutrition",
//                        R.drawable.orange));
//
//        productList2.add(
//                new Product2(
//                        "Proven Tips to Sleep",
//                        "Better at Night",
//                        "Nutrition",
//                        R.drawable.sleep));
//
//        productList2.add(
//                new Product2(
//                        "10 Ways to Stay",
//                        "Motivated at Gym",
//                        "Nutrition",
//                        R.drawable.dessert));





        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

//        //creating recyclerview adapter
//        ProductAdapter2 adapter2 = new ProductAdapter2(this, productList2);
//
//        //setting adapter to recyclerview
//        recyclerView.setAdapter(adapter2);
    }
}
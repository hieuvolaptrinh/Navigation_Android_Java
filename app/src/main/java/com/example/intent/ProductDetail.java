package com.example.intent;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProductDetail extends AppCompatActivity {

    private TextView tvQuantity;
    private Button btnDecrease, btnIncrease;
    private Button btnAddToCart, btnOrderNow;
    private int quantity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product_detail);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        initViews();
        setupClickListeners();
    }

    private void initViews() {
        tvQuantity = findViewById(R.id.tv_quantity);
        btnDecrease = findViewById(R.id.btn_decrease);
        btnIncrease = findViewById(R.id.btn_increase);
        btnAddToCart = findViewById(R.id.btn_add_to_cart);
        btnOrderNow = findViewById(R.id.btn_order_now);
    }

    private void setupClickListeners() {
        btnDecrease.setOnClickListener(v -> {
            if (quantity > 1) {
                quantity--;
                updateQuantityDisplay();
            }
        });

        btnIncrease.setOnClickListener(v -> {
            if (quantity < 99) {
                quantity++;
                updateQuantityDisplay();
            }
        });

        btnAddToCart.setOnClickListener(v -> {
            Toast.makeText(this, "Đã thêm " + quantity + " Gà Nướng Mắm vào giỏ hàng!",
                    Toast.LENGTH_SHORT).show();
        });

        btnOrderNow.setOnClickListener(v -> {
            Toast.makeText(this, "Đang xử lý đơn hàng " + quantity + " Gà Nướng Mắm...",
                    Toast.LENGTH_SHORT).show();
        });
    }

    private void updateQuantityDisplay() {
        tvQuantity.setText(String.valueOf(quantity));
    }
}
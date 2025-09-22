package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnBuy1, btnBuy2, btnBuy3, btnBuy4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Khởi tạo các nút
        btnBuy1 = findViewById(R.id.btnBuy1);
        btnBuy2 = findViewById(R.id.btnBuy2);
        btnBuy3 = findViewById(R.id.btnBuy3);
        btnBuy4 = findViewById(R.id.btnBuy4);

        // Xử lý click cho tất cả các nút mua
        setupClickListeners();
    }

    private void setupClickListeners() {
        // Gà Nướng Mắm
        btnBuy1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ProductDetail.class);
            startActivity(intent);
        });

        // Cơm Tấm Sườn
        btnBuy2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ProductDetail.class);
            startActivity(intent);
        });

        // Bánh Mì Thịt Nướng
        btnBuy3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ProductDetail.class);
            startActivity(intent);
        });

        // Phở Bò Đặc Biệt
        btnBuy4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ProductDetail.class);
            startActivity(intent);
        });
    }
}
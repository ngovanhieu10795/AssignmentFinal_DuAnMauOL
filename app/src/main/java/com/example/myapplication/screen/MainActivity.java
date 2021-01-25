package com.example.myapplication.screen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nguoidung(View view) {
        Intent intent = new Intent(MainActivity.this,ListNguoiDungActivity.class);
        startActivity(intent);
    }
    public void theloai(View view) {
        Intent intent = new Intent(MainActivity.this,ListTheLoaiActivity.class);
        startActivity(intent);
    }
    public void sach(View view) {
        Intent intent = new Intent(MainActivity.this,ListBookActivity.class);
        startActivity(intent);
    }
    public void hoadon(View view) {
        Intent intent = new Intent(MainActivity.this,ListHoaDonActivity.class);
        startActivity(intent);
    }
    public void sachbanchay(View view) {
        Intent intent = new Intent(MainActivity.this,LuotSachBanChayActivity.class);
        startActivity(intent);
    }
    public void thongke(View view) {
        Intent intent = new Intent(MainActivity.this,ThongKeDoanhThuActivity.class);
        startActivity(intent);
    }
}
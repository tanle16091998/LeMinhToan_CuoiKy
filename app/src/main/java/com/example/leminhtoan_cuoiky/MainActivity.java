package com.example.leminhtoan_cuoiky;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 ListView lvSach;
 ArrayList<Sach> mangSach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvSach =(ListView)findViewById(R.id.listViewSach);
        mangSach = new ArrayList<Sach>();

        mangSach.add(new Sach("harry potter","Được viết bởi Jk.Rowling",R.drawable.sach));
        mangSach.add(new Sach("harry potter","Được viết bởi Jk.Rowling",R.drawable.sach));
        mangSach.add(new Sach("harry potter","Được viết bởi Jk.Rowling",R.drawable.sach));
        mangSach.add(new Sach("harry potter","Được viết bởi Jk.Rowling",R.drawable.sach));
        mangSach.add(new Sach("harry potter","Được viết bởi Jk.Rowling",R.drawable.sach));
        mangSach.add(new Sach("harry potter","Được viết bởi Jk.Rowling",R.drawable.sach));
        mangSach.add(new Sach("harry potter","Được viết bởi Jk.Rowling",R.drawable.sach));
        mangSach.add(new Sach("harry potter","Được viết bởi Jk.Rowling",R.drawable.sach));

        SachAdapter sachadapter = new SachAdapter(
                MainActivity.this,
                R.layout.list_sach,
                mangSach
        );
        lvSach.setAdapter(sachadapter);


    }
}
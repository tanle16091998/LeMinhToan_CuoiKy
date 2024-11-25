package com.example.leminhtoan_cuoiky;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SachAdapter extends BaseAdapter {

    Context myContext;
    int myLayout;
    List<Sach> arraySach;

    public SachAdapter(Context context, int layout, List<Sach> SachList) {
        myContext = context;
        myLayout = layout;
        arraySach = SachList;
    }

    @Override
    public int getCount() {
        return arraySach.size();
    }

    @Override
    public Object getItem(int i) {
        return arraySach.get(i); // Return the item at position i
    }

    @Override
    public long getItemId(int i) {
        return i; // Use position as ID
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(myLayout, null);
        }


        TextView txtTen = view.findViewById(R.id.txt_TenSach);
        txtTen.setText(arraySach.get(i).TenSach);

        TextView txtNoiDung = view.findViewById(R.id.txt_NoiDung);
        txtNoiDung.setText(arraySach.get(i).NoiDung);

        ImageView imgHinh = view.findViewById(R.id.img_HinhAnh);
        imgHinh.setImageResource(arraySach.get(i).HinhAnh);
        return view;
    }
}

package com.example.smartcity1_1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.smartcity1_1.R;
import com.example.smartcity1_1.bean.OrderDetail;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * @Login Name win10
 * @Create by 张瀛煜 on 2020/10/2 at 14:50
 */
public class OrderDetailsAdapter extends ArrayAdapter<OrderDetail> {

    public OrderDetailsAdapter(@NonNull Context context, @NonNull List<OrderDetail> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.order_details_item, parent, false);
            holder = new ViewHolder();
            holder.itemSjmc = convertView.findViewById(R.id.item_sjmc);
            holder.itemSpmc = convertView.findViewById(R.id.item_spmc);
            holder.itemDj = convertView.findViewById(R.id.item_dj);
            holder.itemSl = convertView.findViewById(R.id.item_sl);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        OrderDetail orderDetail = getItem(position);
        holder.itemDj.setText(orderDetail.getPrice()+"");
        holder.itemSl.setText(orderDetail.getCount());
        holder.itemSpmc.setText(orderDetail.getCommodity());
        holder.itemSjmc.setText(orderDetail.getBusiness());
        return convertView;
    }
    static class ViewHolder{

        private TextView itemSjmc;
        private TextView itemSpmc;
        private TextView itemDj;
        private TextView itemSl;
    }

    private void initView() {
    }
}

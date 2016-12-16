package com.wlit.nileema.atmnepal1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Nileema on 12/10/2016.
 */
public class CustomAdapter extends BaseAdapter {

    Context context;
    List<BankItem> bankItems;

    CustomAdapter(Context context, List<BankItem> bankItems) {
        this.context = context;
        this.bankItems = bankItems;
    }

    @Override
    public int getCount() {
        return bankItems.size();
    }

    @Override
    public BankItem getItem(int position) {
        return bankItems.get(position);
    }

    @Override
    public long getItemId(int i) {
        return bankItems.get(i).getProfile_pic_id();
    }
// private view holder class

    private class VeiwHolder {
        ImageView profile_pic;
        TextView Bank_List;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        VeiwHolder holder;
        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item, null);

            holder = new VeiwHolder();

            holder.Bank_List = (TextView) convertView
                    .findViewById(R.id.Bank_List);
            holder.profile_pic = (ImageView) convertView
                    .findViewById(R.id.profile_pic);

            convertView.setTag(holder);
        } else {
            holder = (VeiwHolder) convertView.getTag();
        }

        BankItem bank_pos = bankItems.get(position);
        holder.profile_pic.setImageResource(bank_pos.getProfile_pic_id());
        holder.Bank_List.setText(bank_pos.getBank_List());

        return convertView;
    }
}



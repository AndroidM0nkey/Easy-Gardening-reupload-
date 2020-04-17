package com.example.ss.deadlineslul;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MySecondAdapter extends ArrayAdapter<String> {
    List<String> names;
    int[] flags;
    Context mContext;

    public MySecondAdapter(Context context, List<String> countryNames, int[] countryFlags) {
        super(context, R.layout.listblack2);
        this.names = countryNames;
        this.flags = countryFlags;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return names.size();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyAdapter.ViewHolder mViewHolder = new MyAdapter.ViewHolder();
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.listblack2, parent, false);
            mViewHolder.mFlag = (ImageView) convertView.findViewById(R.id.imageView);
            mViewHolder.mName = (TextView) convertView.findViewById(R.id.TheTextview);
            convertView.setTag(mViewHolder);
        } else {
            mViewHolder = (MyAdapter.ViewHolder) convertView.getTag();
        }
        if(flags[position]==0){
            mViewHolder.mFlag.setImageResource(R.drawable.no);
        }
        /*
        if(flags[position]==1){
            mViewHolder.mFlag.setImageResource(R.drawable.p2p);
        }
        */
        mViewHolder.mName.setText(names.get(position));

        return convertView;
    }

    static class ViewHolder {
        ImageView mFlag;
        TextView mName;
    }
}

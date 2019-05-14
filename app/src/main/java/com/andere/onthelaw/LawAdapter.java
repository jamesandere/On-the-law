package com.andere.onthelaw;

import android.content.Context;
import android.widget.ArrayAdapter;

public class LawAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mcases;
    private String[] mparties;

    public LawAdapter(Context mContext, int resource, String[] mcases, String[] mparties) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mcases = mcases;
        this.mparties = mparties;
    }

    @Override
    public Object getItem(int position) {
        String cases = mcases[position];
        String parties = mparties[position];
        return String.format("%s \nCase: %s", cases, parties);
    }

    @Override
    public int getCount() {
        return mcases.length;
    }
}

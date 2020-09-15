package com.example.recyclerviewdemo;

import androidx.recyclerview.widget.DiffUtil;
import java.util.List;

public class MyDiffCallback extends DiffUtil.Callback{

    List<String> oldMsg;
    List<String> newMsg;

    public MyDiffCallback(List<String> newMsg, List<String> oldMsg) {
        this.newMsg = newMsg;
        this.oldMsg = oldMsg;
    }

    @Override
    public int getOldListSize() {
        return oldMsg.size();
    }

    @Override
    public int getNewListSize() {
        return newMsg.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return oldMsg.equals(newMsg);
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return oldMsg.equals(newMsg);
    }
}
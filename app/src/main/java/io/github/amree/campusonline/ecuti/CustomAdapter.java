package io.github.amree.campusonline.ecuti;

import java.util.ArrayList;

import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<DataApplication> data;
    private static LayoutInflater inflater = null;

    public CustomAdapter(Context context, ArrayList<DataApplication> data) {
        this.context = context;
        this.data = data;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // See if the view needs to be inflated
        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.list_item_pengesahan, null);
        }
        // Extract the desired views
        TextView nameText = (TextView) view.findViewById(R.id.nameValue);
        TextView dateTimeText = (TextView) view.findViewById(R.id.dateTimeValue);

        // Get the data item
        DataApplication item = data.get(position);

        // Display the data item's properties
        nameText.setText(item.nama);
        dateTimeText.setText(item.masaMinta);

        return view;
    }

}

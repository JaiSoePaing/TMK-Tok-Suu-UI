package com.soepaing.tmktoksuu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;


public class RecyclerViewAdaptor extends RecyclerView.Adapter<RecyclerViewAdaptor.ViewHolder> {

    private final List<Item> list;
    private final Context context;

    public RecyclerViewAdaptor(List<Item> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_style, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        Item myList = list.get(position);

        holder.imageView.setImageResource(myList.getImage());
        holder.textViewHead.setText(myList.getTitle());
        holder.textViewDesc.setText(myList.getDescription());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showPosition(position);
            }

            private void showPosition(int position) {
                if (position == 0) {
                    Toast.makeText(context.getApplicationContext(), "Play Music", Toast.LENGTH_SHORT).show();

                }
                if (position == 1) {
                    Toast.makeText(context.getApplicationContext(), "Play Music", Toast.LENGTH_SHORT).show();

                }
                if (position == 2) {
                    Toast.makeText(context.getApplicationContext(), "Play Music", Toast.LENGTH_SHORT).show();

                }
                if (position == 3) {
                    Toast.makeText(context.getApplicationContext(), "Play Music", Toast.LENGTH_SHORT).show();

                }
                if (position == 4) {
                    Toast.makeText(context.getApplicationContext(), "Play Music", Toast.LENGTH_SHORT).show();

                }
                if (position == 5) {
                    Toast.makeText(context.getApplicationContext(), "Play Music", Toast.LENGTH_SHORT).show();

                }

            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {

            private void showPosition(int position) {

            }

            @Override
            public boolean onLongClick(View v) {
                showPosition(position);
                return true;
            }

        });

        holder.buttonViewOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showPosition(position);

            }

            private void showPosition(int position) {
                if (position == 0) {

                    Toast.makeText(context.getApplicationContext(), "This is a Book", Toast.LENGTH_SHORT).show();

                }
                if (position == 1) {

                    Toast.makeText(context.getApplicationContext(), "This is a Book", Toast.LENGTH_SHORT).show();

                }
                if (position == 2) {

                    Toast.makeText(context.getApplicationContext(), "This is a Book", Toast.LENGTH_SHORT).show();

                }
                if (position == 3) {

                    Toast.makeText(context.getApplicationContext(), "This is a Book", Toast.LENGTH_SHORT).show();

                }
                if (position == 4) {

                    Toast.makeText(context.getApplicationContext(), "This is a Book", Toast.LENGTH_SHORT).show();

                }
                if (position == 5) {

                    Toast.makeText(context.getApplicationContext(), "This is a Book", Toast.LENGTH_SHORT).show();

                }
            }

        });

    }


    @Override
    public int getItemCount() {

        return list.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewHead;
        public TextView textViewDesc;
        public ImageView buttonViewOption;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);


            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textViewHead = (TextView) itemView.findViewById(R.id.textViewHead);
            textViewDesc = (TextView) itemView.findViewById(R.id.textViewDesc);
            buttonViewOption = (ImageView) itemView.findViewById(R.id.textViewOptions);
        }
    }
}

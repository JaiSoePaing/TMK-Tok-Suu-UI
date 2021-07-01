package com.soepaing.tmktoksuu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    // Item List
    private List<Item> listItem = new ArrayList();

    // ImageList
    private int[] images = {R.drawable.play_list, R.drawable.play_list, R.drawable.play_list,
            R.drawable.play_list, R.drawable.play_list, R.drawable.play_list};

    private String[] title = {"ၵႃႈပၼ်ႇၵွင်ႊ", "ၵႂၢမ်းၶွပ်ႈၸ်ႂ", "ၵႂၢမ်းၸူမ်းပီႈၼွင်ႉ-႑", "ၵႂၢမ်းၸူမ်းပီႈၼွင်ႉ-႒",
            "ၶိူဝ်းသိူဝ်လၢႆး", "ၶတ်းၸ်ႂႁ်ႂႈမ်ႂႇသုင်"};

    private String[] number = {"ထုင်ႉမၢဝ်းၶမ်း (ဝဵင်းမူႇၸေႊ)", "ထုင်ႉမၢဝ်းၶမ်း (ဝဵင်းမူႇၸေႊ)", "ထုင်ႉမၢဝ်းၶမ်း (ဝဵင်းမူႇၸေႊ)",
            "ထုင်ႉမၢဝ်းၶမ်း (ဝဵင်းမူႇၸေႊ)", "ထုင်ႉမၢဝ်းၶမ်း (ဝဵင်းမူႇၸေႊ)", "ထုင်ႉမၢဝ်းၶမ်း (ဝဵင်းမူႇၸေႊ)"};

    // Custom Recycler View Adaptor
    private RecyclerViewAdaptor adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        for (int i = 0; i < 6; i++) {

            Item item = new Item();
            item.setImage(images[i]);
            item.setTitle(title[i]);
            item.setDescription(number[i]);

            listItem.add(item);
        }

        adapter = new RecyclerViewAdaptor(listItem, this);
        recyclerView.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Intent option = new Intent(this, Option.class);
            startActivity(option);
            return true;

        }


        return super.onOptionsItemSelected(item);
    }

}
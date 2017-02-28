package com.example.user.vitals;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity{

    private List<String> listValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listValues = new ArrayList<String>();
        listValues.add("Neonate");
        listValues.add("6 Months");
        listValues.add("1-2 Years");
        listValues.add("3-4 Years");
        listValues.add("5-6 Years");
        listValues.add("7-8 Years");
        listValues.add("9-10 Years");
        listValues.add("11-12 Years");

        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(MainActivity.this, R.layout.row_layout, R.id.listText, listValues);
        setListAdapter(listAdapter);

    }

    protected void onListItemClick(final ListView list, View view, final int position, long id) {
        super.onListItemClick(list, view, position, id);

        final String selectedItem = (String) getListView().getItemAtPosition(position);
        String weight   = "";
        String heart    = "";
        String lung     = "";
        String systo    = "";

        switch (selectedItem) {
            case "Neonate":
                    weight  = "< 3 kg";
                    heart   = getString(R.string.NeonateHeart);
                    lung    = getString(R.string.NeonateLung);
                    systo   = getString(R.string.NeonateSys);
                    break;
            case "6 Months":
                    weight  = getString(R.string.halfWeight);
                    heart   = getString(R.string.halfHeart);
                    lung    = getString(R.string.halfLung);
                    systo   = getString(R.string.halfSys);
                    break;
            case "1-2 Years":
                    weight  = getString(R.string.oneWeight);
                    heart   = getString(R.string.oneHeart);
                    lung    = getString(R.string.oneLung);
                    systo   = getString(R.string.oneSys);
                    break;
            case "3-4 Years":
                    weight  = getString(R.string.threeWeight);
                    heart   = getString(R.string.threeHeart);
                    lung    = getString(R.string.threeLung);
                    systo   = getString(R.string.threeSys);
                    break;
            case "5-6 Years":
                    weight  = getString(R.string.fiveWeight);
                    heart   = getString(R.string.fiveHeart);
                    lung    = getString(R.string.fiveLung);
                    systo   = getString(R.string.fiveSys);
                    break;
            case "7-8 Years":
                    weight  = getString(R.string.sevenWeight);
                    heart   = getString(R.string.sevenHeart);
                    lung    = getString(R.string.sevenLung);
                    systo   = getString(R.string.sevenSys);
                    break;
            case "9-10 Years":
                    weight  = getString(R.string.nineWeight);
                    heart   = getString(R.string.nineHeart);
                    lung    = getString(R.string.nineLung);
                    systo   = getString(R.string.nineSys);
                    break;
            case "11-12 Years":
                    weight  = getString(R.string.elevenWeight);
                    heart   = getString(R.string.elevenHeart);
                    lung    = getString(R.string.elevenLung);
                    systo   = getString(R.string.elevenSys);
                    break;
        }




        Intent infoIntent = new Intent(this,DisplayActivity.class);
        infoIntent.putExtra("age",selectedItem);
        infoIntent.putExtra("weight",weight);
        infoIntent.putExtra("heartRate",heart);
        infoIntent.putExtra("lungRate",lung);
        infoIntent.putExtra("systo",systo);

        startActivity(infoIntent);
    }
}

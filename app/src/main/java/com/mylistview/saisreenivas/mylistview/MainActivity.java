package com.mylistview.saisreenivas.mylistview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        final String[] values = {
                "@alpachino",
                "Hello Friends!",
                "I Love this!",
                "@alpachino",
                "Hello Friends!",
                "I Love this!",
                "@alpachino",
                "Hello Friends!",
                "I Love this!",
                "@alpachino",
                "Hello Friends!",
                "I Love this!",
                "@alpachino",
                "Hello Friends!",
                "I Love this!"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,
                android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int IntPosition = position;
                String value = listView.getItemAtPosition(IntPosition).toString();

                Toast.makeText(getApplicationContext(), value, Toast.LENGTH_LONG).show();
            }
        });
    }
}

package com.example.belka.tpproject;

import android.app.ActionBar;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.util.Log;


/**
 * Created by belka on 11.10.15.
 */
public class SecondActivity extends ListActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("CREATE", "create second activity");

        String[] myStr = new String[1000];
        for (int i = 0; i < 1000; ++i) {
           myStr[i] = PresentString.present(i + 1);
            Log.d("CREATE myStr = ", myStr[i]);
        }


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.list, R.id.label, myStr);
        setListAdapter(adapter);

    }
}

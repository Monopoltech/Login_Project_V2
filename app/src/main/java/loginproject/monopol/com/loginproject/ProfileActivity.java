package loginproject.monopol.com.loginproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ProfileActivity extends AppCompatActivity {


    ListView list;


    public void dec()
    {
        list = (ListView)findViewById(R.id.list_items);
    }


    public void getArray()
    {
        String [] veriler = {"Android","Java","C++","C#"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,veriler);

        list.setAdapter(adapter);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        dec();
        getArray();

    }

}

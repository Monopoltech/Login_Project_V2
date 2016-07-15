package loginproject.monopol.com.loginproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KayitActivity extends AppCompatActivity {

    public EditText password, username;

    public Button signIt;


    public void signIt()
    {
        password = (EditText)findViewById(R.id.password);
        username = (EditText)findViewById(R.id.userName);

        signIt = (Button)findViewById(R.id.signIt);
    }



    public void selectGirisAct()
    {
        Intent intent = getIntent();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit);

    }

}

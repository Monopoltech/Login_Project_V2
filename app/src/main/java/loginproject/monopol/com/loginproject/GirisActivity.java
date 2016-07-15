package loginproject.monopol.com.loginproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class GirisActivity extends AppCompatActivity {

    public EditText userName, password;

    public Button logIn, signIn;



    public void declareVar()
    {
        userName = (EditText)findViewById(R.id.userName);
        password = (EditText)findViewById(R.id.password);

        logIn = (Button)findViewById(R.id.logIn);
        signIn = (Button)findViewById(R.id.singIn);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);

        declareVar();
        signIn();
        logIn();

    }

    public void logIn()
    {
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GirisActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }


    public void signIn()
    {
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(GirisActivity.this,KayitActivity.class);

                String user = userName.getText().toString();
                String pass = password.getText().toString();
                intent.putExtra("username",user);
                intent.putExtra("password",pass);

                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_giris, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

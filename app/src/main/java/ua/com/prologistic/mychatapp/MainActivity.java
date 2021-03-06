package ua.com.prologistic.mychatapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button loginButton;
    private Button createAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createAccountButton = (Button) findViewById(R.id.createButtonId);
        loginButton = (Button) findViewById(R.id.loginButton);

        createAccountButton.setOnClickListener(this);
        loginButton.setOnClickListener(this);

        /*ParseUser user = new ParseUser();
        user.setUsername("andrew");
        user.setPassword("gulak");
        user.setEmail("eml@mple.com");

        user.put("phone", "6522123-2000");
        user.put("catname", "cat");


        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if (e != null){
                    Toast.makeText(getApplicationContext(), "Yeahh!", Toast.LENGTH_LONG).show();
                } else {

                }
            }
        });*/
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.loginButton: {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                break;
            }
            case R.id.createButtonId: {
                startActivity(new Intent(MainActivity.this, CreateAccount.class));
            }
        }
    }
}

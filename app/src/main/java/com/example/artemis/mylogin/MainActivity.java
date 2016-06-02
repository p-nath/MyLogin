package com.example.artemis.mylogin;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et_username;
    private EditText et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylogin);
        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);
    }

    //Login func which take parameter of type view
    public void LogIn(View view) {
        // convert EditText.getText gives me Editable i.e mutable char seq
        // .toSting() gives me immutable char seq i.e. string
        String username = et_username.getText().toString();
        String password = et_password.getText().toString();

        if (username.equals("priyanka") && password.equals("12345")) {
            //create dialog box
            AlertDialog.Builder b = new AlertDialog.Builder(this);
            //this is context, since i have 1 activity it doesn't matter much
            b.setTitle("User authentication");
            b.setMessage("Welcome Priyanka!");
            b.show();
        }
        else {
            //cool feature since every func returns this pointer :)
            new AlertDialog.Builder(this)
                    .setTitle("User authentication")
                    .setMessage("Invalid username or password")
                    .show();
        }
        Toast.makeText(MainActivity.this, "Logging In", Toast.LENGTH_SHORT).show();
    }
    public void Reset(View view) {
        et_password.setText("");
        et_username.setText("");
        Toast.makeText(this, "Reset", Toast.LENGTH_SHORT).show();
    }
}


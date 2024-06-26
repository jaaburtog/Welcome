package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    Button button;

    Button closeButton;
    AlertDialog.Builder builder;

    // Proof

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Displaying Toast with Hello Javatpoint message
        Toast.makeText(getApplicationContext(),"Hello Javatpoint, PROOF",Toast.LENGTH_SHORT).show();

        button=(Button)findViewById(R.id.button2);

        closeButton = findViewById(R.id.button3);
        builder = new AlertDialog.Builder(this);
        closeButton.setOnClickListener(v -> {

            //Uncomment the below code to Set the message and title from the strings.xml file
            builder.setMessage(R.string.dialog_message) .setTitle(R.string.dialog_title);

            //Setting message manually and performing action on button click
            builder.setMessage("Do you want to close this application ?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            finish();
                            Toast.makeText(getApplicationContext(),"you choose yes action for alertbox",
                                    Toast.LENGTH_SHORT).show();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            //  Action for 'NO' Button
                            dialog.cancel();
                            Toast.makeText(getApplicationContext(),"you choose no action for alertbox",
                                    Toast.LENGTH_SHORT).show();
                        }
                    });
            //Creating dialog box
            AlertDialog alert = builder.create();
            //Setting the title manually
            alert.setTitle("AlertDialogExample");
            alert.show();
        });


    }

    public void onClick(View v) {
        Intent intent = new Intent(SecondActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
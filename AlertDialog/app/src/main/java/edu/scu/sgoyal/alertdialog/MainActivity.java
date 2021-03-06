package edu.scu.sgoyal.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, 123);

                builder.setIcon(R.mipmap.ic_launcher)
                        .setTitle("New Message")
                        .setMessage("Do you like to continue?")
                        .setNeutralButton("Not Sure!", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Neutral button clicked!", Toast.LENGTH_SHORT).show();

                            }
                        })
                        .setNegativeButton("No, I don't!", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Negative button clicked!", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("Yes, I do!", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Positive button clicked!", Toast.LENGTH_SHORT).show();

                            }
                        })

                        .setCancelable(true);
                builder.create().show();
            }
        });
    }
}

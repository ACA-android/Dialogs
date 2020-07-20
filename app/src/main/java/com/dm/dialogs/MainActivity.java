package com.dm.dialogs;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.AudioTrack;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private DialogInterface.OnClickListener dialogClickListener =
            new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    if(which == DialogInterface.BUTTON_POSITIVE) {
                        Toast.makeText(MainActivity.this, "YES!", Toast.LENGTH_SHORT).show();
                    } else if(which == DialogInterface.BUTTON_NEGATIVE){
                        dialog.dismiss();
                    }
                }
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.openDialogBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog = new AlertDialog.Builder(v.getContext())
                        .setTitle("hello")
                        .setMessage("I am a dialog")
                        .setCancelable(false)
                        .setPositiveButton("okay", dialogClickListener)
                        .setNegativeButton("cancel", dialogClickListener)
                        .create();
                dialog.show();
            }
        });

        Movie movie = new Movie.Builder("Avatar")
                .setDirector("Steven Spielberg")
                .setYear(2008)
                .setScore(8)
                .create();

        movie.setCriticScore(7);
    }
}
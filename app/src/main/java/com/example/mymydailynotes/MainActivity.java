package com.example.mymydailynotes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mymydailynotes.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNote;
    private Button buttonAddNote;
    private TextView textViewNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNote = findViewById(R.id.editTextNote);
        buttonAddNote = findViewById(R.id.buttonAddNote);
        textViewNotes = findViewById(R.id.textViewNotes);

        buttonAddNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNote();
            }
        });
    }

    private void addNote() {
        String note = editTextNote.getText().toString().trim();
        if (!note.isEmpty()) {
            String currentTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault()).format(new Date());
            String noteWithTimestamp = note + "\n" + currentTime + "\n\n";
            textViewNotes.append(noteWithTimestamp);
            editTextNote.setText(""); // Clear the input field
        }
    }
}
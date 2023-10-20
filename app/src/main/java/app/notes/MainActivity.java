package app.notes;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Note> notes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.idRVCourse);
        NotesAdapter adapter = new NotesAdapter(this, notes);
        recyclerView.setAdapter(adapter);
/*
        recyclerView.setOnClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
               Note selectedItem = notes.get(position);

           }

        });*/
    }

    public void openTask(View view) {
        Intent intent = new Intent(this, TaskActivity.class);
        startActivity(intent);
    }

    public void openNewNote(View view) {
        Intent intent = new Intent(this, ActivityNewNote.class);
        startActivity(intent);
    }

    public void openNote(View view) {
        Intent intent = new Intent(this, ActivityNewNote.class);
        startActivity(intent);
    }

    private void setInitialData() {
        notes.add(new Note ("Подготовка макетов к реализации","Также как современная " +
            "методология разработки выявляет срочную потребность глубокомысленных рассуждений. С учётом сложившейся... ","10 минут назад"));
        notes.add(new Note ("Подготовка макетов к реализации","Также как современная " +
            "методология разработки выявляет срочную потребность глубокомысленных рассуждений. С учётом сложившейся... ","10 минут назад"));
        notes.add(new Note ("Подготовка макетов к реализации","Также как современная " +
            "методология разработки выявляет срочную потребность глубокомысленных рассуждений. С учётом сложившейся... ","10 минут назад"));
        notes.add(new Note ("Подготовка макетов к реализации","Также как современная " +
            "методология разработки выявляет срочную потребность глубокомысленных рассуждений. С учётом сложившейся... ","10 минут назад"));
        notes.add(new Note ("Подготовка макетов к реализации","Также как современная " +
            "методология разработки выявляет срочную потребность глубокомысленных рассуждений. С учётом сложившейся... ","10 минут назад"));
        notes.add(new Note ("Подготовка макетов к реализации","Также как современная " +
            "методология разработки выявляет срочную потребность глубокомысленных рассуждений. С учётом сложившейся... ","10 минут назад"));
        notes.add(new Note ("Подготовка макетов к реализации","Также как современная " +
            "методология разработки выявляет срочную потребность глубокомысленных рассуждений. С учётом сложившейся... ","10 минут назад"));
        notes.add(new Note ("Подготовка макетов к реализации","Также как современная " +
            "методология разработки выявляет срочную потребность глубокомысленных рассуждений. С учётом сложившейся... ","10 минут назад"));
        notes.add(new Note ("Подготовка макетов к реализации","Также как современная " +
            "методология разработки выявляет срочную потребность глубокомысленных рассуждений. С учётом сложившейся... ","10 минут назад"));
        notes.add(new Note ("Подготовка макетов к реализации","Также как современная " +
            "методология разработки выявляет срочную потребность глубокомысленных рассуждений. С учётом сложившейся... ","10 минут назад"));

    }
}
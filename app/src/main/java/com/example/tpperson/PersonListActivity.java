// PersonListActivity.java
package com.example.tpperson;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tpperson.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonListActivity extends AppCompatActivity {

    private ListView listView;
    private List<Person> personList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_list);

        listView = findViewById(R.id.person_list_view);

        // Initialize person list
        personList = new ArrayList<>();
        personList.add(new Person("Alice", "Software Developer"));
        personList.add(new Person("Bob", "Graphic Designer"));
        personList.add(new Person("Charlie", "Data Analyst"));

        // Create an ArrayAdapter for the ListView
        ArrayAdapter<Person> adapter = new ArrayAdapter<Person>(this,
                android.R.layout.simple_list_item_2,
                android.R.id.text1,
                personList) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = view.findViewById(android.R.id.text1);
                TextView text2 = view.findViewById(android.R.id.text2);
                Person person = (Person) getItem(position);
                text1.setText(person.getName());
                text2.setText(person.getOccupation());
                return view;
            }
        };

        listView.setAdapter(adapter);
    }
}

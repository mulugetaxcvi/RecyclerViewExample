package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contatcsRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contatcsRecView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("name1", "email1@gmail.com", "https://cdn.icon-icons.com/icons2/643/PNG/512/android-robot-figure-avatar-brand_icon-icons.com_59276.png"));
        contacts.add(new Contact("name2", "email2@gmail.com", "https://cdn.icon-icons.com/icons2/643/PNG/512/android-robot-figure-avatar-brand_icon-icons.com_59276.png"));
        contacts.add(new Contact("name3", "email3@gmail.com", "https://cdn.icon-icons.com/icons2/643/PNG/512/android-robot-figure-avatar-brand_icon-icons.com_59276.png"));
        contacts.add(new Contact("name4", "email4@gmail.com", "https://cdn.icon-icons.com/icons2/643/PNG/512/android-robot-figure-avatar-brand_icon-icons.com_59276.png"));
        contacts.add(new Contact("name5", "email5@gmail.com", "https://cdn.icon-icons.com/icons2/643/PNG/512/android-robot-figure-avatar-brand_icon-icons.com_59276.png"));
        contacts.add(new Contact("name6", "email6@gmail.com", "https://cdn.icon-icons.com/icons2/643/PNG/512/android-robot-figure-avatar-brand_icon-icons.com_59276.png"));
        contacts.add(new Contact("name7", "email7@gmail.com", "https://cdn.icon-icons.com/icons2/643/PNG/512/android-robot-figure-avatar-brand_icon-icons.com_59276.png"));
        contacts.add(new Contact("name8", "email8@gmail.com", "https://cdn.icon-icons.com/icons2/643/PNG/512/android-robot-figure-avatar-brand_icon-icons.com_59276.png"));
        contacts.add(new Contact("name9", "email9@gmail.com", "https://cdn.icon-icons.com/icons2/643/PNG/512/android-robot-figure-avatar-brand_icon-icons.com_59276.png"));
        contacts.add(new Contact("name10", "emai101@gmail.com", "https://cdn.icon-icons.com/icons2/643/PNG/512/android-robot-figure-avatar-brand_icon-icons.com_59276.png"));
        contacts.add(new Contact("name11", "email11@gmail.com", "https://cdn.icon-icons.com/icons2/643/PNG/512/android-robot-figure-avatar-brand_icon-icons.com_59276.png"));
        contacts.add(new Contact("name12", "email12@gmail.com", "https://cdn.icon-icons.com/icons2/643/PNG/512/android-robot-figure-avatar-brand_icon-icons.com_59276.png"));
        contacts.add(new Contact("name13", "email13@gmail.com", "https://cdn.icon-icons.com/icons2/643/PNG/512/android-robot-figure-avatar-brand_icon-icons.com_59276.png"));
        contacts.add(new Contact("name14", "email14@gmail.com", "https://cdn.icon-icons.com/icons2/643/PNG/512/android-robot-figure-avatar-brand_icon-icons.com_59276.png"));


        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        contatcsRecView.setAdapter(adapter);
        contatcsRecView.setLayoutManager(new LinearLayoutManager(this));
}}
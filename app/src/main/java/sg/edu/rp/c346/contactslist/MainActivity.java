package sg.edu.rp.c346.contactslist;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContacts;
    TextView tvcontacts;

    ArrayList<Contacts> alcontacts;
    CustomAdapter caContacts;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContacts = findViewById(R.id.listViewContacts);
        alcontacts = new ArrayList<>();



        Contacts EI1 = new Contacts("Mary",+65,65442334);
        Contacts EI2 = new Contacts("Ken",+65,97442437);


       alcontacts.add(EI1);
       alcontacts.add(EI2);


          caContacts = new CustomAdapter(this, R.layout.contacts_item,alcontacts);
       lvContacts.setAdapter(caContacts);



    }
}

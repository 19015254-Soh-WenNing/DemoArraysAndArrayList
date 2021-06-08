package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayListActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);

        tv = findViewById(R.id.textView2);

        //continue view the code in the worksheet

        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        //Question 2a
        String text = "Fruits\n====\n";
        for (int i = 0; i < fruits.size(); i++)
        {
            text += fruits.get(i) + "\n";
        }
        tv.setText(text);

        //Question 2b
        fruits.add("durian");

        //Question 2c
        String theFruit = fruits.get(1);

        //Question 2d
        fruits.remove(0);

        //Question 2e
        fruits.set(fruits.size()-1, "dragonfruit");
    }
}
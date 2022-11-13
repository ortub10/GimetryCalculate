package com.example.gimetrycalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.MessageFormat;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final HashMap<Character,Integer> gimetryHashMap = new HashMap<>();
        gimetryHashMap.put('א',1);
        gimetryHashMap.put('ב',2);
        gimetryHashMap.put('ג',3);
        gimetryHashMap.put('ד',4);
        gimetryHashMap.put('ה',5);
        gimetryHashMap.put('ו',6);
        gimetryHashMap.put('ז',7);
        gimetryHashMap.put('ח',8);
        gimetryHashMap.put('ט',9);
        gimetryHashMap.put('י',10);
        gimetryHashMap.put('כ',20);
        gimetryHashMap.put('ל',30);
        gimetryHashMap.put('מ',40);
        gimetryHashMap.put('נ',50);
        gimetryHashMap.put('ס',60);
        gimetryHashMap.put('ע',70);
        gimetryHashMap.put('פ',80);
        gimetryHashMap.put('צ',90);
        gimetryHashMap.put('ק',100);
        gimetryHashMap.put('ר',200);
        gimetryHashMap.put('ש',300);
        gimetryHashMap.put('ת',400);
        gimetryHashMap.put('ך',200);
        gimetryHashMap.put('ם',40);
        gimetryHashMap.put('ן',50);
        gimetryHashMap.put('ף',80);
        gimetryHashMap.put('ץ',90);
        gimetryHashMap.put(' ',0);
        final EditText sentence = findViewById(R.id.sentence);
        final TextView resultTv = findViewById(R.id.result);
        Button calculateBTn = findViewById(R.id.calculate);

        calculateBTn.setOnClickListener(v -> {
            String sentenceStr = sentence.getText().toString();
            int sum = 0;
            for (int i = 0; i<sentenceStr.length();i++){
                if (gimetryHashMap.get(sentenceStr.charAt(i))==null){
                    resultTv.setText("אנא הכנס רק אותיות ורווחים בלבד");
                    return;
                }
                int temp = gimetryHashMap.get(sentenceStr.charAt(i));
                sum+=temp;

            }
            resultTv.setText(MessageFormat.format("{0}", sum));
        });
    }
}

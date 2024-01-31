package com.example.project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class calories extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.need);

        EditText ageb = findViewById(R.id.ageb);
        EditText weightb = findViewById(R.id.weightb);
        EditText heightb = findViewById(R.id.heightb);
        TextView result = findViewById(R.id.result);
        Button calc = findViewById(R.id.calc);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int age = Integer.parseInt(ageb.getText().toString());
                double height = Integer.parseInt(heightb.getText().toString());
                double weight = Integer.parseInt(weightb.getText().toString());

                double bmr = 655 + (9.6*weight)+(1.8*height)-(4.7*age);
                result.setText("Your daily calorie need is approximately: " + bmr + " calories");
            }
        });
    }
    public void caldiv(View view){
        TextView t =(TextView) findViewById(R.id.after);
        t.setText("Macronutrient proportions:\n" +

                "* 50-55% carbohydrates: Choose whole grains, fruits, and vegetables for slow-release energy.\n" +
                "* 15% protein: Include lean protein sources like fish, beans, and poultry for muscle building and satiety.\n" +
                "* 30-35% fats: Focus on healthy fats from sources like nuts, seeds, and avocados for satiety and nutrient absorption.\n" +

                "Meal distribution:\n" +

                "* Breakfast: 15-25% of daily calories: A well-rounded breakfast helps prevent overeating later in the day and boosts metabolism.\n" +
                "* Lunch: 25-35% of daily calories: A balanced lunch provides sustained energy for the afternoon.\n" +
                "* Dinner: 25-35% of daily calories: Enjoy a satisfying dinner, but avoid eating too close to bedtime.\n" +
                "* Snacks: 10-15% of daily calories: Choose healthy snacks between meals to manage hunger and prevent overeating."
                );

    }
}
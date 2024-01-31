package com.example.project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class random extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.random);


        Button generatebutton = findViewById(R.id.generate_button);
        TextView randomtextview = findViewById(R.id.random_text_view);

        generatebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] randomTextArray = {"always put your health first,even before your looks!",
                        "Practice Gratitude: Start your day by appreciating the good things in your life, big or small. A grateful heart leads to a happier and more positive outlook",
                        "Stay Hydrated:Drinking plenty of water keeps your skin glowing and your body functioning optimally.",
                        "Find Your Signature Style:Experiment with different clothes and accessories to discover what makes you feel confident and beautiful",
                        "Get Enough Rest for Your Eyes: Eye strain can lead to dark circles and puffiness. Get enough sleep, take breaks from screens, and try using eye drops to keep your eyes refreshed."
                ,"Confidence is Key:The most important glow-up tip is to wear your confidence like a second skin. Hold your head high, smile often, and believe in yourself."
                        ,"Develop Good Posture:Good posture makes you look taller, slimmer, and more confident. Stand tall, shoulders back, and chin up."
                        ,"Take Care of Your Hands:Your hands are often seen, so keep them soft and moisturized. Don't forget to apply sunscreen to your hands as well."
                        ,"Get Regular Checkups:Taking care of your health is essential for overall well-being and outer glow. See your doctor for regular checkups and screenings."
                        ,"Volunteer:Helping others is a great way to boost your mood and make a difference in the world."
                        ,"Learn Something New: Challenge your mind and keep it active by learning a new skill or hobby."
                        ,"Practice Mindfulness:Mindfulness exercises like meditation or deep breathing can help you manage stress, improve focus, and cultivate inner peace."
                        ,"Learn to Say No:Don't overload yourself. Setting boundaries and saying no to things that don't serve you is crucial for managing your time and energy."
                        ,"Embrace Your Body:Learn to appreciate your body for what it is, and avoid comparing yourself to others. Focus on healthy habits and celebrate your unique beauty."
                        ,"Experiment with Makeup:If you enjoy makeup, play around with different colors and techniques to discover what flatters your features. Remember, it's not about covering up, but enhancing your natural beauty."
                        ,"Remember, glowing up is a journey, not a destination. Be patient with yourself, celebrate your progress, and focus on enjoying the process!"
                };
                int randomIndex = (int) (Math.random() * randomTextArray.length);
                String randomText = randomTextArray[randomIndex];
                randomtextview.setText(randomText);
            }
        });
    }}

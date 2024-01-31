package com.example.project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity_info extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

    }

    public void iu(View view) {
        setContentView(R.layout.undertones);
    }

    public void ui(View view) {
        setContentView(R.layout.info);
    }

    public void ih(View view) {
        setContentView(R.layout.hair);
    }

    public void hi(View view) {
        setContentView(R.layout.info);
    }

    public void is(View view) {
        setContentView(R.layout.skin);
    }

    public void si(View view) {
        setContentView(R.layout.info);
    }

    public void in(View view) {
       Intent i = new Intent(this,calories.class);
       startActivity(i);
    }

    public void ni(View view) {
        setContentView(R.layout.info);
    }

    public void ir(View view) {
        Intent i = new Intent(this,com.example.project.random.class);
        startActivity(i);

    }

    public void ri(View view) {
        setContentView(R.layout.info);
    }

    public void im(View view) {
        setContentView(R.layout.activity_main);
    }

    public void ia(View view) {
        setContentView(R.layout.aboutus);
    }

    public void ai(View view) {
        setContentView(R.layout.info);
    }

    public void call(View view) {
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+966532075432"));
        startActivity(i);
    }
public void undertone(View view){
    TextView t =(TextView) findViewById(R.id.whatisundertone);
    t.setText("Your skin undertone is the subtle hue beneath your surface skin color." +
            " It's like a hidden layer that influences how colors look on you, from makeup to clothing. " +
            "Unlike your skin tone, which can change with sun exposure or tanning," +
            " your undertone typically stays the same throughout your life.");

}
    public void undertone2(View view){
        TextView t =(TextView) findViewById(R.id.under22);
        t.setText(" • It is the key to finding the right foundation.\n" +
                " • It can make the deffrence between your complexion looking pale and washed out or refreshed and rejuvenated.\n" +
                " • Helps you make Retter decisions about your clothing and makeup.\n" +
                " • Helps you choosing the best color palettes for your hue.");

    }
    public void undertone3(View view){
        TextView t =(TextView) findViewById(R.id.under33);
        t.setText(" • Take a look at your veins on the inside of your wrist Do they appear more blue or green?\n" +
                " • if they appear more blue (you are cool-tone) , if they appear more green (you are warm-tone).\n" +
                " • if you see a fair amount of Both, you have neutral undertone.");

    }

    public void hair1(View V){
        TextView t = (TextView) findViewById(R.id.h1);
        t.setText("It is a measurement of the hairs ability to absorb and hold moisture." +
                " It’s largely determined by genetics but can also be altered by external factors such as heat and chemical processing.\n");

    }
    public void hair2(View V){
        TextView t = (TextView) findViewById(R.id.h2);
        t.setText("It is important because it pertains to your hair’s ability to accept and retain moisture, which you need to know in order to start retaining length. \n" +
                "It can also help you figure out the right products (hair care routine)\n" +
                "to use on yourself.");

    }
    public void hair3(View V){
        TextView t = (TextView) findViewById(R.id.h3);
        t.setText("There are three types of hair porosity, low, medium,high porosity." +
                " And you can know what is yours by doing the float test");

    }
    public void goinfo(View v){
        setContentView(R.layout.hairinfo);
    }
    public void hii(View v){
        setContentView(R.layout.hair);
    }
    public void hair1info(View V){
        TextView t = (TextView) findViewById(R.id.h1info);
        t.setText("• Characteristics: Dense, shiny, resistant to styling, prone to build-up and protein overload.\n" +
                " • Focus: Gentle cleansing, lightweight products, protein balance.\n" +
                " • Tips:\n" +
                " ◦ Use clarifying shampoos periodically to remove build-up.\n" +
                " ◦ Opt for lightweight conditioners and leave-in products.\n" +
                " ◦ Apply protein sparingly, focusing on strengthening if needed.\n" +
                " ◦ Avoid heat styling tools or use heat protectant.");

    }
    public void hair2info(View V){
        TextView t = (TextView) findViewById(R.id.h2info);
        t.setText("• Characteristics: Balanced absorption and retention of moisture, holds styles well.\n" +
                " • Focus: Maintaining moisture balance, preventing damage.\n" +
                " • Tips:\n" +
                " ◦ Use gentle, moisturizing shampoos and conditioners.\n" +
                " ◦ Deep condition regularly to replenish moisture.\n" +
                " ◦ Use heat styling tools moderately with heat protectant.\n" +
                " ◦ Apply protein occasionally for strength and elasticity.");

    }
    public void hair3info(View V){
        TextView t = (TextView) findViewById(R.id.h3info);
        t.setText(" • Characteristics: Dry, frizzy, absorbs moisture quickly but loses it easily, prone to breakage.\n" +
                " • Focus: Intense hydration, sealing moisture, preventing breakage.\n" +
                " • Tips:\n" +
                " ◦ Use rich, moisturizing shampoos and conditioners.\n" +
                " ◦ Deep condition weekly for intense hydration.\n" +
                " ◦ Apply leave-in conditioners and oils to seal moisture.\n" +
                " ◦ Use gentle detangling methods and products.\n" +
                " ◦ Minimize heat styling and use heat protectant.\n" +
                " ◦ Apply protein regularly to rebuild the cuticle.");

    }
    public void skin1(View V){
        TextView t = (TextView) findViewById(R.id.s1);
        t.setText("he term (skin type) refers to the naturally occurring characteristics of your skin, such as oil production, " +
                "sensitivity, and moisture levels. These characteristics determine how your skin looks, feels, and reacts to various factors like weather, products, and environmental pollutants.");

    }
    public void skin2(View V){
        TextView t = (TextView) findViewById(R.id.s2);
        t.setText("nowing your skin type is key to building a customized skincare routine that effectively addresses its unique needs." +
                " Think of it like choosing the right tools for the job - the wrong products can worsen oiliness, dryness, etc." +
                " Embrace your skin's individuality and unlock its healthy glow!");

    }
    public void skin3(View V){
        TextView t = (TextView) findViewById(R.id.s3);
        t.setText("these are just starting points. Your skin might be a mix of types or fluctuate seasonally\n" +
                "-Blotting Paper Test:\n" +
                " • Pat blotting paper on your T-zone and observe.\n" +
                " • Little oil: Dry skin\n" +
                " • Oil absorbed but not saturated: Normal/Combination\n" +
                " • Paper saturated: Oily skin\n" +
                "-Bare-Faced Method:\n" +
                " • Wash your face with a gentle cleanser and wait 30 minutes.\n" +
                " • Shiny all over: Oily\n" +
                " • Tight and flaky: Dry\n" +
                " • Hydrated but not oily: Normal\n" +
                " • Shiny T-zone, dry cheeks: Combination");

    }

    public void normal (View V) {
        TextView t = (TextView) findViewById(R.id.normal1);
        t.setText(" • Characteristics: Balanced oil production, fine pores, smooth texture," +
                " generally healthy appearance.\n" +
                " • Needs: Gentle cleansing, lightweight moisturization, regular exfoliation," +
                " and SPF protection.");
    }
    public void dry (View V) {
        TextView t = (TextView) findViewById(R.id.dry1);
        t.setText("Characteristics: Lacks sufficient oil, prone to tightness, flakiness," +
                " fine lines, and wrinkles.\n" +
                " • Needs: Hydrating cleansers and moisturizers, facial oils, gentle exfoliation, " +
                "and SPF protection.");
    }
    public void oil(View V) {
        TextView t = (TextView) findViewById(R.id.oil1);
        t.setText(" Characteristics: Produces excess sebum, leading to a greasy shine," +
                " enlarged pores, and breakouts.\n" +
                " • Needs: Oil-free cleansers and moisturizers, mattifying products, " +
                "regular exfoliation, and SPF protection.");
    }
    public void comb(View V) {
        TextView t = (TextView) findViewById(R.id.comb1);
        t.setText(" • Characteristics: Has both oily and dry areas, typically the T-zone (forehead, nose, and chin) " +
                "being oily and the cheeks being dry.\n" +
                " • Needs: Tailored routines for each zone, oil-free products for the T-zone," +
                " and hydrating products for the cheeks.");
    }
    public void sens(View V) {
        TextView t = (TextView) findViewById(R.id.sens1);
        t.setText(" • Characteristics: Easily reacts to products, ingredients, and environmental factors" +
                " with redness, irritation, and stinging.\n" +
                " • Needs: Fragrance-free, hypoallergenic products, gentle cleansing," +
                " minimal exfoliation, and SPF protection.");
    }

    public void goinfoskin (View v){
        setContentView(R.layout.skininfo);
    }
    public void sii (View v){
        setContentView(R.layout.skin);
    }
    private class random {
    }
}
















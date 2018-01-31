package camp.bso.inf.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    int scorepersib =0;
    int scorepersija =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnpersija,btnpersib,btnberita;


        btnberita = findViewById(R.id.berita);
        btnpersija = findViewById(R.id.btn_detailspersija);
        btnpersib = findViewById(R.id.btn_detailspersib);

        btnpersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsPersib.class);
                startActivity(i);

            }
        });
        btnpersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsPersija.class);
                startActivity(i);

            }
        });
        btnberita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                String urllink = "https://www.facebook.com";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }
        });





    }
    //SCOREPERSIB
    public void minpersib(View view){
        if (scorepersib>0){
            scorepersib = scorepersib-1;
        }else{
            Toast.makeText(this, "Score tidak bisa min", Toast.LENGTH_SHORT).show();

        }

        displaypersib (scorepersib);
    }
    public void pluspersib(View view){
        scorepersib = scorepersib+1;
        displaypersib (scorepersib);
    }
    //SCOREPERSIJA
    public void minpersija(View view){
        if (scorepersija>0){
            scorepersija = scorepersija-1;
        }else{
            Toast.makeText(this, "Score tidak bisa min", Toast.LENGTH_SHORT).show();
        }

        displaypersija (scorepersija);
    }
    public void pluspersija(View view){
        scorepersija = scorepersija+1;
        displaypersija (scorepersija);
    }

    private void displaypersib(int scorepersib){
        TextView ScorePersib = (TextView) findViewById(R.id.nilaipersib);
        ScorePersib.setText(""+scorepersib);
    }
    private void displaypersija(int scorepersija){
        TextView ScorePersija = (TextView) findViewById(R.id.nilaipersija);
        ScorePersija.setText(""+scorepersija);
    }
    public void reset (View view){
        scorepersib = 0;
        scorepersija = 0;
        displaypersib(scorepersib);
        displaypersija(scorepersija);
    }


}

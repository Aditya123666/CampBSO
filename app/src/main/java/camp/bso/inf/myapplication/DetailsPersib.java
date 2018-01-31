package camp.bso.inf.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.bloder.magic.view.MagicButton;

public class DetailsPersib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_persib);

        Button kembali,map,btnsumber;
        MagicButton btnfacebook,btntwitter,btninstagram;


        btnfacebook = findViewById(R.id.magic_button_facebook);
        btntwitter = findViewById(R.id.magic_button_twitter);
        btninstagram = findViewById(R.id.magic_button_instagram);


        btnsumber=findViewById(R.id.sumber);
        kembali=findViewById(R.id.back);
        map = findViewById(R.id.maps);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:-6.957350,107.712083");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) !=null){
                    startActivity(mapIntent);
                }
            }
        });
        btnsumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                String urllink = "https://id.wikipedia.org/wiki/Persib_Bandung";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }
        });

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailsPersib.this,MainActivity.class);
                startActivity(i);
            }
        });
        //BUTTON SOSMED
        btnfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                String urllink = "https://id.wikipedia.org/wiki/Persib_Bandung";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }
        });
        btntwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                String urllink = "https://id.wikipedia.org/wiki/Persib_Bandung";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }
        });
        btninstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                String urllink = "https://id.wikipedia.org/wiki/Persib_Bandung";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }
        });

        //TUTUP BUTTON SOSMED
    }
}

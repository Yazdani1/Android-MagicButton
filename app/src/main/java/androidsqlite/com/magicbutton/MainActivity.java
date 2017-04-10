package androidsqlite.com.magicbutton;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.com.bloder.magic.view.MagicButton;

public class MainActivity extends AppCompatActivity {


        MagicButton m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m=(MagicButton)findViewById(R.id.first);
        m.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://facebook.com")));
                Toast.makeText(getApplicationContext(),"Kaj kore",Toast.LENGTH_SHORT).show();
            }
        });

    }
}

package whitedirewolves.basic_03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Act_a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_aa);


        Button but_1 = (Button) findViewById(R.id.id_but_1);
        Button but_2 = (Button) findViewById(R.id.id_but_2);
        Button but_3 = (Button) findViewById(R.id.id_but_3);

        final Act_a m = this;


        but_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(m,Act_1.class);
                startActivity(intent);
            }
        });

        but_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(m,Act_2.class);
                startActivity(intent);
            }
        });
        but_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(m,Act_3.class);
                startActivity(intent);
            }
        });


    }

}

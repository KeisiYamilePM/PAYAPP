package whitedirewolves.basic_03;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.Scanner;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton but_1= (ImageButton) findViewById(R.id.id_check);

        final MainActivity m = this;


        but_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(m,Act_a.class);
                startActivity(intent);
            }
        });


        Button but_2= (Button) findViewById(R.id.id_but_2);

        final TextView text= (TextView) findViewById(R.id.id_text);
        final EditText editText= (EditText) findViewById(R.id.id_edText);


        but_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PrintStream output = null;
                try {
                    output = new PrintStream(openFileOutput("out.txt", MODE_PRIVATE));

                    output.println(editText.getText().toString());
                    output.println("Estas Listo?");
                    output.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                Scanner scan = null;
                try {
                    scan = new Scanner(openFileInput("out.txt"));
                    String allText = "";
                    while (scan.hasNextLine()) {
                        String line = scan.nextLine();
                        allText += line + '\n';
                    }
                    text.setText(allText);
                    scan.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });



    }
}

package whitedirewolves.basic_03;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Act_2 extends AppCompatActivity {

    private double numa, numb;
    private EditText op_a, op_b;
    private TextView resultado;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_2);

        this.op_a = (EditText) findViewById(R.id.id_a);
        this.op_b = (EditText) findViewById(R.id.id_b);
        this.resultado = (TextView) findViewById(R.id.id_viewResult);
    }

    public void cSumar(View view) {
        if(this.op_a.getText().toString().length() > 0 && this.op_b.getText().toString().length() > 0) {
            this.numa = Double.parseDouble(this.op_a.getText().toString());
            this.numb = Double.parseDouble(this.op_b.getText().toString());
            this.resultado.setText(Double.toString((this.numa + this.numb)));
        }
    }

    public void cRestar(View view) {
        if(this.op_a.getText().toString().length() > 0 && this.op_b.getText().toString().length() > 0) {
            this.numa = Double.parseDouble(this.op_a.getText().toString());
            this.numb = Double.parseDouble(this.op_b.getText().toString());
            this.resultado.setText(Double.toString((this.numa - this.numb)));
        }
    }

    public void cMultiplicar(View view) {
        if(this.op_a.getText().toString().length() > 0 && this.op_b.getText().toString().length() > 0) {
            this.numa = Double.parseDouble(this.op_a.getText().toString());
            this.numb = Double.parseDouble(this.op_b.getText().toString());
            this.resultado.setText(Double.toString((this.numa * this.numb)));
        }
    }

    public void cDividir(View view) {
        if(this.op_a.getText().toString().length() > 0 && this.op_b.getText().toString().length() > 0) {
            this.numa = Double.parseDouble(this.op_a.getText().toString());
            this.numb = Double.parseDouble(this.op_b.getText().toString());
            if(this.numb != 0) {
                this.resultado.setText(Double.toString((this.numa / this.numb)));

            }
            else {
                this.resultado.setText("Division entre O");
            }
        }
    }


}

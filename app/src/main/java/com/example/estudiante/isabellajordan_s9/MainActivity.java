package com.example.estudiante.isabellajordan_s9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button[] buttons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Arreglito de botones
        buttons= new Button[9];

        buttons[0].findViewById(R.id.btn_1);
        buttons[1].findViewById(R.id.btn_2);
        buttons[2].findViewById(R.id.btn_3);
        buttons[3].findViewById(R.id.btn_4);
        buttons[4].findViewById(R.id.btn_5);
        buttons[5].findViewById(R.id.btn_6);
        buttons[6].findViewById(R.id.btn_7);
        buttons[7].findViewById(R.id.btn_8);
        buttons[8].findViewById(R.id.btn_9);

        for(int i=0; i<buttons.length; i++){
            int pos=i;

            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //

                    //cliente.enviarMensaje(pos+"");
                }
            });

        }









    }
}

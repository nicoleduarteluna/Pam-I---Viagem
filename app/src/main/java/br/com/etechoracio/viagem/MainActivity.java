package br.com.etechoracio.viagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtTempoGasto;
    EditText txtVm;
    EditText txtRendimento;
    TextView lblDistancia2;
    TextView lblConsumo2;


    public void onCalcular(View v) {

        double tempoGasto = Double.parseDouble(txtTempoGasto.getText().toString());
        double vm = Double.parseDouble(txtVm.getText().toString());
        double rendimento = Double.parseDouble(txtRendimento.getText().toString());

        double distancia = vm * tempoGasto;

        double rendimentoFinal = distancia / rendimento;

        lblDistancia2.setText(String.valueOf(distancia));
        lblConsumo2.setText(String.valueOf(rendimentoFinal));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTempoGasto = findViewById(R.id.txtTempoGasto);
        txtVm = findViewById(R.id.txtVm);
        txtRendimento = findViewById(R.id.txtRendimento);
        lblConsumo2 = findViewById(R.id.lblConsumo2);
        lblDistancia2 = findViewById(R.id.lblDistancia2);
    }
}

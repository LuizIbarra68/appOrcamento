package com.ibarra.apporcamento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate( R.menu.menu_inicio, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if ( item.getItemId() == R.id.menu_sair ){
            finish();
        }
        if ( item.getItemId() == R.id.menu_limpar ){

        }
        return super.onOptionsItemSelected(item);
    }

//    private void limpar(){
//
//        etCliente.setText("");
//        etOrcamento.setText("");
//
//        cbCaminhada.setChecked(false);
//        cbCorrida.setChecked(false);
//        rbMasculino.setChecked(false);
//        rbFeminino.setChecked(false);
//
//        spinnerEstado.setSelection( 0 );
//    }




}

package pt.ipg.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void enviaMensagem(View view) {
        final Intent intent = new Intent(this, MostraMensagemActivity.class);
        //todo:enviar mensagem
        
        startActivity(intent);
    }
}

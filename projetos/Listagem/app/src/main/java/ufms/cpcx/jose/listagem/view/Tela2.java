package ufms.cpcx.jose.listagem.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import ufms.cpcx.jose.listagem.R;
import ufms.cpcx.jose.listagem.model.Lanche;

public class Tela2 extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.tvNome)
    TextView tvNome;

    @BindView(R.id.tvValor)
    TextView tvValor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        Lanche l =(Lanche) getIntent().getExtras().get("lanche");
        if(l!=null){
            tvNome.setText(l.getNome());
            tvValor.setText(String.format("%.2f",l.getValor()));
        }

    }

}

package ufms.cpcx.jose.listagem.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ufms.cpcx.jose.listagem.R;
import ufms.cpcx.jose.listagem.model.Lanche;

public class Tela2 extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar ;

    @BindView(R.id.tvNome)
    EditText tvNome;

    @BindView(R.id.tvValor)
    EditText tvValor;

    private boolean update= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Lanche l =(Lanche) getIntent().getSerializableExtra("lanche");

        update=false;

        if(l!= null){
            update=true;
            tvNome.setText(l.getNome());
            tvValor.setText(String.valueOf(l.getValor()));
        }
    }

    @OnClick(R.id.fabSave)
    public void btSave(View view){

        Lanche l = new Lanche();
        l.setNome(tvNome.getText().toString());

        l.setValor(Double.parseDouble(
                tvValor.getText().toString()));

        if(update){
            l.update();
        }else {
            l.save();
        }

        finish();
    }

}

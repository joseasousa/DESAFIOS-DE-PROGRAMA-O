package ufms.cpcx.jose.listagem.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
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

    @BindView(R.id.fabDel)
    FloatingActionButton fbDel;

    private boolean update= false;
    Lanche l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

         l =(Lanche) getIntent().getSerializableExtra("lanche");

        update=false;

        if(l!= null){
            update=true;
            fbDel.setVisibility(View.VISIBLE);
            tvNome.setText(l.getNome());
            tvValor.setText(String.valueOf(l.getValor()));
        }
    }

    @OnClick(R.id.fabSave)
    public void btSave(View view){

        if(update){
            l.setNome(tvNome.getText().toString());

            l.setValor(Double.parseDouble(
                    tvValor.getText().toString()));
            l.update();
        }else {
            l = new Lanche();
            l.setNome(tvNome.getText().toString());

            l.setValor(Double.parseDouble(
                    tvValor.getText().toString()));
            l.save();
        }

        finish();
    }

    @OnClick(R.id.fabDel)
    void Delete(View v){
        l.delete();
        finish();
    }

}

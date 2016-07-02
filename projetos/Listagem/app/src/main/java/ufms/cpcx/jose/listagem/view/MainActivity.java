package ufms.cpcx.jose.listagem.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;
import ufms.cpcx.jose.listagem.R;
import ufms.cpcx.jose.listagem.adapter.LancheAdapter;
import ufms.cpcx.jose.listagem.model.Lanche;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar ;

    @BindView(R.id.listLanches)
    ListView listView;

    List<Lanche> lanches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        lanches = getLanches();

        setSupportActionBar(toolbar);
        LancheAdapter adapter =
                new LancheAdapter(lanches , getBaseContext());

        listView.setAdapter(adapter);
    }

    private List<Lanche> getLanches(){
        List<Lanche> l = new ArrayList<Lanche>();
        for(int i =0; i<10;i++){
            Lanche lan = new Lanche();

            lan.setId(i);
            lan.setNome("X-Lanche"+i);
            lan.setValor(Math.random()*15+1);

            l.add(lan);
        }
        return  l ;
    }

    @OnItemClick(R.id.listLanches)
    public void lista(int i){
        Intent iteIntent = new Intent(getBaseContext(),Tela2.class);
        Bundle bundle = new Bundle();

        bundle.putSerializable("lanche",lanches.get(i));

        iteIntent.putExtras(bundle);

        startActivity(iteIntent);
    }

}

package ufms.cpcx.jose.listagem.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
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

        setSupportActionBar(toolbar);
    }

    @Override
    protected void onResume() {
        super.onResume();
        UpdateUi();
    }


    private void UpdateUi() {
        lanches = getLanches();

        LancheAdapter adapter =
                new LancheAdapter(lanches ,
                        getBaseContext());
        listView.setAdapter(adapter);
    }

    private List<Lanche> getLanches(){
        List<Lanche> l = SQLite.select()
                .from(Lanche.class).queryList();

        return  l ;
    }

    @OnItemClick(R.id.listLanches)
    public void onItem(int i){
        Intent intent = new Intent(getBaseContext(),Tela2.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("lanche",lanches.get(i));
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @OnClick(R.id.fab)
    public void addLanche(View v){
        Intent i = new Intent(getBaseContext(),
                Tela2.class);
        startActivity(i);
    }
}
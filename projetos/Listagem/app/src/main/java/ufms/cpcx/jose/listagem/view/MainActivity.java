package ufms.cpcx.jose.listagem.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import ufms.cpcx.jose.listagem.R;
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

        lanches = new ArrayList<Lanche>();

        setSupportActionBar(toolbar);
    }


}

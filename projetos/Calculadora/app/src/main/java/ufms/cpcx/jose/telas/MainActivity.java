package ufms.cpcx.jose.telas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar ;

    @BindView(R.id.edtCampo1)
    EditText campo1;

    @BindView(R.id.edtCampo2)
    EditText campo2;

    @BindView(R.id.tvResultado)
    TextView tvResul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        setSupportActionBar(toolbar);
    }

    @OnClick(R.id.btSoma)
    public void btSave(View v){
        int c1 = Integer.parseInt(campo1.getText().toString());
        int c2 = Integer.parseInt(campo2.getText().toString());

        tvResul.setText(String.valueOf(c1+c2));
    }


}

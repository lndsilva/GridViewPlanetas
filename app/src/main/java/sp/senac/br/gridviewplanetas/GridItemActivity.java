package sp.senac.br.gridviewplanetas;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class GridItemActivity extends AppCompatActivity {

    TextView gridData;
    ImageView imageView;


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item);

        gridData = findViewById(R.id.griddata);
        imageView = findViewById(R.id.imageView);

        Intent intent = getIntent();

        String receivedName = intent.getStringExtra("name");
        int receivedImage = intent.getIntExtra("image", 0);

        gridData.setText(receivedName);
        imageView.setImageResource(receivedImage);

        //criar o botão de voltar na barra do appBar Layout
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    //método utilizado para implementar o clique do botão voltar do appBar Layout
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }

    //método permite retorna a outra activity
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

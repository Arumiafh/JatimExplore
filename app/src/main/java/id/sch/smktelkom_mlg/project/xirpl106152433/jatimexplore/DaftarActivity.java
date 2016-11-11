package id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore.adapter.KotaAdapter;
import id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore.model.Kota;

public class DaftarActivity extends AppCompatActivity {

    ArrayList<Kota> mList = new ArrayList<>();
    KotaAdapter mAdapter;

    //deklarasi variabel recycleview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new KotaAdapter(mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }

    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.city);
        TypedArray a = resources.obtainTypedArray(R.array.city_picture);
        Drawable[] arGambar = new Drawable[a.length()];
        for (int i = 0; i < arGambar.length; i++) {
            arGambar[i] = a.getDrawable(i);
        }
        a.recycle();

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new Kota(arJudul[i], arGambar[i]));
        }
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}

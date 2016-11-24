package id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore.adapter.KotaAdapter;
import id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore.model.KotaData;

//import id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore.model.Kota;

public class DaftarActivity extends AppCompatActivity implements KotaAdapter.IKotaAdapter2 {

    public static final String ID = "id";
    public static final String KOTA = "kota";
    ArrayList<KotaData> mList = new ArrayList<>();
    KotaAdapter mAdapter;
    ArrayList<KotaData> mListAll = new ArrayList<>();
    boolean isFiltered;
    ArrayList<Integer> mListMapFilter = new ArrayList<>();
    String mQuery;
    //deklarasi variabel recycleview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView1);
        LinearLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new KotaAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }

    @Override
    public void doClick(int pos) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(KOTA, mList.get(pos));
        intent.putExtra(ID, 2);
        startActivity(intent);
    }

    private void fillData() {
        Resources resources = getResources();

        String[] arTitle = resources.getStringArray(R.array.title);

        TypedArray a = resources.obtainTypedArray(R.array.iconkota);
        String[] arIconKota = new String[a.length()];
        for (int i = 0; i < arIconKota.length; i++) {
            int id = a.getResourceId(i, 0);
            arIconKota[i] = ContentResolver.SCHEME_ANDROID_RESOURCE + "://"
                    + resources.getResourcePackageName(id) + "/"
                    + resources.getResourceTypeName(id) + "/"
                    + resources.getResourceEntryName(id);
        }
        a.recycle();

        TypedArray b = resources.obtainTypedArray(R.array.tab1logo);
        String[] arTab1Logo = new String[b.length()];
        for (int i = 0; i < arTab1Logo.length; i++) {
            int id = b.getResourceId(i, 0);
            arTab1Logo[i] = ContentResolver.SCHEME_ANDROID_RESOURCE + "://"
                    + resources.getResourcePackageName(id) + '/'
                    + resources.getResourceTypeName(id) + '/'
                    + resources.getResourceEntryName(id);
        }
        b.recycle();

        TypedArray c = resources.obtainTypedArray(R.array.tab2foto);
        String[] arTab2Foto = new String[c.length()];
        for (int i = 0; i < arTab2Foto.length; i++) {
            int id = b.getResourceId(i, 0);
            arTab2Foto[i] = ContentResolver.SCHEME_ANDROID_RESOURCE + "://"
                    + resources.getResourcePackageName(id) + "/"
                    + resources.getResourceTypeName(id) + "/"
                    + resources.getResourceEntryName(id);
        }
        c.recycle();

        String[] arTab2Title = resources.getStringArray(R.array.tab2title);

        String[] arTab2Des = resources.getStringArray(R.array.tab2des);

        String[] arTab3Title = resources.getStringArray(R.array.tab3title);

        String[] arTab3Des1 = resources.getStringArray(R.array.tab3des1);

        TypedArray d = resources.obtainTypedArray(R.array.tab3foto1);
        String[] arTab3Foto1 = new String[d.length()];
        for (int i = 0; i < arTab3Foto1.length; i++) {
            int id = d.getResourceId(i, 0);
            arTab3Foto1[i] = ContentResolver.SCHEME_ANDROID_RESOURCE + "://"
                    + resources.getResourcePackageName(id) + "/"
                    + resources.getResourceTypeName(id) + "/"
                    + resources.getResourceEntryName(id);
        }
        d.recycle();

        String[] arTab3Des2 = resources.getStringArray(R.array.tab3des2);

        TypedArray e = resources.obtainTypedArray(R.array.tab3foto2);
        String[] arTab3Foto2 = new String[e.length()];
        for (int i = 0; i < arTab3Foto2.length; i++) {
            int id = e.getResourceId(i, 0);
            arTab3Foto2[i] = ContentResolver.SCHEME_ANDROID_RESOURCE + "://"
                    + resources.getResourcePackageName(id) + "/"
                    + resources.getResourceTypeName(id) + "/"
                    + resources.getResourceEntryName(id);
        }
        e.recycle();

        String[] arTab3Des3 = resources.getStringArray(R.array.tab3des3);

        String[] arTab4Title = resources.getStringArray(R.array.tab4title);

        TypedArray f = resources.obtainTypedArray(R.array.tab4foto);
        String[] arTab4Foto = new String[f.length()];
        for (int i = 0; i < arTab4Foto.length; i++) {
            int id = f.getResourceId(i, 0);
            arTab4Foto[i] = ContentResolver.SCHEME_ANDROID_RESOURCE + "://"
                    + resources.getResourcePackageName(id) + "/"
                    + resources.getResourceTypeName(id) + "/"
                    + resources.getResourceEntryName(id);
        }
        f.recycle();

        String[] arTab4Des = resources.getStringArray(R.array.tab4des);

        TypedArray g = resources.obtainTypedArray(R.array.tab4foto1);
        String[] arTab4Foto1 = new String[g.length()];
        for (int i = 0; i < arTab4Foto1.length; i++) {
            int id = g.getResourceId(i, 0);
            arTab4Foto1[i] = ContentResolver.SCHEME_ANDROID_RESOURCE + "://"
                    + resources.getResourcePackageName(id) + "/"
                    + resources.getResourceTypeName(id) + "/"
                    + resources.getResourceEntryName(id);
        }
        g.recycle();

        String[] arTab4Des1 = resources.getStringArray(R.array.tab4des1);

        TypedArray h = resources.obtainTypedArray(R.array.tab4foto2);
        String[] arTab4Foto2 = new String[h.length()];
        for (int i = 0; i < arTab4Foto2.length; i++) {
            int id = h.getResourceId(i, 0);
            arTab4Foto2[i] = ContentResolver.SCHEME_ANDROID_RESOURCE + "://"
                    + resources.getResourcePackageName(id) + "/"
                    + resources.getResourceTypeName(id) + "/"
                    + resources.getResourceEntryName(id);
        }
        h.recycle();

        String[] arTab4Des2 = resources.getStringArray(R.array.tab4des2);

        TypedArray j = resources.obtainTypedArray(R.array.tab4foto3);
        String[] arTab4Foto3 = new String[j.length()];
        for (int i = 0; i < arTab4Foto3.length; i++) {
            int id = j.getResourceId(i, 0);
            arTab4Foto3[i] = ContentResolver.SCHEME_ANDROID_RESOURCE + "://"
                    + resources.getResourcePackageName(id) + "/"
                    + resources.getResourceTypeName(id) + "/"
                    + resources.getResourceEntryName(id);
        }
        j.recycle();

        String[] arTab4Des3 = resources.getStringArray(R.array.tab4des3);


        for (int i = 0; i < arTitle.length; i++) {
            mList.add(new KotaData(arIconKota[i], arTitle[i], arTab1Logo[i], arTab2Foto[i], arTab2Title[i],
                    arTab2Des[i], arTab3Title[i], arTab3Des1[i], arTab3Foto1[i], arTab3Des2[i], arTab3Foto2[i], arTab3Des3[i],
                    arTab4Title[i], arTab4Foto[i], arTab4Des[i], arTab4Foto1[i], arTab4Des1[i], arTab4Foto2[i], arTab4Des2[i], arTab4Foto3[i],
                    arTab4Des3[i]));
        }
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)
                MenuItemCompat.getActionView(searchItem);

        searchView.setOnQueryTextListener(
                new SearchView.OnQueryTextListener() {
                    @Override
                    public boolean onQueryTextSubmit(String query) {
                        return false;
                    }

                    @Override
                    public boolean onQueryTextChange(String newText) {
                        mQuery = newText.toLowerCase();
                        doFilter(mQuery);
                        return true;
                    }
                });
        return true;
    }

    private void doFilter(String query) {
        if (!isFiltered) {
            mListAll.clear();
            mListAll.addAll(mList);
            isFiltered = true;
        }

        mList.clear();
        if (query == null || query.isEmpty()) {
            mList.addAll(mListAll);
            isFiltered = false;
        } else {
            mListMapFilter.clear();
            for (int i = 0; i < mListAll.size(); i++) {
                KotaData kota = mListAll.get(i);
                if (kota.title.toLowerCase().contains(query)) {
                    mList.add(kota);
                    mListMapFilter.add(i);
                }
            }
        }
        mAdapter.notifyDataSetChanged();
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

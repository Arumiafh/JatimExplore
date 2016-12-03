package id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

import java.util.ArrayList;
import java.util.HashMap;

import id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore.adapter.KotaHomeAdapter;
import id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore.model.KotaData;

public class MainActivity extends AppCompatActivity implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener, KotaHomeAdapter.IKotaAdapter {
    public static final String ID = "id";
    public static final String KOTA = "kota";
    ArrayList<KotaData> mList = new ArrayList<>();
    KotaHomeAdapter mAdapter;
    private SliderLayout mDemoSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        mDemoSlider = (SliderLayout) findViewById(R.id.slider);

//        FancyButton showallbutton = new FancyButton(this);
//        showallbutton.setText("Show All");
//        showallbutton.setBackgroundColor(Color.parseColor("#3b5998"));
//        showallbutton.setFocusBackgroundColor(Color.parseColor("#5474b8"));
//        showallbutton.setTextSize(17);
//        showallbutton.setRadius(5);
//        showallbutton.setIconResource("\uf082");
//        showallbutton.setIconPosition(FancyButton.POSITION_LEFT);
//        showallbutton.setFontIconSize(30);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new KotaHomeAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();


        HashMap<String, Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("Surabaya", R.drawable.sby1);
        file_maps.put("Malang", R.drawable.mlg1);
        file_maps.put("Kediri", R.drawable.kdr);

        findViewById(R.id.showall).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DaftarActivity.class));
            }
        });

        for (String name : file_maps.keySet()) {
            TextSliderView textSliderView = new TextSliderView(this);
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra", name);

            mDemoSlider.addSlider(textSliderView);

        }
        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mDemoSlider.setCustomAnimation(new DescriptionAnimation());
        mDemoSlider.setDuration(4000);
        mDemoSlider.addOnPageChangeListener(this);
//        ListView l = (ListView)findViewById(R.id.transformers);
//        l.setAdapter(new TransformerAdapter());
//        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                mDemoSlider.setPresetTransformer(((TextView) view).getText().toString());
//                Toast.makeText(MainActivity.this, ((TextView) view).getText().toString(), Toast.LENGTH_SHORT).show();
//            }
//        });

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public void doClick(int pos) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(KOTA, mList.get(pos));
        intent.putExtra(ID, 1);
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
    protected void onStop() {
        // To prevent a memory leak on rotation, make sure to call stopAutoCycle() on the slider before activity or fragment is destroyed
        mDemoSlider.stopAutoCycle();
        super.onStop();
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
        /*if (id == R.id.action_settings) {
            return true;
        }*/


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
        Log.d("Slider Demo", "Page Changed: " + position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onSliderClick(BaseSliderView slider) {
        Toast.makeText(this, slider.getBundle().get("extra") + "", Toast.LENGTH_SHORT).show();
    }


}

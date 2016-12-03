package id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore.model.KotaData;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int id1 = getIntent().getIntExtra(MainActivity.ID, 0);
        int id2 = getIntent().getIntExtra(DaftarActivity.ID, 0);

        if (id1 == 1) {
            KotaData kota = (KotaData) getIntent().getSerializableExtra(MainActivity.KOTA);
            setTitle(kota.title);
            ImageView ivFoto = (ImageView) findViewById(R.id.imageFoto);
            ImageView ivLogo = (ImageView) findViewById(R.id.imageViewLogo);
            TextView tvTitle = (TextView) findViewById(R.id.textViewTitle);
            ImageView ivSej = (ImageView) findViewById(R.id.imageViewSej);
            TextView tvTitleSej = (TextView) findViewById(R.id.textViewTitleSej);
            TextView tvDesSej = (TextView) findViewById(R.id.textViewDesSej);
            TextView tvTitleBud = (TextView) findViewById(R.id.textViewTitleBud);
            TextView tvDesBud1 = (TextView) findViewById(R.id.textViewDesBud1);
            ImageView ivBud1 = (ImageView) findViewById(R.id.imageViewBud1);
            TextView tvDesBud2 = (TextView) findViewById(R.id.textViewDesBud2);
            ImageView ivBud2 = (ImageView) findViewById(R.id.imageViewBud2);
            TextView tvDesBud3 = (TextView) findViewById(R.id.textViewDesBud3);
            ImageView ivPar = (ImageView) findViewById(R.id.imageViewPar);
            TextView tvTitlePar = (TextView) findViewById(R.id.textViewTitlePar);
            TextView tvDesPar = (TextView) findViewById(R.id.textViewDesPar);
            ImageView ivPar1 = (ImageView) findViewById(R.id.imageViewPar1);
            TextView tvDesPar1 = (TextView) findViewById(R.id.textViewDesPar1);
            ImageView ivPar2 = (ImageView) findViewById(R.id.imageViewPar2);
            TextView tvDesPar2 = (TextView) findViewById(R.id.textViewDesPar2);
            ImageView ivPar3 = (ImageView) findViewById(R.id.imageViewPar3);
            TextView tvDesPar3 = (TextView) findViewById(R.id.textViewDesPar3);

            ivFoto.setImageURI(Uri.parse(kota.iconkota));
            ivLogo.setImageURI(Uri.parse(kota.tab1logo));
            tvTitle.setText(kota.title);
            ivSej.setImageURI(Uri.parse(kota.tab2foto));
            tvTitleSej.setText(kota.tab2title);
            tvDesSej.setText(kota.tab2des);
            tvTitleBud.setText(kota.tab3title);
            tvDesBud1.setText(kota.tab3des1);
            ivBud1.setImageURI(Uri.parse(kota.tab3foto1));
            tvDesBud2.setText(kota.tab3des2);
            ivBud2.setImageURI(Uri.parse(kota.tab3foto2));
            tvDesBud3.setText(kota.tab3des3);
            ivPar.setImageURI(Uri.parse(kota.tab4foto));
            tvTitlePar.setText(kota.tab4title);
            tvDesPar.setText(kota.tab4des);
            ivPar1.setImageURI(Uri.parse(kota.tab4foto1));
            tvDesPar1.setText(kota.tab4des1);
            ivPar2.setImageURI(Uri.parse(kota.tab4foto2));
            tvDesPar2.setText(kota.tab4des2);
            ivPar3.setImageURI(Uri.parse(kota.tab4foto3));
            tvDesPar3.setText(kota.tab4des3);
        } else if (id2 == 2) {
            KotaData kota = (KotaData) getIntent().getSerializableExtra(DaftarActivity.KOTA);
            setTitle(kota.title);
            ImageView ivFoto = (ImageView) findViewById(R.id.imageFoto);
            ImageView ivLogo = (ImageView) findViewById(R.id.imageViewLogo);
            TextView tvTitle = (TextView) findViewById(R.id.textViewTitle);
            ImageView ivSej = (ImageView) findViewById(R.id.imageViewSej);
            TextView tvTitleSej = (TextView) findViewById(R.id.textViewTitleSej);
            TextView tvDesSej = (TextView) findViewById(R.id.textViewDesSej);
            TextView tvTitleBud = (TextView) findViewById(R.id.textViewTitleBud);
            TextView tvDesBud1 = (TextView) findViewById(R.id.textViewDesBud1);
            ImageView ivBud1 = (ImageView) findViewById(R.id.imageViewBud1);
            TextView tvDesBud2 = (TextView) findViewById(R.id.textViewDesBud2);
            ImageView ivBud2 = (ImageView) findViewById(R.id.imageViewBud2);
            TextView tvDesBud3 = (TextView) findViewById(R.id.textViewDesBud3);
            ImageView ivPar = (ImageView) findViewById(R.id.imageViewPar);
            TextView tvTitlePar = (TextView) findViewById(R.id.textViewTitlePar);
            TextView tvDesPar = (TextView) findViewById(R.id.textViewDesPar);
            ImageView ivPar1 = (ImageView) findViewById(R.id.imageViewPar1);
            TextView tvDesPar1 = (TextView) findViewById(R.id.textViewDesPar1);
            ImageView ivPar2 = (ImageView) findViewById(R.id.imageViewPar2);
            TextView tvDesPar2 = (TextView) findViewById(R.id.textViewDesPar2);
            ImageView ivPar3 = (ImageView) findViewById(R.id.imageViewPar3);
            TextView tvDesPar3 = (TextView) findViewById(R.id.textViewDesPar3);

            ivFoto.setImageURI(Uri.parse(kota.iconkota));
            ivLogo.setImageURI(Uri.parse(kota.tab1logo));
            tvTitle.setText(kota.title);
            ivSej.setImageURI(Uri.parse(kota.tab2foto));
            tvTitleSej.setText(kota.tab2title);
            tvDesSej.setText(kota.tab2des);
            tvTitleBud.setText(kota.tab3title);
            tvDesBud1.setText(kota.tab3des1);
            ivBud1.setImageURI(Uri.parse(kota.tab3foto1));
            tvDesBud2.setText(kota.tab3des2);
            ivBud2.setImageURI(Uri.parse(kota.tab3foto2));
            tvDesBud3.setText(kota.tab3des3);
            ivPar.setImageURI(Uri.parse(kota.tab4foto));
            tvTitlePar.setText(kota.tab4title);
            tvDesPar.setText(kota.tab4des);
            ivPar1.setImageURI(Uri.parse(kota.tab4foto1));
            tvDesPar1.setText(kota.tab4des1);
            ivPar2.setImageURI(Uri.parse(kota.tab4foto2));
            tvDesPar2.setText(kota.tab4des2);
            ivPar3.setImageURI(Uri.parse(kota.tab4foto3));
            tvDesPar3.setText(kota.tab4des3);
        }



       /* KotaData kotadaftar = (KotaData) getIntent().getSerializableExtra(DaftarActivity.KOTA2);
        setTitle(kotadaftar.title);
        if (ivFoto != null) {
            ivFoto.setImageURI(Uri.parse(kotadaftar.tab1logo));
        }
        if (tvTitle != null) {
            tvTitle.setText(kotadaftar.title);
        }
        if (tvDeskripsi != null) {
            tvDeskripsi.setText(kotadaftar.tab1des);
        }*/

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}

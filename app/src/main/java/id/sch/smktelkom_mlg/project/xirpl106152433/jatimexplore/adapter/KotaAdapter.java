package id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore.R;
import id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore.model.Kota;

/**
 * Created by Smktelkom on 11/8/2016.
 */
public class KotaAdapter extends RecyclerView.Adapter<KotaAdapter.ViewHolder> {
    ArrayList<Kota> kotaList;

    public KotaAdapter(ArrayList<Kota> kotaList) {
        this.kotaList = kotaList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Kota kota = kotaList.get(position);
        holder.tvJudul.setText(kota.judul);
        holder.ivGambar.setImageDrawable(kota.gambar);
    }

    @Override
    public int getItemCount() {
        if (kotaList != null)
            return kotaList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivGambar;
        TextView tvJudul;

        public ViewHolder(View itemView) {
            super(itemView);
            ivGambar = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
        }
    }
}

package id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore.R;
import id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore.model.ListHome;

/**
 * Created by Vira Meliana on 11/11/2016.
 */
public class KotaHomeAdapter extends RecyclerView.Adapter<KotaHomeAdapter.ViewHolder> {
    ArrayList<ListHome> kotalist;

    public KotaHomeAdapter(ArrayList<ListHome> kotalist) {
        this.kotalist = kotalist;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        ListHome listhome = kotalist.get(position);
        holder.tvKota.setText(listhome.kota);
        holder.tvDeskripsi.setText(listhome.deskripsi);
        holder.ivFoto.setImageDrawable(listhome.foto);
    }

    @Override
    public int getItemCount() {
        if (kotalist != null)
            return kotalist.size();

        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvKota;
        TextView tvDeskripsi;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvKota = (TextView) itemView.findViewById(R.id.textViewKota);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
        }
    }
}

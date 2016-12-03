package id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore.R;
import id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore.model.KotaData;

//import id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore.model.Kota;

/**
 * Created by Smktelkom on 11/8/2016.
 */
public class KotaAdapter extends RecyclerView.Adapter<KotaAdapter.ViewHolder> {
    ArrayList<KotaData> kotaList;
    IKotaAdapter2 mIKotaAdapter2;

    public KotaAdapter(Context context, ArrayList<KotaData> kotaList) {
        this.kotaList = kotaList;
        mIKotaAdapter2 = (KotaAdapter.IKotaAdapter2) context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        KotaData kota = kotaList.get(position);
        holder.tvJudul.setText(kota.title);
        holder.ivGambar.setImageURI(Uri.parse(kota.iconkota));
    }

    @Override
    public int getItemCount() {
        if (kotaList != null)
            return kotaList.size();
        return 0;
    }

    public interface IKotaAdapter2 {
        void doClick(int pos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivGambar;
        TextView tvJudul;

        public ViewHolder(View itemView) {
            super(itemView);
            ivGambar = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIKotaAdapter2.doClick(getAdapterPosition());
                }
            });
        }
    }
}

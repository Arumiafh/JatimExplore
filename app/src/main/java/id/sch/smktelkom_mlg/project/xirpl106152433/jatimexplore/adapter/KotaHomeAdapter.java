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


public class KotaHomeAdapter extends RecyclerView.Adapter<KotaHomeAdapter.ViewHolder> {

    ArrayList<KotaData> kotaList;
    IKotaAdapter mIKotaAdapter;

    public KotaHomeAdapter(Context context, ArrayList<KotaData> kotaList) {
        this.kotaList = kotaList;
        mIKotaAdapter = (IKotaAdapter) context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        KotaData kotaData = kotaList.get(position);
        holder.tvJudul.setText(kotaData.title);
        holder.tvDeskripsi.setText(kotaData.tab2des);
        holder.ivFoto.setImageURI(Uri.parse(kotaData.iconkota));
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public interface IKotaAdapter {
        void doClick(int pos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;
        TextView tvDeskripsi;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewKota);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mIKotaAdapter.doClick(getAdapterPosition());
                }
            });

        }
    }
}
package sv.dk.com.dimeunahistoria.Adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import sv.dk.com.dimeunahistoria.HistoriaDetalle;
import sv.dk.com.dimeunahistoria.Model.CategoriesItem;
import sv.dk.com.dimeunahistoria.Modelos.Historia;
import sv.dk.com.dimeunahistoria.Modelos.Story;
import sv.dk.com.dimeunahistoria.R;

/**
 * Created by DK-Ragnar on 8/9/2018.
 */

public class HistoriasAdapter extends RecyclerView.Adapter<HistoriasAdapter.ViewHolder> {

    private List<CategoriesItem> listaHistorias;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;
    private Context context;
    private int lastPosition = -1;

    public HistoriasAdapter(Context context, List<CategoriesItem> listaHistorias) {
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        this.listaHistorias = listaHistorias;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_reciclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

       // holder.myTextView.setText(mData[position]);
        holder.portada.setScaleType(ImageView.ScaleType.FIT_CENTER);
        //Glide.with(holder.portada.getContext()).load(listaHistorias.get(position).getPortada()).into(holder.portada);
        Glide.with(holder.portada.getContext()).load("http://ec2-54-244-63-119.us-west-2.compute.amazonaws.com/story/public/images/"+
                listaHistorias.get(position).getUrl()).into(holder.portada);
    }

    @Override
    public int getItemCount() {
        return listaHistorias.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView portada;
        TextView titulo, autor;
      //  Button categoria;

        public ViewHolder(View itemView) {
            super(itemView);
            //titulo = (TextView) itemView.findViewById(R.id.txthistoriatitulo);
            portada = (ImageView) itemView.findViewById(R.id.txthistoriaportada);
            //autor = (TextView) itemView.findViewById(R.id.txthistoriaautor);
           // categoria = (Button) itemView.findViewById(R.id.txthistoriacategoria);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mClickListener != null) mClickListener.onItemClick(v, getAdapterPosition());
        }
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}

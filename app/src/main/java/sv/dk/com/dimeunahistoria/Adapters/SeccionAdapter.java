package sv.dk.com.dimeunahistoria.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import java.util.List;
import sv.dk.com.dimeunahistoria.Modelos.SectionsItem;
import sv.dk.com.dimeunahistoria.R;

/**
 * Created by DK-Ragnar on 28/10/2018.
 */

public class SeccionAdapter extends RecyclerView.Adapter<SeccionAdapter.ViewHolder>  {
    private List<SectionsItem> listaSecciones;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;
    private Context context;
    private int lastPosition = -1;

    public SeccionAdapter(List<SectionsItem> listaSecciones, Context context) {
        this.listaSecciones = listaSecciones;
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_reciclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.portada.setScaleType(ImageView.ScaleType.FIT_CENTER);
        Glide.with(holder.portada.getContext()).load("http://ec2-54-244-63-119.us-west-2.compute.amazonaws.com/story/public/images/"+
                listaSecciones.get(position).getUrl()).into(holder.portada);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView portada;

        public ViewHolder(View itemView) {
            super(itemView);
            portada = (ImageView) itemView.findViewById(R.id.txthistoriaportada);
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

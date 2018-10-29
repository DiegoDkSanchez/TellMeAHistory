package sv.dk.com.dimeunahistoria.Adapters;
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
 * Created by DK-Ragnar on 29/10/2018.
 */

public class sectionAdapter extends  RecyclerView.Adapter<sectionAdapter.ViewHolder>{


    private List<SectionsItem> purposesList;
    private int layout;
    private onItemClickListener listener;

    public sectionAdapter(List<SectionsItem> Purposes, int layout, onItemClickListener listener) {
            this.purposesList = Purposes;
            this.layout = layout;
            this.listener = listener;
            }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            //inlfamos el layout y le pasamos lso datos al constructor del view holder
            View v = LayoutInflater.from(parent.getContext()).inflate(layout,parent,false);
            ViewHolder vh = new ViewHolder(v);
            return vh;
            }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

            //llamamos al metodo bind del viewholder pasandole el objdeto y un listener
            holder.bind(purposesList.get(position), listener);

            }

    @Override
    public int getItemCount() {
            return purposesList.size();
            }

    public static class ViewHolder extends  RecyclerView.ViewHolder{
        //Elementos UI a rellenar

        ImageView portada;


        public ViewHolder(View v){
            //recibe la vista completa para que la rendericemos, pasamos parametros a constructor padre
            // aqui tambien manejamos los datos de logioca para extraer datos y hacer referencias con los elementoss
            super(v);
            portada = (ImageView) itemView.findViewById(R.id.txthistoriaportada);

        }

        public void bind(final SectionsItem sectionsItem, final  onItemClickListener listener){
            //procesamos los datos para renderizar
            portada = (ImageView) itemView.findViewById(R.id.txthistoriaportada);
            Glide.with(portada.getContext()).load("http://ec2-54-244-63-119.us-west-2.compute.amazonaws.com/story/public/images/"+
                    sectionsItem.getUrl()).into(portada);

            portada.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(sectionsItem, getAdapterPosition());
                }
            });

        }

    }
    ///declaramos las interfaces con los metodos a implementar
    public interface onItemClickListener{
        void onItemClick(SectionsItem sectionsItem, int position);
    }
}
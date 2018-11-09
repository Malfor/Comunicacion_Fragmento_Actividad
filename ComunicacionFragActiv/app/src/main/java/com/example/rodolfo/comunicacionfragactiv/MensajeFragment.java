package com.example.rodolfo.comunicacionfragactiv;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MensajeFragment extends Fragment {

    private Button boton;
    private EditText editMensaje;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_mensaje, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        boton = view.findViewById(R.id.btn_obtener);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getMensajeDeActivity();
            }
        });
    }

    public void getMensajeDeActivity(){
        editMensaje = getActivity().findViewById(R.id.edit_mensaje);
        String mensaje  = editMensaje != null ? editMensaje.getText().toString() : "No hay Mensaje";

        if (getView() != null){
            TextView txtMensaje = getView().findViewById(R.id.txt_mensaje);
            txtMensaje.setText(mensaje);
        }

    }

}

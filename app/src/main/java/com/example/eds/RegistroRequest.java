package com.example.eds;

import android.app.VoiceInteractor;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegistroRequest extends StringRequest {
    private static final String ruta = "https://edsarquitectura.000webhostapp.com/login.php";
    private Map<String, String> parametros;
    public RegistroRequest(String nombre, String usuario, String clave, Response.Listener<String> listener) {
        super(Request.Method.POST, ruta, listener, null);
        parametros = new HashMap<>();
        parametros.put("nombre", nombre + "");
        parametros.put("usuario", usuario + "");
        parametros.put("clave", clave + "");
    }

        @Override
        protected Map<String, String> getParams(){
            return parametros;

    }


}

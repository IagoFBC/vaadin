package com.example;


import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;

public class ObjetoUnico {

    private static ObjetoUnico instancia;

    private JSONArray json;
    private String titulo;
    private String dataset;

    private ObjetoUnico(JSONArray json, String titulo, String dataset) {
        this.json = json;
        this.titulo = titulo;
        this.dataset = dataset;
    }

    public static ObjetoUnico getInstancia(JSONArray json, String titulo, String dataset){

        if (instancia == null){
            instancia = new ObjetoUnico(json, titulo, dataset);
        }

        return instancia;

    }
}

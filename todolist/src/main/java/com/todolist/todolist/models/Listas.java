package com.todolist.todolist.models;

public class Listas {

    private String id;
    private String nombreLista;
    private String producto;
    private String cantidad;
    private String observaciones;
    private String nombreUsuario;


    public Listas() {
    }

    public Listas(String id, String nombreLista, String producto, String cantidad, String observaciones, String nombreUsuario) {
        this.id = id;
        this.nombreLista = nombreLista;
        this.producto = producto;
        this.cantidad = cantidad;
        this.observaciones = observaciones;
        this.nombreUsuario = nombreUsuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}

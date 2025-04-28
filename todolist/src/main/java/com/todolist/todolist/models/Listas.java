package com.todolist.todolist.models;

public class Listas {

    private int idListas;
    private String nombreLista;
    private String producto;
    private String cantidad;
    private String observaciones;
    private String nombreUsuario;


    public Listas() {
    }

    public Listas(String id, String nombreLista, String producto, String cantidad, String observaciones, String nombreUsuario) {
        this.idListas = Integer.parseInt(id);
        this.nombreLista = nombreLista;
        this.producto = producto;
        this.cantidad = cantidad;
        this.observaciones = observaciones;
        this.nombreUsuario = nombreUsuario;
    }

    public Listas(String nombreLista, String producto, String cantidad, String observaciones, String nombreUsuario) {
        this.nombreLista = nombreLista;
        this.producto = producto;
        this.cantidad = cantidad;
        this.observaciones = observaciones;
        this.nombreUsuario = nombreUsuario;
    }

    public int getIdListas() {
        return idListas;
    }

    public void setIdListas(String idListas) {
        this.idListas = Integer.parseInt(idListas);
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

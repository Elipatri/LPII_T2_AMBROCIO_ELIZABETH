package com.cibertec.lp2_t2_AMBROCIO_ELIZABETH.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DetalleAlquilerId implements Serializable {

    @Column(name = "id_alquiler")
    private Integer idAlquiler;

    @Column(name = "id_pelicula")
    private Integer idPelicula;

    public DetalleAlquilerId() {}

    public DetalleAlquilerId(Integer idAlquiler, Integer idPelicula) {
        this.idAlquiler = idAlquiler;
        this.idPelicula = idPelicula;
    }

    public Integer getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(Integer idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DetalleAlquilerId)) return false;
        DetalleAlquilerId that = (DetalleAlquilerId) o;
        return Objects.equals(idAlquiler, that.idAlquiler) &&
               Objects.equals(idPelicula, that.idPelicula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAlquiler, idPelicula);
    }
}
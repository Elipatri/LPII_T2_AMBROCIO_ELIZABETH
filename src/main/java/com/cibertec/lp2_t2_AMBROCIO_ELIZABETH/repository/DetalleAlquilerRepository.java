package com.cibertec.lp2_t2_AMBROCIO_ELIZABETH.repository;


import com.cibertec.lp2_t2_AMBROCIO_ELIZABETH.model.DetalleAlquiler;
import com.cibertec.lp2_t2_AMBROCIO_ELIZABETH.model.DetalleAlquilerId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleAlquilerRepository extends JpaRepository<DetalleAlquiler, DetalleAlquilerId> {

}


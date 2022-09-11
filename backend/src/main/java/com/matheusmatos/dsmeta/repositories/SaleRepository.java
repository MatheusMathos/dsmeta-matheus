/*Componente utilizado para acessar o bando de dados*/

package com.matheusmatos.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusmatos.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}

package com.nydhal.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nydhal.demo.entities.produit;

public interface produitRepository extends JpaRepository<produit, Long> {

}

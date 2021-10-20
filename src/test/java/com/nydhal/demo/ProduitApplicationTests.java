package com.nydhal.demo;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nydhal.demo.entities.produit;

@SpringBootTest
class ProduitApplicationTests<ProduitRepository> {

	@Autowired
	private ProduitRepository produitRepository;
	@Test
	public void testCreateProduit() {
	produit prod = new produit("PC Dell",2200.500,new Date());
  produitRepository.equals(prod);
	}
	@Test
	public void testFindProduit()
	{
		produit p = produitRepository.findById(1L).get();
	System.out.println(p);
	}

}

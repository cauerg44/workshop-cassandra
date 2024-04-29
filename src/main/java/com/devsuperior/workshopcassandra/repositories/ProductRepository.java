package com.devsuperior.workshopcassandra.repositories;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.devsuperior.workshopcassandra.model.entities.Product;

public interface ProductRepository extends CassandraRepository<Product, UUID> {

}

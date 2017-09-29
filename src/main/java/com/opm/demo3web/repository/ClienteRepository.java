package com.opm.demo3web.repository;

import org.springframework.data.repository.CrudRepository;

import com.opm.demo3web.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}

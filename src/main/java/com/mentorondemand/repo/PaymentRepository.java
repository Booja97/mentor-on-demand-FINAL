package com.mentorondemand.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mentorondemand.entity.Payments;
@Repository
public interface PaymentRepository extends CrudRepository<Payments, Long> {

}

package com.mentorondemand.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mentorondemand.entity.PaymentHistory;
@Repository
public interface PaymentHistoryRepository extends CrudRepository<PaymentHistory, Long> {

}

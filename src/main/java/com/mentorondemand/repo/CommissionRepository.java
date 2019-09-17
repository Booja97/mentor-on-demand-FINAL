package com.mentorondemand.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mentorondemand.entity.Commission;
@Repository
public interface CommissionRepository extends CrudRepository<Commission, Long> {

}

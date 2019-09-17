package com.mentorondemand.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mentorondemand.entity.ProposalRequest;
@Repository
public interface ProposalRequestRepository extends CrudRepository<ProposalRequest, Long> {

}

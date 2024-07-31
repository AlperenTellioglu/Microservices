package com.microservices.account_service.dataAccess;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.microservices.account_service.entity.Account;

@Repository
public interface AccountRepository extends CassandraRepository<Account, String>{

}

package com.microservices.account_service.dataAccess;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.microservices.account_service.entity.Account;

@Repository
public interface AccountRepository extends CassandraRepository<Account, UUID>{

}

package com.sk.kmooc_msa.domain.repository;

import com.sk.kmooc_msa.domain.model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AccountRepository extends PagingAndSortingRepository<Account,Long> {
    Account findByName(@Param("name") String name);
}

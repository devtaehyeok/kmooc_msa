package com.sk.kmooc_msa.account.domain.repository;

import com.sk.kmooc_msa.account.domain.model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;


@RepositoryRestResource
public interface AccountRepository extends PagingAndSortingRepository<Account,Long> {
    Account findByName(@Param("name") String name);
}

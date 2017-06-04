package com.sharing.contract.repository;

import com.sharing.contract.domain.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Alexey Schröder (mail@alexey-schroder.de) on 04.06.2017.
 */

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {
}

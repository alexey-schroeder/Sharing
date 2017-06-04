package com.sharing.contract.service;

import com.sharing.contract.domain.Contract;

import java.util.List;

/**
 * Created by Alexey Schröder (mail@alexey-schroder.de) on 04.06.2017.
 */
public interface ContractService {
    Contract create(Contract customer);
    List<Contract> findAll();
    Contract findById(long id);
}

package com.sharing.contract.service;

import com.sharing.contract.domain.Contract;
import com.sharing.contract.repository.ContractRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Alexey Schröder on 10.04.2017.
 */

@Service
public class ContractServiceImpl implements ContractService {

    @Inject
    private ContractRepository contractRepository;

    @Override
    public Contract create(Contract bicycle) {
        return contractRepository.save(bicycle);
    }

    @Override
    public Contract findById(long id) {
        return contractRepository.findOne(id);
    }

    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }
}

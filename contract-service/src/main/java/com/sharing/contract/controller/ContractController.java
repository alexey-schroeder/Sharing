package com.sharing.contract.controller;

import com.sharing.contract.domain.Contract;
import com.sharing.contract.service.ContractService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by Alexey Schröder on 10.04.2017.
 */

@RestController
@RequestMapping("contracts")
public class ContractController {

    @Inject
    private ContractService contractService;

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public Contract findContractById(@PathVariable long id){
        return contractService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Contract> getAllContracts(){
        return contractService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Contract create(@Valid @RequestBody Contract Contract)  {
        return contractService.create(Contract);
    }
}

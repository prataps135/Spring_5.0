package com.example.demo.tx;

import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration.TransactionTemplateConfiguration;
import org.springframework.stereotype.Service;

@Service("businessServiceProgrammaticTx")
public class BusinessServiceProgrammaticTx implements BusinessService {
	private final TransactionTemplateConfiguration transactionTemplate = new TransactionTemplateConfiguration();
	@Override
	public void doBusiness() {
		
	}

}

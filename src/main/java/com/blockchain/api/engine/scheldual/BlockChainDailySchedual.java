package com.blockchain.api.engine.scheldual;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class BlockChainDailySchedual {
	
	Logger logger = LoggerFactory.getLogger(BlockChainDailySchedual.class);
	
	@Scheduled(cron="0 45 14 * * *")
	public void runSchedual() {
		logger.info("enter BlockChainDailySchedual runSchedual");
	}
	
	@Scheduled(cron="0 15 15 * * *")
	public void runTask() {
		logger.info("enter BlockChainDailySchedual runTask");
	}

}

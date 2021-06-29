package com.covalenthq.java;

import java.io.IOException;

/**
 * @author MMoussa
 *
 */
public class CovalentClassA {
	private CovalentSession covSession;
	public CovalentClassA(CovalentSession covSession) {
		this.covSession=covSession;
	}
	// GET {chain_id}/address/{address}/balances_v2/
	public String getTokenBalancesForAddress(CovalentNetworks cn,String address,boolean nft,boolean noNftFetch,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		String req = cn.getValue()+"/address/"+address+"/balances_v2/";
		if (nft) {
			req+="?nft=true";
		}
		else {
			req+="?nft=false";
		}
		if(noNftFetch) {
			req+="&no-nft-fetch=true";
		}
		req+="&match="+match;
		req+="&group="+group;
		req+="&sort="+sort;
		req+="&skip="+skip;
		req+="&primer="+primer;
		req+="&quote-currency="+cqc.getValue();
		req+="&limit="+limit;
		return covSession.query(req);
	}
	// GET {chain_id}/address/{address}/portfolio_v2/
	public String getHistoricalPortfolioValueOverTime(CovalentNetworks cn,String address,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		String req = cn.getValue()+"/address/"+address+"/portfolio_v2/";
		req+="?match="+match;
		req+="&group="+group;
		req+="&sort="+sort;
		req+="&skip="+skip;
		req+="&primer="+primer;
		req+="&quote-currency="+cqc.getValue();
		req+="&limit="+limit;
		return covSession.query(req);
	}
	// GET {chain_id}/address/{address}/transactions_v2/
	public String getTransactions(CovalentNetworks cn,String address,CovalentQuoteCurrency cqc,boolean block_signed_at_asc,boolean no_logs,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		String req = cn.getValue()+"/address/"+address+"/transactions_v2/";
		if (block_signed_at_asc) {
			req+="?block-signed-at-asc=true";
		}
		else {
			req+="?block-signed-at-asc=false";
		}
		if (no_logs) {
			req+="&no-logs=true";
		}
		else {
			req+="&no-logs=false";
		}
		req+="&match="+match;
		req+="&group="+group;
		req+="&sort="+sort;
		req+="&skip="+skip;
		req+="&primer="+primer;
		req+="&quote-currency="+cqc.getValue();
		req+="&limit="+limit;
		return covSession.query(req);
	}
	// GET {chain_id}/address/{address}/transfers_v2/
	public String getERC20Transfers(CovalentNetworks cn,String address,String contract_address,CovalentQuoteCurrency cqc,boolean block_signed_at_asc,boolean no_logs,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		String req = cn.getValue()+"/address/"+address+"/transfers_v2/";
		req+="?contract-address="+contract_address;
		req+="&match="+match;
		req+="&group="+group;
		req+="&sort="+sort;
		req+="&skip="+skip;
		req+="&primer="+primer;
		req+="&quote-currency="+cqc.getValue();
		req+="&limit="+limit;
		return covSession.query(req);
	}
	// GET {chain_id}/block_v2/{block_height}/
	public String getBlock(CovalentNetworks cn,String blockHeight,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		String req = cn.getValue()+"/block_v2/"+blockHeight+"/";
		req+="?quote-currency="+cqc.getValue();
		req+="&match="+match;
		req+="&group="+group;
		req+="&sort="+sort;
		req+="&skip="+skip;
		req+="&primer="+primer;
		req+="&limit="+limit;
		return covSession.query(req);
	}
	// GET {chain_id}/block_v2/{start_date}/{end_date}/
	public String getBlockHeights(CovalentNetworks cn,String start_date ,String end_date,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		String req = cn.getValue()+"/block_v2/"+start_date+"/"+end_date+"/";
		req+="?match="+match;
		req+="&group="+group;
		req+="&sort="+sort;
		req+="&skip="+skip;
		req+="&primer="+primer;
		req+="&quote-currency="+cqc.getValue();
		req+="&limit="+limit;
		return covSession.query(req);
	}
	// GET {chain_id}/events/address/{address}/
	public String getLogEventsByContractAddress(CovalentNetworks cn,String address,String starting_block,String ending_block,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		String req = cn.getValue()+"/events/address/"+address+"/";
		req+="?starting-block="+starting_block;
		req+="&ending-block="+ending_block;
		req+="&match="+match;
		req+="&group="+group;
		req+="&sort="+sort;
		req+="&skip="+skip;
		req+="&primer="+primer;
		req+="&quote-currency="+cqc.getValue();
		req+="&limit="+limit;
		return covSession.query(req);
	}
	// GET {chain_id}/events/topics/{topic}/
	public String getLogEventsByTopicHashes(CovalentNetworks cn,String topic,String secondary_topic,String starting_block,String ending_block,String sender_address,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		String req = cn.getValue()+"/events/topics/"+topic+"/";
		req+="?secondary-topic="+secondary_topic;
		req+="&starting-block="+starting_block;
		req+="&ending-block="+ending_block;
		req+="&sender-address="+sender_address;
		req+="&match="+match;
		req+="&group="+group;
		req+="&sort="+sort;
		req+="&skip="+skip;
		req+="&primer="+primer;
		req+="&quote-currency="+cqc.getValue();
		req+="&limit="+limit;
		return covSession.query(req);
	}
	// GET {chain_id}/tokens/{address}/nft_metadata/{token_id}/
	public String getExternalNFTMetadata(CovalentNetworks cn,String address,String token_id,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		String req = cn.getValue()+"/tokens/"+address+"/nft_metadata/"+token_id+"/";
		req+="?match="+match;
		req+="&group="+group;
		req+="&sort="+sort;
		req+="&skip="+skip;
		req+="&primer="+primer;
		req+="&quote-currency="+cqc.getValue();
		req+="&limit="+limit;
		return covSession.query(req);
	}
	// GET {chain_id}/tokens/{address}/nft_token_ids/
	public String getNFTTokensIDs(CovalentNetworks cn,String address,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		String req = cn.getValue()+"/tokens/"+address+"/nft_token_ids/";
		req+="?match="+match;
		req+="&group="+group;
		req+="&sort="+sort;
		req+="&skip="+skip;
		req+="&primer="+primer;
		req+="&quote-currency="+cqc.getValue();
		req+="&limit="+limit;
		return covSession.query(req);
	}
	// GET {chain_id}/tokens/{address}/nft_transactions/{token_id}/
	public String getNFTTransactions(CovalentNetworks cn,String address,String token_id,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		String req = cn.getValue()+"/tokens/"+address+"/nft_transactions/"+token_id+"/";
		req+="?match="+match;
		req+="&group="+group;
		req+="&sort="+sort;
		req+="&skip="+skip;
		req+="&primer="+primer;
		req+="&quote-currency="+cqc.getValue();
		req+="&limit="+limit;
		return covSession.query(req);
	}
	// GET {chain_id}/tokens/{address}/token_holders_changes/
	public String getChangesInTokenHolders(CovalentNetworks cn,String address,CovalentQuoteCurrency cqc,String starting_block,String ending_block,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		String req = cn.getValue()+"/tokens/"+address+"/token_holders_changes/";
		req+="?starting-block="+starting_block;
		req+="&ending-block="+ending_block;
		req+="&match="+match;
		req+="&group="+group;
		req+="&sort="+sort;
		req+="&skip="+skip;
		req+="&primer="+primer;
		req+="&quote-currency="+cqc.getValue();
		req+="&limit="+limit;
		return covSession.query(req);
	}
	// GET {chain_id}/tokens/{address}/token_holders/
	public String getTokenHoldersASOfBlockHeight(CovalentNetworks cn,String address,String block_height,CovalentQuoteCurrency cqc,String starting_block,String ending_block,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		String req = cn.getValue()+"/tokens/"+address+"/token_holders/";
		req+="?block-height="+starting_block;
		req+="&match="+match;
		req+="&group="+group;
		req+="&sort="+sort;
		req+="&skip="+skip;
		req+="&primer="+primer;
		req+="&quote-currency="+cqc.getValue();
		req+="&limit="+limit;
		return covSession.query(req);
	}
	// GET {chain_id}/tokens/tokenlists/{id}/
	public String getAllContractMetaData(CovalentNetworks cn,String id,String block_height,CovalentQuoteCurrency cqc,String starting_block,String ending_block,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		String req = cn.getValue()+"/tokens/tokenlists/"+id+"/";
		req+="?block-height="+starting_block;
		req+="&match="+match;
		req+="&group="+group;
		req+="&sort="+sort;
		req+="&skip="+skip;
		req+="&primer="+primer;
		req+="&quote-currency="+cqc.getValue();
		req+="&limit="+limit;
		return covSession.query(req);
	}
	// GET {chain_id}/transaction_v2/{tx_hash}/
	public String getTransaction(CovalentNetworks cn,String tx_hash,boolean no_logs,CovalentQuoteCurrency cqc,String primer,String match,String group,String sort,int skip,int limit) throws IOException {
		String req = cn.getValue()+"/transaction_v2/"+tx_hash+"/";
		if(no_logs) {
			req+="?no-logs=true";
		}
		else  {
			req+="?no-logs=false";
		}
		
		req+="&match="+match;
		req+="&group="+group;
		req+="&sort="+sort;
		req+="&skip="+skip;
		req+="&primer="+primer;
		req+="&quote-currency="+cqc.getValue();
		req+="&limit="+limit;
		return covSession.query(req);
	}
	// GET chains/
	public String getAllChain () throws IOException {
		String req = "chains/";
		return covSession.query(req);
	}
	// GET chains/status/
	public String getAllChainStatuses () throws IOException {
		String req = "chains/status/";
		return covSession.query(req);
	}
}
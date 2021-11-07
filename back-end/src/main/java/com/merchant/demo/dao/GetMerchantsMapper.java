package com.merchant.demo.dao;

import java.util.List;
import java.util.Map;
import com.merchant.demo.model.Merchant;

public interface GetMerchantsMapper {

    // dynamic search merchants
	public List<Merchant> getMerchants(Map<String, String> map); 
}

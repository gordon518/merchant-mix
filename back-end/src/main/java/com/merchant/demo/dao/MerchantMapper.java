package com.merchant.demo.dao;

import com.merchant.demo.model.Merchant;

public interface MerchantMapper {

    // refer to xml mapping file's ID element
	Merchant selectByPrimaryKey(Long id);
}

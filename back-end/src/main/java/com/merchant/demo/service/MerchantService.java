package com.merchant.demo.service;

import java.util.List;
import java.util.Map;
import com.merchant.demo.model.Merchant;

public interface MerchantService {
    public Merchant getMerchantById(Long Id);
    public List<Merchant> getMerchants(Map<String, String> filterParams);
}

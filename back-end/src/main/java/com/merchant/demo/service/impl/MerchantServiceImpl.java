package com.merchant.demo.service.impl;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.merchant.demo.model.Merchant;
import com.merchant.demo.dao.MerchantMapper;
import com.merchant.demo.dao.GetMerchantsMapper;
import com.merchant.demo.service.MerchantService;

@Service("merchantService")
public class MerchantServiceImpl implements MerchantService {

    // inject mapper class
    @Resource
    private MerchantMapper merchantMapper;

    @Resource
    private GetMerchantsMapper getMerchantsMapper;
    
    @Override
    public Merchant getMerchantById(Long merchantId) {
        return merchantMapper.selectByPrimaryKey(merchantId);
    }

    @Override
    public List<Merchant> getMerchants(Map<String, String> filterParams) {
        return getMerchantsMapper.getMerchants(filterParams);
    }
}

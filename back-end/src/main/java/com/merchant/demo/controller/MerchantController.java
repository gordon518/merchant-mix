package com.merchant.demo.controller;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.merchant.demo.model.Merchant;
import com.merchant.demo.service.MerchantService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/merchant")
public class MerchantController {

    // inject service class
    @Resource
    private MerchantService merchantService;

    @RequestMapping(value="{id}", method=RequestMethod.GET, produces="application/json")
    public Merchant getMerchant(@PathVariable Long id) throws Exception {
    	Merchant merchant = this.merchantService.getMerchantById(id);
        return merchant;
    }

}

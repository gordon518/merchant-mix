package com.merchant.demo.controller;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.merchant.demo.model.Merchant;
import com.merchant.demo.service.MerchantService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/getMerchants")
public class GetMerchantsController {

    // inject service class
    @Resource
    private MerchantService merchantService;

    @RequestMapping(method=RequestMethod.GET, produces="application/json")
    public Map<String, Object> getMerchants(@RequestParam Map<String, String> filterParams) throws Exception {
    	List<Merchant> merchantList = this.merchantService.getMerchants(filterParams);
    	Map<String, Object> map = new HashMap<>();
    	map.put("rows", merchantList);
        return map;
    }

}

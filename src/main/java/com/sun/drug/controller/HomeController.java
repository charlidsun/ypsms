package com.sun.drug.controller;

import com.sun.drug.domain.Banner;
import com.sun.drug.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    BannerService bannerService;

    @GetMapping("/")
    private Map<String, Object> listHome() {

        Map<String, Object> map = new HashMap<>();

        List<Banner> listBanner = bannerService.listBanner();

        map.put("banner", listBanner);

        return map;
    }

}

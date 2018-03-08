package com.sun.drug.service.impl;

import com.sun.drug.domain.Banner;
import com.sun.drug.repository.BannerRepository;
import com.sun.drug.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService{

    @Autowired
    BannerRepository bannerRepository;

    @Override
    public List<Banner> listBanner() {
        return bannerRepository.listBanner()

                ;
    }
}

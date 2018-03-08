package com.sun.drug.repository;

import com.sun.drug.domain.Banner;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BannerRepository {

    @Select("select from banner where isOpen = 0")
    List<Banner> listBanner();
}

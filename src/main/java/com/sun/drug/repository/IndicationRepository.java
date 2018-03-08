package com.sun.drug.repository;

import com.sun.drug.domain.Indications;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IndicationRepository {

    @Select("select * from indications")
    List<Indications> listIndications();

    @Select("select indications where id=#{id}")
    Indications selectIndications(int id);
}

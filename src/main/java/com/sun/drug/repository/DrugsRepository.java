package com.sun.drug.repository;

import com.sun.drug.domain.Drugs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

@Mapper
public interface DrugsRepository {

    @SelectProvider(type = DrugsProvider.class, method = "listDrugs")
    List<Drugs> listDrugs(String firstSpelling);

    @Select("select * from drugs where id = #{id}")
    Drugs selectDrugs(@Param("id") int id);

    @Select("update drugs set deleteFlag = 1 where id = #{id}")
    void deleteDrugs(int id);

    @Select("update drugs set tradeName=#{tradeName} where id=#{id}")
    Drugs updateDrugs(Drugs drugs);

    @Select("insert into `how2java`.`drugs` ( `indication`, `drugName`, `spec`, `dosage`, `create_time`, `approval`, `drug_package`, `avoid`, `tradeName`, `edit_date`, `tips`, `approval_date`, `interation`, `effect`, `deleteFlag`, `firstSpelling`, `update_time`, `englishName`, `enterprise`, `ingredient`) values ( '解表散热，疏肝和胃。用于寒热往来，胸胁苦满，心烦喜吐，口苦咽干。', #{drugName}, null, '开水冲服，一次2~4克，一日3次。', null, null, null, null, '小柴胡颗粒', null, null, null, null, null, '0', 'XCHKL', null, null, '四川大千药业有限公司\\n', '柴胡、半夏（姜制）、黄芩、党参、甘草、生姜、大枣。\\n\\n辅料：甜菊素、糊精。');\n")
    void saveDrugs(Drugs drugs);


    class DrugsProvider {
        public String listDrugs(String firstSpelling) {
            String sql = "SELECT * FROM drugs where deleteFlag=0";
            if (!firstSpelling.equals("all")) {
                sql += " and firstSpelling LIKE CONCAT('%',#{firstSpelling},'%')";
            }
            return sql;
        }
    }

}

package cn.jf180.finance.dao.fin.dao;

import cn.jf180.finance.dao.fin.model.SellerInfo;
import cn.jf180.finance.dao.fin.model.SellerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellerInfoMapper {
    long countByExample(SellerInfoExample example);

    int deleteByExample(SellerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SellerInfo record);

    int insertSelective(SellerInfo record);

    List<SellerInfo> selectByExample(SellerInfoExample example);

    SellerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SellerInfo record, @Param("example") SellerInfoExample example);

    int updateByExample(@Param("record") SellerInfo record, @Param("example") SellerInfoExample example);

    int updateByPrimaryKeySelective(SellerInfo record);

    int updateByPrimaryKey(SellerInfo record);
}
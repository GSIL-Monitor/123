package cn.jf180.finance.dao.fin.dao;

import cn.jf180.finance.dao.fin.model.UserAccountTran;
import cn.jf180.finance.dao.fin.model.UserAccountTranExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountTranMapper {
    int countByExample(UserAccountTranExample example);

    int deleteByExample(UserAccountTranExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserAccountTran record);

    int insertSelective(UserAccountTran record);

    List<UserAccountTran> selectByExample(UserAccountTranExample example);

    UserAccountTran selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserAccountTran record, @Param("example") UserAccountTranExample example);

    int updateByExample(@Param("record") UserAccountTran record, @Param("example") UserAccountTranExample example);

    int updateByPrimaryKeySelective(UserAccountTran record);

    int updateByPrimaryKey(UserAccountTran record);
}
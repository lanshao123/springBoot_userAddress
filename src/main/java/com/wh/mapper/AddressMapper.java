package com.wh.mapper;

import com.wh.pojo.Address;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AddressMapper extends tk.mybatis.mapper.common.Mapper<Address> {
    List<Address> findAddressListByParentId(@Param("parentId")Integer parentId);
}

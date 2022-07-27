package com.wh.service;

import com.wh.pojo.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressService {
    List<Address> findAddressListByParentId(Integer parentId);
}

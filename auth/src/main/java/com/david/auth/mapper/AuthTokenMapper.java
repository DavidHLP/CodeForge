package com.david.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.david.auth.entity.AuthToken;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthTokenMapper extends BaseMapper<AuthToken> {
}

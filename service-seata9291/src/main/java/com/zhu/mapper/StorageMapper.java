package com.zhu.mapper;

import com.zhu.model.Storage;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StorageMapper {
	void decri(Storage storage);
}

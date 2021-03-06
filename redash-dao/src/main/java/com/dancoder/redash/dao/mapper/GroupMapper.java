package com.dancoder.redash.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dancoder.redash.dao.entity.GroupDO;

import java.util.List;

/**
 * @author dancoder
 */
public interface GroupMapper extends BaseMapper<GroupDO> {

    /**
     * 获取全部group
     * @return
     */
    List<GroupDO> getAll();

    /**
     * 根据id获取group
     * @param id
     * @return
     */
    GroupDO getById(Long id);
}

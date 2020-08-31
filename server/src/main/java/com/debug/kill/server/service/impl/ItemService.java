package com.debug.kill.server.service.impl;

import com.debug.kill.model.entity.ItemKill;
import com.debug.kill.model.mapper.ItemKillMapper;
import com.debug.kill.server.service.IItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService implements IItemService {

    private static final Logger logger = LoggerFactory.getLogger(IItemService.class);

    @Autowired
    private ItemKillMapper itemKillMapper;
    //获取待秒杀商品列表
    @Override
    public List<ItemKill> getKillItems() throws Exception {
        return itemKillMapper.selectAll();
    }
}

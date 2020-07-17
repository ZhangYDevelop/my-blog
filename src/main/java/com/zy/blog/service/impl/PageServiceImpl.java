package com.zy.blog.service.impl;

import com.zy.blog.service.PageService;
import com.zy.blog.entity.Page;
import com.zy.blog.mapper.PageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author zhangyu
 * @date 2017/9/7
 */
@Service
public class PageServiceImpl implements PageService {

    @Autowired(required = false)
    private PageMapper pageMapper;

    @Override
    public Page getPageByKey(Integer status, String key) {
        return pageMapper.getPageByKey(status, key);
    }

    @Override
    public Page getPageById(Integer id) {
        return pageMapper.getPageById(id);
    }

    @Override
    public List<Page> listPage(Integer status) {
        return pageMapper.listPage(status);
    }


    @Override
    public void insertPage(Page page) {
        pageMapper.insert(page);
    }

    @Override
    public void deletePage(Integer id) {
        pageMapper.deleteById(id);
    }

    @Override
    public void updatePage(Page page) {
        pageMapper.update(page);
    }
}

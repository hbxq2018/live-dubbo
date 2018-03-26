package com.xq.live.dubbo.vo.in;

import java.io.Serializable;

/**
 * @package: com.xq.live.dubbo.vo.in
 * @description: 基础入参
 * @author: zhangpeng32
 * @date: 2018/3/25 12:30
 * @version: 1.0
 */
public class BaseInVo implements Serializable {
    private Integer page = 1;   //当前页

    private Integer start;

    private Integer rows = 10;
    /**
     * 搜索关键字
     */
    private String searchKey;

    public Integer getStart() {
        start = rows * (page - 1);
        return start;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }
}

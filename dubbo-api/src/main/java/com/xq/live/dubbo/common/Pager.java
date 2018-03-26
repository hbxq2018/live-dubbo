package com.xq.live.dubbo.common;/**
 * 分页对象
 *
 * @author zhangpeng32
 * @create 2018-02-05 19:31
 */

import java.io.Serializable;
import java.util.List;

/**
 * 分页对象
 *
 * @author zhangpeng32
 * @create 2018-02-05 19:31
 **/
public class Pager<T> implements Serializable {
    private int start; // start表示当前页开始的记录数,start=每页行数*(当前页数-1)
//    private int end; // 当前页结束的记录行数
    private int total; // 总行数
    private int rows = 10; // 每页行数，默认5
    private int page; // 当前页数
//    private int pageListSize = 6;// 页码列表大小，默认6
//    private List<Integer> pageNumList = new ArrayList<Integer>();
    private List<T> list;

    public Pager() {
        start = 0;
        page = 1;
        this.total = 0;
    }

    public Pager(int total) {
        start = 0;
        page = 1;
        this.total = total;
    }

    public Pager(int total, int rows) {
        start = 0;
        this.total = total;
        page = 1;
        if (rows > 0) {
            this.rows = rows;
        }
    }

    /**
     * 执行翻页动作
     *
     * @param currentPage 要翻到的目标页码
     * @return 返回翻页对象
     */
/*    public Pager doPagination(int currentPage) {
        gotoPage(currentPage);
        return this;
    }*/

    // 设置起始数
    public int getStart() {
        start = rows * (page - 1);
        return start;
    }

    // 得到起始数
    public void setStart(int start) {
        if (start < 0) {
            this.start = 0;
        } else if (start >= this.total) {
            this.start = this.total - 1;
        } else {
            this.start = start;
        }
    }

    // 设置当前页的最后一行的在总记录中的顺序(从0开始)
//    public void setEnd(int end) {
//        this.end = end;
//    }
/*
    // 得到当前页的最后一行的在总记录中的顺序(从0开始)
    public int getEnd() {
        if (rows * page > this.total) {
            end = this.total - 1;
        } else {
            end = rows * page - 1;
        }
        return end;
    }*/

    // 以下4个方法供控制器(struts)调用

    // 判断能否到第一页;只要能到上一页，肯定就有第一页
    public boolean firstEnable() {
        return previousEnable();
    }

    // 判断能否到上一页
    public boolean previousEnable() {
        return page > 1;// 只要不是第一页，就能到上一页
    }

    // 判断能否到下一页
    public boolean nextEnable() {
        return page * rows < this.total;
    }

    // 判断能否到最后一页；只要有下一页，就肯定有最后一页.
    public boolean lastEnable() {
        return nextEnable();
    }

    // 跳到第一页
    public void firstPage() {
        page = 1;
    }

    // 跳到上一页
    public void previousPage(int cPage) {
        page = (cPage - 1) > 0 ? (cPage - 1) : 1;
    }

    // 跳到下一页
    public void nextPage(int cPage) {
        page = cPage + 1;
        if (page * rows > this.total) {
            lastPage();
        }
    }

    // 跳到最后一页
    public void lastPage() {
        if (this.total % rows == 0) {
            page = this.total / rows;
        } else {
            page = this.total / rows + 1;
        }
    }

/*    // 跳到指定的某一页
    public void gotoPage(int pageNumber) {
        if (pageNumber <= 1) {
            page = 1;
        } else if (getTotal() < this.getRows()) {
            page = 1;
        } else if (pageNumber * rows >= this.total) {
            lastPage();
        } else {
            page = pageNumber;
        }
    }*/

    // 设置总行数
    public void setTotal(int total) {
        this.total = total;
    }

    // 得到总行数
    public int getTotal() {
        return total;
    }

    // 设置每页行数
    public void setRows(int rows) {
        this.rows = rows;
    }

    // 得到每页行数
    public int getRows() {
        return rows;
    }

    // 得到总页数
    public int getPages() {
        if (this.total % rows == 0)
            return this.total / rows;
        else
            return this.total / rows + 1;
    }

    // 得到当前页数
    public int getPage() {
        return page;
    }

    // 设置当前页数
    public void setPage(int page) {
        this.page = page;
    }

//    public int getPageListSize() {
//        return pageListSize;
//    }
//
//    // 设置页码列表大小
//    public void setPageListSize(int pageListSize) {
//        this.pageListSize = pageListSize;
//    }

    // 得到页面列表
/*    public List<Integer> getPageNumList() {
        this.pageNumList.removeAll(this.pageNumList);// 设置之前先清空
        int totalPage = getPages();
        if (totalPage > this.pageListSize) {
            int halfSize = this.pageListSize / 2;
            int first = 1;
            int end = 1;
            if (this.page - halfSize < 1) { // 当前页靠近最小数1
                first = 1;
                end = this.pageListSize;
            } else if (totalPage - this.page < halfSize) { // 当前页靠近最大数
                first = totalPage - this.pageListSize + 1;
                end = totalPage;
            } else {
                first = this.page - halfSize;
                end = this.page + halfSize;
            }
            for (int i = first; i <= end; i++) {
                this.pageNumList.add(i);
            }
        } else {
            for (int i = 0; i < totalPage; i++) {
                this.pageNumList.add(i + 1);
            }
        }

        return pageNumList;
    }*/

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}

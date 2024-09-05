package com.example.demo.commons.results;

import com.example.demo.entity.Dish;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> {
    /**
     *接收的数据
     */
    private int currentPage = 1;
    private int pageSize = 10;

    /**
     * 解析的数据
     */
    private int prevPage;
    private int nextPage;
    private int endPage;

    /**
     * SQL查询的数据
     */
    private int total;
    private List<T> list;

    public PageResult(int currentPage, int pageSize,int total,List<T> list) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.total = total;
        this.list = list;
        //计算总页数
        this.endPage = total % pageSize == 0 ? total/pageSize : total/pageSize + 1;
        //计算按上一页下一页
        this.prevPage = currentPage - 1 >= 0 ? currentPage-1 : currentPage;
        this.nextPage = currentPage + 1 <= total ? currentPage+1 : currentPage;
    }

}

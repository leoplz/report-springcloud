package com.leojack.utils;

import com.leojack.Enum.EffectOn;

/**
 * @author leojack
 * @message 公共调用的查询类,用于组装dao层的查询条件
 */
public class SearchAble {

    private static SearchAble searchAble;

    private  SearchFilter searchFilter;

    static SearchAble getSearchAble() {

        if(searchAble == null){
            searchAble = new SearchAble(null);
            return searchAble;
        }else {
            return searchAble;
        }
    }

    private SearchAble(SearchFilter searchFilter){
        this.searchFilter =searchFilter;
    }


    public SearchAble addSearchFilter( String property , EffectOn effectOn , Object value ){
        SearchFilter searchFilter = new SearchFilter(effectOn, property, value, searchAble.getSearchFilter());
        searchAble.setSearchFilter(searchFilter);
        return searchAble;

    }

    private void setSearchFilter(SearchFilter searchFilter) {
        this.searchFilter = searchFilter;
    }

    private SearchFilter getSearchFilter() {
        return searchFilter;
    }

}

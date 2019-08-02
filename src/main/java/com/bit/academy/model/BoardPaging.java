package com.bit.academy.model;

import java.util.ArrayList;
import java.util.List;

public class BoardPaging {
    private int totalCount; // 전체 게시물 개수
    private int currentPage; // 현재 페이지 번호
    private int articleCount = 20; // 한 페이지당 게시물 갯수
    private int pageCount = 5; // 1 2 3 4 5 표시될 페이지 개수\
    private int prevPage;
    private int limitBegin;
    private int nextPage; // 다음 페이지
    private int beginPage; // 첫 페이지
    private int lastPage; // 마지막 페이지
    private List<Integer> pageRange; // 표시될 페이지 번호 list

    public List<Integer> getPageRange() {
        pageRange = new ArrayList<>();

        int begin = currentPage / pageCount * pageCount + 1;

        //수정//
        if(currentPage%pageCount==0){
            begin-=pageCount;
        }

        int end = begin + pageCount -1 ;

        if(end>getLastPage()){
            end = getLastPage();
        }

        for( int i=begin ; i <= end ; i++){
            pageRange.add(i);
        }

        return pageRange;
    }

    public void setPageRange(List<Integer> pageRange) {
        this.pageRange = pageRange;
    }

    private String searchKeyword; // 검색어

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(int articleCount) {
        this.articleCount = articleCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPrevPage() {
        this.prevPage = this.getPageRange().get(0);
        return prevPage;
    }

    public void setPrevPage(int prevPage) {
        this.prevPage = prevPage;
    }

    public int getLimitBegin() {
        return limitBegin;
    }

    public void setLimitBegin(int limitBegin) {
        this.limitBegin = limitBegin;
    }


    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getBeginPage() {
        return beginPage;
    }

    public void setBeginPage(int beginPage) {
        this.beginPage = beginPage;
    }

    public int getLastPage() {
        return lastPage;
    }

    public void setLastPage(int lastPage) {
        this.lastPage = lastPage;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }
}

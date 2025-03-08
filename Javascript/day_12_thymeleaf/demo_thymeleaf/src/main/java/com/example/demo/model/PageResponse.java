package com.example.demo.model;

import java.util.List;

public class PageResponse<T> {
    private int pageSize;
    private int currentPage;
    private List<T> resourses;

    public PageResponse() {
    }

    public PageResponse(List<T> resourses, int pageSize, int currentPage) {

        this.resourses = resourses;
        this.pageSize = pageSize;
        this.currentPage = currentPage;
    }

    public int getTotalPages() {
        return (int) Math.ceil((double) resourses.size() / pageSize);
    }

    public List<T> getData(){
        int startIndex = (currentPage - 1)+pageSize;
        int endIndex = Math.min(startIndex + pageSize, resourses.size());
        return resourses.subList(startIndex, endIndex);
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}

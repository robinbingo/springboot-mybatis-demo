package com.example.demo.model;

/**
 * @author Robin
 * @create 2017-12-15 16:15
 * @desc 表格列信息
 **/
public class ColumnInfo {
    private String columnName;
    private String columnComment;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }
}

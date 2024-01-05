package com.olexyn.about.java.spring.jpa.util;

import java.util.List;

public class TableDto {

    private List<List<String>> table = null;

    private TableDto() { }

    public TableDto(List<List<String>> input) {
        this.table = input;
    }

    public List<List<String>> getTable() {
        return table;
    }
}

package com.tenders.entity;

import java.util.List;

public class Item {
    private Integer id;
    private String name;
    private String type;
    private Category category;
    private List<Bid> bids;
}

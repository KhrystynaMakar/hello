package com.tenders.entity;

import java.util.Date;

public class Bid {
    private Integer id;
    private User seller;
    private Double price;
    private String description;
    private Tender tender;
    private Date date;
}

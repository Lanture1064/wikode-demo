package com.wikode.data.demo.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class EntryVersion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    private Integer belongedEntryID;
    private String content;
    private String uploader;
    private Timestamp uploadTime;
}

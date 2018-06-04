package com.example.lengary_l.wanandroid.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArticleCatgDetailData {
    @Expose
    @SerializedName("children")
    private List<ArticleCatgDetailData> children;
    @Expose
    @SerializedName("courseId")
    private int courseId;
    @Expose
    @SerializedName("id")
    private int id;
    @Expose
    @SerializedName("name")
    private String name;
    @Expose
    @SerializedName("order")
    private int order;
    @Expose
    @SerializedName("parentChapterId")
    private int parentChapterId;
    @Expose
    @SerializedName("visible")
    private int visible;
}

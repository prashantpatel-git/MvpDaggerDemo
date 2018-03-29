package com.prashant.mvpdaggerdemo.models.item;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Concetto Labs on 13-Dec-17.
 */
public class Item {

    @SerializedName("id")
    private
    String id;

    @SerializedName("event_type")
    private
    String eventType;

    @SerializedName("name_en")
    private
    String eventNameEng;

    @SerializedName("name_ch")
    private
    String eventNameChi;

    @SerializedName("desc_en")
    private
    String eventDescEng = "";

    @SerializedName("desc_ch")
    private
    String eventDescChi = "";

    @SerializedName("user_id")
    private
    String userId;

    @SerializedName("from_date")
    private
    String fromDate;

    @SerializedName("to_date")
    private
    String toDate;

    @SerializedName("entity_type_id")
    private
    String entityTypeId;

    @SerializedName("item_title_en")
    private
    String eventItemTitleEn;

    @SerializedName("item_title_ch")
    private
    String eventItemTitleChi;

    @SerializedName("item_short_desc_en")
    private
    String eventItemShortDescEn;

    @SerializedName("item_short_desc_ch")
    private
    String eventItemShortDescChi;

    @SerializedName("item_detail")
    private
    ItemDetail itemDetail;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }


    public String getEventNameChi() {
        return eventNameChi;
    }

    public void setEventNameChi(String eventNameChi) {
        this.eventNameChi = eventNameChi;
    }

    public String getEventDescEng() {
        return eventDescEng;
    }

    public void setEventDescEng(String eventDescEng) {
        this.eventDescEng = eventDescEng;
    }

    public String getEventDescChi() {
        return eventDescChi;
    }

    public void setEventDescChi(String eventDescChi) {
        this.eventDescChi = eventDescChi;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getEntityTypeId() {
        return entityTypeId;
    }

    public void setEntityTypeId(String entityTypeId) {
        this.entityTypeId = entityTypeId;
    }

    public String getEventItemTitleEn() {
        return eventItemTitleEn;
    }

    public void setEventItemTitleEn(String eventItemTitleEn) {
        this.eventItemTitleEn = eventItemTitleEn;
    }

    public String getEventItemTitleChi() {
        return eventItemTitleChi;
    }

    public void setEventItemTitleChi(String eventItemTitleChi) {
        this.eventItemTitleChi = eventItemTitleChi;
    }

    public String getEventItemShortDescEn() {
        return eventItemShortDescEn;
    }

    public void setEventItemShortDescEn(String eventItemShortDescEn) {
        this.eventItemShortDescEn = eventItemShortDescEn;
    }

    public String getEventItemShortDescChi() {
        return eventItemShortDescChi;
    }

    public void setEventItemShortDescChi(String eventItemShortDescChi) {
        this.eventItemShortDescChi = eventItemShortDescChi;
    }

    public ItemDetail getItemDetail() {
        return itemDetail;
    }

    public void setItemDetail(ItemDetail itemDetail) {
        this.itemDetail = itemDetail;
    }


}

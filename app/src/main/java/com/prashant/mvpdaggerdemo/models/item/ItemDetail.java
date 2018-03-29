package com.prashant.mvpdaggerdemo.models.item;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Concetto Labs on 13-Dec-17.
 */
public class ItemDetail {

    @SerializedName("is_share")
    String isShare;
    @SerializedName("share_link")
    String shareLink;
    @SerializedName("id")
    private
    String id;
    @SerializedName("uuid")
    private
    String uuid;
    @SerializedName("photo")
    private
    String photo;
    @SerializedName("notification")
    private
    String notification;
    @SerializedName("noti_title")
    private
    String notiTitle;
    @SerializedName("noti_detail")
    private
    String notiDetail;
    @SerializedName("push_notification")
    private
    String pushNotification;
    @SerializedName("push_date")
    private
    String pushDate;
    @SerializedName("run_at")
    private
    String runAt;
    @SerializedName("status")
    private
    String status;
    @SerializedName("reminder")
    private
    String reminder;
    @SerializedName("reminder_day")
    private
    String reminderDay;
    @SerializedName("created_at")
    private
    String createdAt;
    @SerializedName("updated_at")
    private
    String updatedAt;
    @SerializedName("deleted_at")
    private
    String deletedAt;
    @SerializedName("likes")
    private
    String likes;
    @SerializedName("is_like")
    private
    String isLike;
    @SerializedName("notice_id")
    private
    String noticeId;

    @SerializedName("notice_response_id")
    private
    String noticeResponseId;

    @SerializedName("name_en")
    private
    String nameEn;

    @SerializedName("name_ch")
    private
    String nameCh;

    @SerializedName("desc_en")
    private
    String descEn;

    @SerializedName("desc_ch")
    private
    String descCh;

    @SerializedName("from_date")
    private
    String fromDate;

    @SerializedName("to_date")
    private
    String toDate;


    @SerializedName("user_id")
    private
    String userId;

    @SerializedName("acceptance")
    private
    String acceptance;

    @SerializedName("category_id")
    private
    String categoryId;

    @SerializedName("pdf")
    private
    String pdf;

    @SerializedName("response")
    private
    String response;

    @SerializedName("view_count")
    private
    String viewCounts;


    public String getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeResponseId() {
        return noticeResponseId;
    }

    public void setNoticeResponseId(String noticeResponseId) {
        this.noticeResponseId = noticeResponseId;
    }

    public String getAcceptance() {
        return acceptance;
    }

    public void setAcceptance(String acceptance) {
        this.acceptance = acceptance;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getNotiTitle() {
        return notiTitle;
    }

    public void setNotiTitle(String notiTitle) {
        this.notiTitle = notiTitle;
    }

    public String getNotiDetail() {
        return notiDetail;
    }

    public void setNotiDetail(String notiDetail) {
        this.notiDetail = notiDetail;
    }

    public String getPushNotification() {
        return pushNotification;
    }

    public void setPushNotification(String pushNotification) {
        this.pushNotification = pushNotification;
    }

    public String getPushDate() {
        return pushDate;
    }

    public void setPushDate(String pushDate) {
        this.pushDate = pushDate;
    }

    public String getRunAt() {
        return runAt;
    }

    public void setRunAt(String runAt) {
        this.runAt = runAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReminder() {
        return reminder;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }

    public String getReminderDay() {
        return reminderDay;
    }

    public void setReminderDay(String reminderDay) {
        this.reminderDay = reminderDay;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameCh() {
        return nameCh;
    }

    public void setNameCh(String nameCh) {
        this.nameCh = nameCh;
    }

    public String getDescEn() {
        return descEn;
    }

    public void setDescEn(String descEn) {
        this.descEn = descEn;
    }

    public String getDescCh() {
        return descCh;
    }

    public void setDescCh(String descCh) {
        this.descCh = descCh;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getIsLike() {
        return isLike;
    }

    public void setIsLike(String isLike) {
        this.isLike = isLike;
    }

    public String getViewCounts() {
        return viewCounts;
    }

    public void setViewCounts(String viewCounts) {
        this.viewCounts = viewCounts;
    }

    public String getIsShare() {
        return isShare;
    }

    public void setIsShare(String isShare) {
        this.isShare = isShare;
    }

    public String getShareLink() {
        return shareLink;
    }

    public void setShareLink(String shareLink) {
        this.shareLink = shareLink;
    }

}

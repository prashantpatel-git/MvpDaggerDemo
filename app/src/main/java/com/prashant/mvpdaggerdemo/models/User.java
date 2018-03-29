package com.prashant.mvpdaggerdemo.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.File;

/**
 * Created by Concetto Labs on 28-Jun-17.
 */

@SuppressWarnings("ALL")
public class User {


    @SerializedName("company_name")
    private String companyName;

    @SerializedName("fullName")
    private String fullName;


    @SerializedName("userId")
    private String userId;


    @SerializedName("username")
    private String username;


    @SerializedName("device_id")
    private String deviceToken;


    @SerializedName("email")
    private String email;


    @SerializedName("password")
    private String password;

    @SerializedName("new_password")
    private String newPassword;

    @SerializedName("old_password")
    private String oldPassword;

    @SerializedName("api_token")
    private String apiToken;


    @SerializedName("device_type")
    private String deviceType = "1";


    @SerializedName("first_name")
    private String firstName;


    @SerializedName("last_name")
    private String lastName;


    @SerializedName("dob")
    private String dateOfBirth;


    @SerializedName("phone_no")
    private String phoneNo;


    @SerializedName("age")
    private String age;


    @SerializedName("licence_number")
    private String licenceNumber;


    @SerializedName("city_id")
    private String cityId;


    @SerializedName("state_id")
    private String stateId;


    @SerializedName("country_id")
    private String countryId;


    @SerializedName("postcode")
    private String postcode;

    @Expose
    @SerializedName("license_exp_date")
    private String licenseExpiryDate;


    @SerializedName("resume_file")
    private File resume;


    @SerializedName("security_license_file")
    private File securityLicense;


    @SerializedName("smartserve_file")
    private File smartServe;


    @SerializedName("whimis_file")
    private File whimis;


    @SerializedName("first_aid_cpr_file")
    private File firstAidCpr;

    @SerializedName("profile_pic_file")
    private File profilePic;

    @SerializedName("resume")
    private String strResume;


    @SerializedName("security_license")
    private String strSecurityLicense = "";


    @SerializedName("smartserve")
    private String strSmartServe = "";


    @SerializedName("whimis")
    private String strWhimis = "";


    @SerializedName("first_aid_cpr")
    private String strFirstAidCpr = "";


    @SerializedName("profile_pic")
    private String strProfilePic = "";


    //@SerializedName("locality")
    // private String locality;


    @SerializedName("address")
    private String address;


    @SerializedName("entity_type_id")
    private String entityTypeId;


    @SerializedName("entity_id")
    private String entityId;


    @SerializedName("latitude")
    private double latitude;


    @SerializedName("longitude")
    private double longitude;

    private String result;

    private String apiResponseStatus;

    @SerializedName("timeago")
    private String timeAgo;

    @SerializedName("city_name")
    private String cityName;

    @SerializedName("state_name")
    private String stateName;

    @SerializedName("country_name")
    private String countryName;

    @SerializedName("rating")
    private String rating;

    @SerializedName("smartserve_exp_date")
    private String smartserveExpDate;

    @SerializedName("whimis_exp_date")
    private String whimisExpDate;

    @SerializedName("fac_exp_date")
    private String facExpDate;

    @SerializedName("otp")
    private String otp;

    @SerializedName("otp_verified")
    private String otpVerified;

    @SerializedName("payoneer_user_id")
    private String payoneerUserId;

    @SerializedName("payoneer_account_id")
    private String payoneerAccountId;

    @SerializedName("active")
    private String active;

    @SerializedName("date")
    private String date;

    @SerializedName("tshirt")
    private String tshirtSize;

        @SerializedName("is_appadmin")
        private int appAdmin;

        public int getAppAdmin() {
                return appAdmin;
        }

        public void setAppAdmin(int appAdmin) {
                this.appAdmin = appAdmin;
        }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getSmartserveExpDate() {
        return smartserveExpDate;
    }

    public void setSmartserveExpDate(String smartserveExpDate) {
        this.smartserveExpDate = smartserveExpDate;
    }

    public String getWhimisExpDate() {
        return whimisExpDate;
    }

    public void setWhimisExpDate(String whimisExpDate) {
        this.whimisExpDate = whimisExpDate;
    }

    public String getFacExpDate() {
        return facExpDate;
    }

    public void setFacExpDate(String facExpDate) {
        this.facExpDate = facExpDate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public File getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(File profilePic) {
        this.profilePic = profilePic;
    }

    public String getTimeAgo() {
        return timeAgo;
    }

    public void setTimeAgo(String timeAgo) {
        this.timeAgo = timeAgo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getStrResume() {
        return strResume;
    }

    public void setStrResume(String strResume) {
        this.strResume = strResume;
    }

    public String getStrSecurityLicense() {
        return strSecurityLicense;
    }

    public void setStrSecurityLicense(String strSecurityLicense) {
        this.strSecurityLicense = strSecurityLicense;
    }

    public String getStrSmartServe() {
        return strSmartServe;
    }

    public void setStrSmartServe(String strSmartServe) {
        this.strSmartServe = strSmartServe;
    }

    public String getStrWhimis() {
        return strWhimis;
    }

    public void setStrWhimis(String strWhimis) {
        this.strWhimis = strWhimis;
    }

    public String getStrFirstAidCpr() {
        return strFirstAidCpr;
    }

    public void setStrFirstAidCpr(String strFirstAidCpr) {
        this.strFirstAidCpr = strFirstAidCpr;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public String getEntityTypeId() {
        return entityTypeId;
    }

    public void setEntityTypeId(String entityTypeId) {
        this.entityTypeId = entityTypeId;
    }

    public String getApiResponseStatus() {
        return apiResponseStatus;
    }

    public void setApiResponseStatus(String apiResponseStatus) {
        this.apiResponseStatus = apiResponseStatus;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    /* public String getLocality() {
         return locality;
     }

     public void setLocality(String locality) {
         this.locality = locality;
     }
 */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getLicenseExpiryDate() {
        return licenseExpiryDate;
    }

    public void setLicenseExpiryDate(String licenseExpiryDate) {
        this.licenseExpiryDate = licenseExpiryDate;
    }

    public File getResume() {
        return resume;
    }

    public void setResume(File resume) {
        this.resume = resume;
    }

    public File getSecurityLicense() {
        return securityLicense;
    }

    public void setSecurityLicense(File securityLicense) {
        this.securityLicense = securityLicense;
    }

    public File getSmartServe() {
        return smartServe;
    }

    public void setSmartServe(File smartServe) {
        this.smartServe = smartServe;
    }

    public File getWhimis() {
        return whimis;
    }

    public void setWhimis(File whimis) {
        this.whimis = whimis;
    }

    public File getFirstAidCpr() {
        return firstAidCpr;
    }

    public void setFirstAidCpr(File firstAidCpr) {
        this.firstAidCpr = firstAidCpr;
    }

    public String getStrProfilePic() {
        return strProfilePic;
    }

    public void setStrProfilePic(String strProfilePic) {
        this.strProfilePic = strProfilePic;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getOtpVerified() {
        return otpVerified;
    }

    public void setOtpVerified(String otpVerified) {
        this.otpVerified = otpVerified;
    }

    public String getTshirtSize() {
        return tshirtSize;
    }

    public void setTshirtSize(String tshirtSize) {
        this.tshirtSize = tshirtSize;
    }
}

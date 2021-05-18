/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PullSmsSendStatus extends AbstractModel{

    /**
    * 用户实际接收到短信的时间，UNIX 时间戳（单位：秒）。
    */
    @SerializedName("UserReceiveTime")
    @Expose
    private Long UserReceiveTime;

    /**
    * 国家（或地区）码。
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * 用户号码，普通格式，示例如：13711112222。
    */
    @SerializedName("SubscriberNumber")
    @Expose
    private String SubscriberNumber;

    /**
    * 手机号码，E.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 本次发送标识 ID。
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * 实际是否收到短信接收状态，SUCCESS（成功）、FAIL（失败）。
    */
    @SerializedName("ReportStatus")
    @Expose
    private String ReportStatus;

    /**
    * 用户接收短信状态描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 用户实际接收到短信的时间，UNIX 时间戳（单位：秒）。 
     * @return UserReceiveTime 用户实际接收到短信的时间，UNIX 时间戳（单位：秒）。
     */
    public Long getUserReceiveTime() {
        return this.UserReceiveTime;
    }

    /**
     * Set 用户实际接收到短信的时间，UNIX 时间戳（单位：秒）。
     * @param UserReceiveTime 用户实际接收到短信的时间，UNIX 时间戳（单位：秒）。
     */
    public void setUserReceiveTime(Long UserReceiveTime) {
        this.UserReceiveTime = UserReceiveTime;
    }

    /**
     * Get 国家（或地区）码。 
     * @return CountryCode 国家（或地区）码。
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set 国家（或地区）码。
     * @param CountryCode 国家（或地区）码。
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get 用户号码，普通格式，示例如：13711112222。 
     * @return SubscriberNumber 用户号码，普通格式，示例如：13711112222。
     */
    public String getSubscriberNumber() {
        return this.SubscriberNumber;
    }

    /**
     * Set 用户号码，普通格式，示例如：13711112222。
     * @param SubscriberNumber 用户号码，普通格式，示例如：13711112222。
     */
    public void setSubscriberNumber(String SubscriberNumber) {
        this.SubscriberNumber = SubscriberNumber;
    }

    /**
     * Get 手机号码，E.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。 
     * @return PhoneNumber 手机号码，E.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 手机号码，E.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
     * @param PhoneNumber 手机号码，E.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 本次发送标识 ID。 
     * @return SerialNo 本次发送标识 ID。
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set 本次发送标识 ID。
     * @param SerialNo 本次发送标识 ID。
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get 实际是否收到短信接收状态，SUCCESS（成功）、FAIL（失败）。 
     * @return ReportStatus 实际是否收到短信接收状态，SUCCESS（成功）、FAIL（失败）。
     */
    public String getReportStatus() {
        return this.ReportStatus;
    }

    /**
     * Set 实际是否收到短信接收状态，SUCCESS（成功）、FAIL（失败）。
     * @param ReportStatus 实际是否收到短信接收状态，SUCCESS（成功）、FAIL（失败）。
     */
    public void setReportStatus(String ReportStatus) {
        this.ReportStatus = ReportStatus;
    }

    /**
     * Get 用户接收短信状态描述。 
     * @return Description 用户接收短信状态描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 用户接收短信状态描述。
     * @param Description 用户接收短信状态描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public PullSmsSendStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PullSmsSendStatus(PullSmsSendStatus source) {
        if (source.UserReceiveTime != null) {
            this.UserReceiveTime = new Long(source.UserReceiveTime);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new String(source.CountryCode);
        }
        if (source.SubscriberNumber != null) {
            this.SubscriberNumber = new String(source.SubscriberNumber);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.SerialNo != null) {
            this.SerialNo = new String(source.SerialNo);
        }
        if (source.ReportStatus != null) {
            this.ReportStatus = new String(source.ReportStatus);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserReceiveTime", this.UserReceiveTime);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "SubscriberNumber", this.SubscriberNumber);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "SerialNo", this.SerialNo);
        this.setParamSimple(map, prefix + "ReportStatus", this.ReportStatus);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}


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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PullSmsSendStatus extends AbstractModel {

    /**
    * 用户实际接收到短信的时间。
    */
    @SerializedName("UserReceiveTime")
    @Expose
    private String UserReceiveTime;

    /**
    * 用户实际接收到短信的时间，UNIX 时间戳（单位：秒）。
    */
    @SerializedName("UserReceiveUnixTime")
    @Expose
    private Long UserReceiveUnixTime;

    /**
    * 国家（或地区）码。
    */
    @SerializedName("NationCode")
    @Expose
    private String NationCode;

    /**
    * 手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8618501234444， 其中前面有一个+号 ，86为国家码，18501234444为手机号。
    */
    @SerializedName("PurePhoneNumber")
    @Expose
    private String PurePhoneNumber;

    /**
    * 手机号码，普通格式，示例如：18501234444。
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
     * Get 用户实际接收到短信的时间。 
     * @return UserReceiveTime 用户实际接收到短信的时间。
     */
    public String getUserReceiveTime() {
        return this.UserReceiveTime;
    }

    /**
     * Set 用户实际接收到短信的时间。
     * @param UserReceiveTime 用户实际接收到短信的时间。
     */
    public void setUserReceiveTime(String UserReceiveTime) {
        this.UserReceiveTime = UserReceiveTime;
    }

    /**
     * Get 用户实际接收到短信的时间，UNIX 时间戳（单位：秒）。 
     * @return UserReceiveUnixTime 用户实际接收到短信的时间，UNIX 时间戳（单位：秒）。
     */
    public Long getUserReceiveUnixTime() {
        return this.UserReceiveUnixTime;
    }

    /**
     * Set 用户实际接收到短信的时间，UNIX 时间戳（单位：秒）。
     * @param UserReceiveUnixTime 用户实际接收到短信的时间，UNIX 时间戳（单位：秒）。
     */
    public void setUserReceiveUnixTime(Long UserReceiveUnixTime) {
        this.UserReceiveUnixTime = UserReceiveUnixTime;
    }

    /**
     * Get 国家（或地区）码。 
     * @return NationCode 国家（或地区）码。
     */
    public String getNationCode() {
        return this.NationCode;
    }

    /**
     * Set 国家（或地区）码。
     * @param NationCode 国家（或地区）码。
     */
    public void setNationCode(String NationCode) {
        this.NationCode = NationCode;
    }

    /**
     * Get 手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8618501234444， 其中前面有一个+号 ，86为国家码，18501234444为手机号。 
     * @return PurePhoneNumber 手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8618501234444， 其中前面有一个+号 ，86为国家码，18501234444为手机号。
     */
    public String getPurePhoneNumber() {
        return this.PurePhoneNumber;
    }

    /**
     * Set 手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8618501234444， 其中前面有一个+号 ，86为国家码，18501234444为手机号。
     * @param PurePhoneNumber 手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8618501234444， 其中前面有一个+号 ，86为国家码，18501234444为手机号。
     */
    public void setPurePhoneNumber(String PurePhoneNumber) {
        this.PurePhoneNumber = PurePhoneNumber;
    }

    /**
     * Get 手机号码，普通格式，示例如：18501234444。 
     * @return PhoneNumber 手机号码，普通格式，示例如：18501234444。
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 手机号码，普通格式，示例如：18501234444。
     * @param PhoneNumber 手机号码，普通格式，示例如：18501234444。
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
            this.UserReceiveTime = new String(source.UserReceiveTime);
        }
        if (source.UserReceiveUnixTime != null) {
            this.UserReceiveUnixTime = new Long(source.UserReceiveUnixTime);
        }
        if (source.NationCode != null) {
            this.NationCode = new String(source.NationCode);
        }
        if (source.PurePhoneNumber != null) {
            this.PurePhoneNumber = new String(source.PurePhoneNumber);
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
        this.setParamSimple(map, prefix + "UserReceiveUnixTime", this.UserReceiveUnixTime);
        this.setParamSimple(map, prefix + "NationCode", this.NationCode);
        this.setParamSimple(map, prefix + "PurePhoneNumber", this.PurePhoneNumber);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "SerialNo", this.SerialNo);
        this.setParamSimple(map, prefix + "ReportStatus", this.ReportStatus);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}


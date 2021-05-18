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

public class PullSmsReplyStatus extends AbstractModel{

    /**
    * 短信码号扩展号，默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81)。
    */
    @SerializedName("ExtendCode")
    @Expose
    private String ExtendCode;

    /**
    * 国家（或地区）码。
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * 手机号码，E.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 短信签名名称。
    */
    @SerializedName("SignName")
    @Expose
    private String SignName;

    /**
    * 用户回复的内容。
    */
    @SerializedName("ReplyContent")
    @Expose
    private String ReplyContent;

    /**
    * 回复时间，UNIX 时间戳（单位：秒）。
    */
    @SerializedName("ReplyTime")
    @Expose
    private Long ReplyTime;

    /**
    * 用户号码，普通格式，示例如：13711112222。
    */
    @SerializedName("SubscriberNumber")
    @Expose
    private String SubscriberNumber;

    /**
     * Get 短信码号扩展号，默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81)。 
     * @return ExtendCode 短信码号扩展号，默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81)。
     */
    public String getExtendCode() {
        return this.ExtendCode;
    }

    /**
     * Set 短信码号扩展号，默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81)。
     * @param ExtendCode 短信码号扩展号，默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81)。
     */
    public void setExtendCode(String ExtendCode) {
        this.ExtendCode = ExtendCode;
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
     * Get 短信签名名称。 
     * @return SignName 短信签名名称。
     */
    public String getSignName() {
        return this.SignName;
    }

    /**
     * Set 短信签名名称。
     * @param SignName 短信签名名称。
     */
    public void setSignName(String SignName) {
        this.SignName = SignName;
    }

    /**
     * Get 用户回复的内容。 
     * @return ReplyContent 用户回复的内容。
     */
    public String getReplyContent() {
        return this.ReplyContent;
    }

    /**
     * Set 用户回复的内容。
     * @param ReplyContent 用户回复的内容。
     */
    public void setReplyContent(String ReplyContent) {
        this.ReplyContent = ReplyContent;
    }

    /**
     * Get 回复时间，UNIX 时间戳（单位：秒）。 
     * @return ReplyTime 回复时间，UNIX 时间戳（单位：秒）。
     */
    public Long getReplyTime() {
        return this.ReplyTime;
    }

    /**
     * Set 回复时间，UNIX 时间戳（单位：秒）。
     * @param ReplyTime 回复时间，UNIX 时间戳（单位：秒）。
     */
    public void setReplyTime(Long ReplyTime) {
        this.ReplyTime = ReplyTime;
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

    public PullSmsReplyStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PullSmsReplyStatus(PullSmsReplyStatus source) {
        if (source.ExtendCode != null) {
            this.ExtendCode = new String(source.ExtendCode);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new String(source.CountryCode);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.SignName != null) {
            this.SignName = new String(source.SignName);
        }
        if (source.ReplyContent != null) {
            this.ReplyContent = new String(source.ReplyContent);
        }
        if (source.ReplyTime != null) {
            this.ReplyTime = new Long(source.ReplyTime);
        }
        if (source.SubscriberNumber != null) {
            this.SubscriberNumber = new String(source.SubscriberNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExtendCode", this.ExtendCode);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "SignName", this.SignName);
        this.setParamSimple(map, prefix + "ReplyContent", this.ReplyContent);
        this.setParamSimple(map, prefix + "ReplyTime", this.ReplyTime);
        this.setParamSimple(map, prefix + "SubscriberNumber", this.SubscriberNumber);

    }
}


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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PullSmsReplyStatus  extends AbstractModel{

    /**
    * 短信码号扩展号，默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773)
    */
    @SerializedName("ExtendCode")
    @Expose
    private Long ExtendCode;

    /**
    * 国家（或地区）码
    */
    @SerializedName("NationCode")
    @Expose
    private String NationCode;

    /**
    * 手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 短信签名
    */
    @SerializedName("Sign")
    @Expose
    private String Sign;

    /**
    * 用户回复的内容
    */
    @SerializedName("ReplyContent")
    @Expose
    private String ReplyContent;

    /**
    * 回复时间(例如：2019-10-08 17:18:37)
    */
    @SerializedName("ReplyTime")
    @Expose
    private String ReplyTime;

    /**
     * 获取短信码号扩展号，默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773)
     * @return ExtendCode 短信码号扩展号，默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773)
     */
    public Long getExtendCode() {
        return this.ExtendCode;
    }

    /**
     * 设置短信码号扩展号，默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773)
     * @param ExtendCode 短信码号扩展号，默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773)
     */
    public void setExtendCode(Long ExtendCode) {
        this.ExtendCode = ExtendCode;
    }

    /**
     * 获取国家（或地区）码
     * @return NationCode 国家（或地区）码
     */
    public String getNationCode() {
        return this.NationCode;
    }

    /**
     * 设置国家（或地区）码
     * @param NationCode 国家（或地区）码
     */
    public void setNationCode(String NationCode) {
        this.NationCode = NationCode;
    }

    /**
     * 获取手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号
     * @return PhoneNumber 手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * 设置手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号
     * @param PhoneNumber 手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * 获取短信签名
     * @return Sign 短信签名
     */
    public String getSign() {
        return this.Sign;
    }

    /**
     * 设置短信签名
     * @param Sign 短信签名
     */
    public void setSign(String Sign) {
        this.Sign = Sign;
    }

    /**
     * 获取用户回复的内容
     * @return ReplyContent 用户回复的内容
     */
    public String getReplyContent() {
        return this.ReplyContent;
    }

    /**
     * 设置用户回复的内容
     * @param ReplyContent 用户回复的内容
     */
    public void setReplyContent(String ReplyContent) {
        this.ReplyContent = ReplyContent;
    }

    /**
     * 获取回复时间(例如：2019-10-08 17:18:37)
     * @return ReplyTime 回复时间(例如：2019-10-08 17:18:37)
     */
    public String getReplyTime() {
        return this.ReplyTime;
    }

    /**
     * 设置回复时间(例如：2019-10-08 17:18:37)
     * @param ReplyTime 回复时间(例如：2019-10-08 17:18:37)
     */
    public void setReplyTime(String ReplyTime) {
        this.ReplyTime = ReplyTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExtendCode", this.ExtendCode);
        this.setParamSimple(map, prefix + "NationCode", this.NationCode);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "Sign", this.Sign);
        this.setParamSimple(map, prefix + "ReplyContent", this.ReplyContent);
        this.setParamSimple(map, prefix + "ReplyTime", this.ReplyTime);

    }
}


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

public class PullSmsSendStatusByPhoneNumberRequest extends AbstractModel{

    /**
    * 拉取起始时间，UNIX 时间戳（时间：秒）。
注：最大可拉取当前时期7天前的数据。
    */
    @SerializedName("SendDateTime")
    @Expose
    private Long SendDateTime;

    /**
    * 偏移量。
注：目前固定设置为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 拉取最大条数，最多 100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 下发目的手机号码，依据 e.164 标准为：+[国家（或地区）码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 短信SdkAppid在 [短信控制台](https://console.cloud.tencent.com/smsv2) 添加应用后生成的实际SdkAppid，例如1400006666。
    */
    @SerializedName("SmsSdkAppid")
    @Expose
    private String SmsSdkAppid;

    /**
    * 拉取截止时间，UNIX 时间戳（时间：秒）。
    */
    @SerializedName("EndDateTime")
    @Expose
    private Long EndDateTime;

    /**
     * Get 拉取起始时间，UNIX 时间戳（时间：秒）。
注：最大可拉取当前时期7天前的数据。 
     * @return SendDateTime 拉取起始时间，UNIX 时间戳（时间：秒）。
注：最大可拉取当前时期7天前的数据。
     */
    public Long getSendDateTime() {
        return this.SendDateTime;
    }

    /**
     * Set 拉取起始时间，UNIX 时间戳（时间：秒）。
注：最大可拉取当前时期7天前的数据。
     * @param SendDateTime 拉取起始时间，UNIX 时间戳（时间：秒）。
注：最大可拉取当前时期7天前的数据。
     */
    public void setSendDateTime(Long SendDateTime) {
        this.SendDateTime = SendDateTime;
    }

    /**
     * Get 偏移量。
注：目前固定设置为0。 
     * @return Offset 偏移量。
注：目前固定设置为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。
注：目前固定设置为0。
     * @param Offset 偏移量。
注：目前固定设置为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 拉取最大条数，最多 100。 
     * @return Limit 拉取最大条数，最多 100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 拉取最大条数，最多 100。
     * @param Limit 拉取最大条数，最多 100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 下发目的手机号码，依据 e.164 标准为：+[国家（或地区）码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。 
     * @return PhoneNumber 下发目的手机号码，依据 e.164 标准为：+[国家（或地区）码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 下发目的手机号码，依据 e.164 标准为：+[国家（或地区）码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
     * @param PhoneNumber 下发目的手机号码，依据 e.164 标准为：+[国家（或地区）码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 短信SdkAppid在 [短信控制台](https://console.cloud.tencent.com/smsv2) 添加应用后生成的实际SdkAppid，例如1400006666。 
     * @return SmsSdkAppid 短信SdkAppid在 [短信控制台](https://console.cloud.tencent.com/smsv2) 添加应用后生成的实际SdkAppid，例如1400006666。
     */
    public String getSmsSdkAppid() {
        return this.SmsSdkAppid;
    }

    /**
     * Set 短信SdkAppid在 [短信控制台](https://console.cloud.tencent.com/smsv2) 添加应用后生成的实际SdkAppid，例如1400006666。
     * @param SmsSdkAppid 短信SdkAppid在 [短信控制台](https://console.cloud.tencent.com/smsv2) 添加应用后生成的实际SdkAppid，例如1400006666。
     */
    public void setSmsSdkAppid(String SmsSdkAppid) {
        this.SmsSdkAppid = SmsSdkAppid;
    }

    /**
     * Get 拉取截止时间，UNIX 时间戳（时间：秒）。 
     * @return EndDateTime 拉取截止时间，UNIX 时间戳（时间：秒）。
     */
    public Long getEndDateTime() {
        return this.EndDateTime;
    }

    /**
     * Set 拉取截止时间，UNIX 时间戳（时间：秒）。
     * @param EndDateTime 拉取截止时间，UNIX 时间戳（时间：秒）。
     */
    public void setEndDateTime(Long EndDateTime) {
        this.EndDateTime = EndDateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SendDateTime", this.SendDateTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "SmsSdkAppid", this.SmsSdkAppid);
        this.setParamSimple(map, prefix + "EndDateTime", this.EndDateTime);

    }
}


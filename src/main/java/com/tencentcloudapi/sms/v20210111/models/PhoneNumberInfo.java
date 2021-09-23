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

public class PhoneNumberInfo extends AbstractModel{

    /**
    * 号码信息查询错误码，查询成功返回 "Ok"。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 号码信息查询错误码描述。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 国家（或地区）码。
    */
    @SerializedName("NationCode")
    @Expose
    private String NationCode;

    /**
    * 用户号码，去除国家或地区码前缀的普通格式，示例如：13711112222。
    */
    @SerializedName("SubscriberNumber")
    @Expose
    private String SubscriberNumber;

    /**
    * 解析后的规范的 E.164 号码，与下发短信的号码解析结果一致。解析失败时会原样返回。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 国家码或地区码，例如 CN、US 等，对于未识别出国家码或者地区码，默认返回 DEF。
    */
    @SerializedName("IsoCode")
    @Expose
    private String IsoCode;

    /**
    * 国家码或地区名，例如 China，可参考 [国际/港澳台短信价格总览](https://cloud.tencent.com/document/product/382/18051#.E6.97.A5.E7.BB.93.E5.90.8E.E4.BB.98.E8.B4.B9.3Ca-id.3D.22post-payment.22.3E.3C.2Fa.3E)
    */
    @SerializedName("IsoName")
    @Expose
    private String IsoName;

    /**
     * Get 号码信息查询错误码，查询成功返回 "Ok"。 
     * @return Code 号码信息查询错误码，查询成功返回 "Ok"。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 号码信息查询错误码，查询成功返回 "Ok"。
     * @param Code 号码信息查询错误码，查询成功返回 "Ok"。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 号码信息查询错误码描述。 
     * @return Message 号码信息查询错误码描述。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 号码信息查询错误码描述。
     * @param Message 号码信息查询错误码描述。
     */
    public void setMessage(String Message) {
        this.Message = Message;
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
     * Get 用户号码，去除国家或地区码前缀的普通格式，示例如：13711112222。 
     * @return SubscriberNumber 用户号码，去除国家或地区码前缀的普通格式，示例如：13711112222。
     */
    public String getSubscriberNumber() {
        return this.SubscriberNumber;
    }

    /**
     * Set 用户号码，去除国家或地区码前缀的普通格式，示例如：13711112222。
     * @param SubscriberNumber 用户号码，去除国家或地区码前缀的普通格式，示例如：13711112222。
     */
    public void setSubscriberNumber(String SubscriberNumber) {
        this.SubscriberNumber = SubscriberNumber;
    }

    /**
     * Get 解析后的规范的 E.164 号码，与下发短信的号码解析结果一致。解析失败时会原样返回。 
     * @return PhoneNumber 解析后的规范的 E.164 号码，与下发短信的号码解析结果一致。解析失败时会原样返回。
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 解析后的规范的 E.164 号码，与下发短信的号码解析结果一致。解析失败时会原样返回。
     * @param PhoneNumber 解析后的规范的 E.164 号码，与下发短信的号码解析结果一致。解析失败时会原样返回。
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 国家码或地区码，例如 CN、US 等，对于未识别出国家码或者地区码，默认返回 DEF。 
     * @return IsoCode 国家码或地区码，例如 CN、US 等，对于未识别出国家码或者地区码，默认返回 DEF。
     */
    public String getIsoCode() {
        return this.IsoCode;
    }

    /**
     * Set 国家码或地区码，例如 CN、US 等，对于未识别出国家码或者地区码，默认返回 DEF。
     * @param IsoCode 国家码或地区码，例如 CN、US 等，对于未识别出国家码或者地区码，默认返回 DEF。
     */
    public void setIsoCode(String IsoCode) {
        this.IsoCode = IsoCode;
    }

    /**
     * Get 国家码或地区名，例如 China，可参考 [国际/港澳台短信价格总览](https://cloud.tencent.com/document/product/382/18051#.E6.97.A5.E7.BB.93.E5.90.8E.E4.BB.98.E8.B4.B9.3Ca-id.3D.22post-payment.22.3E.3C.2Fa.3E) 
     * @return IsoName 国家码或地区名，例如 China，可参考 [国际/港澳台短信价格总览](https://cloud.tencent.com/document/product/382/18051#.E6.97.A5.E7.BB.93.E5.90.8E.E4.BB.98.E8.B4.B9.3Ca-id.3D.22post-payment.22.3E.3C.2Fa.3E)
     */
    public String getIsoName() {
        return this.IsoName;
    }

    /**
     * Set 国家码或地区名，例如 China，可参考 [国际/港澳台短信价格总览](https://cloud.tencent.com/document/product/382/18051#.E6.97.A5.E7.BB.93.E5.90.8E.E4.BB.98.E8.B4.B9.3Ca-id.3D.22post-payment.22.3E.3C.2Fa.3E)
     * @param IsoName 国家码或地区名，例如 China，可参考 [国际/港澳台短信价格总览](https://cloud.tencent.com/document/product/382/18051#.E6.97.A5.E7.BB.93.E5.90.8E.E4.BB.98.E8.B4.B9.3Ca-id.3D.22post-payment.22.3E.3C.2Fa.3E)
     */
    public void setIsoName(String IsoName) {
        this.IsoName = IsoName;
    }

    public PhoneNumberInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhoneNumberInfo(PhoneNumberInfo source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.NationCode != null) {
            this.NationCode = new String(source.NationCode);
        }
        if (source.SubscriberNumber != null) {
            this.SubscriberNumber = new String(source.SubscriberNumber);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.IsoCode != null) {
            this.IsoCode = new String(source.IsoCode);
        }
        if (source.IsoName != null) {
            this.IsoName = new String(source.IsoName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "NationCode", this.NationCode);
        this.setParamSimple(map, prefix + "SubscriberNumber", this.SubscriberNumber);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "IsoCode", this.IsoCode);
        this.setParamSimple(map, prefix + "IsoName", this.IsoName);

    }
}


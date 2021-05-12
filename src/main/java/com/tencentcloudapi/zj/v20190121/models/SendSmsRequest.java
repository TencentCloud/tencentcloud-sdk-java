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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendSmsRequest extends AbstractModel{

    /**
    * 商户证书
    */
    @SerializedName("License")
    @Expose
    private String License;

    /**
    * 手机号码,采用 e.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号且要求全为境内手机号,如:+8613800138000
    */
    @SerializedName("Phone")
    @Expose
    private String [] Phone;

    /**
    * 短信模板id(推荐使用模板id发送,使用内容发送时模板id留空)
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 模板参数，若无模板参数，则设置为空。
    */
    @SerializedName("Params")
    @Expose
    private String [] Params;

    /**
    * 短信签名内容，使用 UTF-8 编码，必须填写已审核通过的签名。注：国内短信为必填参数。
    */
    @SerializedName("Sign")
    @Expose
    private String Sign;

    /**
    * 国际/港澳台短信 senderid，国内短信填空
    */
    @SerializedName("SenderId")
    @Expose
    private String SenderId;

    /**
    * 短信类型：{0:普通短信，1:营销短信}，使用内容发送时必填
    */
    @SerializedName("SmsType")
    @Expose
    private Long SmsType;

    /**
    * 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。使用内容发送时必填
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
    * 发送使用的模板内容,如果有占位符,此处也包括占位符,占位符的实际内容通过Params参数传递,使用模板id发送时此字段为空
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 商户证书 
     * @return License 商户证书
     */
    public String getLicense() {
        return this.License;
    }

    /**
     * Set 商户证书
     * @param License 商户证书
     */
    public void setLicense(String License) {
        this.License = License;
    }

    /**
     * Get 手机号码,采用 e.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号且要求全为境内手机号,如:+8613800138000 
     * @return Phone 手机号码,采用 e.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号且要求全为境内手机号,如:+8613800138000
     */
    public String [] getPhone() {
        return this.Phone;
    }

    /**
     * Set 手机号码,采用 e.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号且要求全为境内手机号,如:+8613800138000
     * @param Phone 手机号码,采用 e.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号且要求全为境内手机号,如:+8613800138000
     */
    public void setPhone(String [] Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 短信模板id(推荐使用模板id发送,使用内容发送时模板id留空) 
     * @return TemplateId 短信模板id(推荐使用模板id发送,使用内容发送时模板id留空)
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 短信模板id(推荐使用模板id发送,使用内容发送时模板id留空)
     * @param TemplateId 短信模板id(推荐使用模板id发送,使用内容发送时模板id留空)
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模板参数，若无模板参数，则设置为空。 
     * @return Params 模板参数，若无模板参数，则设置为空。
     */
    public String [] getParams() {
        return this.Params;
    }

    /**
     * Set 模板参数，若无模板参数，则设置为空。
     * @param Params 模板参数，若无模板参数，则设置为空。
     */
    public void setParams(String [] Params) {
        this.Params = Params;
    }

    /**
     * Get 短信签名内容，使用 UTF-8 编码，必须填写已审核通过的签名。注：国内短信为必填参数。 
     * @return Sign 短信签名内容，使用 UTF-8 编码，必须填写已审核通过的签名。注：国内短信为必填参数。
     */
    public String getSign() {
        return this.Sign;
    }

    /**
     * Set 短信签名内容，使用 UTF-8 编码，必须填写已审核通过的签名。注：国内短信为必填参数。
     * @param Sign 短信签名内容，使用 UTF-8 编码，必须填写已审核通过的签名。注：国内短信为必填参数。
     */
    public void setSign(String Sign) {
        this.Sign = Sign;
    }

    /**
     * Get 国际/港澳台短信 senderid，国内短信填空 
     * @return SenderId 国际/港澳台短信 senderid，国内短信填空
     */
    public String getSenderId() {
        return this.SenderId;
    }

    /**
     * Set 国际/港澳台短信 senderid，国内短信填空
     * @param SenderId 国际/港澳台短信 senderid，国内短信填空
     */
    public void setSenderId(String SenderId) {
        this.SenderId = SenderId;
    }

    /**
     * Get 短信类型：{0:普通短信，1:营销短信}，使用内容发送时必填 
     * @return SmsType 短信类型：{0:普通短信，1:营销短信}，使用内容发送时必填
     */
    public Long getSmsType() {
        return this.SmsType;
    }

    /**
     * Set 短信类型：{0:普通短信，1:营销短信}，使用内容发送时必填
     * @param SmsType 短信类型：{0:普通短信，1:营销短信}，使用内容发送时必填
     */
    public void setSmsType(Long SmsType) {
        this.SmsType = SmsType;
    }

    /**
     * Get 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。使用内容发送时必填 
     * @return International 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。使用内容发送时必填
     */
    public Long getInternational() {
        return this.International;
    }

    /**
     * Set 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。使用内容发送时必填
     * @param International 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。使用内容发送时必填
     */
    public void setInternational(Long International) {
        this.International = International;
    }

    /**
     * Get 发送使用的模板内容,如果有占位符,此处也包括占位符,占位符的实际内容通过Params参数传递,使用模板id发送时此字段为空 
     * @return Content 发送使用的模板内容,如果有占位符,此处也包括占位符,占位符的实际内容通过Params参数传递,使用模板id发送时此字段为空
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 发送使用的模板内容,如果有占位符,此处也包括占位符,占位符的实际内容通过Params参数传递,使用模板id发送时此字段为空
     * @param Content 发送使用的模板内容,如果有占位符,此处也包括占位符,占位符的实际内容通过Params参数传递,使用模板id发送时此字段为空
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public SendSmsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendSmsRequest(SendSmsRequest source) {
        if (source.License != null) {
            this.License = new String(source.License);
        }
        if (source.Phone != null) {
            this.Phone = new String[source.Phone.length];
            for (int i = 0; i < source.Phone.length; i++) {
                this.Phone[i] = new String(source.Phone[i]);
            }
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Params != null) {
            this.Params = new String[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new String(source.Params[i]);
            }
        }
        if (source.Sign != null) {
            this.Sign = new String(source.Sign);
        }
        if (source.SenderId != null) {
            this.SenderId = new String(source.SenderId);
        }
        if (source.SmsType != null) {
            this.SmsType = new Long(source.SmsType);
        }
        if (source.International != null) {
            this.International = new Long(source.International);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "License", this.License);
        this.setParamArraySimple(map, prefix + "Phone.", this.Phone);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArraySimple(map, prefix + "Params.", this.Params);
        this.setParamSimple(map, prefix + "Sign", this.Sign);
        this.setParamSimple(map, prefix + "SenderId", this.SenderId);
        this.setParamSimple(map, prefix + "SmsType", this.SmsType);
        this.setParamSimple(map, prefix + "International", this.International);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}


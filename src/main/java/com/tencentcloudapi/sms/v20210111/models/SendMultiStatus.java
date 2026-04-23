/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendMultiStatus extends AbstractModel {

    /**
    * <p>发送流水号。</p>
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * <p>手机号码，E.164标准，+[国家或地区码][手机号] ，示例如：+60198890000， 其中前面有一个+号 ，60为国家码，198890000为手机号。</p>
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * <p>计费条数，计费规则请查询 <a href="https://cloud.tencent.com/document/product/382/36135">计费策略</a>。</p>
    */
    @SerializedName("Fee")
    @Expose
    private Long Fee;

    /**
    * <p>用户 session 内容。</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>短信请求错误码，具体含义请参考 <a href="https://cloud.tencent.com/document/product/382/59177#.E7.9F.AD.E4.BF.A1-API-3.0-.E5.8F.91.E9.80.81.E9.94.99.E8.AF.AF.E7.A0.81">错误码</a>，发送成功返回 &quot;Ok&quot;。</p>
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * <p>短信请求错误码描述。</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>国家码或地区码，例如 US、MY 等，对于未识别出国家码或者地区码，默认返回 DEF，具体支持列表请参考 <a href="https://cloud.tencent.com/document/product/382/18051">国际/港澳台短信价格总览</a>。</p>
    */
    @SerializedName("IsoCode")
    @Expose
    private String IsoCode;

    /**
     * Get <p>发送流水号。</p> 
     * @return SerialNo <p>发送流水号。</p>
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set <p>发送流水号。</p>
     * @param SerialNo <p>发送流水号。</p>
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get <p>手机号码，E.164标准，+[国家或地区码][手机号] ，示例如：+60198890000， 其中前面有一个+号 ，60为国家码，198890000为手机号。</p> 
     * @return PhoneNumber <p>手机号码，E.164标准，+[国家或地区码][手机号] ，示例如：+60198890000， 其中前面有一个+号 ，60为国家码，198890000为手机号。</p>
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set <p>手机号码，E.164标准，+[国家或地区码][手机号] ，示例如：+60198890000， 其中前面有一个+号 ，60为国家码，198890000为手机号。</p>
     * @param PhoneNumber <p>手机号码，E.164标准，+[国家或地区码][手机号] ，示例如：+60198890000， 其中前面有一个+号 ，60为国家码，198890000为手机号。</p>
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get <p>计费条数，计费规则请查询 <a href="https://cloud.tencent.com/document/product/382/36135">计费策略</a>。</p> 
     * @return Fee <p>计费条数，计费规则请查询 <a href="https://cloud.tencent.com/document/product/382/36135">计费策略</a>。</p>
     */
    public Long getFee() {
        return this.Fee;
    }

    /**
     * Set <p>计费条数，计费规则请查询 <a href="https://cloud.tencent.com/document/product/382/36135">计费策略</a>。</p>
     * @param Fee <p>计费条数，计费规则请查询 <a href="https://cloud.tencent.com/document/product/382/36135">计费策略</a>。</p>
     */
    public void setFee(Long Fee) {
        this.Fee = Fee;
    }

    /**
     * Get <p>用户 session 内容。</p> 
     * @return SessionContext <p>用户 session 内容。</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>用户 session 内容。</p>
     * @param SessionContext <p>用户 session 内容。</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>短信请求错误码，具体含义请参考 <a href="https://cloud.tencent.com/document/product/382/59177#.E7.9F.AD.E4.BF.A1-API-3.0-.E5.8F.91.E9.80.81.E9.94.99.E8.AF.AF.E7.A0.81">错误码</a>，发送成功返回 &quot;Ok&quot;。</p> 
     * @return Code <p>短信请求错误码，具体含义请参考 <a href="https://cloud.tencent.com/document/product/382/59177#.E7.9F.AD.E4.BF.A1-API-3.0-.E5.8F.91.E9.80.81.E9.94.99.E8.AF.AF.E7.A0.81">错误码</a>，发送成功返回 &quot;Ok&quot;。</p>
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set <p>短信请求错误码，具体含义请参考 <a href="https://cloud.tencent.com/document/product/382/59177#.E7.9F.AD.E4.BF.A1-API-3.0-.E5.8F.91.E9.80.81.E9.94.99.E8.AF.AF.E7.A0.81">错误码</a>，发送成功返回 &quot;Ok&quot;。</p>
     * @param Code <p>短信请求错误码，具体含义请参考 <a href="https://cloud.tencent.com/document/product/382/59177#.E7.9F.AD.E4.BF.A1-API-3.0-.E5.8F.91.E9.80.81.E9.94.99.E8.AF.AF.E7.A0.81">错误码</a>，发送成功返回 &quot;Ok&quot;。</p>
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get <p>短信请求错误码描述。</p> 
     * @return Message <p>短信请求错误码描述。</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>短信请求错误码描述。</p>
     * @param Message <p>短信请求错误码描述。</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>国家码或地区码，例如 US、MY 等，对于未识别出国家码或者地区码，默认返回 DEF，具体支持列表请参考 <a href="https://cloud.tencent.com/document/product/382/18051">国际/港澳台短信价格总览</a>。</p> 
     * @return IsoCode <p>国家码或地区码，例如 US、MY 等，对于未识别出国家码或者地区码，默认返回 DEF，具体支持列表请参考 <a href="https://cloud.tencent.com/document/product/382/18051">国际/港澳台短信价格总览</a>。</p>
     */
    public String getIsoCode() {
        return this.IsoCode;
    }

    /**
     * Set <p>国家码或地区码，例如 US、MY 等，对于未识别出国家码或者地区码，默认返回 DEF，具体支持列表请参考 <a href="https://cloud.tencent.com/document/product/382/18051">国际/港澳台短信价格总览</a>。</p>
     * @param IsoCode <p>国家码或地区码，例如 US、MY 等，对于未识别出国家码或者地区码，默认返回 DEF，具体支持列表请参考 <a href="https://cloud.tencent.com/document/product/382/18051">国际/港澳台短信价格总览</a>。</p>
     */
    public void setIsoCode(String IsoCode) {
        this.IsoCode = IsoCode;
    }

    public SendMultiStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendMultiStatus(SendMultiStatus source) {
        if (source.SerialNo != null) {
            this.SerialNo = new String(source.SerialNo);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.Fee != null) {
            this.Fee = new Long(source.Fee);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.IsoCode != null) {
            this.IsoCode = new String(source.IsoCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SerialNo", this.SerialNo);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "Fee", this.Fee);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "IsoCode", this.IsoCode);

    }
}


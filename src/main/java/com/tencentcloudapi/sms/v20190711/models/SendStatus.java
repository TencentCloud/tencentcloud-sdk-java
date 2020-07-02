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

public class SendStatus extends AbstractModel{

    /**
    * 发送流水号。
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * 手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 计费条数，计费规则请查询 [计费策略](https://cloud.tencent.com/document/product/382/36135)。
    */
    @SerializedName("Fee")
    @Expose
    private Long Fee;

    /**
    * 用户Session内容。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 短信请求错误码，具体含义请参考错误码。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 短信请求错误码描述。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 国家码或地区码，例如CN,US等，对于未识别出国家码或者地区码，默认返回DEF,具体支持列表请参考国际/港澳台计费总览。
    */
    @SerializedName("IsoCode")
    @Expose
    private String IsoCode;

    /**
     * Get 发送流水号。 
     * @return SerialNo 发送流水号。
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set 发送流水号。
     * @param SerialNo 发送流水号。
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get 手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。 
     * @return PhoneNumber 手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
     * @param PhoneNumber 手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 计费条数，计费规则请查询 [计费策略](https://cloud.tencent.com/document/product/382/36135)。 
     * @return Fee 计费条数，计费规则请查询 [计费策略](https://cloud.tencent.com/document/product/382/36135)。
     */
    public Long getFee() {
        return this.Fee;
    }

    /**
     * Set 计费条数，计费规则请查询 [计费策略](https://cloud.tencent.com/document/product/382/36135)。
     * @param Fee 计费条数，计费规则请查询 [计费策略](https://cloud.tencent.com/document/product/382/36135)。
     */
    public void setFee(Long Fee) {
        this.Fee = Fee;
    }

    /**
     * Get 用户Session内容。 
     * @return SessionContext 用户Session内容。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 用户Session内容。
     * @param SessionContext 用户Session内容。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get 短信请求错误码，具体含义请参考错误码。 
     * @return Code 短信请求错误码，具体含义请参考错误码。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 短信请求错误码，具体含义请参考错误码。
     * @param Code 短信请求错误码，具体含义请参考错误码。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 短信请求错误码描述。 
     * @return Message 短信请求错误码描述。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 短信请求错误码描述。
     * @param Message 短信请求错误码描述。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 国家码或地区码，例如CN,US等，对于未识别出国家码或者地区码，默认返回DEF,具体支持列表请参考国际/港澳台计费总览。 
     * @return IsoCode 国家码或地区码，例如CN,US等，对于未识别出国家码或者地区码，默认返回DEF,具体支持列表请参考国际/港澳台计费总览。
     */
    public String getIsoCode() {
        return this.IsoCode;
    }

    /**
     * Set 国家码或地区码，例如CN,US等，对于未识别出国家码或者地区码，默认返回DEF,具体支持列表请参考国际/港澳台计费总览。
     * @param IsoCode 国家码或地区码，例如CN,US等，对于未识别出国家码或者地区码，默认返回DEF,具体支持列表请参考国际/港澳台计费总览。
     */
    public void setIsoCode(String IsoCode) {
        this.IsoCode = IsoCode;
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


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

public class SendSmsPaasDataStruct extends AbstractModel{

    /**
    * 发送流水号
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
    * 计费条数
    */
    @SerializedName("Fee")
    @Expose
    private Long Fee;

    /**
    * OK为成功
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 短信请求错误码描述
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 发送流水号 
     * @return SerialNo 发送流水号
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set 发送流水号
     * @param SerialNo 发送流水号
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
     * Get 计费条数 
     * @return Fee 计费条数
     */
    public Long getFee() {
        return this.Fee;
    }

    /**
     * Set 计费条数
     * @param Fee 计费条数
     */
    public void setFee(Long Fee) {
        this.Fee = Fee;
    }

    /**
     * Get OK为成功 
     * @return Code OK为成功
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set OK为成功
     * @param Code OK为成功
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 短信请求错误码描述 
     * @return Message 短信请求错误码描述
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 短信请求错误码描述
     * @param Message 短信请求错误码描述
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public SendSmsPaasDataStruct() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendSmsPaasDataStruct(SendSmsPaasDataStruct source) {
        if (source.SerialNo != null) {
            this.SerialNo = new String(source.SerialNo);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.Fee != null) {
            this.Fee = new Long(source.Fee);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SerialNo", this.SerialNo);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "Fee", this.Fee);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}


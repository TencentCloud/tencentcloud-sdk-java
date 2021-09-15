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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckIdCardVerificationRequest extends AbstractModel{

    /**
    * 调用方信息; 必选
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 身份证件号码
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 身份证件类型; ID_CARD
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
     * Get 调用方信息; 必选 
     * @return Caller 调用方信息; 必选
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息; 必选
     * @param Caller 调用方信息; 必选
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 姓名 
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 身份证件号码 
     * @return IdCardNumber 身份证件号码
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 身份证件号码
     * @param IdCardNumber 身份证件号码
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 身份证件类型; ID_CARD 
     * @return IdCardType 身份证件类型; ID_CARD
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 身份证件类型; ID_CARD
     * @param IdCardType 身份证件类型; ID_CARD
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    public CheckIdCardVerificationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckIdCardVerificationRequest(CheckIdCardVerificationRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);

    }
}


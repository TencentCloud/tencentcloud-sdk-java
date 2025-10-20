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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindNumberCallInInterfaceRequest extends AbstractModel {

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 待绑定的号码
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 待绑定的回调地址
    */
    @SerializedName("CallInInterface")
    @Expose
    private Interface CallInInterface;

    /**
    * 绑定号码类型: inner: 内线号码 | number: 正常线路号码
    */
    @SerializedName("NumberType")
    @Expose
    private String NumberType;

    /**
     * Get 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc 
     * @return SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     * @param SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 待绑定的号码 
     * @return Number 待绑定的号码
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set 待绑定的号码
     * @param Number 待绑定的号码
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get 待绑定的回调地址 
     * @return CallInInterface 待绑定的回调地址
     */
    public Interface getCallInInterface() {
        return this.CallInInterface;
    }

    /**
     * Set 待绑定的回调地址
     * @param CallInInterface 待绑定的回调地址
     */
    public void setCallInInterface(Interface CallInInterface) {
        this.CallInInterface = CallInInterface;
    }

    /**
     * Get 绑定号码类型: inner: 内线号码 | number: 正常线路号码 
     * @return NumberType 绑定号码类型: inner: 内线号码 | number: 正常线路号码
     */
    public String getNumberType() {
        return this.NumberType;
    }

    /**
     * Set 绑定号码类型: inner: 内线号码 | number: 正常线路号码
     * @param NumberType 绑定号码类型: inner: 内线号码 | number: 正常线路号码
     */
    public void setNumberType(String NumberType) {
        this.NumberType = NumberType;
    }

    public BindNumberCallInInterfaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindNumberCallInInterfaceRequest(BindNumberCallInInterfaceRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.CallInInterface != null) {
            this.CallInInterface = new Interface(source.CallInInterface);
        }
        if (source.NumberType != null) {
            this.NumberType = new String(source.NumberType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamObj(map, prefix + "CallInInterface.", this.CallInInterface);
        this.setParamSimple(map, prefix + "NumberType", this.NumberType);

    }
}


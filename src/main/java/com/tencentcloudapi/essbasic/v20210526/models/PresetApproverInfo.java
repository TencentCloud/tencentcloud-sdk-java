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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PresetApproverInfo extends AbstractModel {

    /**
    * 预设参与方姓名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 预设参与方手机号。
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 预设参与方证件号，需要和IdCardType同时传入。

证件号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li></ul>
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 预设参与方的证件类型，需要与IdCardNumber同时传入。

证件类型，支持以下类型
<ul><li><b>ID_CARD</b>: 居民身份证</li></ul>
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
     * Get 预设参与方姓名。 
     * @return Name 预设参与方姓名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 预设参与方姓名。
     * @param Name 预设参与方姓名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 预设参与方手机号。 
     * @return Mobile 预设参与方手机号。
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 预设参与方手机号。
     * @param Mobile 预设参与方手机号。
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 预设参与方证件号，需要和IdCardType同时传入。

证件号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li></ul> 
     * @return IdCardNumber 预设参与方证件号，需要和IdCardType同时传入。

证件号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li></ul>
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 预设参与方证件号，需要和IdCardType同时传入。

证件号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li></ul>
     * @param IdCardNumber 预设参与方证件号，需要和IdCardType同时传入。

证件号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li></ul>
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 预设参与方的证件类型，需要与IdCardNumber同时传入。

证件类型，支持以下类型
<ul><li><b>ID_CARD</b>: 居民身份证</li></ul> 
     * @return IdCardType 预设参与方的证件类型，需要与IdCardNumber同时传入。

证件类型，支持以下类型
<ul><li><b>ID_CARD</b>: 居民身份证</li></ul>
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 预设参与方的证件类型，需要与IdCardNumber同时传入。

证件类型，支持以下类型
<ul><li><b>ID_CARD</b>: 居民身份证</li></ul>
     * @param IdCardType 预设参与方的证件类型，需要与IdCardNumber同时传入。

证件类型，支持以下类型
<ul><li><b>ID_CARD</b>: 居民身份证</li></ul>
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    public PresetApproverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PresetApproverInfo(PresetApproverInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);

    }
}


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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PayRollAuthResult extends AbstractModel{

    /**
    * 结果为核身失败时的原因描述，仅在失败记录返回，空字符串等同null
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthFailedReason")
    @Expose
    private String AuthFailedReason;

    /**
    * 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一
    */
    @SerializedName("AuthNumber")
    @Expose
    private String AuthNumber;

    /**
    * 核身渠道，发起核身时的来源渠道，如通过小程序，硬件设备等
FROM_MINI_APP：来自小程序方式核身
FROM_HARDWARE：来自硬件设备方式核身
    */
    @SerializedName("AuthScene")
    @Expose
    private String AuthScene;

    /**
    * 核身渠道标识，用于定位渠道具体来源，如果是扫码打卡渠道标识就是具体的小程序appid，若是硬件设备，则是设备的序列号等
    */
    @SerializedName("AuthSource")
    @Expose
    private String AuthSource;

    /**
    * 核身状态
AUTHENTICATE_PROCESSING：核身中
AUTHENTICATE_SUCCESS：核身成功
AUTHENTICATE_FAILED：核身失败
    */
    @SerializedName("AuthStatus")
    @Expose
    private String AuthStatus;

    /**
    * 核身时间，遵循[rfc3339](https://datatracker.ietf.org/doc/html/rfc3339)标准格式，格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE
    */
    @SerializedName("AuthTime")
    @Expose
    private String AuthTime;

    /**
    * 该用户所属的单位名称
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * 微信服务商商户的商户号，由微信支付生成并下发
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 用户在商户对应appid下的唯一标识
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 该项目的名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 微信服务商下特约商户的商户号，由微信支付生成并下发
    */
    @SerializedName("SubMerchantId")
    @Expose
    private String SubMerchantId;

    /**
     * Get 结果为核身失败时的原因描述，仅在失败记录返回，空字符串等同null
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthFailedReason 结果为核身失败时的原因描述，仅在失败记录返回，空字符串等同null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthFailedReason() {
        return this.AuthFailedReason;
    }

    /**
     * Set 结果为核身失败时的原因描述，仅在失败记录返回，空字符串等同null
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthFailedReason 结果为核身失败时的原因描述，仅在失败记录返回，空字符串等同null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthFailedReason(String AuthFailedReason) {
        this.AuthFailedReason = AuthFailedReason;
    }

    /**
     * Get 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一 
     * @return AuthNumber 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一
     */
    public String getAuthNumber() {
        return this.AuthNumber;
    }

    /**
     * Set 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一
     * @param AuthNumber 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一
     */
    public void setAuthNumber(String AuthNumber) {
        this.AuthNumber = AuthNumber;
    }

    /**
     * Get 核身渠道，发起核身时的来源渠道，如通过小程序，硬件设备等
FROM_MINI_APP：来自小程序方式核身
FROM_HARDWARE：来自硬件设备方式核身 
     * @return AuthScene 核身渠道，发起核身时的来源渠道，如通过小程序，硬件设备等
FROM_MINI_APP：来自小程序方式核身
FROM_HARDWARE：来自硬件设备方式核身
     */
    public String getAuthScene() {
        return this.AuthScene;
    }

    /**
     * Set 核身渠道，发起核身时的来源渠道，如通过小程序，硬件设备等
FROM_MINI_APP：来自小程序方式核身
FROM_HARDWARE：来自硬件设备方式核身
     * @param AuthScene 核身渠道，发起核身时的来源渠道，如通过小程序，硬件设备等
FROM_MINI_APP：来自小程序方式核身
FROM_HARDWARE：来自硬件设备方式核身
     */
    public void setAuthScene(String AuthScene) {
        this.AuthScene = AuthScene;
    }

    /**
     * Get 核身渠道标识，用于定位渠道具体来源，如果是扫码打卡渠道标识就是具体的小程序appid，若是硬件设备，则是设备的序列号等 
     * @return AuthSource 核身渠道标识，用于定位渠道具体来源，如果是扫码打卡渠道标识就是具体的小程序appid，若是硬件设备，则是设备的序列号等
     */
    public String getAuthSource() {
        return this.AuthSource;
    }

    /**
     * Set 核身渠道标识，用于定位渠道具体来源，如果是扫码打卡渠道标识就是具体的小程序appid，若是硬件设备，则是设备的序列号等
     * @param AuthSource 核身渠道标识，用于定位渠道具体来源，如果是扫码打卡渠道标识就是具体的小程序appid，若是硬件设备，则是设备的序列号等
     */
    public void setAuthSource(String AuthSource) {
        this.AuthSource = AuthSource;
    }

    /**
     * Get 核身状态
AUTHENTICATE_PROCESSING：核身中
AUTHENTICATE_SUCCESS：核身成功
AUTHENTICATE_FAILED：核身失败 
     * @return AuthStatus 核身状态
AUTHENTICATE_PROCESSING：核身中
AUTHENTICATE_SUCCESS：核身成功
AUTHENTICATE_FAILED：核身失败
     */
    public String getAuthStatus() {
        return this.AuthStatus;
    }

    /**
     * Set 核身状态
AUTHENTICATE_PROCESSING：核身中
AUTHENTICATE_SUCCESS：核身成功
AUTHENTICATE_FAILED：核身失败
     * @param AuthStatus 核身状态
AUTHENTICATE_PROCESSING：核身中
AUTHENTICATE_SUCCESS：核身成功
AUTHENTICATE_FAILED：核身失败
     */
    public void setAuthStatus(String AuthStatus) {
        this.AuthStatus = AuthStatus;
    }

    /**
     * Get 核身时间，遵循[rfc3339](https://datatracker.ietf.org/doc/html/rfc3339)标准格式，格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE 
     * @return AuthTime 核身时间，遵循[rfc3339](https://datatracker.ietf.org/doc/html/rfc3339)标准格式，格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE
     */
    public String getAuthTime() {
        return this.AuthTime;
    }

    /**
     * Set 核身时间，遵循[rfc3339](https://datatracker.ietf.org/doc/html/rfc3339)标准格式，格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE
     * @param AuthTime 核身时间，遵循[rfc3339](https://datatracker.ietf.org/doc/html/rfc3339)标准格式，格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE
     */
    public void setAuthTime(String AuthTime) {
        this.AuthTime = AuthTime;
    }

    /**
     * Get 该用户所属的单位名称 
     * @return CompanyName 该用户所属的单位名称
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set 该用户所属的单位名称
     * @param CompanyName 该用户所属的单位名称
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get 微信服务商商户的商户号，由微信支付生成并下发 
     * @return MerchantId 微信服务商商户的商户号，由微信支付生成并下发
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 微信服务商商户的商户号，由微信支付生成并下发
     * @param MerchantId 微信服务商商户的商户号，由微信支付生成并下发
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 用户在商户对应appid下的唯一标识 
     * @return OpenId 用户在商户对应appid下的唯一标识
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 用户在商户对应appid下的唯一标识
     * @param OpenId 用户在商户对应appid下的唯一标识
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 该项目的名称 
     * @return ProjectName 该项目的名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 该项目的名称
     * @param ProjectName 该项目的名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 微信服务商下特约商户的商户号，由微信支付生成并下发 
     * @return SubMerchantId 微信服务商下特约商户的商户号，由微信支付生成并下发
     */
    public String getSubMerchantId() {
        return this.SubMerchantId;
    }

    /**
     * Set 微信服务商下特约商户的商户号，由微信支付生成并下发
     * @param SubMerchantId 微信服务商下特约商户的商户号，由微信支付生成并下发
     */
    public void setSubMerchantId(String SubMerchantId) {
        this.SubMerchantId = SubMerchantId;
    }

    public PayRollAuthResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PayRollAuthResult(PayRollAuthResult source) {
        if (source.AuthFailedReason != null) {
            this.AuthFailedReason = new String(source.AuthFailedReason);
        }
        if (source.AuthNumber != null) {
            this.AuthNumber = new String(source.AuthNumber);
        }
        if (source.AuthScene != null) {
            this.AuthScene = new String(source.AuthScene);
        }
        if (source.AuthSource != null) {
            this.AuthSource = new String(source.AuthSource);
        }
        if (source.AuthStatus != null) {
            this.AuthStatus = new String(source.AuthStatus);
        }
        if (source.AuthTime != null) {
            this.AuthTime = new String(source.AuthTime);
        }
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.SubMerchantId != null) {
            this.SubMerchantId = new String(source.SubMerchantId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthFailedReason", this.AuthFailedReason);
        this.setParamSimple(map, prefix + "AuthNumber", this.AuthNumber);
        this.setParamSimple(map, prefix + "AuthScene", this.AuthScene);
        this.setParamSimple(map, prefix + "AuthSource", this.AuthSource);
        this.setParamSimple(map, prefix + "AuthStatus", this.AuthStatus);
        this.setParamSimple(map, prefix + "AuthTime", this.AuthTime);
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "SubMerchantId", this.SubMerchantId);

    }
}


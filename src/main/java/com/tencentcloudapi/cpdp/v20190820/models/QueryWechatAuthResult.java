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

public class QueryWechatAuthResult extends AbstractModel{

    /**
    * 商户核身单号
    */
    @SerializedName("AuthNo")
    @Expose
    private String AuthNo;

    /**
    * 微信用户标识
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 商户号
    */
    @SerializedName("MchId")
    @Expose
    private String MchId;

    /**
    * 子商户号
    */
    @SerializedName("SubMchId")
    @Expose
    private String SubMchId;

    /**
    * 核身渠道
FROM_MINI_APP：来自小程序方式核身
FROM_HARDWARE：来自硬件设备方式核身
    */
    @SerializedName("AuthScene")
    @Expose
    private String AuthScene;

    /**
    * 核身渠道标识

用于定位渠道具体来源，如果是扫码打卡渠道标识就是具体的小程序appid，若是硬件设备，则是设备的序列号等
    */
    @SerializedName("AuthSource")
    @Expose
    private String AuthSource;

    /**
    * 项目名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 所属单位名称
    */
    @SerializedName("EmployerName")
    @Expose
    private String EmployerName;

    /**
    * 核身时间
yyyy-MM-DDTHH:mm:ss+TIMEZONE

示例值：2015-05-20T13:29:35+08:00
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthTime")
    @Expose
    private String AuthTime;

    /**
    * 核身类型

SIGN_IN：考勤、签到打卡类型
INSURANCE：投保类型
CONTRACT：签约类型
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * 核身状态
AUTHENTICATE_PROCESSING：核身中
AUTHENTICATE_SUCCESS：核身成功
AUTHENTICATE_FAILED：核身失败
    */
    @SerializedName("AuthState")
    @Expose
    private String AuthState;

    /**
    * 核身失败原因描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthFailReason")
    @Expose
    private String AuthFailReason;

    /**
     * Get 商户核身单号 
     * @return AuthNo 商户核身单号
     */
    public String getAuthNo() {
        return this.AuthNo;
    }

    /**
     * Set 商户核身单号
     * @param AuthNo 商户核身单号
     */
    public void setAuthNo(String AuthNo) {
        this.AuthNo = AuthNo;
    }

    /**
     * Get 微信用户标识 
     * @return OpenId 微信用户标识
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 微信用户标识
     * @param OpenId 微信用户标识
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 商户号 
     * @return MchId 商户号
     */
    public String getMchId() {
        return this.MchId;
    }

    /**
     * Set 商户号
     * @param MchId 商户号
     */
    public void setMchId(String MchId) {
        this.MchId = MchId;
    }

    /**
     * Get 子商户号 
     * @return SubMchId 子商户号
     */
    public String getSubMchId() {
        return this.SubMchId;
    }

    /**
     * Set 子商户号
     * @param SubMchId 子商户号
     */
    public void setSubMchId(String SubMchId) {
        this.SubMchId = SubMchId;
    }

    /**
     * Get 核身渠道
FROM_MINI_APP：来自小程序方式核身
FROM_HARDWARE：来自硬件设备方式核身 
     * @return AuthScene 核身渠道
FROM_MINI_APP：来自小程序方式核身
FROM_HARDWARE：来自硬件设备方式核身
     */
    public String getAuthScene() {
        return this.AuthScene;
    }

    /**
     * Set 核身渠道
FROM_MINI_APP：来自小程序方式核身
FROM_HARDWARE：来自硬件设备方式核身
     * @param AuthScene 核身渠道
FROM_MINI_APP：来自小程序方式核身
FROM_HARDWARE：来自硬件设备方式核身
     */
    public void setAuthScene(String AuthScene) {
        this.AuthScene = AuthScene;
    }

    /**
     * Get 核身渠道标识

用于定位渠道具体来源，如果是扫码打卡渠道标识就是具体的小程序appid，若是硬件设备，则是设备的序列号等 
     * @return AuthSource 核身渠道标识

用于定位渠道具体来源，如果是扫码打卡渠道标识就是具体的小程序appid，若是硬件设备，则是设备的序列号等
     */
    public String getAuthSource() {
        return this.AuthSource;
    }

    /**
     * Set 核身渠道标识

用于定位渠道具体来源，如果是扫码打卡渠道标识就是具体的小程序appid，若是硬件设备，则是设备的序列号等
     * @param AuthSource 核身渠道标识

用于定位渠道具体来源，如果是扫码打卡渠道标识就是具体的小程序appid，若是硬件设备，则是设备的序列号等
     */
    public void setAuthSource(String AuthSource) {
        this.AuthSource = AuthSource;
    }

    /**
     * Get 项目名称 
     * @return ProjectName 项目名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
     * @param ProjectName 项目名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 所属单位名称 
     * @return EmployerName 所属单位名称
     */
    public String getEmployerName() {
        return this.EmployerName;
    }

    /**
     * Set 所属单位名称
     * @param EmployerName 所属单位名称
     */
    public void setEmployerName(String EmployerName) {
        this.EmployerName = EmployerName;
    }

    /**
     * Get 核身时间
yyyy-MM-DDTHH:mm:ss+TIMEZONE

示例值：2015-05-20T13:29:35+08:00
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthTime 核身时间
yyyy-MM-DDTHH:mm:ss+TIMEZONE

示例值：2015-05-20T13:29:35+08:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthTime() {
        return this.AuthTime;
    }

    /**
     * Set 核身时间
yyyy-MM-DDTHH:mm:ss+TIMEZONE

示例值：2015-05-20T13:29:35+08:00
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthTime 核身时间
yyyy-MM-DDTHH:mm:ss+TIMEZONE

示例值：2015-05-20T13:29:35+08:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthTime(String AuthTime) {
        this.AuthTime = AuthTime;
    }

    /**
     * Get 核身类型

SIGN_IN：考勤、签到打卡类型
INSURANCE：投保类型
CONTRACT：签约类型 
     * @return AuthType 核身类型

SIGN_IN：考勤、签到打卡类型
INSURANCE：投保类型
CONTRACT：签约类型
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 核身类型

SIGN_IN：考勤、签到打卡类型
INSURANCE：投保类型
CONTRACT：签约类型
     * @param AuthType 核身类型

SIGN_IN：考勤、签到打卡类型
INSURANCE：投保类型
CONTRACT：签约类型
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 核身状态
AUTHENTICATE_PROCESSING：核身中
AUTHENTICATE_SUCCESS：核身成功
AUTHENTICATE_FAILED：核身失败 
     * @return AuthState 核身状态
AUTHENTICATE_PROCESSING：核身中
AUTHENTICATE_SUCCESS：核身成功
AUTHENTICATE_FAILED：核身失败
     */
    public String getAuthState() {
        return this.AuthState;
    }

    /**
     * Set 核身状态
AUTHENTICATE_PROCESSING：核身中
AUTHENTICATE_SUCCESS：核身成功
AUTHENTICATE_FAILED：核身失败
     * @param AuthState 核身状态
AUTHENTICATE_PROCESSING：核身中
AUTHENTICATE_SUCCESS：核身成功
AUTHENTICATE_FAILED：核身失败
     */
    public void setAuthState(String AuthState) {
        this.AuthState = AuthState;
    }

    /**
     * Get 核身失败原因描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthFailReason 核身失败原因描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthFailReason() {
        return this.AuthFailReason;
    }

    /**
     * Set 核身失败原因描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthFailReason 核身失败原因描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthFailReason(String AuthFailReason) {
        this.AuthFailReason = AuthFailReason;
    }

    public QueryWechatAuthResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryWechatAuthResult(QueryWechatAuthResult source) {
        if (source.AuthNo != null) {
            this.AuthNo = new String(source.AuthNo);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.MchId != null) {
            this.MchId = new String(source.MchId);
        }
        if (source.SubMchId != null) {
            this.SubMchId = new String(source.SubMchId);
        }
        if (source.AuthScene != null) {
            this.AuthScene = new String(source.AuthScene);
        }
        if (source.AuthSource != null) {
            this.AuthSource = new String(source.AuthSource);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.EmployerName != null) {
            this.EmployerName = new String(source.EmployerName);
        }
        if (source.AuthTime != null) {
            this.AuthTime = new String(source.AuthTime);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.AuthState != null) {
            this.AuthState = new String(source.AuthState);
        }
        if (source.AuthFailReason != null) {
            this.AuthFailReason = new String(source.AuthFailReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthNo", this.AuthNo);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "MchId", this.MchId);
        this.setParamSimple(map, prefix + "SubMchId", this.SubMchId);
        this.setParamSimple(map, prefix + "AuthScene", this.AuthScene);
        this.setParamSimple(map, prefix + "AuthSource", this.AuthSource);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "EmployerName", this.EmployerName);
        this.setParamSimple(map, prefix + "AuthTime", this.AuthTime);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "AuthState", this.AuthState);
        this.setParamSimple(map, prefix + "AuthFailReason", this.AuthFailReason);

    }
}


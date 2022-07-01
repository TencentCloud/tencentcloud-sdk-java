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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogMessage extends AbstractModel{

    /**
    * 日志标识
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
    * 租户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 用户池ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * 事件编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventCode")
    @Expose
    private String EventCode;

    /**
    * 事件发生时间戳，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventDate")
    @Expose
    private Long EventDate;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 事件参与者

<li> **TENANT** </li>  租户
<li> **USER** </li>  用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Participant")
    @Expose
    private String Participant;

    /**
    * 应用clientId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationClientId")
    @Expose
    private String ApplicationClientId;

    /**
    * 应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 认证源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthSourceId")
    @Expose
    private String AuthSourceId;

    /**
    * 认证源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthSourceName")
    @Expose
    private String AuthSourceName;

    /**
    * 认证源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthSourceType")
    @Expose
    private String AuthSourceType;

    /**
    * 认证源类别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthSourceCategory")
    @Expose
    private String AuthSourceCategory;

    /**
    * IP地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 用户代理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * 用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
     * Get 日志标识 
     * @return LogId 日志标识
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set 日志标识
     * @param LogId 日志标识
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    /**
     * Get 租户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TenantId 租户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 租户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TenantId 租户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 用户池ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserStoreId 用户池ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set 用户池ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserStoreId 用户池ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
    }

    /**
     * Get 事件编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventCode 事件编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventCode() {
        return this.EventCode;
    }

    /**
     * Set 事件编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventCode 事件编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventCode(String EventCode) {
        this.EventCode = EventCode;
    }

    /**
     * Get 事件发生时间戳，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventDate 事件发生时间戳，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEventDate() {
        return this.EventDate;
    }

    /**
     * Set 事件发生时间戳，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventDate 事件发生时间戳，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventDate(Long EventDate) {
        this.EventDate = EventDate;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 事件参与者

<li> **TENANT** </li>  租户
<li> **USER** </li>  用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Participant 事件参与者

<li> **TENANT** </li>  租户
<li> **USER** </li>  用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParticipant() {
        return this.Participant;
    }

    /**
     * Set 事件参与者

<li> **TENANT** </li>  租户
<li> **USER** </li>  用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param Participant 事件参与者

<li> **TENANT** </li>  租户
<li> **USER** </li>  用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParticipant(String Participant) {
        this.Participant = Participant;
    }

    /**
     * Get 应用clientId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationClientId 应用clientId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationClientId() {
        return this.ApplicationClientId;
    }

    /**
     * Set 应用clientId
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationClientId 应用clientId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationClientId(String ApplicationClientId) {
        this.ApplicationClientId = ApplicationClientId;
    }

    /**
     * Get 应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 认证源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthSourceId 认证源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthSourceId() {
        return this.AuthSourceId;
    }

    /**
     * Set 认证源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthSourceId 认证源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthSourceId(String AuthSourceId) {
        this.AuthSourceId = AuthSourceId;
    }

    /**
     * Get 认证源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthSourceName 认证源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthSourceName() {
        return this.AuthSourceName;
    }

    /**
     * Set 认证源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthSourceName 认证源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthSourceName(String AuthSourceName) {
        this.AuthSourceName = AuthSourceName;
    }

    /**
     * Get 认证源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthSourceType 认证源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthSourceType() {
        return this.AuthSourceType;
    }

    /**
     * Set 认证源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthSourceType 认证源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthSourceType(String AuthSourceType) {
        this.AuthSourceType = AuthSourceType;
    }

    /**
     * Get 认证源类别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthSourceCategory 认证源类别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthSourceCategory() {
        return this.AuthSourceCategory;
    }

    /**
     * Set 认证源类别
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthSourceCategory 认证源类别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthSourceCategory(String AuthSourceCategory) {
        this.AuthSourceCategory = AuthSourceCategory;
    }

    /**
     * Get IP地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 用户代理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserAgent 用户代理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set 用户代理
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserAgent 用户代理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get 用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Detail 详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Detail 详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    public LogMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogMessage(LogMessage source) {
        if (source.LogId != null) {
            this.LogId = new String(source.LogId);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.EventCode != null) {
            this.EventCode = new String(source.EventCode);
        }
        if (source.EventDate != null) {
            this.EventDate = new Long(source.EventDate);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Participant != null) {
            this.Participant = new String(source.Participant);
        }
        if (source.ApplicationClientId != null) {
            this.ApplicationClientId = new String(source.ApplicationClientId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.AuthSourceId != null) {
            this.AuthSourceId = new String(source.AuthSourceId);
        }
        if (source.AuthSourceName != null) {
            this.AuthSourceName = new String(source.AuthSourceName);
        }
        if (source.AuthSourceType != null) {
            this.AuthSourceType = new String(source.AuthSourceType);
        }
        if (source.AuthSourceCategory != null) {
            this.AuthSourceCategory = new String(source.AuthSourceCategory);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.UserAgent != null) {
            this.UserAgent = new String(source.UserAgent);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamSimple(map, prefix + "EventCode", this.EventCode);
        this.setParamSimple(map, prefix + "EventDate", this.EventDate);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Participant", this.Participant);
        this.setParamSimple(map, prefix + "ApplicationClientId", this.ApplicationClientId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "AuthSourceId", this.AuthSourceId);
        this.setParamSimple(map, prefix + "AuthSourceName", this.AuthSourceName);
        this.setParamSimple(map, prefix + "AuthSourceType", this.AuthSourceType);
        this.setParamSimple(map, prefix + "AuthSourceCategory", this.AuthSourceCategory);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Detail", this.Detail);

    }
}


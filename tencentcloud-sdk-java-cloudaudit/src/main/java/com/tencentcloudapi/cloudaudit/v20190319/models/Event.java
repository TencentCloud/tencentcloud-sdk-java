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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Event extends AbstractModel{

    /**
    * 资源对
    */
    @SerializedName("Resources")
    @Expose
    private Resource Resources;

    /**
    * 主账号ID
    */
    @SerializedName("AccountID")
    @Expose
    private Long AccountID;

    /**
    * 日志详情
    */
    @SerializedName("CloudAuditEvent")
    @Expose
    private String CloudAuditEvent;

    /**
    * 鉴权错误码
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * 日志ID
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 事件名称
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 事件名称中文描述（此字段请按需使用，如果您是其他语言使用者，可以忽略该字段描述）
    */
    @SerializedName("EventNameCn")
    @Expose
    private String EventNameCn;

    /**
    * 事件地域
    */
    @SerializedName("EventRegion")
    @Expose
    private String EventRegion;

    /**
    * 请求来源
    */
    @SerializedName("EventSource")
    @Expose
    private String EventSource;

    /**
    * 事件时间
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * 请求ID
    */
    @SerializedName("RequestID")
    @Expose
    private String RequestID;

    /**
    * 资源地域
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 资源类型中文描述（此字段请按需使用，如果您是其他语言使用者，可以忽略该字段描述）
    */
    @SerializedName("ResourceTypeCn")
    @Expose
    private String ResourceTypeCn;

    /**
    * 证书ID
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * 源IP
    */
    @SerializedName("SourceIPAddress")
    @Expose
    private String SourceIPAddress;

    /**
    * 用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
     * Get 资源对 
     * @return Resources 资源对
     */
    public Resource getResources() {
        return this.Resources;
    }

    /**
     * Set 资源对
     * @param Resources 资源对
     */
    public void setResources(Resource Resources) {
        this.Resources = Resources;
    }

    /**
     * Get 主账号ID 
     * @return AccountID 主账号ID
     */
    public Long getAccountID() {
        return this.AccountID;
    }

    /**
     * Set 主账号ID
     * @param AccountID 主账号ID
     */
    public void setAccountID(Long AccountID) {
        this.AccountID = AccountID;
    }

    /**
     * Get 日志详情 
     * @return CloudAuditEvent 日志详情
     */
    public String getCloudAuditEvent() {
        return this.CloudAuditEvent;
    }

    /**
     * Set 日志详情
     * @param CloudAuditEvent 日志详情
     */
    public void setCloudAuditEvent(String CloudAuditEvent) {
        this.CloudAuditEvent = CloudAuditEvent;
    }

    /**
     * Get 鉴权错误码 
     * @return ErrorCode 鉴权错误码
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 鉴权错误码
     * @param ErrorCode 鉴权错误码
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 日志ID 
     * @return EventId 日志ID
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 日志ID
     * @param EventId 日志ID
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 事件名称 
     * @return EventName 事件名称
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 事件名称
     * @param EventName 事件名称
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 事件名称中文描述（此字段请按需使用，如果您是其他语言使用者，可以忽略该字段描述） 
     * @return EventNameCn 事件名称中文描述（此字段请按需使用，如果您是其他语言使用者，可以忽略该字段描述）
     */
    public String getEventNameCn() {
        return this.EventNameCn;
    }

    /**
     * Set 事件名称中文描述（此字段请按需使用，如果您是其他语言使用者，可以忽略该字段描述）
     * @param EventNameCn 事件名称中文描述（此字段请按需使用，如果您是其他语言使用者，可以忽略该字段描述）
     */
    public void setEventNameCn(String EventNameCn) {
        this.EventNameCn = EventNameCn;
    }

    /**
     * Get 事件地域 
     * @return EventRegion 事件地域
     */
    public String getEventRegion() {
        return this.EventRegion;
    }

    /**
     * Set 事件地域
     * @param EventRegion 事件地域
     */
    public void setEventRegion(String EventRegion) {
        this.EventRegion = EventRegion;
    }

    /**
     * Get 请求来源 
     * @return EventSource 请求来源
     */
    public String getEventSource() {
        return this.EventSource;
    }

    /**
     * Set 请求来源
     * @param EventSource 请求来源
     */
    public void setEventSource(String EventSource) {
        this.EventSource = EventSource;
    }

    /**
     * Get 事件时间 
     * @return EventTime 事件时间
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set 事件时间
     * @param EventTime 事件时间
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get 请求ID 
     * @return RequestID 请求ID
     */
    public String getRequestID() {
        return this.RequestID;
    }

    /**
     * Set 请求ID
     * @param RequestID 请求ID
     */
    public void setRequestID(String RequestID) {
        this.RequestID = RequestID;
    }

    /**
     * Get 资源地域 
     * @return ResourceRegion 资源地域
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源地域
     * @param ResourceRegion 资源地域
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 资源类型中文描述（此字段请按需使用，如果您是其他语言使用者，可以忽略该字段描述） 
     * @return ResourceTypeCn 资源类型中文描述（此字段请按需使用，如果您是其他语言使用者，可以忽略该字段描述）
     */
    public String getResourceTypeCn() {
        return this.ResourceTypeCn;
    }

    /**
     * Set 资源类型中文描述（此字段请按需使用，如果您是其他语言使用者，可以忽略该字段描述）
     * @param ResourceTypeCn 资源类型中文描述（此字段请按需使用，如果您是其他语言使用者，可以忽略该字段描述）
     */
    public void setResourceTypeCn(String ResourceTypeCn) {
        this.ResourceTypeCn = ResourceTypeCn;
    }

    /**
     * Get 证书ID 
     * @return SecretId 证书ID
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set 证书ID
     * @param SecretId 证书ID
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get 源IP 
     * @return SourceIPAddress 源IP
     */
    public String getSourceIPAddress() {
        return this.SourceIPAddress;
    }

    /**
     * Set 源IP
     * @param SourceIPAddress 源IP
     */
    public void setSourceIPAddress(String SourceIPAddress) {
        this.SourceIPAddress = SourceIPAddress;
    }

    /**
     * Get 用户名 
     * @return Username 用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 用户名
     * @param Username 用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Resources.", this.Resources);
        this.setParamSimple(map, prefix + "AccountID", this.AccountID);
        this.setParamSimple(map, prefix + "CloudAuditEvent", this.CloudAuditEvent);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventNameCn", this.EventNameCn);
        this.setParamSimple(map, prefix + "EventRegion", this.EventRegion);
        this.setParamSimple(map, prefix + "EventSource", this.EventSource);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "RequestID", this.RequestID);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ResourceTypeCn", this.ResourceTypeCn);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SourceIPAddress", this.SourceIPAddress);
        this.setParamSimple(map, prefix + "Username", this.Username);

    }
}


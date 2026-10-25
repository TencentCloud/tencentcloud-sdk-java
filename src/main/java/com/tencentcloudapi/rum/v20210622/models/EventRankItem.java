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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventRankItem extends AbstractModel {

    /**
    * <p>错误指纹</p>
    */
    @SerializedName("Fingerprint")
    @Expose
    private String Fingerprint;

    /**
    * <p>事件类型</p>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * <p>崩溃类型</p>
    */
    @SerializedName("CrashType")
    @Expose
    private String CrashType;

    /**
    * <p>错误类型</p>
    */
    @SerializedName("ErrorType")
    @Expose
    private String ErrorType;

    /**
    * <p>错误值</p>
    */
    @SerializedName("ErrorValue")
    @Expose
    private String ErrorValue;

    /**
    * <p>问题单 ID</p>
    */
    @SerializedName("IssueId")
    @Expose
    private String IssueId;

    /**
    * <p>问题单状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>API 或资源 URL</p>
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * <p>次数</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>影响用户数</p>
    */
    @SerializedName("AffectedUser")
    @Expose
    private Long AffectedUser;

    /**
    * <p>失败次数</p>
    */
    @SerializedName("Fail")
    @Expose
    private Long Fail;

    /**
    * <p>耗时</p>
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * <p>连接时长</p>
    */
    @SerializedName("ConnectTime")
    @Expose
    private Float ConnectTime;

    /**
    * <p>DNS 时长</p>
    */
    @SerializedName("DomainLookupTime")
    @Expose
    private Float DomainLookupTime;

    /**
    * <p>时序</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Series")
    @Expose
    private EventRankPoint [] Series;

    /**
     * Get <p>错误指纹</p> 
     * @return Fingerprint <p>错误指纹</p>
     */
    public String getFingerprint() {
        return this.Fingerprint;
    }

    /**
     * Set <p>错误指纹</p>
     * @param Fingerprint <p>错误指纹</p>
     */
    public void setFingerprint(String Fingerprint) {
        this.Fingerprint = Fingerprint;
    }

    /**
     * Get <p>事件类型</p> 
     * @return EventType <p>事件类型</p>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set <p>事件类型</p>
     * @param EventType <p>事件类型</p>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get <p>崩溃类型</p> 
     * @return CrashType <p>崩溃类型</p>
     */
    public String getCrashType() {
        return this.CrashType;
    }

    /**
     * Set <p>崩溃类型</p>
     * @param CrashType <p>崩溃类型</p>
     */
    public void setCrashType(String CrashType) {
        this.CrashType = CrashType;
    }

    /**
     * Get <p>错误类型</p> 
     * @return ErrorType <p>错误类型</p>
     */
    public String getErrorType() {
        return this.ErrorType;
    }

    /**
     * Set <p>错误类型</p>
     * @param ErrorType <p>错误类型</p>
     */
    public void setErrorType(String ErrorType) {
        this.ErrorType = ErrorType;
    }

    /**
     * Get <p>错误值</p> 
     * @return ErrorValue <p>错误值</p>
     */
    public String getErrorValue() {
        return this.ErrorValue;
    }

    /**
     * Set <p>错误值</p>
     * @param ErrorValue <p>错误值</p>
     */
    public void setErrorValue(String ErrorValue) {
        this.ErrorValue = ErrorValue;
    }

    /**
     * Get <p>问题单 ID</p> 
     * @return IssueId <p>问题单 ID</p>
     */
    public String getIssueId() {
        return this.IssueId;
    }

    /**
     * Set <p>问题单 ID</p>
     * @param IssueId <p>问题单 ID</p>
     */
    public void setIssueId(String IssueId) {
        this.IssueId = IssueId;
    }

    /**
     * Get <p>问题单状态</p> 
     * @return Status <p>问题单状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>问题单状态</p>
     * @param Status <p>问题单状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>API 或资源 URL</p> 
     * @return URL <p>API 或资源 URL</p>
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set <p>API 或资源 URL</p>
     * @param URL <p>API 或资源 URL</p>
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get <p>次数</p> 
     * @return Count <p>次数</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>次数</p>
     * @param Count <p>次数</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>影响用户数</p> 
     * @return AffectedUser <p>影响用户数</p>
     */
    public Long getAffectedUser() {
        return this.AffectedUser;
    }

    /**
     * Set <p>影响用户数</p>
     * @param AffectedUser <p>影响用户数</p>
     */
    public void setAffectedUser(Long AffectedUser) {
        this.AffectedUser = AffectedUser;
    }

    /**
     * Get <p>失败次数</p> 
     * @return Fail <p>失败次数</p>
     */
    public Long getFail() {
        return this.Fail;
    }

    /**
     * Set <p>失败次数</p>
     * @param Fail <p>失败次数</p>
     */
    public void setFail(Long Fail) {
        this.Fail = Fail;
    }

    /**
     * Get <p>耗时</p> 
     * @return Duration <p>耗时</p>
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>耗时</p>
     * @param Duration <p>耗时</p>
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>连接时长</p> 
     * @return ConnectTime <p>连接时长</p>
     */
    public Float getConnectTime() {
        return this.ConnectTime;
    }

    /**
     * Set <p>连接时长</p>
     * @param ConnectTime <p>连接时长</p>
     */
    public void setConnectTime(Float ConnectTime) {
        this.ConnectTime = ConnectTime;
    }

    /**
     * Get <p>DNS 时长</p> 
     * @return DomainLookupTime <p>DNS 时长</p>
     */
    public Float getDomainLookupTime() {
        return this.DomainLookupTime;
    }

    /**
     * Set <p>DNS 时长</p>
     * @param DomainLookupTime <p>DNS 时长</p>
     */
    public void setDomainLookupTime(Float DomainLookupTime) {
        this.DomainLookupTime = DomainLookupTime;
    }

    /**
     * Get <p>时序</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Series <p>时序</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventRankPoint [] getSeries() {
        return this.Series;
    }

    /**
     * Set <p>时序</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Series <p>时序</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeries(EventRankPoint [] Series) {
        this.Series = Series;
    }

    public EventRankItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventRankItem(EventRankItem source) {
        if (source.Fingerprint != null) {
            this.Fingerprint = new String(source.Fingerprint);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.CrashType != null) {
            this.CrashType = new String(source.CrashType);
        }
        if (source.ErrorType != null) {
            this.ErrorType = new String(source.ErrorType);
        }
        if (source.ErrorValue != null) {
            this.ErrorValue = new String(source.ErrorValue);
        }
        if (source.IssueId != null) {
            this.IssueId = new String(source.IssueId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.AffectedUser != null) {
            this.AffectedUser = new Long(source.AffectedUser);
        }
        if (source.Fail != null) {
            this.Fail = new Long(source.Fail);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.ConnectTime != null) {
            this.ConnectTime = new Float(source.ConnectTime);
        }
        if (source.DomainLookupTime != null) {
            this.DomainLookupTime = new Float(source.DomainLookupTime);
        }
        if (source.Series != null) {
            this.Series = new EventRankPoint[source.Series.length];
            for (int i = 0; i < source.Series.length; i++) {
                this.Series[i] = new EventRankPoint(source.Series[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Fingerprint", this.Fingerprint);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "CrashType", this.CrashType);
        this.setParamSimple(map, prefix + "ErrorType", this.ErrorType);
        this.setParamSimple(map, prefix + "ErrorValue", this.ErrorValue);
        this.setParamSimple(map, prefix + "IssueId", this.IssueId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "AffectedUser", this.AffectedUser);
        this.setParamSimple(map, prefix + "Fail", this.Fail);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ConnectTime", this.ConnectTime);
        this.setParamSimple(map, prefix + "DomainLookupTime", this.DomainLookupTime);
        this.setParamArrayObj(map, prefix + "Series.", this.Series);

    }
}


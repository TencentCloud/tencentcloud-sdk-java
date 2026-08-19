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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageDetail extends AbstractModel {

    /**
    * <p>调用来源</p>
    */
    @SerializedName("CallSource")
    @Expose
    private CallSource CallSource;

    /**
    * <p>计量 ID，用于对账/回溯</p>
    */
    @SerializedName("DosageId")
    @Expose
    private String DosageId;

    /**
    * <p>调用时间戳（Unix 秒）</p>
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * <p>MODEL 域专属</p>
    */
    @SerializedName("Model")
    @Expose
    private ModelUsageDetail Model;

    /**
    * <p>PLUGIN 域专属</p>
    */
    @SerializedName("Plugin")
    @Expose
    private PluginUsageDetail Plugin;

    /**
    * <p>调用链路追踪 ID</p>
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
    * <p>用户 ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get <p>调用来源</p> 
     * @return CallSource <p>调用来源</p>
     */
    public CallSource getCallSource() {
        return this.CallSource;
    }

    /**
     * Set <p>调用来源</p>
     * @param CallSource <p>调用来源</p>
     */
    public void setCallSource(CallSource CallSource) {
        this.CallSource = CallSource;
    }

    /**
     * Get <p>计量 ID，用于对账/回溯</p> 
     * @return DosageId <p>计量 ID，用于对账/回溯</p>
     */
    public String getDosageId() {
        return this.DosageId;
    }

    /**
     * Set <p>计量 ID，用于对账/回溯</p>
     * @param DosageId <p>计量 ID，用于对账/回溯</p>
     */
    public void setDosageId(String DosageId) {
        this.DosageId = DosageId;
    }

    /**
     * Get <p>调用时间戳（Unix 秒）</p> 
     * @return EventTime <p>调用时间戳（Unix 秒）</p>
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set <p>调用时间戳（Unix 秒）</p>
     * @param EventTime <p>调用时间戳（Unix 秒）</p>
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get <p>MODEL 域专属</p> 
     * @return Model <p>MODEL 域专属</p>
     */
    public ModelUsageDetail getModel() {
        return this.Model;
    }

    /**
     * Set <p>MODEL 域专属</p>
     * @param Model <p>MODEL 域专属</p>
     */
    public void setModel(ModelUsageDetail Model) {
        this.Model = Model;
    }

    /**
     * Get <p>PLUGIN 域专属</p> 
     * @return Plugin <p>PLUGIN 域专属</p>
     */
    public PluginUsageDetail getPlugin() {
        return this.Plugin;
    }

    /**
     * Set <p>PLUGIN 域专属</p>
     * @param Plugin <p>PLUGIN 域专属</p>
     */
    public void setPlugin(PluginUsageDetail Plugin) {
        this.Plugin = Plugin;
    }

    /**
     * Get <p>调用链路追踪 ID</p> 
     * @return TraceId <p>调用链路追踪 ID</p>
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set <p>调用链路追踪 ID</p>
     * @param TraceId <p>调用链路追踪 ID</p>
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
    }

    /**
     * Get <p>用户 ID</p> 
     * @return UserId <p>用户 ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户 ID</p>
     * @param UserId <p>用户 ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public UsageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageDetail(UsageDetail source) {
        if (source.CallSource != null) {
            this.CallSource = new CallSource(source.CallSource);
        }
        if (source.DosageId != null) {
            this.DosageId = new String(source.DosageId);
        }
        if (source.EventTime != null) {
            this.EventTime = new String(source.EventTime);
        }
        if (source.Model != null) {
            this.Model = new ModelUsageDetail(source.Model);
        }
        if (source.Plugin != null) {
            this.Plugin = new PluginUsageDetail(source.Plugin);
        }
        if (source.TraceId != null) {
            this.TraceId = new String(source.TraceId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CallSource.", this.CallSource);
        this.setParamSimple(map, prefix + "DosageId", this.DosageId);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamObj(map, prefix + "Model.", this.Model);
        this.setParamObj(map, prefix + "Plugin.", this.Plugin);
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}


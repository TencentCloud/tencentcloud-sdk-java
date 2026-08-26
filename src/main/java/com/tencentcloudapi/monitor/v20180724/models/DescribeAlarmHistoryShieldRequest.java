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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmHistoryShieldRequest extends AbstractModel {

    /**
    * 模块名，这里填“monitor”
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 策略id
    */
    @SerializedName("ShieldPolicyId")
    @Expose
    private String ShieldPolicyId;

    /**
    * 告警历史维度
    */
    @SerializedName("ShieldObject")
    @Expose
    private String [] ShieldObject;

    /**
    * 指标名称
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 屏蔽策略Id
    */
    @SerializedName("ShieldId")
    @Expose
    private String ShieldId;

    /**
    * 告警等级
    */
    @SerializedName("ShieldAlarmLevel")
    @Expose
    private String ShieldAlarmLevel;

    /**
    * 告警历史会话ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 监控类型
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
     * Get 模块名，这里填“monitor” 
     * @return Module 模块名，这里填“monitor”
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，这里填“monitor”
     * @param Module 模块名，这里填“monitor”
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 策略id 
     * @return ShieldPolicyId 策略id
     */
    public String getShieldPolicyId() {
        return this.ShieldPolicyId;
    }

    /**
     * Set 策略id
     * @param ShieldPolicyId 策略id
     */
    public void setShieldPolicyId(String ShieldPolicyId) {
        this.ShieldPolicyId = ShieldPolicyId;
    }

    /**
     * Get 告警历史维度 
     * @return ShieldObject 告警历史维度
     */
    public String [] getShieldObject() {
        return this.ShieldObject;
    }

    /**
     * Set 告警历史维度
     * @param ShieldObject 告警历史维度
     */
    public void setShieldObject(String [] ShieldObject) {
        this.ShieldObject = ShieldObject;
    }

    /**
     * Get 指标名称 
     * @return MetricName 指标名称
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名称
     * @param MetricName 指标名称
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 屏蔽策略Id 
     * @return ShieldId 屏蔽策略Id
     */
    public String getShieldId() {
        return this.ShieldId;
    }

    /**
     * Set 屏蔽策略Id
     * @param ShieldId 屏蔽策略Id
     */
    public void setShieldId(String ShieldId) {
        this.ShieldId = ShieldId;
    }

    /**
     * Get 告警等级 
     * @return ShieldAlarmLevel 告警等级
     */
    public String getShieldAlarmLevel() {
        return this.ShieldAlarmLevel;
    }

    /**
     * Set 告警等级
     * @param ShieldAlarmLevel 告警等级
     */
    public void setShieldAlarmLevel(String ShieldAlarmLevel) {
        this.ShieldAlarmLevel = ShieldAlarmLevel;
    }

    /**
     * Get 告警历史会话ID 
     * @return SessionId 告警历史会话ID
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 告警历史会话ID
     * @param SessionId 告警历史会话ID
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 监控类型 
     * @return MonitorType 监控类型
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 监控类型
     * @param MonitorType 监控类型
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    public DescribeAlarmHistoryShieldRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmHistoryShieldRequest(DescribeAlarmHistoryShieldRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.ShieldPolicyId != null) {
            this.ShieldPolicyId = new String(source.ShieldPolicyId);
        }
        if (source.ShieldObject != null) {
            this.ShieldObject = new String[source.ShieldObject.length];
            for (int i = 0; i < source.ShieldObject.length; i++) {
                this.ShieldObject[i] = new String(source.ShieldObject[i]);
            }
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.ShieldId != null) {
            this.ShieldId = new String(source.ShieldId);
        }
        if (source.ShieldAlarmLevel != null) {
            this.ShieldAlarmLevel = new String(source.ShieldAlarmLevel);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new String(source.MonitorType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "ShieldPolicyId", this.ShieldPolicyId);
        this.setParamArraySimple(map, prefix + "ShieldObject.", this.ShieldObject);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "ShieldId", this.ShieldId);
        this.setParamSimple(map, prefix + "ShieldAlarmLevel", this.ShieldAlarmLevel);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);

    }
}


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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmsRules extends AbstractModel {

    /**
    * 间隔
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 告警名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 指标
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 操作符
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 等级 
fatal-致命
critical-严重
warning-告警
information-通知

    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * 指标值
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get 间隔 
     * @return Interval 间隔
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 间隔
     * @param Interval 间隔
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 告警名 
     * @return Name 告警名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 告警名
     * @param Name 告警名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 指标 
     * @return Metric 指标
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 指标
     * @param Metric 指标
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 操作符 
     * @return Operator 操作符
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作符
     * @param Operator 操作符
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 等级 
fatal-致命
critical-严重
warning-告警
information-通知
 
     * @return Severity 等级 
fatal-致命
critical-严重
warning-告警
information-通知

     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set 等级 
fatal-致命
critical-严重
warning-告警
information-通知

     * @param Severity 等级 
fatal-致命
critical-严重
warning-告警
information-通知

     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    /**
     * Get 指标值 
     * @return Value 指标值
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set 指标值
     * @param Value 指标值
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    public AlarmsRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmsRules(AlarmsRules source) {
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}


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

public class MetricQueryItem extends AbstractModel {

    /**
    * <p>事件类型</p>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * <p>指标名列表，如 count / rate</p>
    */
    @SerializedName("Metrics")
    @Expose
    private String [] Metrics;

    /**
    * <p>条目 Key，缺省为 EventType/SubType/MeasurementKey</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>子类型</p>
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * <p>分位/均值测量键</p>
    */
    @SerializedName("MeasurementKey")
    @Expose
    private String MeasurementKey;

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
     * Get <p>指标名列表，如 count / rate</p> 
     * @return Metrics <p>指标名列表，如 count / rate</p>
     */
    public String [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set <p>指标名列表，如 count / rate</p>
     * @param Metrics <p>指标名列表，如 count / rate</p>
     */
    public void setMetrics(String [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get <p>条目 Key，缺省为 EventType/SubType/MeasurementKey</p> 
     * @return Key <p>条目 Key，缺省为 EventType/SubType/MeasurementKey</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>条目 Key，缺省为 EventType/SubType/MeasurementKey</p>
     * @param Key <p>条目 Key，缺省为 EventType/SubType/MeasurementKey</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>子类型</p> 
     * @return SubType <p>子类型</p>
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set <p>子类型</p>
     * @param SubType <p>子类型</p>
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get <p>分位/均值测量键</p> 
     * @return MeasurementKey <p>分位/均值测量键</p>
     */
    public String getMeasurementKey() {
        return this.MeasurementKey;
    }

    /**
     * Set <p>分位/均值测量键</p>
     * @param MeasurementKey <p>分位/均值测量键</p>
     */
    public void setMeasurementKey(String MeasurementKey) {
        this.MeasurementKey = MeasurementKey;
    }

    public MetricQueryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricQueryItem(MetricQueryItem source) {
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.Metrics != null) {
            this.Metrics = new String[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new String(source.Metrics[i]);
            }
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
        }
        if (source.MeasurementKey != null) {
            this.MeasurementKey = new String(source.MeasurementKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamArraySimple(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamSimple(map, prefix + "MeasurementKey", this.MeasurementKey);

    }
}


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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceServiceMonitorRecord extends AbstractModel {

    /**
    * 推理服务 ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 指标名称。
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 详细推理服务监控数据。
    */
    @SerializedName("InferenceServiceMonitorItems")
    @Expose
    private InferenceServiceMonitorItem [] InferenceServiceMonitorItems;

    /**
     * Get 推理服务 ID。 
     * @return ServiceId 推理服务 ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 推理服务 ID。
     * @param ServiceId 推理服务 ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 指标名称。 
     * @return MetricName 指标名称。
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名称。
     * @param MetricName 指标名称。
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 详细推理服务监控数据。 
     * @return InferenceServiceMonitorItems 详细推理服务监控数据。
     */
    public InferenceServiceMonitorItem [] getInferenceServiceMonitorItems() {
        return this.InferenceServiceMonitorItems;
    }

    /**
     * Set 详细推理服务监控数据。
     * @param InferenceServiceMonitorItems 详细推理服务监控数据。
     */
    public void setInferenceServiceMonitorItems(InferenceServiceMonitorItem [] InferenceServiceMonitorItems) {
        this.InferenceServiceMonitorItems = InferenceServiceMonitorItems;
    }

    public InferenceServiceMonitorRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceServiceMonitorRecord(InferenceServiceMonitorRecord source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.InferenceServiceMonitorItems != null) {
            this.InferenceServiceMonitorItems = new InferenceServiceMonitorItem[source.InferenceServiceMonitorItems.length];
            for (int i = 0; i < source.InferenceServiceMonitorItems.length; i++) {
                this.InferenceServiceMonitorItems[i] = new InferenceServiceMonitorItem(source.InferenceServiceMonitorItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArrayObj(map, prefix + "InferenceServiceMonitorItems.", this.InferenceServiceMonitorItems);

    }
}


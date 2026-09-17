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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueueResourceQuota extends AbstractModel {

    /**
    * <p>资源类型标识。CPU / HM_CPU 类计费项统一映射为 "CU"；GPU 类计费项取卡型简称（如 "T4"、"H20"）</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>资源单位。CU 类为 "core"；GPU 类为 "card"</p>
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * <p>配额总量，由 resource_usage 最大值（index 1）× spec 折算得出</p>
    */
    @SerializedName("Total")
    @Expose
    private Float Total;

    /**
    * 当前已使用量，计费 spec 口径：队列内业务容器（ray-head/ray-worker）的 Pod limits 之和，经 kube_pod_labels 按 local queue 过滤。依赖 kube_pod_labels 指标采集，未开启时恒为 0
    */
    @SerializedName("Used")
    @Expose
    private Float Used;

    /**
    * <p>可用量（总量 - 已使用量，截断至 0）。当 used 超出 total 时（例如配额尚未生效或数据短暂不一致），返回 0 而非负数</p>
    */
    @SerializedName("Available")
    @Expose
    private Float Available;

    /**
     * Get <p>资源类型标识。CPU / HM_CPU 类计费项统一映射为 "CU"；GPU 类计费项取卡型简称（如 "T4"、"H20"）</p> 
     * @return ResourceType <p>资源类型标识。CPU / HM_CPU 类计费项统一映射为 "CU"；GPU 类计费项取卡型简称（如 "T4"、"H20"）</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型标识。CPU / HM_CPU 类计费项统一映射为 "CU"；GPU 类计费项取卡型简称（如 "T4"、"H20"）</p>
     * @param ResourceType <p>资源类型标识。CPU / HM_CPU 类计费项统一映射为 "CU"；GPU 类计费项取卡型简称（如 "T4"、"H20"）</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>资源单位。CU 类为 "core"；GPU 类为 "card"</p> 
     * @return Unit <p>资源单位。CU 类为 "core"；GPU 类为 "card"</p>
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set <p>资源单位。CU 类为 "core"；GPU 类为 "card"</p>
     * @param Unit <p>资源单位。CU 类为 "core"；GPU 类为 "card"</p>
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get <p>配额总量，由 resource_usage 最大值（index 1）× spec 折算得出</p> 
     * @return Total <p>配额总量，由 resource_usage 最大值（index 1）× spec 折算得出</p>
     */
    public Float getTotal() {
        return this.Total;
    }

    /**
     * Set <p>配额总量，由 resource_usage 最大值（index 1）× spec 折算得出</p>
     * @param Total <p>配额总量，由 resource_usage 最大值（index 1）× spec 折算得出</p>
     */
    public void setTotal(Float Total) {
        this.Total = Total;
    }

    /**
     * Get 当前已使用量，计费 spec 口径：队列内业务容器（ray-head/ray-worker）的 Pod limits 之和，经 kube_pod_labels 按 local queue 过滤。依赖 kube_pod_labels 指标采集，未开启时恒为 0 
     * @return Used 当前已使用量，计费 spec 口径：队列内业务容器（ray-head/ray-worker）的 Pod limits 之和，经 kube_pod_labels 按 local queue 过滤。依赖 kube_pod_labels 指标采集，未开启时恒为 0
     */
    public Float getUsed() {
        return this.Used;
    }

    /**
     * Set 当前已使用量，计费 spec 口径：队列内业务容器（ray-head/ray-worker）的 Pod limits 之和，经 kube_pod_labels 按 local queue 过滤。依赖 kube_pod_labels 指标采集，未开启时恒为 0
     * @param Used 当前已使用量，计费 spec 口径：队列内业务容器（ray-head/ray-worker）的 Pod limits 之和，经 kube_pod_labels 按 local queue 过滤。依赖 kube_pod_labels 指标采集，未开启时恒为 0
     */
    public void setUsed(Float Used) {
        this.Used = Used;
    }

    /**
     * Get <p>可用量（总量 - 已使用量，截断至 0）。当 used 超出 total 时（例如配额尚未生效或数据短暂不一致），返回 0 而非负数</p> 
     * @return Available <p>可用量（总量 - 已使用量，截断至 0）。当 used 超出 total 时（例如配额尚未生效或数据短暂不一致），返回 0 而非负数</p>
     */
    public Float getAvailable() {
        return this.Available;
    }

    /**
     * Set <p>可用量（总量 - 已使用量，截断至 0）。当 used 超出 total 时（例如配额尚未生效或数据短暂不一致），返回 0 而非负数</p>
     * @param Available <p>可用量（总量 - 已使用量，截断至 0）。当 used 超出 total 时（例如配额尚未生效或数据短暂不一致），返回 0 而非负数</p>
     */
    public void setAvailable(Float Available) {
        this.Available = Available;
    }

    public QueueResourceQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueueResourceQuota(QueueResourceQuota source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Total != null) {
            this.Total = new Float(source.Total);
        }
        if (source.Used != null) {
            this.Used = new Float(source.Used);
        }
        if (source.Available != null) {
            this.Available = new Float(source.Available);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Used", this.Used);
        this.setParamSimple(map, prefix + "Available", this.Available);

    }
}


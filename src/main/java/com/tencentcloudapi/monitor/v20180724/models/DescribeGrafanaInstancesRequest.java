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

public class DescribeGrafanaInstancesRequest extends AbstractModel {

    /**
    * <p>查询偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>查询数量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Grafana 实例 ID 数组</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>Grafana 实例名，支持前缀模糊搜索</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>查询状态</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long [] InstanceStatus;

    /**
    * <p>标签过滤数组</p>
    */
    @SerializedName("TagFilters")
    @Expose
    private PrometheusTag [] TagFilters;

    /**
     * Get <p>查询偏移量</p> 
     * @return Offset <p>查询偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>查询偏移量</p>
     * @param Offset <p>查询偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>查询数量</p> 
     * @return Limit <p>查询数量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>查询数量</p>
     * @param Limit <p>查询数量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Grafana 实例 ID 数组</p> 
     * @return InstanceIds <p>Grafana 实例 ID 数组</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>Grafana 实例 ID 数组</p>
     * @param InstanceIds <p>Grafana 实例 ID 数组</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>Grafana 实例名，支持前缀模糊搜索</p> 
     * @return InstanceName <p>Grafana 实例名，支持前缀模糊搜索</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Grafana 实例名，支持前缀模糊搜索</p>
     * @param InstanceName <p>Grafana 实例名，支持前缀模糊搜索</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>查询状态</p> 
     * @return InstanceStatus <p>查询状态</p>
     */
    public Long [] getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>查询状态</p>
     * @param InstanceStatus <p>查询状态</p>
     */
    public void setInstanceStatus(Long [] InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>标签过滤数组</p> 
     * @return TagFilters <p>标签过滤数组</p>
     */
    public PrometheusTag [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set <p>标签过滤数组</p>
     * @param TagFilters <p>标签过滤数组</p>
     */
    public void setTagFilters(PrometheusTag [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    public DescribeGrafanaInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGrafanaInstancesRequest(DescribeGrafanaInstancesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long[source.InstanceStatus.length];
            for (int i = 0; i < source.InstanceStatus.length; i++) {
                this.InstanceStatus[i] = new Long(source.InstanceStatus[i]);
            }
        }
        if (source.TagFilters != null) {
            this.TagFilters = new PrometheusTag[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new PrometheusTag(source.TagFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "InstanceStatus.", this.InstanceStatus);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}


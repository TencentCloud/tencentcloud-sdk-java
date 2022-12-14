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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGrafanaInstancesRequest extends AbstractModel{

    /**
    * 查询偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Grafana 实例 ID 数组
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Grafana 实例名，支持前缀模糊搜索
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 查询状态
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long [] InstanceStatus;

    /**
    * 标签过滤数组
    */
    @SerializedName("TagFilters")
    @Expose
    private PrometheusTag [] TagFilters;

    /**
     * Get 查询偏移量 
     * @return Offset 查询偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移量
     * @param Offset 查询偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询数量 
     * @return Limit 查询数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询数量
     * @param Limit 查询数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Grafana 实例 ID 数组 
     * @return InstanceIds Grafana 实例 ID 数组
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Grafana 实例 ID 数组
     * @param InstanceIds Grafana 实例 ID 数组
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Grafana 实例名，支持前缀模糊搜索 
     * @return InstanceName Grafana 实例名，支持前缀模糊搜索
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Grafana 实例名，支持前缀模糊搜索
     * @param InstanceName Grafana 实例名，支持前缀模糊搜索
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 查询状态 
     * @return InstanceStatus 查询状态
     */
    public Long [] getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 查询状态
     * @param InstanceStatus 查询状态
     */
    public void setInstanceStatus(Long [] InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 标签过滤数组 
     * @return TagFilters 标签过滤数组
     */
    public PrometheusTag [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set 标签过滤数组
     * @param TagFilters 标签过滤数组
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


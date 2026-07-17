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

public class DescribePrometheusAlertGroupsRequest extends AbstractModel {

    /**
    * <p>Prometheus 实例 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>返回数量，默认为 20，最大值为 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，默认为 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>告警分组ID，形如alert-xxxx。<br>查询给定ID的告警分组</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>告警分组名称。<br>查询名称中包含给定字符串的告警分组</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>通过自定义label查询告警规则：<br>返回包含符合过滤条件告警规则的整个分组</p><p>多个label过滤条件取交集</p>
    */
    @SerializedName("Labels")
    @Expose
    private PrometheusRuleKV [] Labels;

    /**
     * Get <p>Prometheus 实例 ID</p> 
     * @return InstanceId <p>Prometheus 实例 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Prometheus 实例 ID</p>
     * @param InstanceId <p>Prometheus 实例 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>返回数量，默认为 20，最大值为 100</p> 
     * @return Limit <p>返回数量，默认为 20，最大值为 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为 20，最大值为 100</p>
     * @param Limit <p>返回数量，默认为 20，最大值为 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，默认为 0</p> 
     * @return Offset <p>偏移量，默认为 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为 0</p>
     * @param Offset <p>偏移量，默认为 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>告警分组ID，形如alert-xxxx。<br>查询给定ID的告警分组</p> 
     * @return GroupId <p>告警分组ID，形如alert-xxxx。<br>查询给定ID的告警分组</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>告警分组ID，形如alert-xxxx。<br>查询给定ID的告警分组</p>
     * @param GroupId <p>告警分组ID，形如alert-xxxx。<br>查询给定ID的告警分组</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>告警分组名称。<br>查询名称中包含给定字符串的告警分组</p> 
     * @return GroupName <p>告警分组名称。<br>查询名称中包含给定字符串的告警分组</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>告警分组名称。<br>查询名称中包含给定字符串的告警分组</p>
     * @param GroupName <p>告警分组名称。<br>查询名称中包含给定字符串的告警分组</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>通过自定义label查询告警规则：<br>返回包含符合过滤条件告警规则的整个分组</p><p>多个label过滤条件取交集</p> 
     * @return Labels <p>通过自定义label查询告警规则：<br>返回包含符合过滤条件告警规则的整个分组</p><p>多个label过滤条件取交集</p>
     */
    public PrometheusRuleKV [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>通过自定义label查询告警规则：<br>返回包含符合过滤条件告警规则的整个分组</p><p>多个label过滤条件取交集</p>
     * @param Labels <p>通过自定义label查询告警规则：<br>返回包含符合过滤条件告警规则的整个分组</p><p>多个label过滤条件取交集</p>
     */
    public void setLabels(PrometheusRuleKV [] Labels) {
        this.Labels = Labels;
    }

    public DescribePrometheusAlertGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusAlertGroupsRequest(DescribePrometheusAlertGroupsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Labels != null) {
            this.Labels = new PrometheusRuleKV[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new PrometheusRuleKV(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);

    }
}


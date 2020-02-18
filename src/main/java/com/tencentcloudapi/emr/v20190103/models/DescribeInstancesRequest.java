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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel{

    /**
    * 集群展示策略，该字段取值根据所选页面不同输入不同，集群列表页：clusterList，集群监控：monitorManage，云硬件管理：cloudHardwareManage，组件管理页：componentManage
    */
    @SerializedName("DisplayStrategy")
    @Expose
    private String DisplayStrategy;

    /**
    * 查询列表,  如果不填写，返回该AppId下所有实例列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 查询偏移量，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询结果限制，默认值10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 项目列表，默认值-1
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 排序字段，当前支持以下排序字段：clusterId、addTime、status
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方法，0降序，1升序
    */
    @SerializedName("Asc")
    @Expose
    private Long Asc;

    /**
     * Get 集群展示策略，该字段取值根据所选页面不同输入不同，集群列表页：clusterList，集群监控：monitorManage，云硬件管理：cloudHardwareManage，组件管理页：componentManage 
     * @return DisplayStrategy 集群展示策略，该字段取值根据所选页面不同输入不同，集群列表页：clusterList，集群监控：monitorManage，云硬件管理：cloudHardwareManage，组件管理页：componentManage
     */
    public String getDisplayStrategy() {
        return this.DisplayStrategy;
    }

    /**
     * Set 集群展示策略，该字段取值根据所选页面不同输入不同，集群列表页：clusterList，集群监控：monitorManage，云硬件管理：cloudHardwareManage，组件管理页：componentManage
     * @param DisplayStrategy 集群展示策略，该字段取值根据所选页面不同输入不同，集群列表页：clusterList，集群监控：monitorManage，云硬件管理：cloudHardwareManage，组件管理页：componentManage
     */
    public void setDisplayStrategy(String DisplayStrategy) {
        this.DisplayStrategy = DisplayStrategy;
    }

    /**
     * Get 查询列表,  如果不填写，返回该AppId下所有实例列表 
     * @return InstanceIds 查询列表,  如果不填写，返回该AppId下所有实例列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 查询列表,  如果不填写，返回该AppId下所有实例列表
     * @param InstanceIds 查询列表,  如果不填写，返回该AppId下所有实例列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 查询偏移量，默认0 
     * @return Offset 查询偏移量，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移量，默认0
     * @param Offset 查询偏移量，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询结果限制，默认值10 
     * @return Limit 查询结果限制，默认值10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询结果限制，默认值10
     * @param Limit 查询结果限制，默认值10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 项目列表，默认值-1 
     * @return ProjectId 项目列表，默认值-1
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目列表，默认值-1
     * @param ProjectId 项目列表，默认值-1
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 排序字段，当前支持以下排序字段：clusterId、addTime、status 
     * @return OrderField 排序字段，当前支持以下排序字段：clusterId、addTime、status
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段，当前支持以下排序字段：clusterId、addTime、status
     * @param OrderField 排序字段，当前支持以下排序字段：clusterId、addTime、status
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序方法，0降序，1升序 
     * @return Asc 排序方法，0降序，1升序
     */
    public Long getAsc() {
        return this.Asc;
    }

    /**
     * Set 排序方法，0降序，1升序
     * @param Asc 排序方法，0降序，1升序
     */
    public void setAsc(Long Asc) {
        this.Asc = Asc;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisplayStrategy", this.DisplayStrategy);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Asc", this.Asc);

    }
}


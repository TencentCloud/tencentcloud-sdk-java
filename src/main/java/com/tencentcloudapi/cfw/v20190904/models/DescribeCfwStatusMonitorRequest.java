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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCfwStatusMonitorRequest extends AbstractModel {

    /**
    * <p>操作类型。describe_scene 表示发现场景和二级下拉选项；fetch_scene 表示获取具体场景快照。必填。</p>
    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * <p>防火墙场景类型。支持 internet_edge（互联网边界防火墙）、nat_cluster（NAT边界防火墙-集群）、nat_ha（NAT边界防火墙-主备）、vpc_cluster（VPC边界防火墙-集群）、vpc_ha（VPC边界防火墙-主备）。必填。</p>
    */
    @SerializedName("FirewallType")
    @Expose
    private String FirewallType;

    /**
    * <p>二级下拉选项 ID。fetch_scene 按需传入；internet_edge 为地域，NAT 为实例 ID，VPC 带宽场景为防火墙组 ID；vpc_cluster 的 connections 汇总场景会忽略该参数。</p>
    */
    @SerializedName("SelectionId")
    @Expose
    private String SelectionId;

    /**
    * <p>二级下拉显示名称。可替代 SelectionId 按名称匹配。</p>
    */
    @SerializedName("SelectionName")
    @Expose
    private String SelectionName;

    /**
    * <p>引擎实例 ID。主要用于 vpc_ha 下一个防火墙组对应多个实例的场景。</p>
    */
    @SerializedName("SelectionInstanceId")
    @Expose
    private String SelectionInstanceId;

    /**
    * <p>指标页签。fetch_scene 可传；不传时使用该场景默认值。支持 bandwidth、connections。</p>
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * <p>指标下的视角。fetch_scene 可传；不传时使用该场景默认值。支持 ip、subnet、session、switch、vpc，实际可用组合以 describe_scene 返回为准。</p>
    */
    @SerializedName("Perspective")
    @Expose
    private String Perspective;

    /**
    * <p>NAT 主备连接数 IP 视角范围。external 表示外部 IP，asset 表示资产 IP；仅 nat_ha + connections + ip 使用。</p>
    */
    @SerializedName("IpScope")
    @Expose
    private String IpScope;

    /**
    * <p>预设时间范围。默认 24h；fetch_scene 使用。支持 5m、15m、30m、1h、6h、24h、3d、7d、30d、today、yesterday、day_before_yesterday、this_week、last_week、this_month。</p>
    */
    @SerializedName("TimePreset")
    @Expose
    private String TimePreset;

    /**
    * <p>自定义开始时间。格式 YYYY-MM-DD HH:MM:SS；必须与 EndTime 同时传，最大跨度 30 天。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>自定义结束时间。格式 YYYY-MM-DD HH:MM:SS；必须与 StartTime 同时传，最大跨度 30 天。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>页码，从 1 开始。默认 1；fetch_scene 列表视角使用。</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>每页条数。默认 10，最大 100；fetch_scene 列表视角使用。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>是否只获取概览数据。true 时 fetch_scene 只请求 overview，跳过 table/detail，适合只看场景快照汇总。</p>
    */
    @SerializedName("OverviewOnly")
    @Expose
    private Boolean OverviewOnly;

    /**
    * <p>原始偏移量覆盖。可选，传入后覆盖 Page 计算结果；必须大于等于 0 且不超过安全上限。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>排序字段。可选，只接受当前场景后端允许的安全字段。</p>
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * <p>排序方向。默认 desc；支持 asc、desc。</p>
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * <p>过滤条件列表。可选，最多 5 个；是否支持以及字段名以具体 fetch_scene 场景为准。</p>
    */
    @SerializedName("Filters")
    @Expose
    private CfwStatusMonitorFilter [] Filters;

    /**
     * Get <p>操作类型。describe_scene 表示发现场景和二级下拉选项；fetch_scene 表示获取具体场景快照。必填。</p> 
     * @return Op <p>操作类型。describe_scene 表示发现场景和二级下拉选项；fetch_scene 表示获取具体场景快照。必填。</p>
     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set <p>操作类型。describe_scene 表示发现场景和二级下拉选项；fetch_scene 表示获取具体场景快照。必填。</p>
     * @param Op <p>操作类型。describe_scene 表示发现场景和二级下拉选项；fetch_scene 表示获取具体场景快照。必填。</p>
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get <p>防火墙场景类型。支持 internet_edge（互联网边界防火墙）、nat_cluster（NAT边界防火墙-集群）、nat_ha（NAT边界防火墙-主备）、vpc_cluster（VPC边界防火墙-集群）、vpc_ha（VPC边界防火墙-主备）。必填。</p> 
     * @return FirewallType <p>防火墙场景类型。支持 internet_edge（互联网边界防火墙）、nat_cluster（NAT边界防火墙-集群）、nat_ha（NAT边界防火墙-主备）、vpc_cluster（VPC边界防火墙-集群）、vpc_ha（VPC边界防火墙-主备）。必填。</p>
     */
    public String getFirewallType() {
        return this.FirewallType;
    }

    /**
     * Set <p>防火墙场景类型。支持 internet_edge（互联网边界防火墙）、nat_cluster（NAT边界防火墙-集群）、nat_ha（NAT边界防火墙-主备）、vpc_cluster（VPC边界防火墙-集群）、vpc_ha（VPC边界防火墙-主备）。必填。</p>
     * @param FirewallType <p>防火墙场景类型。支持 internet_edge（互联网边界防火墙）、nat_cluster（NAT边界防火墙-集群）、nat_ha（NAT边界防火墙-主备）、vpc_cluster（VPC边界防火墙-集群）、vpc_ha（VPC边界防火墙-主备）。必填。</p>
     */
    public void setFirewallType(String FirewallType) {
        this.FirewallType = FirewallType;
    }

    /**
     * Get <p>二级下拉选项 ID。fetch_scene 按需传入；internet_edge 为地域，NAT 为实例 ID，VPC 带宽场景为防火墙组 ID；vpc_cluster 的 connections 汇总场景会忽略该参数。</p> 
     * @return SelectionId <p>二级下拉选项 ID。fetch_scene 按需传入；internet_edge 为地域，NAT 为实例 ID，VPC 带宽场景为防火墙组 ID；vpc_cluster 的 connections 汇总场景会忽略该参数。</p>
     */
    public String getSelectionId() {
        return this.SelectionId;
    }

    /**
     * Set <p>二级下拉选项 ID。fetch_scene 按需传入；internet_edge 为地域，NAT 为实例 ID，VPC 带宽场景为防火墙组 ID；vpc_cluster 的 connections 汇总场景会忽略该参数。</p>
     * @param SelectionId <p>二级下拉选项 ID。fetch_scene 按需传入；internet_edge 为地域，NAT 为实例 ID，VPC 带宽场景为防火墙组 ID；vpc_cluster 的 connections 汇总场景会忽略该参数。</p>
     */
    public void setSelectionId(String SelectionId) {
        this.SelectionId = SelectionId;
    }

    /**
     * Get <p>二级下拉显示名称。可替代 SelectionId 按名称匹配。</p> 
     * @return SelectionName <p>二级下拉显示名称。可替代 SelectionId 按名称匹配。</p>
     */
    public String getSelectionName() {
        return this.SelectionName;
    }

    /**
     * Set <p>二级下拉显示名称。可替代 SelectionId 按名称匹配。</p>
     * @param SelectionName <p>二级下拉显示名称。可替代 SelectionId 按名称匹配。</p>
     */
    public void setSelectionName(String SelectionName) {
        this.SelectionName = SelectionName;
    }

    /**
     * Get <p>引擎实例 ID。主要用于 vpc_ha 下一个防火墙组对应多个实例的场景。</p> 
     * @return SelectionInstanceId <p>引擎实例 ID。主要用于 vpc_ha 下一个防火墙组对应多个实例的场景。</p>
     */
    public String getSelectionInstanceId() {
        return this.SelectionInstanceId;
    }

    /**
     * Set <p>引擎实例 ID。主要用于 vpc_ha 下一个防火墙组对应多个实例的场景。</p>
     * @param SelectionInstanceId <p>引擎实例 ID。主要用于 vpc_ha 下一个防火墙组对应多个实例的场景。</p>
     */
    public void setSelectionInstanceId(String SelectionInstanceId) {
        this.SelectionInstanceId = SelectionInstanceId;
    }

    /**
     * Get <p>指标页签。fetch_scene 可传；不传时使用该场景默认值。支持 bandwidth、connections。</p> 
     * @return Metric <p>指标页签。fetch_scene 可传；不传时使用该场景默认值。支持 bandwidth、connections。</p>
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set <p>指标页签。fetch_scene 可传；不传时使用该场景默认值。支持 bandwidth、connections。</p>
     * @param Metric <p>指标页签。fetch_scene 可传；不传时使用该场景默认值。支持 bandwidth、connections。</p>
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get <p>指标下的视角。fetch_scene 可传；不传时使用该场景默认值。支持 ip、subnet、session、switch、vpc，实际可用组合以 describe_scene 返回为准。</p> 
     * @return Perspective <p>指标下的视角。fetch_scene 可传；不传时使用该场景默认值。支持 ip、subnet、session、switch、vpc，实际可用组合以 describe_scene 返回为准。</p>
     */
    public String getPerspective() {
        return this.Perspective;
    }

    /**
     * Set <p>指标下的视角。fetch_scene 可传；不传时使用该场景默认值。支持 ip、subnet、session、switch、vpc，实际可用组合以 describe_scene 返回为准。</p>
     * @param Perspective <p>指标下的视角。fetch_scene 可传；不传时使用该场景默认值。支持 ip、subnet、session、switch、vpc，实际可用组合以 describe_scene 返回为准。</p>
     */
    public void setPerspective(String Perspective) {
        this.Perspective = Perspective;
    }

    /**
     * Get <p>NAT 主备连接数 IP 视角范围。external 表示外部 IP，asset 表示资产 IP；仅 nat_ha + connections + ip 使用。</p> 
     * @return IpScope <p>NAT 主备连接数 IP 视角范围。external 表示外部 IP，asset 表示资产 IP；仅 nat_ha + connections + ip 使用。</p>
     */
    public String getIpScope() {
        return this.IpScope;
    }

    /**
     * Set <p>NAT 主备连接数 IP 视角范围。external 表示外部 IP，asset 表示资产 IP；仅 nat_ha + connections + ip 使用。</p>
     * @param IpScope <p>NAT 主备连接数 IP 视角范围。external 表示外部 IP，asset 表示资产 IP；仅 nat_ha + connections + ip 使用。</p>
     */
    public void setIpScope(String IpScope) {
        this.IpScope = IpScope;
    }

    /**
     * Get <p>预设时间范围。默认 24h；fetch_scene 使用。支持 5m、15m、30m、1h、6h、24h、3d、7d、30d、today、yesterday、day_before_yesterday、this_week、last_week、this_month。</p> 
     * @return TimePreset <p>预设时间范围。默认 24h；fetch_scene 使用。支持 5m、15m、30m、1h、6h、24h、3d、7d、30d、today、yesterday、day_before_yesterday、this_week、last_week、this_month。</p>
     */
    public String getTimePreset() {
        return this.TimePreset;
    }

    /**
     * Set <p>预设时间范围。默认 24h；fetch_scene 使用。支持 5m、15m、30m、1h、6h、24h、3d、7d、30d、today、yesterday、day_before_yesterday、this_week、last_week、this_month。</p>
     * @param TimePreset <p>预设时间范围。默认 24h；fetch_scene 使用。支持 5m、15m、30m、1h、6h、24h、3d、7d、30d、today、yesterday、day_before_yesterday、this_week、last_week、this_month。</p>
     */
    public void setTimePreset(String TimePreset) {
        this.TimePreset = TimePreset;
    }

    /**
     * Get <p>自定义开始时间。格式 YYYY-MM-DD HH:MM:SS；必须与 EndTime 同时传，最大跨度 30 天。</p> 
     * @return StartTime <p>自定义开始时间。格式 YYYY-MM-DD HH:MM:SS；必须与 EndTime 同时传，最大跨度 30 天。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>自定义开始时间。格式 YYYY-MM-DD HH:MM:SS；必须与 EndTime 同时传，最大跨度 30 天。</p>
     * @param StartTime <p>自定义开始时间。格式 YYYY-MM-DD HH:MM:SS；必须与 EndTime 同时传，最大跨度 30 天。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>自定义结束时间。格式 YYYY-MM-DD HH:MM:SS；必须与 StartTime 同时传，最大跨度 30 天。</p> 
     * @return EndTime <p>自定义结束时间。格式 YYYY-MM-DD HH:MM:SS；必须与 StartTime 同时传，最大跨度 30 天。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>自定义结束时间。格式 YYYY-MM-DD HH:MM:SS；必须与 StartTime 同时传，最大跨度 30 天。</p>
     * @param EndTime <p>自定义结束时间。格式 YYYY-MM-DD HH:MM:SS；必须与 StartTime 同时传，最大跨度 30 天。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>页码，从 1 开始。默认 1；fetch_scene 列表视角使用。</p> 
     * @return Page <p>页码，从 1 开始。默认 1；fetch_scene 列表视角使用。</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>页码，从 1 开始。默认 1；fetch_scene 列表视角使用。</p>
     * @param Page <p>页码，从 1 开始。默认 1；fetch_scene 列表视角使用。</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>每页条数。默认 10，最大 100；fetch_scene 列表视角使用。</p> 
     * @return Limit <p>每页条数。默认 10，最大 100；fetch_scene 列表视角使用。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页条数。默认 10，最大 100；fetch_scene 列表视角使用。</p>
     * @param Limit <p>每页条数。默认 10，最大 100；fetch_scene 列表视角使用。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>是否只获取概览数据。true 时 fetch_scene 只请求 overview，跳过 table/detail，适合只看场景快照汇总。</p> 
     * @return OverviewOnly <p>是否只获取概览数据。true 时 fetch_scene 只请求 overview，跳过 table/detail，适合只看场景快照汇总。</p>
     */
    public Boolean getOverviewOnly() {
        return this.OverviewOnly;
    }

    /**
     * Set <p>是否只获取概览数据。true 时 fetch_scene 只请求 overview，跳过 table/detail，适合只看场景快照汇总。</p>
     * @param OverviewOnly <p>是否只获取概览数据。true 时 fetch_scene 只请求 overview，跳过 table/detail，适合只看场景快照汇总。</p>
     */
    public void setOverviewOnly(Boolean OverviewOnly) {
        this.OverviewOnly = OverviewOnly;
    }

    /**
     * Get <p>原始偏移量覆盖。可选，传入后覆盖 Page 计算结果；必须大于等于 0 且不超过安全上限。</p> 
     * @return Offset <p>原始偏移量覆盖。可选，传入后覆盖 Page 计算结果；必须大于等于 0 且不超过安全上限。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>原始偏移量覆盖。可选，传入后覆盖 Page 计算结果；必须大于等于 0 且不超过安全上限。</p>
     * @param Offset <p>原始偏移量覆盖。可选，传入后覆盖 Page 计算结果；必须大于等于 0 且不超过安全上限。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>排序字段。可选，只接受当前场景后端允许的安全字段。</p> 
     * @return SortBy <p>排序字段。可选，只接受当前场景后端允许的安全字段。</p>
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set <p>排序字段。可选，只接受当前场景后端允许的安全字段。</p>
     * @param SortBy <p>排序字段。可选，只接受当前场景后端允许的安全字段。</p>
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get <p>排序方向。默认 desc；支持 asc、desc。</p> 
     * @return SortOrder <p>排序方向。默认 desc；支持 asc、desc。</p>
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set <p>排序方向。默认 desc；支持 asc、desc。</p>
     * @param SortOrder <p>排序方向。默认 desc；支持 asc、desc。</p>
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get <p>过滤条件列表。可选，最多 5 个；是否支持以及字段名以具体 fetch_scene 场景为准。</p> 
     * @return Filters <p>过滤条件列表。可选，最多 5 个；是否支持以及字段名以具体 fetch_scene 场景为准。</p>
     */
    public CfwStatusMonitorFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件列表。可选，最多 5 个；是否支持以及字段名以具体 fetch_scene 场景为准。</p>
     * @param Filters <p>过滤条件列表。可选，最多 5 个；是否支持以及字段名以具体 fetch_scene 场景为准。</p>
     */
    public void setFilters(CfwStatusMonitorFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCfwStatusMonitorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfwStatusMonitorRequest(DescribeCfwStatusMonitorRequest source) {
        if (source.Op != null) {
            this.Op = new String(source.Op);
        }
        if (source.FirewallType != null) {
            this.FirewallType = new String(source.FirewallType);
        }
        if (source.SelectionId != null) {
            this.SelectionId = new String(source.SelectionId);
        }
        if (source.SelectionName != null) {
            this.SelectionName = new String(source.SelectionName);
        }
        if (source.SelectionInstanceId != null) {
            this.SelectionInstanceId = new String(source.SelectionInstanceId);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Perspective != null) {
            this.Perspective = new String(source.Perspective);
        }
        if (source.IpScope != null) {
            this.IpScope = new String(source.IpScope);
        }
        if (source.TimePreset != null) {
            this.TimePreset = new String(source.TimePreset);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OverviewOnly != null) {
            this.OverviewOnly = new Boolean(source.OverviewOnly);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
        if (source.Filters != null) {
            this.Filters = new CfwStatusMonitorFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CfwStatusMonitorFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Op", this.Op);
        this.setParamSimple(map, prefix + "FirewallType", this.FirewallType);
        this.setParamSimple(map, prefix + "SelectionId", this.SelectionId);
        this.setParamSimple(map, prefix + "SelectionName", this.SelectionName);
        this.setParamSimple(map, prefix + "SelectionInstanceId", this.SelectionInstanceId);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Perspective", this.Perspective);
        this.setParamSimple(map, prefix + "IpScope", this.IpScope);
        this.setParamSimple(map, prefix + "TimePreset", this.TimePreset);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OverviewOnly", this.OverviewOnly);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


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
    * 操作类型。describe_scene 表示发现场景和二级下拉选项；fetch_scene 表示获取具体场景快照。必填。
    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * 防火墙场景类型。支持 internet_edge（互联网边界防火墙）、nat_cluster（NAT边界防火墙-集群）、nat_ha（NAT边界防火墙-主备）、vpc_cluster（VPC边界防火墙-集群）、vpc_ha（VPC边界防火墙-主备）。必填。
    */
    @SerializedName("FirewallType")
    @Expose
    private String FirewallType;

    /**
    * 二级下拉选项 ID。fetch_scene 按需传入，值来自 describe_scene 返回的 selection.available_options[].id；internet_edge 为地域，NAT 为实例 ID，VPC 带宽场景为防火墙组 ID；vpc_cluster 的 connections 汇总场景会忽略该参数。
    */
    @SerializedName("SelectionId")
    @Expose
    private String SelectionId;

    /**
    * 二级下拉显示名称。可替代 SelectionId 按名称匹配，值来自 describe_scene 返回的 selection.available_options[].name。
    */
    @SerializedName("SelectionName")
    @Expose
    private String SelectionName;

    /**
    * 引擎实例 ID。主要用于 vpc_ha 下一个防火墙组对应多个实例的场景，优先使用 describe_scene 返回的 selection.available_options[].instance_id；如只有 instance_ids，则从数组中选择一个字符串值。
    */
    @SerializedName("SelectionInstanceId")
    @Expose
    private String SelectionInstanceId;

    /**
    * 指标页签。fetch_scene 可传；不传时使用该场景默认值。支持 bandwidth、connections。
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 指标下的视角。fetch_scene 可传；不传时使用该场景默认值。支持 ip、subnet、session、switch、vpc，实际可用组合以 describe_scene 返回为准。
    */
    @SerializedName("Perspective")
    @Expose
    private String Perspective;

    /**
    * NAT 主备连接数 IP 视角范围。external 表示外部 IP，asset 表示资产 IP；仅 nat_ha + connections + ip 使用，其他组合传入将返回 InvalidParameter。
    */
    @SerializedName("IpScope")
    @Expose
    private String IpScope;

    /**
    * 预设时间范围。默认 24h；fetch_scene 使用。支持 5m、15m、30m、1h、6h、24h、3d、7d、30d、today、yesterday、day_before_yesterday、this_week、last_week、this_month。
    */
    @SerializedName("TimePreset")
    @Expose
    private String TimePreset;

    /**
    * 自定义开始时间。格式 YYYY-MM-DD HH:MM:SS；必须与 EndTime 同时传，最大跨度 30 天。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 自定义结束时间。格式 YYYY-MM-DD HH:MM:SS；必须与 StartTime 同时传，最大跨度 30 天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 页码，从 1 开始。默认 1；fetch_scene 列表视角使用。
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页条数。默认 10，取值 1 至 100；fetch_scene 列表视角使用。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 是否只获取概览数据。true 时 fetch_scene 只请求 overview，跳过 table/detail，适合只看场景快照汇总。
    */
    @SerializedName("OverviewOnly")
    @Expose
    private Boolean OverviewOnly;

    /**
    * 原始偏移量覆盖。可选，传入后覆盖 Page 计算结果；取值 0 至 10000。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序字段。可选。互联网边界 IP、NAT IP/子网视角支持 InputMax、OutputMax；VPC switch 视角支持 SwitchName；VPC ip/vpc 视角支持 FlowMax；其他组合不要传。
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * 排序方向。默认 desc；支持 asc、desc。
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * 过滤条件列表。保留字段；当前公开 fetch_scene 场景均不支持，调用方不要传。
    */
    @SerializedName("Filters")
    @Expose
    private CfwStatusMonitorFilter [] Filters;

    /**
     * Get 操作类型。describe_scene 表示发现场景和二级下拉选项；fetch_scene 表示获取具体场景快照。必填。 
     * @return Op 操作类型。describe_scene 表示发现场景和二级下拉选项；fetch_scene 表示获取具体场景快照。必填。
     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set 操作类型。describe_scene 表示发现场景和二级下拉选项；fetch_scene 表示获取具体场景快照。必填。
     * @param Op 操作类型。describe_scene 表示发现场景和二级下拉选项；fetch_scene 表示获取具体场景快照。必填。
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get 防火墙场景类型。支持 internet_edge（互联网边界防火墙）、nat_cluster（NAT边界防火墙-集群）、nat_ha（NAT边界防火墙-主备）、vpc_cluster（VPC边界防火墙-集群）、vpc_ha（VPC边界防火墙-主备）。必填。 
     * @return FirewallType 防火墙场景类型。支持 internet_edge（互联网边界防火墙）、nat_cluster（NAT边界防火墙-集群）、nat_ha（NAT边界防火墙-主备）、vpc_cluster（VPC边界防火墙-集群）、vpc_ha（VPC边界防火墙-主备）。必填。
     */
    public String getFirewallType() {
        return this.FirewallType;
    }

    /**
     * Set 防火墙场景类型。支持 internet_edge（互联网边界防火墙）、nat_cluster（NAT边界防火墙-集群）、nat_ha（NAT边界防火墙-主备）、vpc_cluster（VPC边界防火墙-集群）、vpc_ha（VPC边界防火墙-主备）。必填。
     * @param FirewallType 防火墙场景类型。支持 internet_edge（互联网边界防火墙）、nat_cluster（NAT边界防火墙-集群）、nat_ha（NAT边界防火墙-主备）、vpc_cluster（VPC边界防火墙-集群）、vpc_ha（VPC边界防火墙-主备）。必填。
     */
    public void setFirewallType(String FirewallType) {
        this.FirewallType = FirewallType;
    }

    /**
     * Get 二级下拉选项 ID。fetch_scene 按需传入，值来自 describe_scene 返回的 selection.available_options[].id；internet_edge 为地域，NAT 为实例 ID，VPC 带宽场景为防火墙组 ID；vpc_cluster 的 connections 汇总场景会忽略该参数。 
     * @return SelectionId 二级下拉选项 ID。fetch_scene 按需传入，值来自 describe_scene 返回的 selection.available_options[].id；internet_edge 为地域，NAT 为实例 ID，VPC 带宽场景为防火墙组 ID；vpc_cluster 的 connections 汇总场景会忽略该参数。
     */
    public String getSelectionId() {
        return this.SelectionId;
    }

    /**
     * Set 二级下拉选项 ID。fetch_scene 按需传入，值来自 describe_scene 返回的 selection.available_options[].id；internet_edge 为地域，NAT 为实例 ID，VPC 带宽场景为防火墙组 ID；vpc_cluster 的 connections 汇总场景会忽略该参数。
     * @param SelectionId 二级下拉选项 ID。fetch_scene 按需传入，值来自 describe_scene 返回的 selection.available_options[].id；internet_edge 为地域，NAT 为实例 ID，VPC 带宽场景为防火墙组 ID；vpc_cluster 的 connections 汇总场景会忽略该参数。
     */
    public void setSelectionId(String SelectionId) {
        this.SelectionId = SelectionId;
    }

    /**
     * Get 二级下拉显示名称。可替代 SelectionId 按名称匹配，值来自 describe_scene 返回的 selection.available_options[].name。 
     * @return SelectionName 二级下拉显示名称。可替代 SelectionId 按名称匹配，值来自 describe_scene 返回的 selection.available_options[].name。
     */
    public String getSelectionName() {
        return this.SelectionName;
    }

    /**
     * Set 二级下拉显示名称。可替代 SelectionId 按名称匹配，值来自 describe_scene 返回的 selection.available_options[].name。
     * @param SelectionName 二级下拉显示名称。可替代 SelectionId 按名称匹配，值来自 describe_scene 返回的 selection.available_options[].name。
     */
    public void setSelectionName(String SelectionName) {
        this.SelectionName = SelectionName;
    }

    /**
     * Get 引擎实例 ID。主要用于 vpc_ha 下一个防火墙组对应多个实例的场景，优先使用 describe_scene 返回的 selection.available_options[].instance_id；如只有 instance_ids，则从数组中选择一个字符串值。 
     * @return SelectionInstanceId 引擎实例 ID。主要用于 vpc_ha 下一个防火墙组对应多个实例的场景，优先使用 describe_scene 返回的 selection.available_options[].instance_id；如只有 instance_ids，则从数组中选择一个字符串值。
     */
    public String getSelectionInstanceId() {
        return this.SelectionInstanceId;
    }

    /**
     * Set 引擎实例 ID。主要用于 vpc_ha 下一个防火墙组对应多个实例的场景，优先使用 describe_scene 返回的 selection.available_options[].instance_id；如只有 instance_ids，则从数组中选择一个字符串值。
     * @param SelectionInstanceId 引擎实例 ID。主要用于 vpc_ha 下一个防火墙组对应多个实例的场景，优先使用 describe_scene 返回的 selection.available_options[].instance_id；如只有 instance_ids，则从数组中选择一个字符串值。
     */
    public void setSelectionInstanceId(String SelectionInstanceId) {
        this.SelectionInstanceId = SelectionInstanceId;
    }

    /**
     * Get 指标页签。fetch_scene 可传；不传时使用该场景默认值。支持 bandwidth、connections。 
     * @return Metric 指标页签。fetch_scene 可传；不传时使用该场景默认值。支持 bandwidth、connections。
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 指标页签。fetch_scene 可传；不传时使用该场景默认值。支持 bandwidth、connections。
     * @param Metric 指标页签。fetch_scene 可传；不传时使用该场景默认值。支持 bandwidth、connections。
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 指标下的视角。fetch_scene 可传；不传时使用该场景默认值。支持 ip、subnet、session、switch、vpc，实际可用组合以 describe_scene 返回为准。 
     * @return Perspective 指标下的视角。fetch_scene 可传；不传时使用该场景默认值。支持 ip、subnet、session、switch、vpc，实际可用组合以 describe_scene 返回为准。
     */
    public String getPerspective() {
        return this.Perspective;
    }

    /**
     * Set 指标下的视角。fetch_scene 可传；不传时使用该场景默认值。支持 ip、subnet、session、switch、vpc，实际可用组合以 describe_scene 返回为准。
     * @param Perspective 指标下的视角。fetch_scene 可传；不传时使用该场景默认值。支持 ip、subnet、session、switch、vpc，实际可用组合以 describe_scene 返回为准。
     */
    public void setPerspective(String Perspective) {
        this.Perspective = Perspective;
    }

    /**
     * Get NAT 主备连接数 IP 视角范围。external 表示外部 IP，asset 表示资产 IP；仅 nat_ha + connections + ip 使用，其他组合传入将返回 InvalidParameter。 
     * @return IpScope NAT 主备连接数 IP 视角范围。external 表示外部 IP，asset 表示资产 IP；仅 nat_ha + connections + ip 使用，其他组合传入将返回 InvalidParameter。
     */
    public String getIpScope() {
        return this.IpScope;
    }

    /**
     * Set NAT 主备连接数 IP 视角范围。external 表示外部 IP，asset 表示资产 IP；仅 nat_ha + connections + ip 使用，其他组合传入将返回 InvalidParameter。
     * @param IpScope NAT 主备连接数 IP 视角范围。external 表示外部 IP，asset 表示资产 IP；仅 nat_ha + connections + ip 使用，其他组合传入将返回 InvalidParameter。
     */
    public void setIpScope(String IpScope) {
        this.IpScope = IpScope;
    }

    /**
     * Get 预设时间范围。默认 24h；fetch_scene 使用。支持 5m、15m、30m、1h、6h、24h、3d、7d、30d、today、yesterday、day_before_yesterday、this_week、last_week、this_month。 
     * @return TimePreset 预设时间范围。默认 24h；fetch_scene 使用。支持 5m、15m、30m、1h、6h、24h、3d、7d、30d、today、yesterday、day_before_yesterday、this_week、last_week、this_month。
     */
    public String getTimePreset() {
        return this.TimePreset;
    }

    /**
     * Set 预设时间范围。默认 24h；fetch_scene 使用。支持 5m、15m、30m、1h、6h、24h、3d、7d、30d、today、yesterday、day_before_yesterday、this_week、last_week、this_month。
     * @param TimePreset 预设时间范围。默认 24h；fetch_scene 使用。支持 5m、15m、30m、1h、6h、24h、3d、7d、30d、today、yesterday、day_before_yesterday、this_week、last_week、this_month。
     */
    public void setTimePreset(String TimePreset) {
        this.TimePreset = TimePreset;
    }

    /**
     * Get 自定义开始时间。格式 YYYY-MM-DD HH:MM:SS；必须与 EndTime 同时传，最大跨度 30 天。 
     * @return StartTime 自定义开始时间。格式 YYYY-MM-DD HH:MM:SS；必须与 EndTime 同时传，最大跨度 30 天。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 自定义开始时间。格式 YYYY-MM-DD HH:MM:SS；必须与 EndTime 同时传，最大跨度 30 天。
     * @param StartTime 自定义开始时间。格式 YYYY-MM-DD HH:MM:SS；必须与 EndTime 同时传，最大跨度 30 天。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 自定义结束时间。格式 YYYY-MM-DD HH:MM:SS；必须与 StartTime 同时传，最大跨度 30 天。 
     * @return EndTime 自定义结束时间。格式 YYYY-MM-DD HH:MM:SS；必须与 StartTime 同时传，最大跨度 30 天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 自定义结束时间。格式 YYYY-MM-DD HH:MM:SS；必须与 StartTime 同时传，最大跨度 30 天。
     * @param EndTime 自定义结束时间。格式 YYYY-MM-DD HH:MM:SS；必须与 StartTime 同时传，最大跨度 30 天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 页码，从 1 开始。默认 1；fetch_scene 列表视角使用。 
     * @return Page 页码，从 1 开始。默认 1；fetch_scene 列表视角使用。
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码，从 1 开始。默认 1；fetch_scene 列表视角使用。
     * @param Page 页码，从 1 开始。默认 1；fetch_scene 列表视角使用。
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 每页条数。默认 10，取值 1 至 100；fetch_scene 列表视角使用。 
     * @return Limit 每页条数。默认 10，取值 1 至 100；fetch_scene 列表视角使用。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条数。默认 10，取值 1 至 100；fetch_scene 列表视角使用。
     * @param Limit 每页条数。默认 10，取值 1 至 100；fetch_scene 列表视角使用。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 是否只获取概览数据。true 时 fetch_scene 只请求 overview，跳过 table/detail，适合只看场景快照汇总。 
     * @return OverviewOnly 是否只获取概览数据。true 时 fetch_scene 只请求 overview，跳过 table/detail，适合只看场景快照汇总。
     */
    public Boolean getOverviewOnly() {
        return this.OverviewOnly;
    }

    /**
     * Set 是否只获取概览数据。true 时 fetch_scene 只请求 overview，跳过 table/detail，适合只看场景快照汇总。
     * @param OverviewOnly 是否只获取概览数据。true 时 fetch_scene 只请求 overview，跳过 table/detail，适合只看场景快照汇总。
     */
    public void setOverviewOnly(Boolean OverviewOnly) {
        this.OverviewOnly = OverviewOnly;
    }

    /**
     * Get 原始偏移量覆盖。可选，传入后覆盖 Page 计算结果；取值 0 至 10000。 
     * @return Offset 原始偏移量覆盖。可选，传入后覆盖 Page 计算结果；取值 0 至 10000。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 原始偏移量覆盖。可选，传入后覆盖 Page 计算结果；取值 0 至 10000。
     * @param Offset 原始偏移量覆盖。可选，传入后覆盖 Page 计算结果；取值 0 至 10000。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序字段。可选。互联网边界 IP、NAT IP/子网视角支持 InputMax、OutputMax；VPC switch 视角支持 SwitchName；VPC ip/vpc 视角支持 FlowMax；其他组合不要传。 
     * @return SortBy 排序字段。可选。互联网边界 IP、NAT IP/子网视角支持 InputMax、OutputMax；VPC switch 视角支持 SwitchName；VPC ip/vpc 视角支持 FlowMax；其他组合不要传。
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 排序字段。可选。互联网边界 IP、NAT IP/子网视角支持 InputMax、OutputMax；VPC switch 视角支持 SwitchName；VPC ip/vpc 视角支持 FlowMax；其他组合不要传。
     * @param SortBy 排序字段。可选。互联网边界 IP、NAT IP/子网视角支持 InputMax、OutputMax；VPC switch 视角支持 SwitchName；VPC ip/vpc 视角支持 FlowMax；其他组合不要传。
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 排序方向。默认 desc；支持 asc、desc。 
     * @return SortOrder 排序方向。默认 desc；支持 asc、desc。
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set 排序方向。默认 desc；支持 asc、desc。
     * @param SortOrder 排序方向。默认 desc；支持 asc、desc。
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get 过滤条件列表。保留字段；当前公开 fetch_scene 场景均不支持，调用方不要传。 
     * @return Filters 过滤条件列表。保留字段；当前公开 fetch_scene 场景均不支持，调用方不要传。
     */
    public CfwStatusMonitorFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件列表。保留字段；当前公开 fetch_scene 场景均不支持，调用方不要传。
     * @param Filters 过滤条件列表。保留字段；当前公开 fetch_scene 场景均不支持，调用方不要传。
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


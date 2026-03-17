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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRaspLicenseListRequest extends AbstractModel {

    /**
    * 过滤条件
- AssetType 资产类型(CWP 主机安全资产, TCSS_HOST 容器主机节点,TCSS_EKS 容器超级节点)
- PluginStatus 插件状态(Normal 使用正常,Abnormal 存在异常,Unused 未使用)
- ProtectionSwitch 防护开关(Enable 开启,Disable 未开启)
- ProtectionVersion 防护版本(Rasp 重保授权包,Unauthorized 未授权)
- InstanceID 实例ID
- InstanceName 实例名称
- InstanceIP 实例IP(内网IP/外网IP)
- NodeID 容器节点ID
- NodeName 容器节点名称
- ClusterID 容器集群ID
- ClusterName 容器集群名称
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 限制条数,默认10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量,默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序方式,ASC 正序,DESC 倒序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序值
- LatestUpdateTime 最近更新时间
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 过滤条件
- AssetType 资产类型(CWP 主机安全资产, TCSS_HOST 容器主机节点,TCSS_EKS 容器超级节点)
- PluginStatus 插件状态(Normal 使用正常,Abnormal 存在异常,Unused 未使用)
- ProtectionSwitch 防护开关(Enable 开启,Disable 未开启)
- ProtectionVersion 防护版本(Rasp 重保授权包,Unauthorized 未授权)
- InstanceID 实例ID
- InstanceName 实例名称
- InstanceIP 实例IP(内网IP/外网IP)
- NodeID 容器节点ID
- NodeName 容器节点名称
- ClusterID 容器集群ID
- ClusterName 容器集群名称 
     * @return Filters 过滤条件
- AssetType 资产类型(CWP 主机安全资产, TCSS_HOST 容器主机节点,TCSS_EKS 容器超级节点)
- PluginStatus 插件状态(Normal 使用正常,Abnormal 存在异常,Unused 未使用)
- ProtectionSwitch 防护开关(Enable 开启,Disable 未开启)
- ProtectionVersion 防护版本(Rasp 重保授权包,Unauthorized 未授权)
- InstanceID 实例ID
- InstanceName 实例名称
- InstanceIP 实例IP(内网IP/外网IP)
- NodeID 容器节点ID
- NodeName 容器节点名称
- ClusterID 容器集群ID
- ClusterName 容器集群名称
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
- AssetType 资产类型(CWP 主机安全资产, TCSS_HOST 容器主机节点,TCSS_EKS 容器超级节点)
- PluginStatus 插件状态(Normal 使用正常,Abnormal 存在异常,Unused 未使用)
- ProtectionSwitch 防护开关(Enable 开启,Disable 未开启)
- ProtectionVersion 防护版本(Rasp 重保授权包,Unauthorized 未授权)
- InstanceID 实例ID
- InstanceName 实例名称
- InstanceIP 实例IP(内网IP/外网IP)
- NodeID 容器节点ID
- NodeName 容器节点名称
- ClusterID 容器集群ID
- ClusterName 容器集群名称
     * @param Filters 过滤条件
- AssetType 资产类型(CWP 主机安全资产, TCSS_HOST 容器主机节点,TCSS_EKS 容器超级节点)
- PluginStatus 插件状态(Normal 使用正常,Abnormal 存在异常,Unused 未使用)
- ProtectionSwitch 防护开关(Enable 开启,Disable 未开启)
- ProtectionVersion 防护版本(Rasp 重保授权包,Unauthorized 未授权)
- InstanceID 实例ID
- InstanceName 实例名称
- InstanceIP 实例IP(内网IP/外网IP)
- NodeID 容器节点ID
- NodeName 容器节点名称
- ClusterID 容器集群ID
- ClusterName 容器集群名称
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 限制条数,默认10 
     * @return Limit 限制条数,默认10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制条数,默认10
     * @param Limit 限制条数,默认10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量,默认0 
     * @return Offset 偏移量,默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量,默认0
     * @param Offset 偏移量,默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序方式,ASC 正序,DESC 倒序 
     * @return Order 排序方式,ASC 正序,DESC 倒序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式,ASC 正序,DESC 倒序
     * @param Order 排序方式,ASC 正序,DESC 倒序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序值
- LatestUpdateTime 最近更新时间 
     * @return By 排序值
- LatestUpdateTime 最近更新时间
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序值
- LatestUpdateTime 最近更新时间
     * @param By 排序值
- LatestUpdateTime 最近更新时间
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeRaspLicenseListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRaspLicenseListRequest(DescribeRaspLicenseListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}


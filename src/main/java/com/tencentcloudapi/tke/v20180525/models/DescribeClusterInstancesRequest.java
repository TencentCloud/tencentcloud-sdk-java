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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterInstancesRequest extends AbstractModel {

    /**
    * 集群ID（请登录 [TKE 控制台](https://console.cloud.tencent.com/tke2) 获取集群 ID ）
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 需要获取的节点实例 ID 列表。如果为空，表示拉取集群下所有节点实例。普通节点用 CVM ID（如 ins-1cghhuuu ），原生节点用节点池内机器 ID （如 np-1ade4uid-0a2dc ）。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 节点角色，默认为WORKER类型

- WOKRER 集群内常规计算节点
- MASTER 独立集群控制面组件节点
- ETCD 独立集群 etcd 存储节点
- MASTER_ETCD 独立集群控制面、etcd 共同部署的 master 节点

    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * 过滤条件列表；Name的可选值为nodepool-id、nodepool-instance-type；Name为nodepool-id表示根据节点池id过滤机器，Value的值为具体的节点池id，Name为nodepool-instance-type表示节点加入节点池的方式，Value的值为MANUALLY_ADDED（手动加入节点池）、AUTOSCALING_ADDED（伸缩组扩容方式加入节点池）、ALL（手动加入节点池 和 伸缩组扩容方式加入节点池）
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 集群ID（请登录 [TKE 控制台](https://console.cloud.tencent.com/tke2) 获取集群 ID ） 
     * @return ClusterId 集群ID（请登录 [TKE 控制台](https://console.cloud.tencent.com/tke2) 获取集群 ID ）
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID（请登录 [TKE 控制台](https://console.cloud.tencent.com/tke2) 获取集群 ID ）
     * @param ClusterId 集群ID（请登录 [TKE 控制台](https://console.cloud.tencent.com/tke2) 获取集群 ID ）
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Limit 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Limit 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 需要获取的节点实例 ID 列表。如果为空，表示拉取集群下所有节点实例。普通节点用 CVM ID（如 ins-1cghhuuu ），原生节点用节点池内机器 ID （如 np-1ade4uid-0a2dc ）。 
     * @return InstanceIds 需要获取的节点实例 ID 列表。如果为空，表示拉取集群下所有节点实例。普通节点用 CVM ID（如 ins-1cghhuuu ），原生节点用节点池内机器 ID （如 np-1ade4uid-0a2dc ）。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 需要获取的节点实例 ID 列表。如果为空，表示拉取集群下所有节点实例。普通节点用 CVM ID（如 ins-1cghhuuu ），原生节点用节点池内机器 ID （如 np-1ade4uid-0a2dc ）。
     * @param InstanceIds 需要获取的节点实例 ID 列表。如果为空，表示拉取集群下所有节点实例。普通节点用 CVM ID（如 ins-1cghhuuu ），原生节点用节点池内机器 ID （如 np-1ade4uid-0a2dc ）。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 节点角色，默认为WORKER类型

- WOKRER 集群内常规计算节点
- MASTER 独立集群控制面组件节点
- ETCD 独立集群 etcd 存储节点
- MASTER_ETCD 独立集群控制面、etcd 共同部署的 master 节点
 
     * @return InstanceRole 节点角色，默认为WORKER类型

- WOKRER 集群内常规计算节点
- MASTER 独立集群控制面组件节点
- ETCD 独立集群 etcd 存储节点
- MASTER_ETCD 独立集群控制面、etcd 共同部署的 master 节点

     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set 节点角色，默认为WORKER类型

- WOKRER 集群内常规计算节点
- MASTER 独立集群控制面组件节点
- ETCD 独立集群 etcd 存储节点
- MASTER_ETCD 独立集群控制面、etcd 共同部署的 master 节点

     * @param InstanceRole 节点角色，默认为WORKER类型

- WOKRER 集群内常规计算节点
- MASTER 独立集群控制面组件节点
- ETCD 独立集群 etcd 存储节点
- MASTER_ETCD 独立集群控制面、etcd 共同部署的 master 节点

     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get 过滤条件列表；Name的可选值为nodepool-id、nodepool-instance-type；Name为nodepool-id表示根据节点池id过滤机器，Value的值为具体的节点池id，Name为nodepool-instance-type表示节点加入节点池的方式，Value的值为MANUALLY_ADDED（手动加入节点池）、AUTOSCALING_ADDED（伸缩组扩容方式加入节点池）、ALL（手动加入节点池 和 伸缩组扩容方式加入节点池） 
     * @return Filters 过滤条件列表；Name的可选值为nodepool-id、nodepool-instance-type；Name为nodepool-id表示根据节点池id过滤机器，Value的值为具体的节点池id，Name为nodepool-instance-type表示节点加入节点池的方式，Value的值为MANUALLY_ADDED（手动加入节点池）、AUTOSCALING_ADDED（伸缩组扩容方式加入节点池）、ALL（手动加入节点池 和 伸缩组扩容方式加入节点池）
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件列表；Name的可选值为nodepool-id、nodepool-instance-type；Name为nodepool-id表示根据节点池id过滤机器，Value的值为具体的节点池id，Name为nodepool-instance-type表示节点加入节点池的方式，Value的值为MANUALLY_ADDED（手动加入节点池）、AUTOSCALING_ADDED（伸缩组扩容方式加入节点池）、ALL（手动加入节点池 和 伸缩组扩容方式加入节点池）
     * @param Filters 过滤条件列表；Name的可选值为nodepool-id、nodepool-instance-type；Name为nodepool-id表示根据节点池id过滤机器，Value的值为具体的节点池id，Name为nodepool-instance-type表示节点加入节点池的方式，Value的值为MANUALLY_ADDED（手动加入节点池）、AUTOSCALING_ADDED（伸缩组扩容方式加入节点池）、ALL（手动加入节点池 和 伸缩组扩容方式加入节点池）
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeClusterInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterInstancesRequest(DescribeClusterInstancesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
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
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


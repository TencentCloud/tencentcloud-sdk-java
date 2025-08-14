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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupInfo extends AbstractModel {

    /**
    * 部署组ID
可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/product/649/36068)或[DescribeGroups](https://cloud.tencent.com/document/product/649/36065)查询已创建的部署组列表或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-yo7kp9dv&tab=publish&subTab=group)进行查看。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 部署组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 集群类型，C：容器集群，V：虚拟机集群
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 集群ID
可通过[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已经创建的集群列表，也可以通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1)查看。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 绑定时间，格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("AssociateTime")
    @Expose
    private String AssociateTime;

    /**
     * Get 部署组ID
可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/product/649/36068)或[DescribeGroups](https://cloud.tencent.com/document/product/649/36065)查询已创建的部署组列表或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-yo7kp9dv&tab=publish&subTab=group)进行查看。 
     * @return GroupId 部署组ID
可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/product/649/36068)或[DescribeGroups](https://cloud.tencent.com/document/product/649/36065)查询已创建的部署组列表或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-yo7kp9dv&tab=publish&subTab=group)进行查看。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID
可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/product/649/36068)或[DescribeGroups](https://cloud.tencent.com/document/product/649/36065)查询已创建的部署组列表或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-yo7kp9dv&tab=publish&subTab=group)进行查看。
     * @param GroupId 部署组ID
可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/product/649/36068)或[DescribeGroups](https://cloud.tencent.com/document/product/649/36065)查询已创建的部署组列表或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-yo7kp9dv&tab=publish&subTab=group)进行查看。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 部署组名称 
     * @return GroupName 部署组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 部署组名称
     * @param GroupName 部署组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 集群类型，C：容器集群，V：虚拟机集群 
     * @return ClusterType 集群类型，C：容器集群，V：虚拟机集群
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型，C：容器集群，V：虚拟机集群
     * @param ClusterType 集群类型，C：容器集群，V：虚拟机集群
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 集群ID
可通过[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已经创建的集群列表，也可以通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1)查看。 
     * @return ClusterId 集群ID
可通过[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已经创建的集群列表，也可以通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1)查看。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
可通过[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已经创建的集群列表，也可以通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1)查看。
     * @param ClusterId 集群ID
可通过[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已经创建的集群列表，也可以通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1)查看。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 命名空间名称 
     * @return NamespaceName 命名空间名称
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
     * @param NamespaceName 命名空间名称
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 绑定时间，格式yyyy-MM-dd HH:mm:ss 
     * @return AssociateTime 绑定时间，格式yyyy-MM-dd HH:mm:ss
     */
    public String getAssociateTime() {
        return this.AssociateTime;
    }

    /**
     * Set 绑定时间，格式yyyy-MM-dd HH:mm:ss
     * @param AssociateTime 绑定时间，格式yyyy-MM-dd HH:mm:ss
     */
    public void setAssociateTime(String AssociateTime) {
        this.AssociateTime = AssociateTime;
    }

    public GroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupInfo(GroupInfo source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.AssociateTime != null) {
            this.AssociateTime = new String(source.AssociateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "AssociateTime", this.AssociateTime);

    }
}


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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BusinessLogConfigAssociatedGroup extends AbstractModel {

    /**
    * 部署组ID
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
    * 部署组所属应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 部署组所属应用名称
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 部署组所属应用类型
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * 部署组所属命名空间ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 部署组所属命名空间名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 部署组所属集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 部署组所属集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 部署组所属集群类型
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 部署组关联日志配置时间
    */
    @SerializedName("AssociatedTime")
    @Expose
    private String AssociatedTime;

    /**
     * Get 部署组ID 
     * @return GroupId 部署组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID
     * @param GroupId 部署组ID
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
     * Get 部署组所属应用ID 
     * @return ApplicationId 部署组所属应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 部署组所属应用ID
     * @param ApplicationId 部署组所属应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 部署组所属应用名称 
     * @return ApplicationName 部署组所属应用名称
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 部署组所属应用名称
     * @param ApplicationName 部署组所属应用名称
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 部署组所属应用类型 
     * @return ApplicationType 部署组所属应用类型
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 部署组所属应用类型
     * @param ApplicationType 部署组所属应用类型
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 部署组所属命名空间ID 
     * @return NamespaceId 部署组所属命名空间ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 部署组所属命名空间ID
     * @param NamespaceId 部署组所属命名空间ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 部署组所属命名空间名称 
     * @return NamespaceName 部署组所属命名空间名称
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 部署组所属命名空间名称
     * @param NamespaceName 部署组所属命名空间名称
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 部署组所属集群ID 
     * @return ClusterId 部署组所属集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 部署组所属集群ID
     * @param ClusterId 部署组所属集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 部署组所属集群名称 
     * @return ClusterName 部署组所属集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 部署组所属集群名称
     * @param ClusterName 部署组所属集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 部署组所属集群类型 
     * @return ClusterType 部署组所属集群类型
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 部署组所属集群类型
     * @param ClusterType 部署组所属集群类型
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 部署组关联日志配置时间 
     * @return AssociatedTime 部署组关联日志配置时间
     */
    public String getAssociatedTime() {
        return this.AssociatedTime;
    }

    /**
     * Set 部署组关联日志配置时间
     * @param AssociatedTime 部署组关联日志配置时间
     */
    public void setAssociatedTime(String AssociatedTime) {
        this.AssociatedTime = AssociatedTime;
    }

    public BusinessLogConfigAssociatedGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BusinessLogConfigAssociatedGroup(BusinessLogConfigAssociatedGroup source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.AssociatedTime != null) {
            this.AssociatedTime = new String(source.AssociatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "AssociatedTime", this.AssociatedTime);

    }
}


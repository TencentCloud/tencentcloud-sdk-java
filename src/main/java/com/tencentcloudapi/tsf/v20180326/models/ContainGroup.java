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

public class ContainGroup extends AbstractModel {

    /**
    * 部署组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 分组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 镜像server
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * 镜像名，如/tsf/nginx
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 镜像版本名称
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 集群ID
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
    * 命名空间ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 初始分配的 CPU 核数，对应 K8S request
    */
    @SerializedName("CpuRequest")
    @Expose
    private String CpuRequest;

    /**
    * 最大分配的 CPU 核数，对应 K8S limit
    */
    @SerializedName("CpuLimit")
    @Expose
    private String CpuLimit;

    /**
    * 初始分配的内存 MiB 数，对应 K8S request
    */
    @SerializedName("MemRequest")
    @Expose
    private String MemRequest;

    /**
    * 最大分配的内存 MiB 数，对应 K8S limit
    */
    @SerializedName("MemLimit")
    @Expose
    private String MemLimit;

    /**
    * 部署组备注
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * KubeInjectEnable值
    */
    @SerializedName("KubeInjectEnable")
    @Expose
    private Boolean KubeInjectEnable;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

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
     * Get 分组名称 
     * @return GroupName 分组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 分组名称
     * @param GroupName 分组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 镜像server 
     * @return Server 镜像server
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set 镜像server
     * @param Server 镜像server
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Get 镜像名，如/tsf/nginx 
     * @return RepoName 镜像名，如/tsf/nginx
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 镜像名，如/tsf/nginx
     * @param RepoName 镜像名，如/tsf/nginx
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get 镜像版本名称 
     * @return TagName 镜像版本名称
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set 镜像版本名称
     * @param TagName 镜像版本名称
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
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
     * Get 命名空间ID 
     * @return NamespaceId 命名空间ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID
     * @param NamespaceId 命名空间ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
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
     * Get 初始分配的 CPU 核数，对应 K8S request 
     * @return CpuRequest 初始分配的 CPU 核数，对应 K8S request
     */
    public String getCpuRequest() {
        return this.CpuRequest;
    }

    /**
     * Set 初始分配的 CPU 核数，对应 K8S request
     * @param CpuRequest 初始分配的 CPU 核数，对应 K8S request
     */
    public void setCpuRequest(String CpuRequest) {
        this.CpuRequest = CpuRequest;
    }

    /**
     * Get 最大分配的 CPU 核数，对应 K8S limit 
     * @return CpuLimit 最大分配的 CPU 核数，对应 K8S limit
     */
    public String getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set 最大分配的 CPU 核数，对应 K8S limit
     * @param CpuLimit 最大分配的 CPU 核数，对应 K8S limit
     */
    public void setCpuLimit(String CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get 初始分配的内存 MiB 数，对应 K8S request 
     * @return MemRequest 初始分配的内存 MiB 数，对应 K8S request
     */
    public String getMemRequest() {
        return this.MemRequest;
    }

    /**
     * Set 初始分配的内存 MiB 数，对应 K8S request
     * @param MemRequest 初始分配的内存 MiB 数，对应 K8S request
     */
    public void setMemRequest(String MemRequest) {
        this.MemRequest = MemRequest;
    }

    /**
     * Get 最大分配的内存 MiB 数，对应 K8S limit 
     * @return MemLimit 最大分配的内存 MiB 数，对应 K8S limit
     */
    public String getMemLimit() {
        return this.MemLimit;
    }

    /**
     * Set 最大分配的内存 MiB 数，对应 K8S limit
     * @param MemLimit 最大分配的内存 MiB 数，对应 K8S limit
     */
    public void setMemLimit(String MemLimit) {
        this.MemLimit = MemLimit;
    }

    /**
     * Get 部署组备注 
     * @return Alias 部署组备注
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 部署组备注
     * @param Alias 部署组备注
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get KubeInjectEnable值 
     * @return KubeInjectEnable KubeInjectEnable值
     */
    public Boolean getKubeInjectEnable() {
        return this.KubeInjectEnable;
    }

    /**
     * Set KubeInjectEnable值
     * @param KubeInjectEnable KubeInjectEnable值
     */
    public void setKubeInjectEnable(Boolean KubeInjectEnable) {
        this.KubeInjectEnable = KubeInjectEnable;
    }

    /**
     * Get 更新时间 
     * @return UpdatedTime 更新时间
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 更新时间
     * @param UpdatedTime 更新时间
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    public ContainGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainGroup(ContainGroup source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Server != null) {
            this.Server = new String(source.Server);
        }
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.CpuRequest != null) {
            this.CpuRequest = new String(source.CpuRequest);
        }
        if (source.CpuLimit != null) {
            this.CpuLimit = new String(source.CpuLimit);
        }
        if (source.MemRequest != null) {
            this.MemRequest = new String(source.MemRequest);
        }
        if (source.MemLimit != null) {
            this.MemLimit = new String(source.MemLimit);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.KubeInjectEnable != null) {
            this.KubeInjectEnable = new Boolean(source.KubeInjectEnable);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "CpuRequest", this.CpuRequest);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);
        this.setParamSimple(map, prefix + "MemRequest", this.MemRequest);
        this.setParamSimple(map, prefix + "MemLimit", this.MemLimit);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "KubeInjectEnable", this.KubeInjectEnable);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);

    }
}


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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateContainGroupRequest extends AbstractModel{

    /**
    * 分组所属应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 分组所属命名空间ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 分组名称字段，长度1~60，字母或下划线开头，可包含字母数字下划线
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 实例数量
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * 0:公网 1:集群内访问 2：NodePort
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * 数组对象，见下方定义
    */
    @SerializedName("ProtocolPorts")
    @Expose
    private ProtocolPort [] ProtocolPorts;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 最大分配 CPU 核数，对应 K8S limit
    */
    @SerializedName("CpuLimit")
    @Expose
    private String CpuLimit;

    /**
    * 最大分配内存 MiB 数，对应 K8S limit
    */
    @SerializedName("MemLimit")
    @Expose
    private String MemLimit;

    /**
    * 分组备注字段，长度应不大于200字符
    */
    @SerializedName("GroupComment")
    @Expose
    private String GroupComment;

    /**
    * 更新方式：0:快速更新 1:滚动更新
    */
    @SerializedName("UpdateType")
    @Expose
    private Long UpdateType;

    /**
    * 滚动更新必填，更新间隔
    */
    @SerializedName("UpdateIvl")
    @Expose
    private Long UpdateIvl;

    /**
    * 初始分配的 CPU 核数，对应 K8S request
    */
    @SerializedName("CpuRequest")
    @Expose
    private String CpuRequest;

    /**
    * 初始分配的内存 MiB 数，对应 K8S request
    */
    @SerializedName("MemRequest")
    @Expose
    private String MemRequest;

    /**
    * 部署组资源类型
    */
    @SerializedName("GroupResourceType")
    @Expose
    private String GroupResourceType;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * agent 容器分配的 CPU 核数，对应 K8S 的 request
    */
    @SerializedName("AgentCpuRequest")
    @Expose
    private String AgentCpuRequest;

    /**
    * agent 容器最大的 CPU 核数，对应 K8S 的 limit
    */
    @SerializedName("AgentCpuLimit")
    @Expose
    private String AgentCpuLimit;

    /**
    * agent 容器分配的内存 MiB 数，对应 K8S 的 request
    */
    @SerializedName("AgentMemRequest")
    @Expose
    private String AgentMemRequest;

    /**
    * agent 容器最大的内存 MiB 数，对应 K8S 的 limit
    */
    @SerializedName("AgentMemLimit")
    @Expose
    private String AgentMemLimit;

    /**
    * istioproxy 容器分配的 CPU 核数，对应 K8S 的 request
    */
    @SerializedName("IstioCpuRequest")
    @Expose
    private String IstioCpuRequest;

    /**
    * istioproxy 容器最大的 CPU 核数，对应 K8S 的 limit
    */
    @SerializedName("IstioCpuLimit")
    @Expose
    private String IstioCpuLimit;

    /**
    * istioproxy 容器分配的内存 MiB 数，对应 K8S 的 request
    */
    @SerializedName("IstioMemRequest")
    @Expose
    private String IstioMemRequest;

    /**
    * istioproxy 容器最大的内存 MiB 数，对应 K8S 的 limit
    */
    @SerializedName("IstioMemLimit")
    @Expose
    private String IstioMemLimit;

    /**
     * Get 分组所属应用ID 
     * @return ApplicationId 分组所属应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 分组所属应用ID
     * @param ApplicationId 分组所属应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 分组所属命名空间ID 
     * @return NamespaceId 分组所属命名空间ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 分组所属命名空间ID
     * @param NamespaceId 分组所属命名空间ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 分组名称字段，长度1~60，字母或下划线开头，可包含字母数字下划线 
     * @return GroupName 分组名称字段，长度1~60，字母或下划线开头，可包含字母数字下划线
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 分组名称字段，长度1~60，字母或下划线开头，可包含字母数字下划线
     * @param GroupName 分组名称字段，长度1~60，字母或下划线开头，可包含字母数字下划线
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 实例数量 
     * @return InstanceNum 实例数量
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set 实例数量
     * @param InstanceNum 实例数量
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get 0:公网 1:集群内访问 2：NodePort 
     * @return AccessType 0:公网 1:集群内访问 2：NodePort
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 0:公网 1:集群内访问 2：NodePort
     * @param AccessType 0:公网 1:集群内访问 2：NodePort
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 数组对象，见下方定义 
     * @return ProtocolPorts 数组对象，见下方定义
     */
    public ProtocolPort [] getProtocolPorts() {
        return this.ProtocolPorts;
    }

    /**
     * Set 数组对象，见下方定义
     * @param ProtocolPorts 数组对象，见下方定义
     */
    public void setProtocolPorts(ProtocolPort [] ProtocolPorts) {
        this.ProtocolPorts = ProtocolPorts;
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
     * Get 最大分配 CPU 核数，对应 K8S limit 
     * @return CpuLimit 最大分配 CPU 核数，对应 K8S limit
     */
    public String getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set 最大分配 CPU 核数，对应 K8S limit
     * @param CpuLimit 最大分配 CPU 核数，对应 K8S limit
     */
    public void setCpuLimit(String CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get 最大分配内存 MiB 数，对应 K8S limit 
     * @return MemLimit 最大分配内存 MiB 数，对应 K8S limit
     */
    public String getMemLimit() {
        return this.MemLimit;
    }

    /**
     * Set 最大分配内存 MiB 数，对应 K8S limit
     * @param MemLimit 最大分配内存 MiB 数，对应 K8S limit
     */
    public void setMemLimit(String MemLimit) {
        this.MemLimit = MemLimit;
    }

    /**
     * Get 分组备注字段，长度应不大于200字符 
     * @return GroupComment 分组备注字段，长度应不大于200字符
     */
    public String getGroupComment() {
        return this.GroupComment;
    }

    /**
     * Set 分组备注字段，长度应不大于200字符
     * @param GroupComment 分组备注字段，长度应不大于200字符
     */
    public void setGroupComment(String GroupComment) {
        this.GroupComment = GroupComment;
    }

    /**
     * Get 更新方式：0:快速更新 1:滚动更新 
     * @return UpdateType 更新方式：0:快速更新 1:滚动更新
     */
    public Long getUpdateType() {
        return this.UpdateType;
    }

    /**
     * Set 更新方式：0:快速更新 1:滚动更新
     * @param UpdateType 更新方式：0:快速更新 1:滚动更新
     */
    public void setUpdateType(Long UpdateType) {
        this.UpdateType = UpdateType;
    }

    /**
     * Get 滚动更新必填，更新间隔 
     * @return UpdateIvl 滚动更新必填，更新间隔
     */
    public Long getUpdateIvl() {
        return this.UpdateIvl;
    }

    /**
     * Set 滚动更新必填，更新间隔
     * @param UpdateIvl 滚动更新必填，更新间隔
     */
    public void setUpdateIvl(Long UpdateIvl) {
        this.UpdateIvl = UpdateIvl;
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
     * Get 部署组资源类型 
     * @return GroupResourceType 部署组资源类型
     */
    public String getGroupResourceType() {
        return this.GroupResourceType;
    }

    /**
     * Set 部署组资源类型
     * @param GroupResourceType 部署组资源类型
     */
    public void setGroupResourceType(String GroupResourceType) {
        this.GroupResourceType = GroupResourceType;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get agent 容器分配的 CPU 核数，对应 K8S 的 request 
     * @return AgentCpuRequest agent 容器分配的 CPU 核数，对应 K8S 的 request
     */
    public String getAgentCpuRequest() {
        return this.AgentCpuRequest;
    }

    /**
     * Set agent 容器分配的 CPU 核数，对应 K8S 的 request
     * @param AgentCpuRequest agent 容器分配的 CPU 核数，对应 K8S 的 request
     */
    public void setAgentCpuRequest(String AgentCpuRequest) {
        this.AgentCpuRequest = AgentCpuRequest;
    }

    /**
     * Get agent 容器最大的 CPU 核数，对应 K8S 的 limit 
     * @return AgentCpuLimit agent 容器最大的 CPU 核数，对应 K8S 的 limit
     */
    public String getAgentCpuLimit() {
        return this.AgentCpuLimit;
    }

    /**
     * Set agent 容器最大的 CPU 核数，对应 K8S 的 limit
     * @param AgentCpuLimit agent 容器最大的 CPU 核数，对应 K8S 的 limit
     */
    public void setAgentCpuLimit(String AgentCpuLimit) {
        this.AgentCpuLimit = AgentCpuLimit;
    }

    /**
     * Get agent 容器分配的内存 MiB 数，对应 K8S 的 request 
     * @return AgentMemRequest agent 容器分配的内存 MiB 数，对应 K8S 的 request
     */
    public String getAgentMemRequest() {
        return this.AgentMemRequest;
    }

    /**
     * Set agent 容器分配的内存 MiB 数，对应 K8S 的 request
     * @param AgentMemRequest agent 容器分配的内存 MiB 数，对应 K8S 的 request
     */
    public void setAgentMemRequest(String AgentMemRequest) {
        this.AgentMemRequest = AgentMemRequest;
    }

    /**
     * Get agent 容器最大的内存 MiB 数，对应 K8S 的 limit 
     * @return AgentMemLimit agent 容器最大的内存 MiB 数，对应 K8S 的 limit
     */
    public String getAgentMemLimit() {
        return this.AgentMemLimit;
    }

    /**
     * Set agent 容器最大的内存 MiB 数，对应 K8S 的 limit
     * @param AgentMemLimit agent 容器最大的内存 MiB 数，对应 K8S 的 limit
     */
    public void setAgentMemLimit(String AgentMemLimit) {
        this.AgentMemLimit = AgentMemLimit;
    }

    /**
     * Get istioproxy 容器分配的 CPU 核数，对应 K8S 的 request 
     * @return IstioCpuRequest istioproxy 容器分配的 CPU 核数，对应 K8S 的 request
     */
    public String getIstioCpuRequest() {
        return this.IstioCpuRequest;
    }

    /**
     * Set istioproxy 容器分配的 CPU 核数，对应 K8S 的 request
     * @param IstioCpuRequest istioproxy 容器分配的 CPU 核数，对应 K8S 的 request
     */
    public void setIstioCpuRequest(String IstioCpuRequest) {
        this.IstioCpuRequest = IstioCpuRequest;
    }

    /**
     * Get istioproxy 容器最大的 CPU 核数，对应 K8S 的 limit 
     * @return IstioCpuLimit istioproxy 容器最大的 CPU 核数，对应 K8S 的 limit
     */
    public String getIstioCpuLimit() {
        return this.IstioCpuLimit;
    }

    /**
     * Set istioproxy 容器最大的 CPU 核数，对应 K8S 的 limit
     * @param IstioCpuLimit istioproxy 容器最大的 CPU 核数，对应 K8S 的 limit
     */
    public void setIstioCpuLimit(String IstioCpuLimit) {
        this.IstioCpuLimit = IstioCpuLimit;
    }

    /**
     * Get istioproxy 容器分配的内存 MiB 数，对应 K8S 的 request 
     * @return IstioMemRequest istioproxy 容器分配的内存 MiB 数，对应 K8S 的 request
     */
    public String getIstioMemRequest() {
        return this.IstioMemRequest;
    }

    /**
     * Set istioproxy 容器分配的内存 MiB 数，对应 K8S 的 request
     * @param IstioMemRequest istioproxy 容器分配的内存 MiB 数，对应 K8S 的 request
     */
    public void setIstioMemRequest(String IstioMemRequest) {
        this.IstioMemRequest = IstioMemRequest;
    }

    /**
     * Get istioproxy 容器最大的内存 MiB 数，对应 K8S 的 limit 
     * @return IstioMemLimit istioproxy 容器最大的内存 MiB 数，对应 K8S 的 limit
     */
    public String getIstioMemLimit() {
        return this.IstioMemLimit;
    }

    /**
     * Set istioproxy 容器最大的内存 MiB 数，对应 K8S 的 limit
     * @param IstioMemLimit istioproxy 容器最大的内存 MiB 数，对应 K8S 的 limit
     */
    public void setIstioMemLimit(String IstioMemLimit) {
        this.IstioMemLimit = IstioMemLimit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamArrayObj(map, prefix + "ProtocolPorts.", this.ProtocolPorts);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);
        this.setParamSimple(map, prefix + "MemLimit", this.MemLimit);
        this.setParamSimple(map, prefix + "GroupComment", this.GroupComment);
        this.setParamSimple(map, prefix + "UpdateType", this.UpdateType);
        this.setParamSimple(map, prefix + "UpdateIvl", this.UpdateIvl);
        this.setParamSimple(map, prefix + "CpuRequest", this.CpuRequest);
        this.setParamSimple(map, prefix + "MemRequest", this.MemRequest);
        this.setParamSimple(map, prefix + "GroupResourceType", this.GroupResourceType);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "AgentCpuRequest", this.AgentCpuRequest);
        this.setParamSimple(map, prefix + "AgentCpuLimit", this.AgentCpuLimit);
        this.setParamSimple(map, prefix + "AgentMemRequest", this.AgentMemRequest);
        this.setParamSimple(map, prefix + "AgentMemLimit", this.AgentMemLimit);
        this.setParamSimple(map, prefix + "IstioCpuRequest", this.IstioCpuRequest);
        this.setParamSimple(map, prefix + "IstioCpuLimit", this.IstioCpuLimit);
        this.setParamSimple(map, prefix + "IstioMemRequest", this.IstioMemRequest);
        this.setParamSimple(map, prefix + "IstioMemLimit", this.IstioMemLimit);

    }
}


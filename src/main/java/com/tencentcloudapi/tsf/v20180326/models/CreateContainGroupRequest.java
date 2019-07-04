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

public class CreateContainGroupRequest  extends AbstractModel{

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
     * 获取分组所属应用ID
     * @return ApplicationId 分组所属应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * 设置分组所属应用ID
     * @param ApplicationId 分组所属应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * 获取分组所属命名空间ID
     * @return NamespaceId 分组所属命名空间ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * 设置分组所属命名空间ID
     * @param NamespaceId 分组所属命名空间ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * 获取分组名称字段，长度1~60，字母或下划线开头，可包含字母数字下划线
     * @return GroupName 分组名称字段，长度1~60，字母或下划线开头，可包含字母数字下划线
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * 设置分组名称字段，长度1~60，字母或下划线开头，可包含字母数字下划线
     * @param GroupName 分组名称字段，长度1~60，字母或下划线开头，可包含字母数字下划线
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * 获取实例数量
     * @return InstanceNum 实例数量
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * 设置实例数量
     * @param InstanceNum 实例数量
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * 获取0:公网 1:集群内访问 2：NodePort
     * @return AccessType 0:公网 1:集群内访问 2：NodePort
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * 设置0:公网 1:集群内访问 2：NodePort
     * @param AccessType 0:公网 1:集群内访问 2：NodePort
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * 获取数组对象，见下方定义
     * @return ProtocolPorts 数组对象，见下方定义
     */
    public ProtocolPort [] getProtocolPorts() {
        return this.ProtocolPorts;
    }

    /**
     * 设置数组对象，见下方定义
     * @param ProtocolPorts 数组对象，见下方定义
     */
    public void setProtocolPorts(ProtocolPort [] ProtocolPorts) {
        this.ProtocolPorts = ProtocolPorts;
    }

    /**
     * 获取集群ID
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * 设置集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * 获取最大分配 CPU 核数，对应 K8S limit
     * @return CpuLimit 最大分配 CPU 核数，对应 K8S limit
     */
    public String getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * 设置最大分配 CPU 核数，对应 K8S limit
     * @param CpuLimit 最大分配 CPU 核数，对应 K8S limit
     */
    public void setCpuLimit(String CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * 获取最大分配内存 MiB 数，对应 K8S limit
     * @return MemLimit 最大分配内存 MiB 数，对应 K8S limit
     */
    public String getMemLimit() {
        return this.MemLimit;
    }

    /**
     * 设置最大分配内存 MiB 数，对应 K8S limit
     * @param MemLimit 最大分配内存 MiB 数，对应 K8S limit
     */
    public void setMemLimit(String MemLimit) {
        this.MemLimit = MemLimit;
    }

    /**
     * 获取分组备注字段，长度应不大于200字符
     * @return GroupComment 分组备注字段，长度应不大于200字符
     */
    public String getGroupComment() {
        return this.GroupComment;
    }

    /**
     * 设置分组备注字段，长度应不大于200字符
     * @param GroupComment 分组备注字段，长度应不大于200字符
     */
    public void setGroupComment(String GroupComment) {
        this.GroupComment = GroupComment;
    }

    /**
     * 获取更新方式：0:快速更新 1:滚动更新
     * @return UpdateType 更新方式：0:快速更新 1:滚动更新
     */
    public Long getUpdateType() {
        return this.UpdateType;
    }

    /**
     * 设置更新方式：0:快速更新 1:滚动更新
     * @param UpdateType 更新方式：0:快速更新 1:滚动更新
     */
    public void setUpdateType(Long UpdateType) {
        this.UpdateType = UpdateType;
    }

    /**
     * 获取滚动更新必填，更新间隔
     * @return UpdateIvl 滚动更新必填，更新间隔
     */
    public Long getUpdateIvl() {
        return this.UpdateIvl;
    }

    /**
     * 设置滚动更新必填，更新间隔
     * @param UpdateIvl 滚动更新必填，更新间隔
     */
    public void setUpdateIvl(Long UpdateIvl) {
        this.UpdateIvl = UpdateIvl;
    }

    /**
     * 获取初始分配的 CPU 核数，对应 K8S request
     * @return CpuRequest 初始分配的 CPU 核数，对应 K8S request
     */
    public String getCpuRequest() {
        return this.CpuRequest;
    }

    /**
     * 设置初始分配的 CPU 核数，对应 K8S request
     * @param CpuRequest 初始分配的 CPU 核数，对应 K8S request
     */
    public void setCpuRequest(String CpuRequest) {
        this.CpuRequest = CpuRequest;
    }

    /**
     * 获取初始分配的内存 MiB 数，对应 K8S request
     * @return MemRequest 初始分配的内存 MiB 数，对应 K8S request
     */
    public String getMemRequest() {
        return this.MemRequest;
    }

    /**
     * 设置初始分配的内存 MiB 数，对应 K8S request
     * @param MemRequest 初始分配的内存 MiB 数，对应 K8S request
     */
    public void setMemRequest(String MemRequest) {
        this.MemRequest = MemRequest;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}


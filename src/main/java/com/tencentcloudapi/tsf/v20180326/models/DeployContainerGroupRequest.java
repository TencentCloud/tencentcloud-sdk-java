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

public class DeployContainerGroupRequest  extends AbstractModel{

    /**
    * 部署组ID，分组唯一标识
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 镜像server
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * 镜像版本名称,如v1
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 实例数量
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * 旧版镜像名，如/tsf/nginx
    */
    @SerializedName("Reponame")
    @Expose
    private String Reponame;

    /**
    * 最大的 CPU 核数，对应 K8S 的 limit；不填时默认为 request 的 2 倍
    */
    @SerializedName("CpuLimit")
    @Expose
    private String CpuLimit;

    /**
    * 最大的内存 MiB 数，对应 K8S 的 limit；不填时默认为 request 的 2 倍
    */
    @SerializedName("MemLimit")
    @Expose
    private String MemLimit;

    /**
    * jvm参数
    */
    @SerializedName("JvmOpts")
    @Expose
    private String JvmOpts;

    /**
    * 分配的 CPU 核数，对应 K8S 的 request
    */
    @SerializedName("CpuRequest")
    @Expose
    private String CpuRequest;

    /**
    * 分配的内存 MiB 数，对应 K8S 的 request
    */
    @SerializedName("MemRequest")
    @Expose
    private String MemRequest;

    /**
    * 是否不立即启动
    */
    @SerializedName("DoNotStart")
    @Expose
    private Boolean DoNotStart;

    /**
    * （优先使用）新版镜像名，如/tsf/nginx
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

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
     * 获取部署组ID，分组唯一标识
     * @return GroupId 部署组ID，分组唯一标识
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * 设置部署组ID，分组唯一标识
     * @param GroupId 部署组ID，分组唯一标识
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * 获取镜像server
     * @return Server 镜像server
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * 设置镜像server
     * @param Server 镜像server
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * 获取镜像版本名称,如v1
     * @return TagName 镜像版本名称,如v1
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * 设置镜像版本名称,如v1
     * @param TagName 镜像版本名称,如v1
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
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
     * 获取旧版镜像名，如/tsf/nginx
     * @return Reponame 旧版镜像名，如/tsf/nginx
     */
    public String getReponame() {
        return this.Reponame;
    }

    /**
     * 设置旧版镜像名，如/tsf/nginx
     * @param Reponame 旧版镜像名，如/tsf/nginx
     */
    public void setReponame(String Reponame) {
        this.Reponame = Reponame;
    }

    /**
     * 获取最大的 CPU 核数，对应 K8S 的 limit；不填时默认为 request 的 2 倍
     * @return CpuLimit 最大的 CPU 核数，对应 K8S 的 limit；不填时默认为 request 的 2 倍
     */
    public String getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * 设置最大的 CPU 核数，对应 K8S 的 limit；不填时默认为 request 的 2 倍
     * @param CpuLimit 最大的 CPU 核数，对应 K8S 的 limit；不填时默认为 request 的 2 倍
     */
    public void setCpuLimit(String CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * 获取最大的内存 MiB 数，对应 K8S 的 limit；不填时默认为 request 的 2 倍
     * @return MemLimit 最大的内存 MiB 数，对应 K8S 的 limit；不填时默认为 request 的 2 倍
     */
    public String getMemLimit() {
        return this.MemLimit;
    }

    /**
     * 设置最大的内存 MiB 数，对应 K8S 的 limit；不填时默认为 request 的 2 倍
     * @param MemLimit 最大的内存 MiB 数，对应 K8S 的 limit；不填时默认为 request 的 2 倍
     */
    public void setMemLimit(String MemLimit) {
        this.MemLimit = MemLimit;
    }

    /**
     * 获取jvm参数
     * @return JvmOpts jvm参数
     */
    public String getJvmOpts() {
        return this.JvmOpts;
    }

    /**
     * 设置jvm参数
     * @param JvmOpts jvm参数
     */
    public void setJvmOpts(String JvmOpts) {
        this.JvmOpts = JvmOpts;
    }

    /**
     * 获取分配的 CPU 核数，对应 K8S 的 request
     * @return CpuRequest 分配的 CPU 核数，对应 K8S 的 request
     */
    public String getCpuRequest() {
        return this.CpuRequest;
    }

    /**
     * 设置分配的 CPU 核数，对应 K8S 的 request
     * @param CpuRequest 分配的 CPU 核数，对应 K8S 的 request
     */
    public void setCpuRequest(String CpuRequest) {
        this.CpuRequest = CpuRequest;
    }

    /**
     * 获取分配的内存 MiB 数，对应 K8S 的 request
     * @return MemRequest 分配的内存 MiB 数，对应 K8S 的 request
     */
    public String getMemRequest() {
        return this.MemRequest;
    }

    /**
     * 设置分配的内存 MiB 数，对应 K8S 的 request
     * @param MemRequest 分配的内存 MiB 数，对应 K8S 的 request
     */
    public void setMemRequest(String MemRequest) {
        this.MemRequest = MemRequest;
    }

    /**
     * 获取是否不立即启动
     * @return DoNotStart 是否不立即启动
     */
    public Boolean getDoNotStart() {
        return this.DoNotStart;
    }

    /**
     * 设置是否不立即启动
     * @param DoNotStart 是否不立即启动
     */
    public void setDoNotStart(Boolean DoNotStart) {
        this.DoNotStart = DoNotStart;
    }

    /**
     * 获取（优先使用）新版镜像名，如/tsf/nginx
     * @return RepoName （优先使用）新版镜像名，如/tsf/nginx
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * 设置（优先使用）新版镜像名，如/tsf/nginx
     * @param RepoName （优先使用）新版镜像名，如/tsf/nginx
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
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
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "Reponame", this.Reponame);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);
        this.setParamSimple(map, prefix + "MemLimit", this.MemLimit);
        this.setParamSimple(map, prefix + "JvmOpts", this.JvmOpts);
        this.setParamSimple(map, prefix + "CpuRequest", this.CpuRequest);
        this.setParamSimple(map, prefix + "MemRequest", this.MemRequest);
        this.setParamSimple(map, prefix + "DoNotStart", this.DoNotStart);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "UpdateType", this.UpdateType);
        this.setParamSimple(map, prefix + "UpdateIvl", this.UpdateIvl);

    }
}


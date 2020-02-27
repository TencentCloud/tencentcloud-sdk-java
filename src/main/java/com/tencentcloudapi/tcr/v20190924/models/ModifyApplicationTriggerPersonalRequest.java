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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyApplicationTriggerPersonalRequest extends AbstractModel{

    /**
    * 触发器关联的镜像仓库，library/test格式
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 触发器名称
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * 触发方式，"all"全部触发，"taglist"指定tag触发，"regex"正则触发
    */
    @SerializedName("InvokeMethod")
    @Expose
    private String InvokeMethod;

    /**
    * 触发方式对应的表达式
    */
    @SerializedName("InvokeExpr")
    @Expose
    private String InvokeExpr;

    /**
    * 应用所在TKE集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 应用所在TKE集群命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 应用所在TKE集群工作负载类型,支持Deployment、StatefulSet、DaemonSet、CronJob、Job。
    */
    @SerializedName("WorkloadType")
    @Expose
    private String WorkloadType;

    /**
    * 应用所在TKE集群工作负载名称
    */
    @SerializedName("WorkloadName")
    @Expose
    private String WorkloadName;

    /**
    * 应用所在TKE集群工作负载下容器名称
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 应用所在TKE集群地域数字ID，如1（广州）、16（成都）
    */
    @SerializedName("ClusterRegion")
    @Expose
    private Long ClusterRegion;

    /**
    * 新触发器名称
    */
    @SerializedName("NewTriggerName")
    @Expose
    private String NewTriggerName;

    /**
     * Get 触发器关联的镜像仓库，library/test格式 
     * @return RepoName 触发器关联的镜像仓库，library/test格式
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 触发器关联的镜像仓库，library/test格式
     * @param RepoName 触发器关联的镜像仓库，library/test格式
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get 触发器名称 
     * @return TriggerName 触发器名称
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set 触发器名称
     * @param TriggerName 触发器名称
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get 触发方式，"all"全部触发，"taglist"指定tag触发，"regex"正则触发 
     * @return InvokeMethod 触发方式，"all"全部触发，"taglist"指定tag触发，"regex"正则触发
     */
    public String getInvokeMethod() {
        return this.InvokeMethod;
    }

    /**
     * Set 触发方式，"all"全部触发，"taglist"指定tag触发，"regex"正则触发
     * @param InvokeMethod 触发方式，"all"全部触发，"taglist"指定tag触发，"regex"正则触发
     */
    public void setInvokeMethod(String InvokeMethod) {
        this.InvokeMethod = InvokeMethod;
    }

    /**
     * Get 触发方式对应的表达式 
     * @return InvokeExpr 触发方式对应的表达式
     */
    public String getInvokeExpr() {
        return this.InvokeExpr;
    }

    /**
     * Set 触发方式对应的表达式
     * @param InvokeExpr 触发方式对应的表达式
     */
    public void setInvokeExpr(String InvokeExpr) {
        this.InvokeExpr = InvokeExpr;
    }

    /**
     * Get 应用所在TKE集群ID 
     * @return ClusterId 应用所在TKE集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 应用所在TKE集群ID
     * @param ClusterId 应用所在TKE集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 应用所在TKE集群命名空间 
     * @return Namespace 应用所在TKE集群命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 应用所在TKE集群命名空间
     * @param Namespace 应用所在TKE集群命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 应用所在TKE集群工作负载类型,支持Deployment、StatefulSet、DaemonSet、CronJob、Job。 
     * @return WorkloadType 应用所在TKE集群工作负载类型,支持Deployment、StatefulSet、DaemonSet、CronJob、Job。
     */
    public String getWorkloadType() {
        return this.WorkloadType;
    }

    /**
     * Set 应用所在TKE集群工作负载类型,支持Deployment、StatefulSet、DaemonSet、CronJob、Job。
     * @param WorkloadType 应用所在TKE集群工作负载类型,支持Deployment、StatefulSet、DaemonSet、CronJob、Job。
     */
    public void setWorkloadType(String WorkloadType) {
        this.WorkloadType = WorkloadType;
    }

    /**
     * Get 应用所在TKE集群工作负载名称 
     * @return WorkloadName 应用所在TKE集群工作负载名称
     */
    public String getWorkloadName() {
        return this.WorkloadName;
    }

    /**
     * Set 应用所在TKE集群工作负载名称
     * @param WorkloadName 应用所在TKE集群工作负载名称
     */
    public void setWorkloadName(String WorkloadName) {
        this.WorkloadName = WorkloadName;
    }

    /**
     * Get 应用所在TKE集群工作负载下容器名称 
     * @return ContainerName 应用所在TKE集群工作负载下容器名称
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 应用所在TKE集群工作负载下容器名称
     * @param ContainerName 应用所在TKE集群工作负载下容器名称
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get 应用所在TKE集群地域数字ID，如1（广州）、16（成都） 
     * @return ClusterRegion 应用所在TKE集群地域数字ID，如1（广州）、16（成都）
     */
    public Long getClusterRegion() {
        return this.ClusterRegion;
    }

    /**
     * Set 应用所在TKE集群地域数字ID，如1（广州）、16（成都）
     * @param ClusterRegion 应用所在TKE集群地域数字ID，如1（广州）、16（成都）
     */
    public void setClusterRegion(Long ClusterRegion) {
        this.ClusterRegion = ClusterRegion;
    }

    /**
     * Get 新触发器名称 
     * @return NewTriggerName 新触发器名称
     */
    public String getNewTriggerName() {
        return this.NewTriggerName;
    }

    /**
     * Set 新触发器名称
     * @param NewTriggerName 新触发器名称
     */
    public void setNewTriggerName(String NewTriggerName) {
        this.NewTriggerName = NewTriggerName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "InvokeMethod", this.InvokeMethod);
        this.setParamSimple(map, prefix + "InvokeExpr", this.InvokeExpr);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "WorkloadType", this.WorkloadType);
        this.setParamSimple(map, prefix + "WorkloadName", this.WorkloadName);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ClusterRegion", this.ClusterRegion);
        this.setParamSimple(map, prefix + "NewTriggerName", this.NewTriggerName);

    }
}


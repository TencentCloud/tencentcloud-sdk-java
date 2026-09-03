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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeploymentResourceInfo extends AbstractModel {

    /**
    * <p>部署业务唯一标识（deploymentUid）</p>
    */
    @SerializedName("DeploymentId")
    @Expose
    private String DeploymentId;

    /**
    * <p>部署名称</p>
    */
    @SerializedName("DeploymentName")
    @Expose
    private String DeploymentName;

    /**
    * <p>部署状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Worker 节点 BillingItem</p>
    */
    @SerializedName("WorkerBillingItem")
    @Expose
    private String WorkerBillingItem;

    /**
    * <p>Worker 节点规格倍数</p>
    */
    @SerializedName("WorkerSpec")
    @Expose
    private Long WorkerSpec;

    /**
    * <p>Worker 节点资源类型，枚举： • GU — GPU 计费单位 • CU — CPU 计费单位</p>
    */
    @SerializedName("WorkerResourceType")
    @Expose
    private String WorkerResourceType;

    /**
    * <p>Head 节点 BillingItem</p>
    */
    @SerializedName("HeadBillingItem")
    @Expose
    private String HeadBillingItem;

    /**
    * <p>Head 节点规格倍数</p>
    */
    @SerializedName("HeadSpec")
    @Expose
    private Long HeadSpec;

    /**
    * <p>Head 节点资源类型。当前实现恒为 CU</p>
    */
    @SerializedName("HeadResourceType")
    @Expose
    private String HeadResourceType;

    /**
    * <p>GPU 型号。CPU 部署或型号未知时为空串 &quot;&quot;</p>
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * <p>期望副本数</p>
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
     * Get <p>部署业务唯一标识（deploymentUid）</p> 
     * @return DeploymentId <p>部署业务唯一标识（deploymentUid）</p>
     */
    public String getDeploymentId() {
        return this.DeploymentId;
    }

    /**
     * Set <p>部署业务唯一标识（deploymentUid）</p>
     * @param DeploymentId <p>部署业务唯一标识（deploymentUid）</p>
     */
    public void setDeploymentId(String DeploymentId) {
        this.DeploymentId = DeploymentId;
    }

    /**
     * Get <p>部署名称</p> 
     * @return DeploymentName <p>部署名称</p>
     */
    public String getDeploymentName() {
        return this.DeploymentName;
    }

    /**
     * Set <p>部署名称</p>
     * @param DeploymentName <p>部署名称</p>
     */
    public void setDeploymentName(String DeploymentName) {
        this.DeploymentName = DeploymentName;
    }

    /**
     * Get <p>部署状态</p> 
     * @return Status <p>部署状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>部署状态</p>
     * @param Status <p>部署状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Worker 节点 BillingItem</p> 
     * @return WorkerBillingItem <p>Worker 节点 BillingItem</p>
     */
    public String getWorkerBillingItem() {
        return this.WorkerBillingItem;
    }

    /**
     * Set <p>Worker 节点 BillingItem</p>
     * @param WorkerBillingItem <p>Worker 节点 BillingItem</p>
     */
    public void setWorkerBillingItem(String WorkerBillingItem) {
        this.WorkerBillingItem = WorkerBillingItem;
    }

    /**
     * Get <p>Worker 节点规格倍数</p> 
     * @return WorkerSpec <p>Worker 节点规格倍数</p>
     */
    public Long getWorkerSpec() {
        return this.WorkerSpec;
    }

    /**
     * Set <p>Worker 节点规格倍数</p>
     * @param WorkerSpec <p>Worker 节点规格倍数</p>
     */
    public void setWorkerSpec(Long WorkerSpec) {
        this.WorkerSpec = WorkerSpec;
    }

    /**
     * Get <p>Worker 节点资源类型，枚举： • GU — GPU 计费单位 • CU — CPU 计费单位</p> 
     * @return WorkerResourceType <p>Worker 节点资源类型，枚举： • GU — GPU 计费单位 • CU — CPU 计费单位</p>
     */
    public String getWorkerResourceType() {
        return this.WorkerResourceType;
    }

    /**
     * Set <p>Worker 节点资源类型，枚举： • GU — GPU 计费单位 • CU — CPU 计费单位</p>
     * @param WorkerResourceType <p>Worker 节点资源类型，枚举： • GU — GPU 计费单位 • CU — CPU 计费单位</p>
     */
    public void setWorkerResourceType(String WorkerResourceType) {
        this.WorkerResourceType = WorkerResourceType;
    }

    /**
     * Get <p>Head 节点 BillingItem</p> 
     * @return HeadBillingItem <p>Head 节点 BillingItem</p>
     */
    public String getHeadBillingItem() {
        return this.HeadBillingItem;
    }

    /**
     * Set <p>Head 节点 BillingItem</p>
     * @param HeadBillingItem <p>Head 节点 BillingItem</p>
     */
    public void setHeadBillingItem(String HeadBillingItem) {
        this.HeadBillingItem = HeadBillingItem;
    }

    /**
     * Get <p>Head 节点规格倍数</p> 
     * @return HeadSpec <p>Head 节点规格倍数</p>
     */
    public Long getHeadSpec() {
        return this.HeadSpec;
    }

    /**
     * Set <p>Head 节点规格倍数</p>
     * @param HeadSpec <p>Head 节点规格倍数</p>
     */
    public void setHeadSpec(Long HeadSpec) {
        this.HeadSpec = HeadSpec;
    }

    /**
     * Get <p>Head 节点资源类型。当前实现恒为 CU</p> 
     * @return HeadResourceType <p>Head 节点资源类型。当前实现恒为 CU</p>
     */
    public String getHeadResourceType() {
        return this.HeadResourceType;
    }

    /**
     * Set <p>Head 节点资源类型。当前实现恒为 CU</p>
     * @param HeadResourceType <p>Head 节点资源类型。当前实现恒为 CU</p>
     */
    public void setHeadResourceType(String HeadResourceType) {
        this.HeadResourceType = HeadResourceType;
    }

    /**
     * Get <p>GPU 型号。CPU 部署或型号未知时为空串 &quot;&quot;</p> 
     * @return GpuType <p>GPU 型号。CPU 部署或型号未知时为空串 &quot;&quot;</p>
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set <p>GPU 型号。CPU 部署或型号未知时为空串 &quot;&quot;</p>
     * @param GpuType <p>GPU 型号。CPU 部署或型号未知时为空串 &quot;&quot;</p>
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get <p>期望副本数</p> 
     * @return Replicas <p>期望副本数</p>
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set <p>期望副本数</p>
     * @param Replicas <p>期望副本数</p>
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    public DeploymentResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeploymentResourceInfo(DeploymentResourceInfo source) {
        if (source.DeploymentId != null) {
            this.DeploymentId = new String(source.DeploymentId);
        }
        if (source.DeploymentName != null) {
            this.DeploymentName = new String(source.DeploymentName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.WorkerBillingItem != null) {
            this.WorkerBillingItem = new String(source.WorkerBillingItem);
        }
        if (source.WorkerSpec != null) {
            this.WorkerSpec = new Long(source.WorkerSpec);
        }
        if (source.WorkerResourceType != null) {
            this.WorkerResourceType = new String(source.WorkerResourceType);
        }
        if (source.HeadBillingItem != null) {
            this.HeadBillingItem = new String(source.HeadBillingItem);
        }
        if (source.HeadSpec != null) {
            this.HeadSpec = new Long(source.HeadSpec);
        }
        if (source.HeadResourceType != null) {
            this.HeadResourceType = new String(source.HeadResourceType);
        }
        if (source.GpuType != null) {
            this.GpuType = new String(source.GpuType);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeploymentId", this.DeploymentId);
        this.setParamSimple(map, prefix + "DeploymentName", this.DeploymentName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "WorkerBillingItem", this.WorkerBillingItem);
        this.setParamSimple(map, prefix + "WorkerSpec", this.WorkerSpec);
        this.setParamSimple(map, prefix + "WorkerResourceType", this.WorkerResourceType);
        this.setParamSimple(map, prefix + "HeadBillingItem", this.HeadBillingItem);
        this.setParamSimple(map, prefix + "HeadSpec", this.HeadSpec);
        this.setParamSimple(map, prefix + "HeadResourceType", this.HeadResourceType);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);

    }
}


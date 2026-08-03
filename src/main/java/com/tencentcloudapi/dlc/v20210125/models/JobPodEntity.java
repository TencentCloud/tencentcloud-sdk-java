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

public class JobPodEntity extends AbstractModel {

    /**
    * Pod名称
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * Pod IP
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
    * Pod状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Pod阶段
    */
    @SerializedName("Phase")
    @Expose
    private String Phase;

    /**
    * 所属节点
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 节点IP
    */
    @SerializedName("NodeIp")
    @Expose
    private String NodeIp;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * CPU请求
    */
    @SerializedName("CpuRequest")
    @Expose
    private String CpuRequest;

    /**
    * CPU限制
    */
    @SerializedName("CpuLimit")
    @Expose
    private String CpuLimit;

    /**
    * 内存请求
    */
    @SerializedName("MemoryRequest")
    @Expose
    private String MemoryRequest;

    /**
    * 内存限制
    */
    @SerializedName("MemoryLimit")
    @Expose
    private String MemoryLimit;

    /**
    * GPU数量
    */
    @SerializedName("GpuCount")
    @Expose
    private String GpuCount;

    /**
    * 容器镜像
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * Pod角色(head/worker)
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 启动时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
     * Get Pod名称 
     * @return PodName Pod名称
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod名称
     * @param PodName Pod名称
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get Pod IP 
     * @return PodIp Pod IP
     */
    public String getPodIp() {
        return this.PodIp;
    }

    /**
     * Set Pod IP
     * @param PodIp Pod IP
     */
    public void setPodIp(String PodIp) {
        this.PodIp = PodIp;
    }

    /**
     * Get Pod状态 
     * @return Status Pod状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Pod状态
     * @param Status Pod状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Pod阶段 
     * @return Phase Pod阶段
     */
    public String getPhase() {
        return this.Phase;
    }

    /**
     * Set Pod阶段
     * @param Phase Pod阶段
     */
    public void setPhase(String Phase) {
        this.Phase = Phase;
    }

    /**
     * Get 所属节点 
     * @return NodeName 所属节点
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 所属节点
     * @param NodeName 所属节点
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 节点IP 
     * @return NodeIp 节点IP
     */
    public String getNodeIp() {
        return this.NodeIp;
    }

    /**
     * Set 节点IP
     * @param NodeIp 节点IP
     */
    public void setNodeIp(String NodeIp) {
        this.NodeIp = NodeIp;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get CPU请求 
     * @return CpuRequest CPU请求
     */
    public String getCpuRequest() {
        return this.CpuRequest;
    }

    /**
     * Set CPU请求
     * @param CpuRequest CPU请求
     */
    public void setCpuRequest(String CpuRequest) {
        this.CpuRequest = CpuRequest;
    }

    /**
     * Get CPU限制 
     * @return CpuLimit CPU限制
     */
    public String getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set CPU限制
     * @param CpuLimit CPU限制
     */
    public void setCpuLimit(String CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get 内存请求 
     * @return MemoryRequest 内存请求
     */
    public String getMemoryRequest() {
        return this.MemoryRequest;
    }

    /**
     * Set 内存请求
     * @param MemoryRequest 内存请求
     */
    public void setMemoryRequest(String MemoryRequest) {
        this.MemoryRequest = MemoryRequest;
    }

    /**
     * Get 内存限制 
     * @return MemoryLimit 内存限制
     */
    public String getMemoryLimit() {
        return this.MemoryLimit;
    }

    /**
     * Set 内存限制
     * @param MemoryLimit 内存限制
     */
    public void setMemoryLimit(String MemoryLimit) {
        this.MemoryLimit = MemoryLimit;
    }

    /**
     * Get GPU数量 
     * @return GpuCount GPU数量
     */
    public String getGpuCount() {
        return this.GpuCount;
    }

    /**
     * Set GPU数量
     * @param GpuCount GPU数量
     */
    public void setGpuCount(String GpuCount) {
        this.GpuCount = GpuCount;
    }

    /**
     * Get 容器镜像 
     * @return Image 容器镜像
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 容器镜像
     * @param Image 容器镜像
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get Pod角色(head/worker) 
     * @return Role Pod角色(head/worker)
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Pod角色(head/worker)
     * @param Role Pod角色(head/worker)
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 启动时间 
     * @return StartTime 启动时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 启动时间
     * @param StartTime 启动时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    public JobPodEntity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobPodEntity(JobPodEntity source) {
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIp != null) {
            this.PodIp = new String(source.PodIp);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Phase != null) {
            this.Phase = new String(source.Phase);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeIp != null) {
            this.NodeIp = new String(source.NodeIp);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.CpuRequest != null) {
            this.CpuRequest = new String(source.CpuRequest);
        }
        if (source.CpuLimit != null) {
            this.CpuLimit = new String(source.CpuLimit);
        }
        if (source.MemoryRequest != null) {
            this.MemoryRequest = new String(source.MemoryRequest);
        }
        if (source.MemoryLimit != null) {
            this.MemoryLimit = new String(source.MemoryLimit);
        }
        if (source.GpuCount != null) {
            this.GpuCount = new String(source.GpuCount);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodIp", this.PodIp);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Phase", this.Phase);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeIp", this.NodeIp);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "CpuRequest", this.CpuRequest);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);
        this.setParamSimple(map, prefix + "MemoryRequest", this.MemoryRequest);
        this.setParamSimple(map, prefix + "MemoryLimit", this.MemoryLimit);
        this.setParamSimple(map, prefix + "GpuCount", this.GpuCount);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}


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

public class DeploymentReplicaInfo extends AbstractModel {

    /**
    * <p>关联的部署ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeploymentId")
    @Expose
    private Long DeploymentId;

    /**
    * <p>副本名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>副本状态（Running/Pending/Failed/Terminated）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>重启次数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestartCount")
    @Expose
    private Long RestartCount;

    /**
    * <p>节点类型（head/worker）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>启动时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>Pod IP</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
    * <p>节点名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>节点 IP</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeIp")
    @Expose
    private String NodeIp;

    /**
    * <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>CPU 请求</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuRequest")
    @Expose
    private String CpuRequest;

    /**
    * <p>CPU 限制</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuLimit")
    @Expose
    private String CpuLimit;

    /**
    * <p>内存请求</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemoryRequest")
    @Expose
    private String MemoryRequest;

    /**
    * <p>内存限制</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemoryLimit")
    @Expose
    private String MemoryLimit;

    /**
    * <p>GPU 数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuCount")
    @Expose
    private Long GpuCount;

    /**
    * <p>容器镜像</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get <p>关联的部署ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeploymentId <p>关联的部署ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeploymentId() {
        return this.DeploymentId;
    }

    /**
     * Set <p>关联的部署ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeploymentId <p>关联的部署ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeploymentId(Long DeploymentId) {
        this.DeploymentId = DeploymentId;
    }

    /**
     * Get <p>副本名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>副本名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>副本名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>副本名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>副本状态（Running/Pending/Failed/Terminated）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>副本状态（Running/Pending/Failed/Terminated）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>副本状态（Running/Pending/Failed/Terminated）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>副本状态（Running/Pending/Failed/Terminated）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>重启次数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestartCount <p>重启次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRestartCount() {
        return this.RestartCount;
    }

    /**
     * Set <p>重启次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestartCount <p>重启次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestartCount(Long RestartCount) {
        this.RestartCount = RestartCount;
    }

    /**
     * Get <p>节点类型（head/worker）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeType <p>节点类型（head/worker）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>节点类型（head/worker）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeType <p>节点类型（head/worker）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>启动时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>启动时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>启动时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>启动时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Pod IP</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodIp <p>Pod IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodIp() {
        return this.PodIp;
    }

    /**
     * Set <p>Pod IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodIp <p>Pod IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodIp(String PodIp) {
        this.PodIp = PodIp;
    }

    /**
     * Get <p>节点名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeName <p>节点名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>节点名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeName <p>节点名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>节点 IP</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeIp <p>节点 IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeIp() {
        return this.NodeIp;
    }

    /**
     * Set <p>节点 IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeIp <p>节点 IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeIp(String NodeIp) {
        this.NodeIp = NodeIp;
    }

    /**
     * Get <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>CPU 请求</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuRequest <p>CPU 请求</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCpuRequest() {
        return this.CpuRequest;
    }

    /**
     * Set <p>CPU 请求</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuRequest <p>CPU 请求</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuRequest(String CpuRequest) {
        this.CpuRequest = CpuRequest;
    }

    /**
     * Get <p>CPU 限制</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuLimit <p>CPU 限制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set <p>CPU 限制</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuLimit <p>CPU 限制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuLimit(String CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get <p>内存请求</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemoryRequest <p>内存请求</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemoryRequest() {
        return this.MemoryRequest;
    }

    /**
     * Set <p>内存请求</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemoryRequest <p>内存请求</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemoryRequest(String MemoryRequest) {
        this.MemoryRequest = MemoryRequest;
    }

    /**
     * Get <p>内存限制</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemoryLimit <p>内存限制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemoryLimit() {
        return this.MemoryLimit;
    }

    /**
     * Set <p>内存限制</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemoryLimit <p>内存限制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemoryLimit(String MemoryLimit) {
        this.MemoryLimit = MemoryLimit;
    }

    /**
     * Get <p>GPU 数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuCount <p>GPU 数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGpuCount() {
        return this.GpuCount;
    }

    /**
     * Set <p>GPU 数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuCount <p>GPU 数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuCount(Long GpuCount) {
        this.GpuCount = GpuCount;
    }

    /**
     * Get <p>容器镜像</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Image <p>容器镜像</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>容器镜像</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Image <p>容器镜像</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    public DeploymentReplicaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeploymentReplicaInfo(DeploymentReplicaInfo source) {
        if (source.DeploymentId != null) {
            this.DeploymentId = new Long(source.DeploymentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RestartCount != null) {
            this.RestartCount = new Long(source.RestartCount);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.PodIp != null) {
            this.PodIp = new String(source.PodIp);
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
            this.GpuCount = new Long(source.GpuCount);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeploymentId", this.DeploymentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RestartCount", this.RestartCount);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "PodIp", this.PodIp);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeIp", this.NodeIp);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "CpuRequest", this.CpuRequest);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);
        this.setParamSimple(map, prefix + "MemoryRequest", this.MemoryRequest);
        this.setParamSimple(map, prefix + "MemoryLimit", this.MemoryLimit);
        this.setParamSimple(map, prefix + "GpuCount", this.GpuCount);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}


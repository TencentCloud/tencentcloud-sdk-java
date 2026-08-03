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

public class ClusterPod extends AbstractModel {

    /**
    * <p>Pod名称</p>
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * <p>Pod IP</p>
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
    * <p>Pod状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Pod阶段</p>
    */
    @SerializedName("Phase")
    @Expose
    private String Phase;

    /**
    * <p>所属节点</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>节点IP</p>
    */
    @SerializedName("NodeIp")
    @Expose
    private String NodeIp;

    /**
    * <p>命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>CPU请求</p>
    */
    @SerializedName("CpuRequest")
    @Expose
    private String CpuRequest;

    /**
    * <p>CPU限制</p>
    */
    @SerializedName("CpuLimit")
    @Expose
    private String CpuLimit;

    /**
    * <p>内存请求</p>
    */
    @SerializedName("MemoryRequest")
    @Expose
    private String MemoryRequest;

    /**
    * <p>内存限制</p>
    */
    @SerializedName("MemoryLimit")
    @Expose
    private String MemoryLimit;

    /**
    * <p>GPU数量</p>
    */
    @SerializedName("GpuCount")
    @Expose
    private String GpuCount;

    /**
    * <p>容器镜像</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>Pod角色(head/worker)</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>创建时间（毫秒时间戳）</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>启动时间（毫秒时间戳）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
     * Get <p>Pod名称</p> 
     * @return PodName <p>Pod名称</p>
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set <p>Pod名称</p>
     * @param PodName <p>Pod名称</p>
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get <p>Pod IP</p> 
     * @return PodIp <p>Pod IP</p>
     */
    public String getPodIp() {
        return this.PodIp;
    }

    /**
     * Set <p>Pod IP</p>
     * @param PodIp <p>Pod IP</p>
     */
    public void setPodIp(String PodIp) {
        this.PodIp = PodIp;
    }

    /**
     * Get <p>Pod状态</p> 
     * @return Status <p>Pod状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Pod状态</p>
     * @param Status <p>Pod状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Pod阶段</p> 
     * @return Phase <p>Pod阶段</p>
     */
    public String getPhase() {
        return this.Phase;
    }

    /**
     * Set <p>Pod阶段</p>
     * @param Phase <p>Pod阶段</p>
     */
    public void setPhase(String Phase) {
        this.Phase = Phase;
    }

    /**
     * Get <p>所属节点</p> 
     * @return NodeName <p>所属节点</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>所属节点</p>
     * @param NodeName <p>所属节点</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>节点IP</p> 
     * @return NodeIp <p>节点IP</p>
     */
    public String getNodeIp() {
        return this.NodeIp;
    }

    /**
     * Set <p>节点IP</p>
     * @param NodeIp <p>节点IP</p>
     */
    public void setNodeIp(String NodeIp) {
        this.NodeIp = NodeIp;
    }

    /**
     * Get <p>命名空间</p> 
     * @return Namespace <p>命名空间</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>命名空间</p>
     * @param Namespace <p>命名空间</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>CPU请求</p> 
     * @return CpuRequest <p>CPU请求</p>
     */
    public String getCpuRequest() {
        return this.CpuRequest;
    }

    /**
     * Set <p>CPU请求</p>
     * @param CpuRequest <p>CPU请求</p>
     */
    public void setCpuRequest(String CpuRequest) {
        this.CpuRequest = CpuRequest;
    }

    /**
     * Get <p>CPU限制</p> 
     * @return CpuLimit <p>CPU限制</p>
     */
    public String getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set <p>CPU限制</p>
     * @param CpuLimit <p>CPU限制</p>
     */
    public void setCpuLimit(String CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get <p>内存请求</p> 
     * @return MemoryRequest <p>内存请求</p>
     */
    public String getMemoryRequest() {
        return this.MemoryRequest;
    }

    /**
     * Set <p>内存请求</p>
     * @param MemoryRequest <p>内存请求</p>
     */
    public void setMemoryRequest(String MemoryRequest) {
        this.MemoryRequest = MemoryRequest;
    }

    /**
     * Get <p>内存限制</p> 
     * @return MemoryLimit <p>内存限制</p>
     */
    public String getMemoryLimit() {
        return this.MemoryLimit;
    }

    /**
     * Set <p>内存限制</p>
     * @param MemoryLimit <p>内存限制</p>
     */
    public void setMemoryLimit(String MemoryLimit) {
        this.MemoryLimit = MemoryLimit;
    }

    /**
     * Get <p>GPU数量</p> 
     * @return GpuCount <p>GPU数量</p>
     */
    public String getGpuCount() {
        return this.GpuCount;
    }

    /**
     * Set <p>GPU数量</p>
     * @param GpuCount <p>GPU数量</p>
     */
    public void setGpuCount(String GpuCount) {
        this.GpuCount = GpuCount;
    }

    /**
     * Get <p>容器镜像</p> 
     * @return Image <p>容器镜像</p>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>容器镜像</p>
     * @param Image <p>容器镜像</p>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>Pod角色(head/worker)</p> 
     * @return Role <p>Pod角色(head/worker)</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>Pod角色(head/worker)</p>
     * @param Role <p>Pod角色(head/worker)</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>创建时间（毫秒时间戳）</p> 
     * @return CreateTime <p>创建时间（毫秒时间戳）</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（毫秒时间戳）</p>
     * @param CreateTime <p>创建时间（毫秒时间戳）</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>启动时间（毫秒时间戳）</p> 
     * @return StartTime <p>启动时间（毫秒时间戳）</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>启动时间（毫秒时间戳）</p>
     * @param StartTime <p>启动时间（毫秒时间戳）</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    public ClusterPod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterPod(ClusterPod source) {
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


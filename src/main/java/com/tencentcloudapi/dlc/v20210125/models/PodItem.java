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

public class PodItem extends AbstractModel {

    /**
    * <p>Pod 名称</p>
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * <p>命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>K8s Pod Phase</p>
    */
    @SerializedName("Phase")
    @Expose
    private String Phase;

    /**
    * <p>计算后的状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Pod IP</p>
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
    * <p>调度节点名</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>容器镜像</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>CPU 请求</p>
    */
    @SerializedName("CpuRequest")
    @Expose
    private String CpuRequest;

    /**
    * <p>CPU 限制</p>
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
    * <p>创建时间（epoch millis）</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>启动时间（epoch millis）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
     * Get <p>Pod 名称</p> 
     * @return PodName <p>Pod 名称</p>
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set <p>Pod 名称</p>
     * @param PodName <p>Pod 名称</p>
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
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
     * Get <p>K8s Pod Phase</p> 
     * @return Phase <p>K8s Pod Phase</p>
     */
    public String getPhase() {
        return this.Phase;
    }

    /**
     * Set <p>K8s Pod Phase</p>
     * @param Phase <p>K8s Pod Phase</p>
     */
    public void setPhase(String Phase) {
        this.Phase = Phase;
    }

    /**
     * Get <p>计算后的状态</p> 
     * @return Status <p>计算后的状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>计算后的状态</p>
     * @param Status <p>计算后的状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get <p>调度节点名</p> 
     * @return NodeName <p>调度节点名</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>调度节点名</p>
     * @param NodeName <p>调度节点名</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
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
     * Get <p>CPU 请求</p> 
     * @return CpuRequest <p>CPU 请求</p>
     */
    public String getCpuRequest() {
        return this.CpuRequest;
    }

    /**
     * Set <p>CPU 请求</p>
     * @param CpuRequest <p>CPU 请求</p>
     */
    public void setCpuRequest(String CpuRequest) {
        this.CpuRequest = CpuRequest;
    }

    /**
     * Get <p>CPU 限制</p> 
     * @return CpuLimit <p>CPU 限制</p>
     */
    public String getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set <p>CPU 限制</p>
     * @param CpuLimit <p>CPU 限制</p>
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
     * Get <p>创建时间（epoch millis）</p> 
     * @return CreateTime <p>创建时间（epoch millis）</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（epoch millis）</p>
     * @param CreateTime <p>创建时间（epoch millis）</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>启动时间（epoch millis）</p> 
     * @return StartTime <p>启动时间（epoch millis）</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>启动时间（epoch millis）</p>
     * @param StartTime <p>启动时间（epoch millis）</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    public PodItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodItem(PodItem source) {
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Phase != null) {
            this.Phase = new String(source.Phase);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PodIp != null) {
            this.PodIp = new String(source.PodIp);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
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
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Phase", this.Phase);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PodIp", this.PodIp);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "CpuRequest", this.CpuRequest);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);
        this.setParamSimple(map, prefix + "MemoryRequest", this.MemoryRequest);
        this.setParamSimple(map, prefix + "MemoryLimit", this.MemoryLimit);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}


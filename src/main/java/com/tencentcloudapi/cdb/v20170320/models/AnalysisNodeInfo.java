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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalysisNodeInfo extends AbstractModel {

    /**
    * 节点ID
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 节点状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 数据加载状态
    */
    @SerializedName("DataStatus")
    @Expose
    private String DataStatus;

    /**
    * cpu核数，单位：核
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存大小，单位: MB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 磁盘大小，单位：GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 节点所在可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 数据同步错误信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 节点ID 
     * @return NodeId 节点ID
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点ID
     * @param NodeId 节点ID
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 节点状态 
     * @return Status 节点状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 节点状态
     * @param Status 节点状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 数据加载状态 
     * @return DataStatus 数据加载状态
     */
    public String getDataStatus() {
        return this.DataStatus;
    }

    /**
     * Set 数据加载状态
     * @param DataStatus 数据加载状态
     */
    public void setDataStatus(String DataStatus) {
        this.DataStatus = DataStatus;
    }

    /**
     * Get cpu核数，单位：核 
     * @return Cpu cpu核数，单位：核
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set cpu核数，单位：核
     * @param Cpu cpu核数，单位：核
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存大小，单位: MB 
     * @return Memory 内存大小，单位: MB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位: MB
     * @param Memory 内存大小，单位: MB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 磁盘大小，单位：GB 
     * @return Storage 磁盘大小，单位：GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 磁盘大小，单位：GB
     * @param Storage 磁盘大小，单位：GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 节点所在可用区 
     * @return Zone 节点所在可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 节点所在可用区
     * @param Zone 节点所在可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 数据同步错误信息 
     * @return Message 数据同步错误信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 数据同步错误信息
     * @param Message 数据同步错误信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public AnalysisNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalysisNodeInfo(AnalysisNodeInfo source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DataStatus != null) {
            this.DataStatus = new String(source.DataStatus);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DataStatus", this.DataStatus);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}


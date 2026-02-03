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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LibraDBNodeInfo extends AbstractModel {

    /**
    * LibraDB节点ID
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
    * 数据同步中
    */
    @SerializedName("DataStatus")
    @Expose
    private String DataStatus;

    /**
    * CPU核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存大小，单位 G
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 磁盘大小，单位G
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 错误信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get LibraDB节点ID 
     * @return NodeId LibraDB节点ID
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set LibraDB节点ID
     * @param NodeId LibraDB节点ID
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
     * Get 数据同步中 
     * @return DataStatus 数据同步中
     */
    public String getDataStatus() {
        return this.DataStatus;
    }

    /**
     * Set 数据同步中
     * @param DataStatus 数据同步中
     */
    public void setDataStatus(String DataStatus) {
        this.DataStatus = DataStatus;
    }

    /**
     * Get CPU核数 
     * @return Cpu CPU核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU核数
     * @param Cpu CPU核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存大小，单位 G 
     * @return Memory 内存大小，单位 G
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位 G
     * @param Memory 内存大小，单位 G
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 磁盘大小，单位G 
     * @return Storage 磁盘大小，单位G
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 磁盘大小，单位G
     * @param Storage 磁盘大小，单位G
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 错误信息 
     * @return Message 错误信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误信息
     * @param Message 错误信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public LibraDBNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LibraDBNodeInfo(LibraDBNodeInfo source) {
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
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}


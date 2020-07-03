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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShardInfo extends AbstractModel{

    /**
    * 分片ID
    */
    @SerializedName("ShardInstanceId")
    @Expose
    private String ShardInstanceId;

    /**
    * 分片Set ID
    */
    @SerializedName("ShardSerialId")
    @Expose
    private String ShardSerialId;

    /**
    * 状态：0 创建中，1 流程处理中， 2 运行中，3 分片未初始化，-2 分片已删除
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
    */
    @SerializedName("Createtime")
    @Expose
    private String Createtime;

    /**
    * 内存大小，单位 GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 存储大小，单位 GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 分片数字ID
    */
    @SerializedName("ShardId")
    @Expose
    private Long ShardId;

    /**
    * 节点数，2 为一主一从， 3 为一主二从
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 产品类型 Id（过时字段，请勿依赖该值）
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Cpu核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
     * Get 分片ID 
     * @return ShardInstanceId 分片ID
     */
    public String getShardInstanceId() {
        return this.ShardInstanceId;
    }

    /**
     * Set 分片ID
     * @param ShardInstanceId 分片ID
     */
    public void setShardInstanceId(String ShardInstanceId) {
        this.ShardInstanceId = ShardInstanceId;
    }

    /**
     * Get 分片Set ID 
     * @return ShardSerialId 分片Set ID
     */
    public String getShardSerialId() {
        return this.ShardSerialId;
    }

    /**
     * Set 分片Set ID
     * @param ShardSerialId 分片Set ID
     */
    public void setShardSerialId(String ShardSerialId) {
        this.ShardSerialId = ShardSerialId;
    }

    /**
     * Get 状态：0 创建中，1 流程处理中， 2 运行中，3 分片未初始化，-2 分片已删除 
     * @return Status 状态：0 创建中，1 流程处理中， 2 运行中，3 分片未初始化，-2 分片已删除
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：0 创建中，1 流程处理中， 2 运行中，3 分片未初始化，-2 分片已删除
     * @param Status 状态：0 创建中，1 流程处理中， 2 运行中，3 分片未初始化，-2 分片已删除
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return Createtime 创建时间
     */
    public String getCreatetime() {
        return this.Createtime;
    }

    /**
     * Set 创建时间
     * @param Createtime 创建时间
     */
    public void setCreatetime(String Createtime) {
        this.Createtime = Createtime;
    }

    /**
     * Get 内存大小，单位 GB 
     * @return Memory 内存大小，单位 GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位 GB
     * @param Memory 内存大小，单位 GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 存储大小，单位 GB 
     * @return Storage 存储大小，单位 GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储大小，单位 GB
     * @param Storage 存储大小，单位 GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 分片数字ID 
     * @return ShardId 分片数字ID
     */
    public Long getShardId() {
        return this.ShardId;
    }

    /**
     * Set 分片数字ID
     * @param ShardId 分片数字ID
     */
    public void setShardId(Long ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * Get 节点数，2 为一主一从， 3 为一主二从 
     * @return NodeCount 节点数，2 为一主一从， 3 为一主二从
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点数，2 为一主一从， 3 为一主二从
     * @param NodeCount 节点数，2 为一主一从， 3 为一主二从
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 产品类型 Id（过时字段，请勿依赖该值） 
     * @return Pid 产品类型 Id（过时字段，请勿依赖该值）
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 产品类型 Id（过时字段，请勿依赖该值）
     * @param Pid 产品类型 Id（过时字段，请勿依赖该值）
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Cpu核数 
     * @return Cpu Cpu核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Cpu核数
     * @param Cpu Cpu核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShardInstanceId", this.ShardInstanceId);
        this.setParamSimple(map, prefix + "ShardSerialId", this.ShardSerialId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Createtime", this.Createtime);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);

    }
}


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
package com.tencentcloudapi.mongodb.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MongodbShardInfo  extends AbstractModel{

    /**
    * 分片已使用容量
    */
    @SerializedName("UsedVolume")
    @Expose
    private Float UsedVolume;

    /**
    * 分片ID
    */
    @SerializedName("ReplicaSetId")
    @Expose
    private String ReplicaSetId;

    /**
    * 分片名
    */
    @SerializedName("ReplicaSetName")
    @Expose
    private String ReplicaSetName;

    /**
    * 分片内存规格，单位为MB
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * 分片磁盘规格，单位为MB
    */
    @SerializedName("Volume")
    @Expose
    private Integer Volume;

    /**
    * 分片Oplog大小，单位为MB
    */
    @SerializedName("OplogSize")
    @Expose
    private Integer OplogSize;

    /**
    * 分片从节点数
    */
    @SerializedName("SecondaryNum")
    @Expose
    private Integer SecondaryNum;

    /**
    * 分片物理id
    */
    @SerializedName("RealReplicaSetId")
    @Expose
    private String RealReplicaSetId;

    /**
     * 获取分片已使用容量
     * @return UsedVolume 分片已使用容量
     */
    public Float getUsedVolume() {
        return this.UsedVolume;
    }

    /**
     * 设置分片已使用容量
     * @param UsedVolume 分片已使用容量
     */
    public void setUsedVolume(Float UsedVolume) {
        this.UsedVolume = UsedVolume;
    }

    /**
     * 获取分片ID
     * @return ReplicaSetId 分片ID
     */
    public String getReplicaSetId() {
        return this.ReplicaSetId;
    }

    /**
     * 设置分片ID
     * @param ReplicaSetId 分片ID
     */
    public void setReplicaSetId(String ReplicaSetId) {
        this.ReplicaSetId = ReplicaSetId;
    }

    /**
     * 获取分片名
     * @return ReplicaSetName 分片名
     */
    public String getReplicaSetName() {
        return this.ReplicaSetName;
    }

    /**
     * 设置分片名
     * @param ReplicaSetName 分片名
     */
    public void setReplicaSetName(String ReplicaSetName) {
        this.ReplicaSetName = ReplicaSetName;
    }

    /**
     * 获取分片内存规格，单位为MB
     * @return Memory 分片内存规格，单位为MB
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置分片内存规格，单位为MB
     * @param Memory 分片内存规格，单位为MB
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取分片磁盘规格，单位为MB
     * @return Volume 分片磁盘规格，单位为MB
     */
    public Integer getVolume() {
        return this.Volume;
    }

    /**
     * 设置分片磁盘规格，单位为MB
     * @param Volume 分片磁盘规格，单位为MB
     */
    public void setVolume(Integer Volume) {
        this.Volume = Volume;
    }

    /**
     * 获取分片Oplog大小，单位为MB
     * @return OplogSize 分片Oplog大小，单位为MB
     */
    public Integer getOplogSize() {
        return this.OplogSize;
    }

    /**
     * 设置分片Oplog大小，单位为MB
     * @param OplogSize 分片Oplog大小，单位为MB
     */
    public void setOplogSize(Integer OplogSize) {
        this.OplogSize = OplogSize;
    }

    /**
     * 获取分片从节点数
     * @return SecondaryNum 分片从节点数
     */
    public Integer getSecondaryNum() {
        return this.SecondaryNum;
    }

    /**
     * 设置分片从节点数
     * @param SecondaryNum 分片从节点数
     */
    public void setSecondaryNum(Integer SecondaryNum) {
        this.SecondaryNum = SecondaryNum;
    }

    /**
     * 获取分片物理id
     * @return RealReplicaSetId 分片物理id
     */
    public String getRealReplicaSetId() {
        return this.RealReplicaSetId;
    }

    /**
     * 设置分片物理id
     * @param RealReplicaSetId 分片物理id
     */
    public void setRealReplicaSetId(String RealReplicaSetId) {
        this.RealReplicaSetId = RealReplicaSetId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UsedVolume", this.UsedVolume);
        this.setParamSimple(map, prefix + "ReplicaSetId", this.ReplicaSetId);
        this.setParamSimple(map, prefix + "ReplicaSetName", this.ReplicaSetName);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "OplogSize", this.OplogSize);
        this.setParamSimple(map, prefix + "SecondaryNum", this.SecondaryNum);
        this.setParamSimple(map, prefix + "RealReplicaSetId", this.RealReplicaSetId);

    }
}


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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceClusterShard  extends AbstractModel{

    /**
    * 分片节点名称
    */
    @SerializedName("ShardName")
    @Expose
    private String ShardName;

    /**
    * 分片节点Id
    */
    @SerializedName("ShardId")
    @Expose
    private String ShardId;

    /**
    * 角色
    */
    @SerializedName("Role")
    @Expose
    private Integer Role;

    /**
    * Key数量
    */
    @SerializedName("Keys")
    @Expose
    private Integer Keys;

    /**
    * slot信息
    */
    @SerializedName("Slots")
    @Expose
    private String Slots;

    /**
    * 使用容量
    */
    @SerializedName("Storage")
    @Expose
    private Integer Storage;

    /**
    * 容量倾斜率
    */
    @SerializedName("StorageSlope")
    @Expose
    private Float StorageSlope;

    /**
    * 实例运行时节点Id
    */
    @SerializedName("Runid")
    @Expose
    private String Runid;

    /**
    * 服务状态：0-down；1-on
    */
    @SerializedName("Connected")
    @Expose
    private Integer Connected;

    /**
     * 获取分片节点名称
     * @return ShardName 分片节点名称
     */
    public String getShardName() {
        return this.ShardName;
    }

    /**
     * 设置分片节点名称
     * @param ShardName 分片节点名称
     */
    public void setShardName(String ShardName) {
        this.ShardName = ShardName;
    }

    /**
     * 获取分片节点Id
     * @return ShardId 分片节点Id
     */
    public String getShardId() {
        return this.ShardId;
    }

    /**
     * 设置分片节点Id
     * @param ShardId 分片节点Id
     */
    public void setShardId(String ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * 获取角色
     * @return Role 角色
     */
    public Integer getRole() {
        return this.Role;
    }

    /**
     * 设置角色
     * @param Role 角色
     */
    public void setRole(Integer Role) {
        this.Role = Role;
    }

    /**
     * 获取Key数量
     * @return Keys Key数量
     */
    public Integer getKeys() {
        return this.Keys;
    }

    /**
     * 设置Key数量
     * @param Keys Key数量
     */
    public void setKeys(Integer Keys) {
        this.Keys = Keys;
    }

    /**
     * 获取slot信息
     * @return Slots slot信息
     */
    public String getSlots() {
        return this.Slots;
    }

    /**
     * 设置slot信息
     * @param Slots slot信息
     */
    public void setSlots(String Slots) {
        this.Slots = Slots;
    }

    /**
     * 获取使用容量
     * @return Storage 使用容量
     */
    public Integer getStorage() {
        return this.Storage;
    }

    /**
     * 设置使用容量
     * @param Storage 使用容量
     */
    public void setStorage(Integer Storage) {
        this.Storage = Storage;
    }

    /**
     * 获取容量倾斜率
     * @return StorageSlope 容量倾斜率
     */
    public Float getStorageSlope() {
        return this.StorageSlope;
    }

    /**
     * 设置容量倾斜率
     * @param StorageSlope 容量倾斜率
     */
    public void setStorageSlope(Float StorageSlope) {
        this.StorageSlope = StorageSlope;
    }

    /**
     * 获取实例运行时节点Id
     * @return Runid 实例运行时节点Id
     */
    public String getRunid() {
        return this.Runid;
    }

    /**
     * 设置实例运行时节点Id
     * @param Runid 实例运行时节点Id
     */
    public void setRunid(String Runid) {
        this.Runid = Runid;
    }

    /**
     * 获取服务状态：0-down；1-on
     * @return Connected 服务状态：0-down；1-on
     */
    public Integer getConnected() {
        return this.Connected;
    }

    /**
     * 设置服务状态：0-down；1-on
     * @param Connected 服务状态：0-down；1-on
     */
    public void setConnected(Integer Connected) {
        this.Connected = Connected;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShardName", this.ShardName);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Keys", this.Keys);
        this.setParamSimple(map, prefix + "Slots", this.Slots);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "StorageSlope", this.StorageSlope);
        this.setParamSimple(map, prefix + "Runid", this.Runid);
        this.setParamSimple(map, prefix + "Connected", this.Connected);

    }
}


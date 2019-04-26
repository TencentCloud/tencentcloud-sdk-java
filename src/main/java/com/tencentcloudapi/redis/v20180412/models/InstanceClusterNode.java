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

public class InstanceClusterNode  extends AbstractModel{

    /**
    * 节点名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 实例运行时节点Id
    */
    @SerializedName("RunId")
    @Expose
    private String RunId;

    /**
    * 集群角色：0-master；1-slave
    */
    @SerializedName("Role")
    @Expose
    private Integer Role;

    /**
    * 节点状态：0-readwrite, 1-read, 2-backup
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 服务状态：0-down；1-on
    */
    @SerializedName("Connected")
    @Expose
    private Integer Connected;

    /**
    * 节点创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 节点下线时间
    */
    @SerializedName("DownTime")
    @Expose
    private String DownTime;

    /**
    * 节点slot分布
    */
    @SerializedName("Slots")
    @Expose
    private String Slots;

    /**
    * 节点key分布
    */
    @SerializedName("Keys")
    @Expose
    private Integer Keys;

    /**
    * 节点qps
    */
    @SerializedName("Qps")
    @Expose
    private Integer Qps;

    /**
    * 节点qps倾斜度
    */
    @SerializedName("QpsSlope")
    @Expose
    private Float QpsSlope;

    /**
    * 节点存储
    */
    @SerializedName("Storage")
    @Expose
    private Integer Storage;

    /**
    * 节点存储倾斜度
    */
    @SerializedName("StorageSlope")
    @Expose
    private Float StorageSlope;

    /**
     * 获取节点名称
     * @return Name 节点名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置节点名称
     * @param Name 节点名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取实例运行时节点Id
     * @return RunId 实例运行时节点Id
     */
    public String getRunId() {
        return this.RunId;
    }

    /**
     * 设置实例运行时节点Id
     * @param RunId 实例运行时节点Id
     */
    public void setRunId(String RunId) {
        this.RunId = RunId;
    }

    /**
     * 获取集群角色：0-master；1-slave
     * @return Role 集群角色：0-master；1-slave
     */
    public Integer getRole() {
        return this.Role;
    }

    /**
     * 设置集群角色：0-master；1-slave
     * @param Role 集群角色：0-master；1-slave
     */
    public void setRole(Integer Role) {
        this.Role = Role;
    }

    /**
     * 获取节点状态：0-readwrite, 1-read, 2-backup
     * @return Status 节点状态：0-readwrite, 1-read, 2-backup
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置节点状态：0-readwrite, 1-read, 2-backup
     * @param Status 节点状态：0-readwrite, 1-read, 2-backup
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
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
     * 获取节点创建时间
     * @return CreateTime 节点创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置节点创建时间
     * @param CreateTime 节点创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取节点下线时间
     * @return DownTime 节点下线时间
     */
    public String getDownTime() {
        return this.DownTime;
    }

    /**
     * 设置节点下线时间
     * @param DownTime 节点下线时间
     */
    public void setDownTime(String DownTime) {
        this.DownTime = DownTime;
    }

    /**
     * 获取节点slot分布
     * @return Slots 节点slot分布
     */
    public String getSlots() {
        return this.Slots;
    }

    /**
     * 设置节点slot分布
     * @param Slots 节点slot分布
     */
    public void setSlots(String Slots) {
        this.Slots = Slots;
    }

    /**
     * 获取节点key分布
     * @return Keys 节点key分布
     */
    public Integer getKeys() {
        return this.Keys;
    }

    /**
     * 设置节点key分布
     * @param Keys 节点key分布
     */
    public void setKeys(Integer Keys) {
        this.Keys = Keys;
    }

    /**
     * 获取节点qps
     * @return Qps 节点qps
     */
    public Integer getQps() {
        return this.Qps;
    }

    /**
     * 设置节点qps
     * @param Qps 节点qps
     */
    public void setQps(Integer Qps) {
        this.Qps = Qps;
    }

    /**
     * 获取节点qps倾斜度
     * @return QpsSlope 节点qps倾斜度
     */
    public Float getQpsSlope() {
        return this.QpsSlope;
    }

    /**
     * 设置节点qps倾斜度
     * @param QpsSlope 节点qps倾斜度
     */
    public void setQpsSlope(Float QpsSlope) {
        this.QpsSlope = QpsSlope;
    }

    /**
     * 获取节点存储
     * @return Storage 节点存储
     */
    public Integer getStorage() {
        return this.Storage;
    }

    /**
     * 设置节点存储
     * @param Storage 节点存储
     */
    public void setStorage(Integer Storage) {
        this.Storage = Storage;
    }

    /**
     * 获取节点存储倾斜度
     * @return StorageSlope 节点存储倾斜度
     */
    public Float getStorageSlope() {
        return this.StorageSlope;
    }

    /**
     * 设置节点存储倾斜度
     * @param StorageSlope 节点存储倾斜度
     */
    public void setStorageSlope(Float StorageSlope) {
        this.StorageSlope = StorageSlope;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RunId", this.RunId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Connected", this.Connected);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DownTime", this.DownTime);
        this.setParamSimple(map, prefix + "Slots", this.Slots);
        this.setParamSimple(map, prefix + "Keys", this.Keys);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "QpsSlope", this.QpsSlope);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "StorageSlope", this.StorageSlope);

    }
}


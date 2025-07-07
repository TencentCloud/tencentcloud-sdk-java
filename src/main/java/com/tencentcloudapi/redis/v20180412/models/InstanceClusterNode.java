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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceClusterNode extends AbstractModel {

    /**
    * 节点组名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 实例运行时节点 ID。
    */
    @SerializedName("RunId")
    @Expose
    private String RunId;

    /**
    * 集群角色。
- 0：master。
- 1：slave。
    */
    @SerializedName("Role")
    @Expose
    private Long Role;

    /**
    * 节点状态。
- 0：readwrite,。
- 1：read。
- 2：backup。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 服务状态。
0-down。
1-on
    */
    @SerializedName("Connected")
    @Expose
    private Long Connected;

    /**
    * 节点创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 节点下线时间。
    */
    @SerializedName("DownTime")
    @Expose
    private String DownTime;

    /**
    * 节点 Slot 分布区间。
    */
    @SerializedName("Slots")
    @Expose
    private String Slots;

    /**
    * 节点 Key分布。
    */
    @SerializedName("Keys")
    @Expose
    private Long Keys;

    /**
    * 节点 QPS。分片节点每秒执行次数。单位：次/秒。
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * 节点 QPS 倾斜度。
    */
    @SerializedName("QpsSlope")
    @Expose
    private Float QpsSlope;

    /**
    * 节点存储。
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 节点存储倾斜度。
    */
    @SerializedName("StorageSlope")
    @Expose
    private Float StorageSlope;

    /**
     * Get 节点组名称。 
     * @return Name 节点组名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 节点组名称。
     * @param Name 节点组名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 实例运行时节点 ID。 
     * @return RunId 实例运行时节点 ID。
     */
    public String getRunId() {
        return this.RunId;
    }

    /**
     * Set 实例运行时节点 ID。
     * @param RunId 实例运行时节点 ID。
     */
    public void setRunId(String RunId) {
        this.RunId = RunId;
    }

    /**
     * Get 集群角色。
- 0：master。
- 1：slave。 
     * @return Role 集群角色。
- 0：master。
- 1：slave。
     */
    public Long getRole() {
        return this.Role;
    }

    /**
     * Set 集群角色。
- 0：master。
- 1：slave。
     * @param Role 集群角色。
- 0：master。
- 1：slave。
     */
    public void setRole(Long Role) {
        this.Role = Role;
    }

    /**
     * Get 节点状态。
- 0：readwrite,。
- 1：read。
- 2：backup。 
     * @return Status 节点状态。
- 0：readwrite,。
- 1：read。
- 2：backup。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 节点状态。
- 0：readwrite,。
- 1：read。
- 2：backup。
     * @param Status 节点状态。
- 0：readwrite,。
- 1：read。
- 2：backup。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 服务状态。
0-down。
1-on 
     * @return Connected 服务状态。
0-down。
1-on
     */
    public Long getConnected() {
        return this.Connected;
    }

    /**
     * Set 服务状态。
0-down。
1-on
     * @param Connected 服务状态。
0-down。
1-on
     */
    public void setConnected(Long Connected) {
        this.Connected = Connected;
    }

    /**
     * Get 节点创建时间。 
     * @return CreateTime 节点创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 节点创建时间。
     * @param CreateTime 节点创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 节点下线时间。 
     * @return DownTime 节点下线时间。
     */
    public String getDownTime() {
        return this.DownTime;
    }

    /**
     * Set 节点下线时间。
     * @param DownTime 节点下线时间。
     */
    public void setDownTime(String DownTime) {
        this.DownTime = DownTime;
    }

    /**
     * Get 节点 Slot 分布区间。 
     * @return Slots 节点 Slot 分布区间。
     */
    public String getSlots() {
        return this.Slots;
    }

    /**
     * Set 节点 Slot 分布区间。
     * @param Slots 节点 Slot 分布区间。
     */
    public void setSlots(String Slots) {
        this.Slots = Slots;
    }

    /**
     * Get 节点 Key分布。 
     * @return Keys 节点 Key分布。
     */
    public Long getKeys() {
        return this.Keys;
    }

    /**
     * Set 节点 Key分布。
     * @param Keys 节点 Key分布。
     */
    public void setKeys(Long Keys) {
        this.Keys = Keys;
    }

    /**
     * Get 节点 QPS。分片节点每秒执行次数。单位：次/秒。 
     * @return Qps 节点 QPS。分片节点每秒执行次数。单位：次/秒。
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set 节点 QPS。分片节点每秒执行次数。单位：次/秒。
     * @param Qps 节点 QPS。分片节点每秒执行次数。单位：次/秒。
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get 节点 QPS 倾斜度。 
     * @return QpsSlope 节点 QPS 倾斜度。
     */
    public Float getQpsSlope() {
        return this.QpsSlope;
    }

    /**
     * Set 节点 QPS 倾斜度。
     * @param QpsSlope 节点 QPS 倾斜度。
     */
    public void setQpsSlope(Float QpsSlope) {
        this.QpsSlope = QpsSlope;
    }

    /**
     * Get 节点存储。 
     * @return Storage 节点存储。
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 节点存储。
     * @param Storage 节点存储。
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 节点存储倾斜度。 
     * @return StorageSlope 节点存储倾斜度。
     */
    public Float getStorageSlope() {
        return this.StorageSlope;
    }

    /**
     * Set 节点存储倾斜度。
     * @param StorageSlope 节点存储倾斜度。
     */
    public void setStorageSlope(Float StorageSlope) {
        this.StorageSlope = StorageSlope;
    }

    public InstanceClusterNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceClusterNode(InstanceClusterNode source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RunId != null) {
            this.RunId = new String(source.RunId);
        }
        if (source.Role != null) {
            this.Role = new Long(source.Role);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Connected != null) {
            this.Connected = new Long(source.Connected);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DownTime != null) {
            this.DownTime = new String(source.DownTime);
        }
        if (source.Slots != null) {
            this.Slots = new String(source.Slots);
        }
        if (source.Keys != null) {
            this.Keys = new Long(source.Keys);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.QpsSlope != null) {
            this.QpsSlope = new Float(source.QpsSlope);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.StorageSlope != null) {
            this.StorageSlope = new Float(source.StorageSlope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
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


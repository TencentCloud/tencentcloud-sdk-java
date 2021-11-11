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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Mesh extends AbstractModel{

    /**
    * Mesh实例Id
    */
    @SerializedName("MeshId")
    @Expose
    private String MeshId;

    /**
    * Mesh名称
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Mesh类型，取值范围：
- STANDALONE：独立网格
- HOSTED：托管网格
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Mesh状态，取值范围：
- PENDING：等待中
- CREATING：创建中
- RUNNING：运行中
- ABNORMAL：异常
- UPGRADING：升级中
- CANARY_UPGRADED：升级灰度完成
- ROLLBACKING：升级回滚
- DELETING：删除中
- CREATE_FAILED：安装失败
- DELETE_FAILED：删除失败
- UPGRADE_FAILED：升级失败
- ROLLBACK_FAILED：回滚失败
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 集群列表
    */
    @SerializedName("ClusterList")
    @Expose
    private Cluster [] ClusterList;

    /**
    * Mesh配置
    */
    @SerializedName("Config")
    @Expose
    private MeshConfig Config;

    /**
    * Mesh详细状态
    */
    @SerializedName("Status")
    @Expose
    private MeshStatus Status;

    /**
     * Get Mesh实例Id 
     * @return MeshId Mesh实例Id
     */
    public String getMeshId() {
        return this.MeshId;
    }

    /**
     * Set Mesh实例Id
     * @param MeshId Mesh实例Id
     */
    public void setMeshId(String MeshId) {
        this.MeshId = MeshId;
    }

    /**
     * Get Mesh名称 
     * @return DisplayName Mesh名称
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Mesh名称
     * @param DisplayName Mesh名称
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Mesh类型，取值范围：
- STANDALONE：独立网格
- HOSTED：托管网格 
     * @return Type Mesh类型，取值范围：
- STANDALONE：独立网格
- HOSTED：托管网格
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Mesh类型，取值范围：
- STANDALONE：独立网格
- HOSTED：托管网格
     * @param Type Mesh类型，取值范围：
- STANDALONE：独立网格
- HOSTED：托管网格
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 版本 
     * @return Version 版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本
     * @param Version 版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Mesh状态，取值范围：
- PENDING：等待中
- CREATING：创建中
- RUNNING：运行中
- ABNORMAL：异常
- UPGRADING：升级中
- CANARY_UPGRADED：升级灰度完成
- ROLLBACKING：升级回滚
- DELETING：删除中
- CREATE_FAILED：安装失败
- DELETE_FAILED：删除失败
- UPGRADE_FAILED：升级失败
- ROLLBACK_FAILED：回滚失败 
     * @return State Mesh状态，取值范围：
- PENDING：等待中
- CREATING：创建中
- RUNNING：运行中
- ABNORMAL：异常
- UPGRADING：升级中
- CANARY_UPGRADED：升级灰度完成
- ROLLBACKING：升级回滚
- DELETING：删除中
- CREATE_FAILED：安装失败
- DELETE_FAILED：删除失败
- UPGRADE_FAILED：升级失败
- ROLLBACK_FAILED：回滚失败
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Mesh状态，取值范围：
- PENDING：等待中
- CREATING：创建中
- RUNNING：运行中
- ABNORMAL：异常
- UPGRADING：升级中
- CANARY_UPGRADED：升级灰度完成
- ROLLBACKING：升级回滚
- DELETING：删除中
- CREATE_FAILED：安装失败
- DELETE_FAILED：删除失败
- UPGRADE_FAILED：升级失败
- ROLLBACK_FAILED：回滚失败
     * @param State Mesh状态，取值范围：
- PENDING：等待中
- CREATING：创建中
- RUNNING：运行中
- ABNORMAL：异常
- UPGRADING：升级中
- CANARY_UPGRADED：升级灰度完成
- ROLLBACKING：升级回滚
- DELETING：删除中
- CREATE_FAILED：安装失败
- DELETE_FAILED：删除失败
- UPGRADE_FAILED：升级失败
- ROLLBACK_FAILED：回滚失败
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 集群列表 
     * @return ClusterList 集群列表
     */
    public Cluster [] getClusterList() {
        return this.ClusterList;
    }

    /**
     * Set 集群列表
     * @param ClusterList 集群列表
     */
    public void setClusterList(Cluster [] ClusterList) {
        this.ClusterList = ClusterList;
    }

    /**
     * Get Mesh配置 
     * @return Config Mesh配置
     */
    public MeshConfig getConfig() {
        return this.Config;
    }

    /**
     * Set Mesh配置
     * @param Config Mesh配置
     */
    public void setConfig(MeshConfig Config) {
        this.Config = Config;
    }

    /**
     * Get Mesh详细状态 
     * @return Status Mesh详细状态
     */
    public MeshStatus getStatus() {
        return this.Status;
    }

    /**
     * Set Mesh详细状态
     * @param Status Mesh详细状态
     */
    public void setStatus(MeshStatus Status) {
        this.Status = Status;
    }

    public Mesh() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Mesh(Mesh source) {
        if (source.MeshId != null) {
            this.MeshId = new String(source.MeshId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.ClusterList != null) {
            this.ClusterList = new Cluster[source.ClusterList.length];
            for (int i = 0; i < source.ClusterList.length; i++) {
                this.ClusterList[i] = new Cluster(source.ClusterList[i]);
            }
        }
        if (source.Config != null) {
            this.Config = new MeshConfig(source.Config);
        }
        if (source.Status != null) {
            this.Status = new MeshStatus(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MeshId", this.MeshId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamArrayObj(map, prefix + "ClusterList.", this.ClusterList);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamObj(map, prefix + "Status.", this.Status);

    }
}


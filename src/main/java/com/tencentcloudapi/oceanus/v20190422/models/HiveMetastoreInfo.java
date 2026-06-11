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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HiveMetastoreInfo extends AbstractModel {

    /**
    * <p>hms serialId</p>
    */
    @SerializedName("HiveMetastoreSerialId")
    @Expose
    private String HiveMetastoreSerialId;

    /**
    * <p>集群SerialId</p>
    */
    @SerializedName("ClusterGroupSerialId")
    @Expose
    private String ClusterGroupSerialId;

    /**
    * <p>状态枚举</p><p>枚举值：</p><ul><li>3： 运行中</li><li>1： 初始化中</li><li>2： 部署中</li><li>-2： 已删除</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>使用核数</p><p>单位：cu</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>使用内存资源</p><p>单位：GB</p>
    */
    @SerializedName("MemGB")
    @Expose
    private Long MemGB;

    /**
    * <p>副本数</p>
    */
    @SerializedName("Replica")
    @Expose
    private Long Replica;

    /**
    * <p>hms 访问uri</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HiveUri")
    @Expose
    private String HiveUri;

    /**
    * <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HiveNamespace")
    @Expose
    private String HiveNamespace;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Warehouse地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HiveMetastoreWarehouseDir")
    @Expose
    private String HiveMetastoreWarehouseDir;

    /**
    * <p>高级参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Config")
    @Expose
    private Property [] Config;

    /**
     * Get <p>hms serialId</p> 
     * @return HiveMetastoreSerialId <p>hms serialId</p>
     */
    public String getHiveMetastoreSerialId() {
        return this.HiveMetastoreSerialId;
    }

    /**
     * Set <p>hms serialId</p>
     * @param HiveMetastoreSerialId <p>hms serialId</p>
     */
    public void setHiveMetastoreSerialId(String HiveMetastoreSerialId) {
        this.HiveMetastoreSerialId = HiveMetastoreSerialId;
    }

    /**
     * Get <p>集群SerialId</p> 
     * @return ClusterGroupSerialId <p>集群SerialId</p>
     */
    public String getClusterGroupSerialId() {
        return this.ClusterGroupSerialId;
    }

    /**
     * Set <p>集群SerialId</p>
     * @param ClusterGroupSerialId <p>集群SerialId</p>
     */
    public void setClusterGroupSerialId(String ClusterGroupSerialId) {
        this.ClusterGroupSerialId = ClusterGroupSerialId;
    }

    /**
     * Get <p>状态枚举</p><p>枚举值：</p><ul><li>3： 运行中</li><li>1： 初始化中</li><li>2： 部署中</li><li>-2： 已删除</li></ul> 
     * @return Status <p>状态枚举</p><p>枚举值：</p><ul><li>3： 运行中</li><li>1： 初始化中</li><li>2： 部署中</li><li>-2： 已删除</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态枚举</p><p>枚举值：</p><ul><li>3： 运行中</li><li>1： 初始化中</li><li>2： 部署中</li><li>-2： 已删除</li></ul>
     * @param Status <p>状态枚举</p><p>枚举值：</p><ul><li>3： 运行中</li><li>1： 初始化中</li><li>2： 部署中</li><li>-2： 已删除</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>使用核数</p><p>单位：cu</p> 
     * @return Cpu <p>使用核数</p><p>单位：cu</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>使用核数</p><p>单位：cu</p>
     * @param Cpu <p>使用核数</p><p>单位：cu</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>使用内存资源</p><p>单位：GB</p> 
     * @return MemGB <p>使用内存资源</p><p>单位：GB</p>
     */
    public Long getMemGB() {
        return this.MemGB;
    }

    /**
     * Set <p>使用内存资源</p><p>单位：GB</p>
     * @param MemGB <p>使用内存资源</p><p>单位：GB</p>
     */
    public void setMemGB(Long MemGB) {
        this.MemGB = MemGB;
    }

    /**
     * Get <p>副本数</p> 
     * @return Replica <p>副本数</p>
     */
    public Long getReplica() {
        return this.Replica;
    }

    /**
     * Set <p>副本数</p>
     * @param Replica <p>副本数</p>
     */
    public void setReplica(Long Replica) {
        this.Replica = Replica;
    }

    /**
     * Get <p>hms 访问uri</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HiveUri <p>hms 访问uri</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHiveUri() {
        return this.HiveUri;
    }

    /**
     * Set <p>hms 访问uri</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HiveUri <p>hms 访问uri</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHiveUri(String HiveUri) {
        this.HiveUri = HiveUri;
    }

    /**
     * Get <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HiveNamespace <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHiveNamespace() {
        return this.HiveNamespace;
    }

    /**
     * Set <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HiveNamespace <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHiveNamespace(String HiveNamespace) {
        this.HiveNamespace = HiveNamespace;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Warehouse地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HiveMetastoreWarehouseDir <p>Warehouse地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHiveMetastoreWarehouseDir() {
        return this.HiveMetastoreWarehouseDir;
    }

    /**
     * Set <p>Warehouse地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HiveMetastoreWarehouseDir <p>Warehouse地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHiveMetastoreWarehouseDir(String HiveMetastoreWarehouseDir) {
        this.HiveMetastoreWarehouseDir = HiveMetastoreWarehouseDir;
    }

    /**
     * Get <p>高级参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Config <p>高级参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Property [] getConfig() {
        return this.Config;
    }

    /**
     * Set <p>高级参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Config <p>高级参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfig(Property [] Config) {
        this.Config = Config;
    }

    public HiveMetastoreInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HiveMetastoreInfo(HiveMetastoreInfo source) {
        if (source.HiveMetastoreSerialId != null) {
            this.HiveMetastoreSerialId = new String(source.HiveMetastoreSerialId);
        }
        if (source.ClusterGroupSerialId != null) {
            this.ClusterGroupSerialId = new String(source.ClusterGroupSerialId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.MemGB != null) {
            this.MemGB = new Long(source.MemGB);
        }
        if (source.Replica != null) {
            this.Replica = new Long(source.Replica);
        }
        if (source.HiveUri != null) {
            this.HiveUri = new String(source.HiveUri);
        }
        if (source.HiveNamespace != null) {
            this.HiveNamespace = new String(source.HiveNamespace);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.HiveMetastoreWarehouseDir != null) {
            this.HiveMetastoreWarehouseDir = new String(source.HiveMetastoreWarehouseDir);
        }
        if (source.Config != null) {
            this.Config = new Property[source.Config.length];
            for (int i = 0; i < source.Config.length; i++) {
                this.Config[i] = new Property(source.Config[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HiveMetastoreSerialId", this.HiveMetastoreSerialId);
        this.setParamSimple(map, prefix + "ClusterGroupSerialId", this.ClusterGroupSerialId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "MemGB", this.MemGB);
        this.setParamSimple(map, prefix + "Replica", this.Replica);
        this.setParamSimple(map, prefix + "HiveUri", this.HiveUri);
        this.setParamSimple(map, prefix + "HiveNamespace", this.HiveNamespace);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "HiveMetastoreWarehouseDir", this.HiveMetastoreWarehouseDir);
        this.setParamArrayObj(map, prefix + "Config.", this.Config);

    }
}


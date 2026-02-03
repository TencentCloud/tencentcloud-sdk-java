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
package com.tencentcloudapi.ctsdb.v20230202.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Component extends AbstractModel {

    /**
    * <p>所属实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>组件类型</p>枚举值：<ul><li> gateway： 时序节点</li><li> database： 数据节点</li><li> gateway-worker： 扩展节点</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>cpu</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>内存</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>磁盘</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
    * <p>节点数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Shards")
    @Expose
    private Long Shards;

    /**
    * <p>副本数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * <p>网络</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Networks")
    @Expose
    private Network [] Networks;

    /**
    * <p>组件状态</p>枚举值：<ul><li> 0： 运行中</li><li> 1： 创建中</li><li> 2： 变配中</li><li> 3： 隔离中</li><li> 4： 已隔离</li><li> 5： 删除中</li><li> 6： 已删除</li><li> 7： 禁用中</li><li> 8： 已禁用</li><li> 9： 启用中</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * <p>组件内部ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
     * Get <p>所属实例id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceID <p>所属实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>所属实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceID <p>所属实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>组件类型</p>枚举值：<ul><li> gateway： 时序节点</li><li> database： 数据节点</li><li> gateway-worker： 扩展节点</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>组件类型</p>枚举值：<ul><li> gateway： 时序节点</li><li> database： 数据节点</li><li> gateway-worker： 扩展节点</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>组件类型</p>枚举值：<ul><li> gateway： 时序节点</li><li> database： 数据节点</li><li> gateway-worker： 扩展节点</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>组件类型</p>枚举值：<ul><li> gateway： 时序节点</li><li> database： 数据节点</li><li> gateway-worker： 扩展节点</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>cpu</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu <p>cpu</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>cpu</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu <p>cpu</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory <p>内存</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory <p>内存</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>磁盘</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Disk <p>磁盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDisk() {
        return this.Disk;
    }

    /**
     * Set <p>磁盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Disk <p>磁盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisk(Long Disk) {
        this.Disk = Disk;
    }

    /**
     * Get <p>节点数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Shards <p>节点数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getShards() {
        return this.Shards;
    }

    /**
     * Set <p>节点数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Shards <p>节点数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShards(Long Shards) {
        this.Shards = Shards;
    }

    /**
     * Get <p>副本数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Replicas <p>副本数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set <p>副本数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Replicas <p>副本数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get <p>网络</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Networks <p>网络</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Network [] getNetworks() {
        return this.Networks;
    }

    /**
     * Set <p>网络</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Networks <p>网络</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworks(Network [] Networks) {
        this.Networks = Networks;
    }

    /**
     * Get <p>组件状态</p>枚举值：<ul><li> 0： 运行中</li><li> 1： 创建中</li><li> 2： 变配中</li><li> 3： 隔离中</li><li> 4： 已隔离</li><li> 5： 删除中</li><li> 6： 已删除</li><li> 7： 禁用中</li><li> 8： 已禁用</li><li> 9： 启用中</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State <p>组件状态</p>枚举值：<ul><li> 0： 运行中</li><li> 1： 创建中</li><li> 2： 变配中</li><li> 3： 隔离中</li><li> 4： 已隔离</li><li> 5： 删除中</li><li> 6： 已删除</li><li> 7： 禁用中</li><li> 8： 已禁用</li><li> 9： 启用中</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set <p>组件状态</p>枚举值：<ul><li> 0： 运行中</li><li> 1： 创建中</li><li> 2： 变配中</li><li> 3： 隔离中</li><li> 4： 已隔离</li><li> 5： 删除中</li><li> 6： 已删除</li><li> 7： 禁用中</li><li> 8： 已禁用</li><li> 9： 启用中</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param State <p>组件状态</p>枚举值：<ul><li> 0： 运行中</li><li> 1： 创建中</li><li> 2： 变配中</li><li> 3： 隔离中</li><li> 4： 已隔离</li><li> 5： 删除中</li><li> 6： 已删除</li><li> 7： 禁用中</li><li> 8： 已禁用</li><li> 9： 启用中</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get <p>组件内部ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID <p>组件内部ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>组件内部ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID <p>组件内部ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    public Component() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Component(Component source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Disk != null) {
            this.Disk = new Long(source.Disk);
        }
        if (source.Shards != null) {
            this.Shards = new Long(source.Shards);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.Networks != null) {
            this.Networks = new Network[source.Networks.length];
            for (int i = 0; i < source.Networks.length; i++) {
                this.Networks[i] = new Network(source.Networks[i]);
            }
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "Shards", this.Shards);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamArrayObj(map, prefix + "Networks.", this.Networks);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}


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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SREInstance extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 版本号
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 状态, 枚举值:creating/create_fail/running/updating/update_fail/restarting/restart_fail/destroying/destroy_fail
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 规格ID
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
    * 副本数
    */
    @SerializedName("Replica")
    @Expose
    private Long Replica;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Vpc iD
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 是否开启持久化存储
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableStorage")
    @Expose
    private Boolean EnableStorage;

    /**
    * 数据存储方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 云硬盘容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageCapacity")
    @Expose
    private Long StorageCapacity;

    /**
    * 计费方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Paymode")
    @Expose
    private String Paymode;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 版本号 
     * @return Edition 版本号
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set 版本号
     * @param Edition 版本号
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 状态, 枚举值:creating/create_fail/running/updating/update_fail/restarting/restart_fail/destroying/destroy_fail 
     * @return Status 状态, 枚举值:creating/create_fail/running/updating/update_fail/restarting/restart_fail/destroying/destroy_fail
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态, 枚举值:creating/create_fail/running/updating/update_fail/restarting/restart_fail/destroying/destroy_fail
     * @param Status 状态, 枚举值:creating/create_fail/running/updating/update_fail/restarting/restart_fail/destroying/destroy_fail
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 规格ID 
     * @return SpecId 规格ID
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set 规格ID
     * @param SpecId 规格ID
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get 副本数 
     * @return Replica 副本数
     */
    public Long getReplica() {
        return this.Replica;
    }

    /**
     * Set 副本数
     * @param Replica 副本数
     */
    public void setReplica(Long Replica) {
        this.Replica = Replica;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Vpc iD 
     * @return VpcId Vpc iD
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Vpc iD
     * @param VpcId Vpc iD
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetIds 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetIds 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 是否开启持久化存储
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableStorage 是否开启持久化存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableStorage() {
        return this.EnableStorage;
    }

    /**
     * Set 是否开启持久化存储
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableStorage 是否开启持久化存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableStorage(Boolean EnableStorage) {
        this.EnableStorage = EnableStorage;
    }

    /**
     * Get 数据存储方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageType 数据存储方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 数据存储方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType 数据存储方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 云硬盘容量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageCapacity 云硬盘容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageCapacity() {
        return this.StorageCapacity;
    }

    /**
     * Set 云硬盘容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageCapacity 云硬盘容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageCapacity(Long StorageCapacity) {
        this.StorageCapacity = StorageCapacity;
    }

    /**
     * Get 计费方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Paymode 计费方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymode() {
        return this.Paymode;
    }

    /**
     * Set 计费方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Paymode 计费方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymode(String Paymode) {
        this.Paymode = Paymode;
    }

    public SREInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SREInstance(SREInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SpecId != null) {
            this.SpecId = new String(source.SpecId);
        }
        if (source.Replica != null) {
            this.Replica = new Long(source.Replica);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.EnableStorage != null) {
            this.EnableStorage = new Boolean(source.EnableStorage);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.StorageCapacity != null) {
            this.StorageCapacity = new Long(source.StorageCapacity);
        }
        if (source.Paymode != null) {
            this.Paymode = new String(source.Paymode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamSimple(map, prefix + "Replica", this.Replica);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "EnableStorage", this.EnableStorage);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "StorageCapacity", this.StorageCapacity);
        this.setParamSimple(map, prefix + "Paymode", this.Paymode);

    }
}


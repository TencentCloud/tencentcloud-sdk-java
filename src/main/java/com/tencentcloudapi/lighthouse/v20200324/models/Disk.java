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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Disk extends AbstractModel{

    /**
    * 磁盘ID
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 磁盘名称
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
    * 磁盘类型
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * 磁盘介质类型
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 磁盘付费类型
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * 磁盘大小
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 续费标识
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 磁盘状态
    */
    @SerializedName("DiskState")
    @Expose
    private String DiskState;

    /**
    * 磁盘挂载状态
    */
    @SerializedName("Attached")
    @Expose
    private Boolean Attached;

    /**
    * 是否随实例释放
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
    * 上一次操作
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * 上一次操作状态
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
    * 上一次请求ID
    */
    @SerializedName("LatestOperationRequestId")
    @Expose
    private String LatestOperationRequestId;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 到期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * 隔离时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
     * Get 磁盘ID 
     * @return DiskId 磁盘ID
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 磁盘ID
     * @param DiskId 磁盘ID
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

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
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 磁盘名称 
     * @return DiskName 磁盘名称
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set 磁盘名称
     * @param DiskName 磁盘名称
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    /**
     * Get 磁盘类型 
     * @return DiskUsage 磁盘类型
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set 磁盘类型
     * @param DiskUsage 磁盘类型
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get 磁盘介质类型 
     * @return DiskType 磁盘介质类型
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 磁盘介质类型
     * @param DiskType 磁盘介质类型
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 磁盘付费类型 
     * @return DiskChargeType 磁盘付费类型
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * Set 磁盘付费类型
     * @param DiskChargeType 磁盘付费类型
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * Get 磁盘大小 
     * @return DiskSize 磁盘大小
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 磁盘大小
     * @param DiskSize 磁盘大小
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 续费标识 
     * @return RenewFlag 续费标识
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 续费标识
     * @param RenewFlag 续费标识
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 磁盘状态 
     * @return DiskState 磁盘状态
     */
    public String getDiskState() {
        return this.DiskState;
    }

    /**
     * Set 磁盘状态
     * @param DiskState 磁盘状态
     */
    public void setDiskState(String DiskState) {
        this.DiskState = DiskState;
    }

    /**
     * Get 磁盘挂载状态 
     * @return Attached 磁盘挂载状态
     */
    public Boolean getAttached() {
        return this.Attached;
    }

    /**
     * Set 磁盘挂载状态
     * @param Attached 磁盘挂载状态
     */
    public void setAttached(Boolean Attached) {
        this.Attached = Attached;
    }

    /**
     * Get 是否随实例释放 
     * @return DeleteWithInstance 是否随实例释放
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set 是否随实例释放
     * @param DeleteWithInstance 是否随实例释放
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    /**
     * Get 上一次操作 
     * @return LatestOperation 上一次操作
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set 上一次操作
     * @param LatestOperation 上一次操作
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get 上一次操作状态 
     * @return LatestOperationState 上一次操作状态
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set 上一次操作状态
     * @param LatestOperationState 上一次操作状态
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    /**
     * Get 上一次请求ID 
     * @return LatestOperationRequestId 上一次请求ID
     */
    public String getLatestOperationRequestId() {
        return this.LatestOperationRequestId;
    }

    /**
     * Set 上一次请求ID
     * @param LatestOperationRequestId 上一次请求ID
     */
    public void setLatestOperationRequestId(String LatestOperationRequestId) {
        this.LatestOperationRequestId = LatestOperationRequestId;
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
     * Get 到期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredTime 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredTime 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 隔离时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolatedTime 隔离时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set 隔离时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolatedTime 隔离时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    public Disk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Disk(Disk source) {
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DiskName != null) {
            this.DiskName = new String(source.DiskName);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskChargeType != null) {
            this.DiskChargeType = new String(source.DiskChargeType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.DiskState != null) {
            this.DiskState = new String(source.DiskState);
        }
        if (source.Attached != null) {
            this.Attached = new Boolean(source.Attached);
        }
        if (source.DeleteWithInstance != null) {
            this.DeleteWithInstance = new Boolean(source.DeleteWithInstance);
        }
        if (source.LatestOperation != null) {
            this.LatestOperation = new String(source.LatestOperation);
        }
        if (source.LatestOperationState != null) {
            this.LatestOperationState = new String(source.LatestOperationState);
        }
        if (source.LatestOperationRequestId != null) {
            this.LatestOperationRequestId = new String(source.LatestOperationRequestId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "DiskState", this.DiskState);
        this.setParamSimple(map, prefix + "Attached", this.Attached);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);
        this.setParamSimple(map, prefix + "LatestOperation", this.LatestOperation);
        this.setParamSimple(map, prefix + "LatestOperationState", this.LatestOperationState);
        this.setParamSimple(map, prefix + "LatestOperationRequestId", this.LatestOperationRequestId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);

    }
}


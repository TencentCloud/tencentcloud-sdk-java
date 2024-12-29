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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CBSInstance extends AbstractModel {

    /**
    * 云硬盘ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * 云硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * 云硬盘名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
    * 云硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 云盘介质类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 是否跟随实例删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
    * 云硬盘收费类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * 云硬盘运行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskState")
    @Expose
    private String DiskState;

    /**
    * 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 到期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * 云盘是否挂载到云主机上
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Attached")
    @Expose
    private Boolean Attached;

    /**
    * 当前时间距离盘到期的天数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DifferDaysOfDeadline")
    @Expose
    private Long DifferDaysOfDeadline;

    /**
    * 该云盘当前被挂载到的CVM实例InstanceId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
    * 云硬盘挂载的云主机ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 云盘是否为共享型云盘。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Shareable")
    @Expose
    private Boolean Shareable;

    /**
     * Get 云硬盘ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskId 云硬盘ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 云硬盘ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskId 云硬盘ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get 云硬盘类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskUsage 云硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set 云硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskUsage 云硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get 云硬盘名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskName 云硬盘名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set 云硬盘名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskName 云硬盘名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    /**
     * Get 云硬盘大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskSize 云硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 云硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskSize 云硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 云盘介质类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskType 云盘介质类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 云盘介质类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskType 云盘介质类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 是否跟随实例删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeleteWithInstance 是否跟随实例删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set 是否跟随实例删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteWithInstance 是否跟随实例删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    /**
     * Get 云硬盘收费类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskChargeType 云硬盘收费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * Set 云硬盘收费类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskChargeType 云硬盘收费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * Get 云硬盘运行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskState 云硬盘运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskState() {
        return this.DiskState;
    }

    /**
     * Set 云硬盘运行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskState 云硬盘运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskState(String DiskState) {
        this.DiskState = DiskState;
    }

    /**
     * Get 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 到期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadlineTime 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadlineTime 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get 云盘是否挂载到云主机上
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Attached 云盘是否挂载到云主机上
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAttached() {
        return this.Attached;
    }

    /**
     * Set 云盘是否挂载到云主机上
注意：此字段可能返回 null，表示取不到有效值。
     * @param Attached 云盘是否挂载到云主机上
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttached(Boolean Attached) {
        this.Attached = Attached;
    }

    /**
     * Get 当前时间距离盘到期的天数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DifferDaysOfDeadline 当前时间距离盘到期的天数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDifferDaysOfDeadline() {
        return this.DifferDaysOfDeadline;
    }

    /**
     * Set 当前时间距离盘到期的天数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DifferDaysOfDeadline 当前时间距离盘到期的天数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDifferDaysOfDeadline(Long DifferDaysOfDeadline) {
        this.DifferDaysOfDeadline = DifferDaysOfDeadline;
    }

    /**
     * Get 该云盘当前被挂载到的CVM实例InstanceId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceIdList 该云盘当前被挂载到的CVM实例InstanceId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set 该云盘当前被挂载到的CVM实例InstanceId
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceIdList 该云盘当前被挂载到的CVM实例InstanceId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
    }

    /**
     * Get 云硬盘挂载的云主机ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 云硬盘挂载的云主机ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 云硬盘挂载的云主机ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 云硬盘挂载的云主机ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 云盘是否为共享型云盘。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Shareable 云盘是否为共享型云盘。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getShareable() {
        return this.Shareable;
    }

    /**
     * Set 云盘是否为共享型云盘。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Shareable 云盘是否为共享型云盘。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShareable(Boolean Shareable) {
        this.Shareable = Shareable;
    }

    public CBSInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CBSInstance(CBSInstance source) {
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
        }
        if (source.DiskName != null) {
            this.DiskName = new String(source.DiskName);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DeleteWithInstance != null) {
            this.DeleteWithInstance = new Boolean(source.DeleteWithInstance);
        }
        if (source.DiskChargeType != null) {
            this.DiskChargeType = new String(source.DiskChargeType);
        }
        if (source.DiskState != null) {
            this.DiskState = new String(source.DiskState);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
        if (source.Attached != null) {
            this.Attached = new Boolean(source.Attached);
        }
        if (source.DifferDaysOfDeadline != null) {
            this.DifferDaysOfDeadline = new Long(source.DifferDaysOfDeadline);
        }
        if (source.InstanceIdList != null) {
            this.InstanceIdList = new String[source.InstanceIdList.length];
            for (int i = 0; i < source.InstanceIdList.length; i++) {
                this.InstanceIdList[i] = new String(source.InstanceIdList[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Shareable != null) {
            this.Shareable = new Boolean(source.Shareable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamSimple(map, prefix + "DiskState", this.DiskState);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "Attached", this.Attached);
        this.setParamSimple(map, prefix + "DifferDaysOfDeadline", this.DifferDaysOfDeadline);
        this.setParamArraySimple(map, prefix + "InstanceIdList.", this.InstanceIdList);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Shareable", this.Shareable);

    }
}


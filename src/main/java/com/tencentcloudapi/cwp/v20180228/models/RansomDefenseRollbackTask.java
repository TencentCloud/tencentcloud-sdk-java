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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RansomDefenseRollbackTask extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机名称
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 回滚任务状态：0进行中，1成功，2失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 硬盘id列表，;分隔
    */
    @SerializedName("Disks")
    @Expose
    private String Disks;

    /**
    * 操作时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 快照时间
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
    * Status!=0时为完成时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 可用区信息
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * 主机示例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 任务ID 
     * @return Id 任务ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 任务ID
     * @param Id 任务ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 主机Uuid 
     * @return Uuid 主机Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机Uuid
     * @param Uuid 主机Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 主机Quuid 
     * @return Quuid 主机Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机Quuid
     * @param Quuid 主机Quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机名称 
     * @return MachineName 主机名称
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 主机名称
     * @param MachineName 主机名称
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 回滚任务状态：0进行中，1成功，2失败 
     * @return Status 回滚任务状态：0进行中，1成功，2失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 回滚任务状态：0进行中，1成功，2失败
     * @param Status 回滚任务状态：0进行中，1成功，2失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 硬盘id列表，;分隔 
     * @return Disks 硬盘id列表，;分隔
     */
    public String getDisks() {
        return this.Disks;
    }

    /**
     * Set 硬盘id列表，;分隔
     * @param Disks 硬盘id列表，;分隔
     */
    public void setDisks(String Disks) {
        this.Disks = Disks;
    }

    /**
     * Get 操作时间 
     * @return CreateTime 操作时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 操作时间
     * @param CreateTime 操作时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 快照时间 
     * @return BackupTime 快照时间
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set 快照时间
     * @param BackupTime 快照时间
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get Status!=0时为完成时间 
     * @return ModifyTime Status!=0时为完成时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Status!=0时为完成时间
     * @param ModifyTime Status!=0时为完成时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 可用区信息 
     * @return RegionInfo 可用区信息
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set 可用区信息
     * @param RegionInfo 可用区信息
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get 主机示例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 主机示例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 主机示例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 主机示例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public RansomDefenseRollbackTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RansomDefenseRollbackTask(RansomDefenseRollbackTask source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Disks != null) {
            this.Disks = new String(source.Disks);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new String(source.BackupTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.RegionInfo != null) {
            this.RegionInfo = new RegionInfo(source.RegionInfo);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Disks", this.Disks);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}


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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RansomDefenseStrategyDetail extends AbstractModel{

    /**
    * 策略id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 操作uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 策略备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 开启状态：0关闭，1开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否对所有主机生效
    */
    @SerializedName("IsAll")
    @Expose
    private Long IsAll;

    /**
    * 包含目录，用;分隔
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncludeDir")
    @Expose
    private String IncludeDir;

    /**
    * 包含目录，用;分隔
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExcludeDir")
    @Expose
    private String ExcludeDir;

    /**
    * 备份模式： 0按周，1按天
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupType")
    @Expose
    private Long BackupType;

    /**
    * 备份星期天数（1-7）：1;2;3;4
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weekday")
    @Expose
    private String Weekday;

    /**
    * 备份执行时间点(0-23): 11:00;12:00
    */
    @SerializedName("Hour")
    @Expose
    private String Hour;

    /**
    * 保存天数，0永久保存
    */
    @SerializedName("SaveDay")
    @Expose
    private Long SaveDay;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 绑定机器数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineCount")
    @Expose
    private Long MachineCount;

    /**
    * 策略关联事件数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
     * Get 策略id 
     * @return Id 策略id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 策略id
     * @param Id 策略id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 操作uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 操作uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 操作uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 操作uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 策略名称 
     * @return Name 策略名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略名称
     * @param Name 策略名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 策略备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 策略备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 策略备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 策略备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 开启状态：0关闭，1开启 
     * @return Status 开启状态：0关闭，1开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 开启状态：0关闭，1开启
     * @param Status 开启状态：0关闭，1开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否对所有主机生效 
     * @return IsAll 是否对所有主机生效
     */
    public Long getIsAll() {
        return this.IsAll;
    }

    /**
     * Set 是否对所有主机生效
     * @param IsAll 是否对所有主机生效
     */
    public void setIsAll(Long IsAll) {
        this.IsAll = IsAll;
    }

    /**
     * Get 包含目录，用;分隔
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncludeDir 包含目录，用;分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIncludeDir() {
        return this.IncludeDir;
    }

    /**
     * Set 包含目录，用;分隔
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncludeDir 包含目录，用;分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncludeDir(String IncludeDir) {
        this.IncludeDir = IncludeDir;
    }

    /**
     * Get 包含目录，用;分隔
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExcludeDir 包含目录，用;分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExcludeDir() {
        return this.ExcludeDir;
    }

    /**
     * Set 包含目录，用;分隔
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExcludeDir 包含目录，用;分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExcludeDir(String ExcludeDir) {
        this.ExcludeDir = ExcludeDir;
    }

    /**
     * Get 备份模式： 0按周，1按天
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupType 备份模式： 0按周，1按天
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份模式： 0按周，1按天
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupType 备份模式： 0按周，1按天
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupType(Long BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 备份星期天数（1-7）：1;2;3;4
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weekday 备份星期天数（1-7）：1;2;3;4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWeekday() {
        return this.Weekday;
    }

    /**
     * Set 备份星期天数（1-7）：1;2;3;4
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weekday 备份星期天数（1-7）：1;2;3;4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeekday(String Weekday) {
        this.Weekday = Weekday;
    }

    /**
     * Get 备份执行时间点(0-23): 11:00;12:00 
     * @return Hour 备份执行时间点(0-23): 11:00;12:00
     */
    public String getHour() {
        return this.Hour;
    }

    /**
     * Set 备份执行时间点(0-23): 11:00;12:00
     * @param Hour 备份执行时间点(0-23): 11:00;12:00
     */
    public void setHour(String Hour) {
        this.Hour = Hour;
    }

    /**
     * Get 保存天数，0永久保存 
     * @return SaveDay 保存天数，0永久保存
     */
    public Long getSaveDay() {
        return this.SaveDay;
    }

    /**
     * Set 保存天数，0永久保存
     * @param SaveDay 保存天数，0永久保存
     */
    public void setSaveDay(Long SaveDay) {
        this.SaveDay = SaveDay;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 最近修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 最近修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 最近修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 绑定机器数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineCount 绑定机器数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMachineCount() {
        return this.MachineCount;
    }

    /**
     * Set 绑定机器数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineCount 绑定机器数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineCount(Long MachineCount) {
        this.MachineCount = MachineCount;
    }

    /**
     * Get 策略关联事件数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventCount 策略关联事件数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set 策略关联事件数
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventCount 策略关联事件数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    public RansomDefenseStrategyDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RansomDefenseStrategyDetail(RansomDefenseStrategyDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsAll != null) {
            this.IsAll = new Long(source.IsAll);
        }
        if (source.IncludeDir != null) {
            this.IncludeDir = new String(source.IncludeDir);
        }
        if (source.ExcludeDir != null) {
            this.ExcludeDir = new String(source.ExcludeDir);
        }
        if (source.BackupType != null) {
            this.BackupType = new Long(source.BackupType);
        }
        if (source.Weekday != null) {
            this.Weekday = new String(source.Weekday);
        }
        if (source.Hour != null) {
            this.Hour = new String(source.Hour);
        }
        if (source.SaveDay != null) {
            this.SaveDay = new Long(source.SaveDay);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.MachineCount != null) {
            this.MachineCount = new Long(source.MachineCount);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsAll", this.IsAll);
        this.setParamSimple(map, prefix + "IncludeDir", this.IncludeDir);
        this.setParamSimple(map, prefix + "ExcludeDir", this.ExcludeDir);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "Weekday", this.Weekday);
        this.setParamSimple(map, prefix + "Hour", this.Hour);
        this.setParamSimple(map, prefix + "SaveDay", this.SaveDay);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "MachineCount", this.MachineCount);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);

    }
}


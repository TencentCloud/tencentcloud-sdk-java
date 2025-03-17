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

public class CreateRansomDefenseStrategyRequest extends AbstractModel {

    /**
    * 策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 定时快照执行时间（0-23）：01:00;23:00
    */
    @SerializedName("Hour")
    @Expose
    private String Hour;

    /**
    * 策略ID，填ID时修改策略，否则新增策略
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 策略备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 是否开启：0关，1开
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否全部机器生效：0否，1是
    */
    @SerializedName("IsAll")
    @Expose
    private Long IsAll;

    /**
    * 包含目录，;分隔
    */
    @SerializedName("IncludeDir")
    @Expose
    private String IncludeDir;

    /**
    * 排除目录，;分隔
    */
    @SerializedName("ExcludeDir")
    @Expose
    private String ExcludeDir;

    /**
    * 备份模式： 0按周，1按天，2不备份
    */
    @SerializedName("BackupType")
    @Expose
    private Long BackupType;

    /**
    * 定时任务执行星期天数（1-7）：1;2;7
    */
    @SerializedName("Weekday")
    @Expose
    private String Weekday;

    /**
    * 保留天数：0永久
    */
    @SerializedName("SaveDay")
    @Expose
    private Long SaveDay;

    /**
    * 绑定主机列表
    */
    @SerializedName("Machines")
    @Expose
    private RansomDefenseStrategyMachineInfo [] Machines;

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
     * Get 定时快照执行时间（0-23）：01:00;23:00 
     * @return Hour 定时快照执行时间（0-23）：01:00;23:00
     */
    public String getHour() {
        return this.Hour;
    }

    /**
     * Set 定时快照执行时间（0-23）：01:00;23:00
     * @param Hour 定时快照执行时间（0-23）：01:00;23:00
     */
    public void setHour(String Hour) {
        this.Hour = Hour;
    }

    /**
     * Get 策略ID，填ID时修改策略，否则新增策略 
     * @return Id 策略ID，填ID时修改策略，否则新增策略
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 策略ID，填ID时修改策略，否则新增策略
     * @param Id 策略ID，填ID时修改策略，否则新增策略
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 策略备注 
     * @return Description 策略备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 策略备注
     * @param Description 策略备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 是否开启：0关，1开 
     * @return Status 是否开启：0关，1开
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 是否开启：0关，1开
     * @param Status 是否开启：0关，1开
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否全部机器生效：0否，1是 
     * @return IsAll 是否全部机器生效：0否，1是
     */
    public Long getIsAll() {
        return this.IsAll;
    }

    /**
     * Set 是否全部机器生效：0否，1是
     * @param IsAll 是否全部机器生效：0否，1是
     */
    public void setIsAll(Long IsAll) {
        this.IsAll = IsAll;
    }

    /**
     * Get 包含目录，;分隔 
     * @return IncludeDir 包含目录，;分隔
     */
    public String getIncludeDir() {
        return this.IncludeDir;
    }

    /**
     * Set 包含目录，;分隔
     * @param IncludeDir 包含目录，;分隔
     */
    public void setIncludeDir(String IncludeDir) {
        this.IncludeDir = IncludeDir;
    }

    /**
     * Get 排除目录，;分隔 
     * @return ExcludeDir 排除目录，;分隔
     */
    public String getExcludeDir() {
        return this.ExcludeDir;
    }

    /**
     * Set 排除目录，;分隔
     * @param ExcludeDir 排除目录，;分隔
     */
    public void setExcludeDir(String ExcludeDir) {
        this.ExcludeDir = ExcludeDir;
    }

    /**
     * Get 备份模式： 0按周，1按天，2不备份 
     * @return BackupType 备份模式： 0按周，1按天，2不备份
     */
    public Long getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份模式： 0按周，1按天，2不备份
     * @param BackupType 备份模式： 0按周，1按天，2不备份
     */
    public void setBackupType(Long BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 定时任务执行星期天数（1-7）：1;2;7 
     * @return Weekday 定时任务执行星期天数（1-7）：1;2;7
     */
    public String getWeekday() {
        return this.Weekday;
    }

    /**
     * Set 定时任务执行星期天数（1-7）：1;2;7
     * @param Weekday 定时任务执行星期天数（1-7）：1;2;7
     */
    public void setWeekday(String Weekday) {
        this.Weekday = Weekday;
    }

    /**
     * Get 保留天数：0永久 
     * @return SaveDay 保留天数：0永久
     */
    public Long getSaveDay() {
        return this.SaveDay;
    }

    /**
     * Set 保留天数：0永久
     * @param SaveDay 保留天数：0永久
     */
    public void setSaveDay(Long SaveDay) {
        this.SaveDay = SaveDay;
    }

    /**
     * Get 绑定主机列表 
     * @return Machines 绑定主机列表
     */
    public RansomDefenseStrategyMachineInfo [] getMachines() {
        return this.Machines;
    }

    /**
     * Set 绑定主机列表
     * @param Machines 绑定主机列表
     */
    public void setMachines(RansomDefenseStrategyMachineInfo [] Machines) {
        this.Machines = Machines;
    }

    public CreateRansomDefenseStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRansomDefenseStrategyRequest(CreateRansomDefenseStrategyRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Hour != null) {
            this.Hour = new String(source.Hour);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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
        if (source.SaveDay != null) {
            this.SaveDay = new Long(source.SaveDay);
        }
        if (source.Machines != null) {
            this.Machines = new RansomDefenseStrategyMachineInfo[source.Machines.length];
            for (int i = 0; i < source.Machines.length; i++) {
                this.Machines[i] = new RansomDefenseStrategyMachineInfo(source.Machines[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Hour", this.Hour);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsAll", this.IsAll);
        this.setParamSimple(map, prefix + "IncludeDir", this.IncludeDir);
        this.setParamSimple(map, prefix + "ExcludeDir", this.ExcludeDir);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "Weekday", this.Weekday);
        this.setParamSimple(map, prefix + "SaveDay", this.SaveDay);
        this.setParamArrayObj(map, prefix + "Machines.", this.Machines);

    }
}


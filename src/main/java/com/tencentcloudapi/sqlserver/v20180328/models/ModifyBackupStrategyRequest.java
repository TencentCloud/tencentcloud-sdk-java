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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupStrategyRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份类型，当length(BackupDay) <=7 && length(BackupDay) >=2时，取值为weekly，当length(BackupDay)=1时，取值daily，默认daily
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 备份时间点，取值为0-23的整数
    */
    @SerializedName("BackupTime")
    @Expose
    private Long BackupTime;

    /**
    * BackupType取值为daily时，表示备份间隔天数。当前取值只能为1
    */
    @SerializedName("BackupDay")
    @Expose
    private Long BackupDay;

    /**
    * 备份模式，master_pkg-主节点上打包备份文件；master_no_pkg-主节点单库备份文件；slave_pkg-从节点上打包备份文件；slave_no_pkg-从节点上单库备份文件，从节点上备份只有在always on容灾模式下支持。
    */
    @SerializedName("BackupModel")
    @Expose
    private String BackupModel;

    /**
    * BackupType取值为weekly时，表示每周的星期N做备份。（如果数据备份保留时间<7天，则取值[1,2,3,4,5,6,7]。如果数据备份保留时间>=7天，则备份周期取值至少是一周的任意2天）
    */
    @SerializedName("BackupCycle")
    @Expose
    private Long [] BackupCycle;

    /**
    * 数据(日志)备份保留时间，取值[3-1830]天，默认7天
    */
    @SerializedName("BackupSaveDays")
    @Expose
    private Long BackupSaveDays;

    /**
    * 定期备份状态 enable-开启，disable-关闭，默认关闭
    */
    @SerializedName("RegularBackupEnable")
    @Expose
    private String RegularBackupEnable;

    /**
    * 定期备份保留天数 [90 - 3650]天，默认365天
    */
    @SerializedName("RegularBackupSaveDays")
    @Expose
    private Long RegularBackupSaveDays;

    /**
    * 定期备份策略 years-每年，quarters-每季度，months-每月，默认months
    */
    @SerializedName("RegularBackupStrategy")
    @Expose
    private String RegularBackupStrategy;

    /**
    * 定期备份保留个数，默认1个
    */
    @SerializedName("RegularBackupCounts")
    @Expose
    private Long RegularBackupCounts;

    /**
    * 定期备份开始日期，格式-YYYY-MM-DD 默认当前日期
    */
    @SerializedName("RegularBackupStartTime")
    @Expose
    private String RegularBackupStartTime;

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
     * Get 备份类型，当length(BackupDay) <=7 && length(BackupDay) >=2时，取值为weekly，当length(BackupDay)=1时，取值daily，默认daily 
     * @return BackupType 备份类型，当length(BackupDay) <=7 && length(BackupDay) >=2时，取值为weekly，当length(BackupDay)=1时，取值daily，默认daily
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份类型，当length(BackupDay) <=7 && length(BackupDay) >=2时，取值为weekly，当length(BackupDay)=1时，取值daily，默认daily
     * @param BackupType 备份类型，当length(BackupDay) <=7 && length(BackupDay) >=2时，取值为weekly，当length(BackupDay)=1时，取值daily，默认daily
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 备份时间点，取值为0-23的整数 
     * @return BackupTime 备份时间点，取值为0-23的整数
     */
    public Long getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set 备份时间点，取值为0-23的整数
     * @param BackupTime 备份时间点，取值为0-23的整数
     */
    public void setBackupTime(Long BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get BackupType取值为daily时，表示备份间隔天数。当前取值只能为1 
     * @return BackupDay BackupType取值为daily时，表示备份间隔天数。当前取值只能为1
     */
    public Long getBackupDay() {
        return this.BackupDay;
    }

    /**
     * Set BackupType取值为daily时，表示备份间隔天数。当前取值只能为1
     * @param BackupDay BackupType取值为daily时，表示备份间隔天数。当前取值只能为1
     */
    public void setBackupDay(Long BackupDay) {
        this.BackupDay = BackupDay;
    }

    /**
     * Get 备份模式，master_pkg-主节点上打包备份文件；master_no_pkg-主节点单库备份文件；slave_pkg-从节点上打包备份文件；slave_no_pkg-从节点上单库备份文件，从节点上备份只有在always on容灾模式下支持。 
     * @return BackupModel 备份模式，master_pkg-主节点上打包备份文件；master_no_pkg-主节点单库备份文件；slave_pkg-从节点上打包备份文件；slave_no_pkg-从节点上单库备份文件，从节点上备份只有在always on容灾模式下支持。
     */
    public String getBackupModel() {
        return this.BackupModel;
    }

    /**
     * Set 备份模式，master_pkg-主节点上打包备份文件；master_no_pkg-主节点单库备份文件；slave_pkg-从节点上打包备份文件；slave_no_pkg-从节点上单库备份文件，从节点上备份只有在always on容灾模式下支持。
     * @param BackupModel 备份模式，master_pkg-主节点上打包备份文件；master_no_pkg-主节点单库备份文件；slave_pkg-从节点上打包备份文件；slave_no_pkg-从节点上单库备份文件，从节点上备份只有在always on容灾模式下支持。
     */
    public void setBackupModel(String BackupModel) {
        this.BackupModel = BackupModel;
    }

    /**
     * Get BackupType取值为weekly时，表示每周的星期N做备份。（如果数据备份保留时间<7天，则取值[1,2,3,4,5,6,7]。如果数据备份保留时间>=7天，则备份周期取值至少是一周的任意2天） 
     * @return BackupCycle BackupType取值为weekly时，表示每周的星期N做备份。（如果数据备份保留时间<7天，则取值[1,2,3,4,5,6,7]。如果数据备份保留时间>=7天，则备份周期取值至少是一周的任意2天）
     */
    public Long [] getBackupCycle() {
        return this.BackupCycle;
    }

    /**
     * Set BackupType取值为weekly时，表示每周的星期N做备份。（如果数据备份保留时间<7天，则取值[1,2,3,4,5,6,7]。如果数据备份保留时间>=7天，则备份周期取值至少是一周的任意2天）
     * @param BackupCycle BackupType取值为weekly时，表示每周的星期N做备份。（如果数据备份保留时间<7天，则取值[1,2,3,4,5,6,7]。如果数据备份保留时间>=7天，则备份周期取值至少是一周的任意2天）
     */
    public void setBackupCycle(Long [] BackupCycle) {
        this.BackupCycle = BackupCycle;
    }

    /**
     * Get 数据(日志)备份保留时间，取值[3-1830]天，默认7天 
     * @return BackupSaveDays 数据(日志)备份保留时间，取值[3-1830]天，默认7天
     */
    public Long getBackupSaveDays() {
        return this.BackupSaveDays;
    }

    /**
     * Set 数据(日志)备份保留时间，取值[3-1830]天，默认7天
     * @param BackupSaveDays 数据(日志)备份保留时间，取值[3-1830]天，默认7天
     */
    public void setBackupSaveDays(Long BackupSaveDays) {
        this.BackupSaveDays = BackupSaveDays;
    }

    /**
     * Get 定期备份状态 enable-开启，disable-关闭，默认关闭 
     * @return RegularBackupEnable 定期备份状态 enable-开启，disable-关闭，默认关闭
     */
    public String getRegularBackupEnable() {
        return this.RegularBackupEnable;
    }

    /**
     * Set 定期备份状态 enable-开启，disable-关闭，默认关闭
     * @param RegularBackupEnable 定期备份状态 enable-开启，disable-关闭，默认关闭
     */
    public void setRegularBackupEnable(String RegularBackupEnable) {
        this.RegularBackupEnable = RegularBackupEnable;
    }

    /**
     * Get 定期备份保留天数 [90 - 3650]天，默认365天 
     * @return RegularBackupSaveDays 定期备份保留天数 [90 - 3650]天，默认365天
     */
    public Long getRegularBackupSaveDays() {
        return this.RegularBackupSaveDays;
    }

    /**
     * Set 定期备份保留天数 [90 - 3650]天，默认365天
     * @param RegularBackupSaveDays 定期备份保留天数 [90 - 3650]天，默认365天
     */
    public void setRegularBackupSaveDays(Long RegularBackupSaveDays) {
        this.RegularBackupSaveDays = RegularBackupSaveDays;
    }

    /**
     * Get 定期备份策略 years-每年，quarters-每季度，months-每月，默认months 
     * @return RegularBackupStrategy 定期备份策略 years-每年，quarters-每季度，months-每月，默认months
     */
    public String getRegularBackupStrategy() {
        return this.RegularBackupStrategy;
    }

    /**
     * Set 定期备份策略 years-每年，quarters-每季度，months-每月，默认months
     * @param RegularBackupStrategy 定期备份策略 years-每年，quarters-每季度，months-每月，默认months
     */
    public void setRegularBackupStrategy(String RegularBackupStrategy) {
        this.RegularBackupStrategy = RegularBackupStrategy;
    }

    /**
     * Get 定期备份保留个数，默认1个 
     * @return RegularBackupCounts 定期备份保留个数，默认1个
     */
    public Long getRegularBackupCounts() {
        return this.RegularBackupCounts;
    }

    /**
     * Set 定期备份保留个数，默认1个
     * @param RegularBackupCounts 定期备份保留个数，默认1个
     */
    public void setRegularBackupCounts(Long RegularBackupCounts) {
        this.RegularBackupCounts = RegularBackupCounts;
    }

    /**
     * Get 定期备份开始日期，格式-YYYY-MM-DD 默认当前日期 
     * @return RegularBackupStartTime 定期备份开始日期，格式-YYYY-MM-DD 默认当前日期
     */
    public String getRegularBackupStartTime() {
        return this.RegularBackupStartTime;
    }

    /**
     * Set 定期备份开始日期，格式-YYYY-MM-DD 默认当前日期
     * @param RegularBackupStartTime 定期备份开始日期，格式-YYYY-MM-DD 默认当前日期
     */
    public void setRegularBackupStartTime(String RegularBackupStartTime) {
        this.RegularBackupStartTime = RegularBackupStartTime;
    }

    public ModifyBackupStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupStrategyRequest(ModifyBackupStrategyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new Long(source.BackupTime);
        }
        if (source.BackupDay != null) {
            this.BackupDay = new Long(source.BackupDay);
        }
        if (source.BackupModel != null) {
            this.BackupModel = new String(source.BackupModel);
        }
        if (source.BackupCycle != null) {
            this.BackupCycle = new Long[source.BackupCycle.length];
            for (int i = 0; i < source.BackupCycle.length; i++) {
                this.BackupCycle[i] = new Long(source.BackupCycle[i]);
            }
        }
        if (source.BackupSaveDays != null) {
            this.BackupSaveDays = new Long(source.BackupSaveDays);
        }
        if (source.RegularBackupEnable != null) {
            this.RegularBackupEnable = new String(source.RegularBackupEnable);
        }
        if (source.RegularBackupSaveDays != null) {
            this.RegularBackupSaveDays = new Long(source.RegularBackupSaveDays);
        }
        if (source.RegularBackupStrategy != null) {
            this.RegularBackupStrategy = new String(source.RegularBackupStrategy);
        }
        if (source.RegularBackupCounts != null) {
            this.RegularBackupCounts = new Long(source.RegularBackupCounts);
        }
        if (source.RegularBackupStartTime != null) {
            this.RegularBackupStartTime = new String(source.RegularBackupStartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "BackupDay", this.BackupDay);
        this.setParamSimple(map, prefix + "BackupModel", this.BackupModel);
        this.setParamArraySimple(map, prefix + "BackupCycle.", this.BackupCycle);
        this.setParamSimple(map, prefix + "BackupSaveDays", this.BackupSaveDays);
        this.setParamSimple(map, prefix + "RegularBackupEnable", this.RegularBackupEnable);
        this.setParamSimple(map, prefix + "RegularBackupSaveDays", this.RegularBackupSaveDays);
        this.setParamSimple(map, prefix + "RegularBackupStrategy", this.RegularBackupStrategy);
        this.setParamSimple(map, prefix + "RegularBackupCounts", this.RegularBackupCounts);
        this.setParamSimple(map, prefix + "RegularBackupStartTime", this.RegularBackupStartTime);

    }
}


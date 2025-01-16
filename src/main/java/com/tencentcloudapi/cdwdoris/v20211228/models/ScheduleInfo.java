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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduleInfo extends AbstractModel {

    /**
    * 生效周期
    */
    @SerializedName("EffectivePeriod")
    @Expose
    private String EffectivePeriod;

    /**
    * 调度类型，不传该参数时为立即执行：
Day-天
Week-周
Month-月
Once-单次

    */
    @SerializedName("ScheduleType")
    @Expose
    private String ScheduleType;

    /**
    * 执行调度的日期。调度类型为周和月时以英文逗号分隔；
调度类型为单次时，该值是个日期
    */
    @SerializedName("ScheduleData")
    @Expose
    private String ScheduleData;

    /**
    * 执行时间：时
    */
    @SerializedName("ScheduleHour")
    @Expose
    private Long ScheduleHour;

    /**
    * 执行时间：分
    */
    @SerializedName("ScheduleMin")
    @Expose
    private Long ScheduleMin;

    /**
    * 备份粒度：
All-全量
Database-按库
Table-按表
    */
    @SerializedName("BackupScope")
    @Expose
    private String BackupScope;

    /**
    * 备份库：如果是按库备份，则需要该字段，库之间用英文逗号分割
    */
    @SerializedName("BackupDatabase")
    @Expose
    private String BackupDatabase;

    /**
     * Get 生效周期 
     * @return EffectivePeriod 生效周期
     */
    public String getEffectivePeriod() {
        return this.EffectivePeriod;
    }

    /**
     * Set 生效周期
     * @param EffectivePeriod 生效周期
     */
    public void setEffectivePeriod(String EffectivePeriod) {
        this.EffectivePeriod = EffectivePeriod;
    }

    /**
     * Get 调度类型，不传该参数时为立即执行：
Day-天
Week-周
Month-月
Once-单次
 
     * @return ScheduleType 调度类型，不传该参数时为立即执行：
Day-天
Week-周
Month-月
Once-单次

     */
    public String getScheduleType() {
        return this.ScheduleType;
    }

    /**
     * Set 调度类型，不传该参数时为立即执行：
Day-天
Week-周
Month-月
Once-单次

     * @param ScheduleType 调度类型，不传该参数时为立即执行：
Day-天
Week-周
Month-月
Once-单次

     */
    public void setScheduleType(String ScheduleType) {
        this.ScheduleType = ScheduleType;
    }

    /**
     * Get 执行调度的日期。调度类型为周和月时以英文逗号分隔；
调度类型为单次时，该值是个日期 
     * @return ScheduleData 执行调度的日期。调度类型为周和月时以英文逗号分隔；
调度类型为单次时，该值是个日期
     */
    public String getScheduleData() {
        return this.ScheduleData;
    }

    /**
     * Set 执行调度的日期。调度类型为周和月时以英文逗号分隔；
调度类型为单次时，该值是个日期
     * @param ScheduleData 执行调度的日期。调度类型为周和月时以英文逗号分隔；
调度类型为单次时，该值是个日期
     */
    public void setScheduleData(String ScheduleData) {
        this.ScheduleData = ScheduleData;
    }

    /**
     * Get 执行时间：时 
     * @return ScheduleHour 执行时间：时
     */
    public Long getScheduleHour() {
        return this.ScheduleHour;
    }

    /**
     * Set 执行时间：时
     * @param ScheduleHour 执行时间：时
     */
    public void setScheduleHour(Long ScheduleHour) {
        this.ScheduleHour = ScheduleHour;
    }

    /**
     * Get 执行时间：分 
     * @return ScheduleMin 执行时间：分
     */
    public Long getScheduleMin() {
        return this.ScheduleMin;
    }

    /**
     * Set 执行时间：分
     * @param ScheduleMin 执行时间：分
     */
    public void setScheduleMin(Long ScheduleMin) {
        this.ScheduleMin = ScheduleMin;
    }

    /**
     * Get 备份粒度：
All-全量
Database-按库
Table-按表 
     * @return BackupScope 备份粒度：
All-全量
Database-按库
Table-按表
     */
    public String getBackupScope() {
        return this.BackupScope;
    }

    /**
     * Set 备份粒度：
All-全量
Database-按库
Table-按表
     * @param BackupScope 备份粒度：
All-全量
Database-按库
Table-按表
     */
    public void setBackupScope(String BackupScope) {
        this.BackupScope = BackupScope;
    }

    /**
     * Get 备份库：如果是按库备份，则需要该字段，库之间用英文逗号分割 
     * @return BackupDatabase 备份库：如果是按库备份，则需要该字段，库之间用英文逗号分割
     */
    public String getBackupDatabase() {
        return this.BackupDatabase;
    }

    /**
     * Set 备份库：如果是按库备份，则需要该字段，库之间用英文逗号分割
     * @param BackupDatabase 备份库：如果是按库备份，则需要该字段，库之间用英文逗号分割
     */
    public void setBackupDatabase(String BackupDatabase) {
        this.BackupDatabase = BackupDatabase;
    }

    public ScheduleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduleInfo(ScheduleInfo source) {
        if (source.EffectivePeriod != null) {
            this.EffectivePeriod = new String(source.EffectivePeriod);
        }
        if (source.ScheduleType != null) {
            this.ScheduleType = new String(source.ScheduleType);
        }
        if (source.ScheduleData != null) {
            this.ScheduleData = new String(source.ScheduleData);
        }
        if (source.ScheduleHour != null) {
            this.ScheduleHour = new Long(source.ScheduleHour);
        }
        if (source.ScheduleMin != null) {
            this.ScheduleMin = new Long(source.ScheduleMin);
        }
        if (source.BackupScope != null) {
            this.BackupScope = new String(source.BackupScope);
        }
        if (source.BackupDatabase != null) {
            this.BackupDatabase = new String(source.BackupDatabase);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EffectivePeriod", this.EffectivePeriod);
        this.setParamSimple(map, prefix + "ScheduleType", this.ScheduleType);
        this.setParamSimple(map, prefix + "ScheduleData", this.ScheduleData);
        this.setParamSimple(map, prefix + "ScheduleHour", this.ScheduleHour);
        this.setParamSimple(map, prefix + "ScheduleMin", this.ScheduleMin);
        this.setParamSimple(map, prefix + "BackupScope", this.BackupScope);
        this.setParamSimple(map, prefix + "BackupDatabase", this.BackupDatabase);

    }
}


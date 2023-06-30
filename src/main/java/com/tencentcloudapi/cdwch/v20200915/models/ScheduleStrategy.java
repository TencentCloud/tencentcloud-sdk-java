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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduleStrategy extends AbstractModel{

    /**
    * 备份桶列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * 备份保留天数
    */
    @SerializedName("RetainDays")
    @Expose
    private Long RetainDays;

    /**
    * 备份的天
    */
    @SerializedName("WeekDays")
    @Expose
    private String WeekDays;

    /**
    * 备份小时
    */
    @SerializedName("ExecuteHour")
    @Expose
    private Long ExecuteHour;

    /**
    * 策略id
    */
    @SerializedName("ScheduleId")
    @Expose
    private Long ScheduleId;

    /**
    * 下次备份时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextBackupTime")
    @Expose
    private String NextBackupTime;

    /**
     * Get 备份桶列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosBucketName 备份桶列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set 备份桶列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosBucketName 备份桶列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get 备份保留天数 
     * @return RetainDays 备份保留天数
     */
    public Long getRetainDays() {
        return this.RetainDays;
    }

    /**
     * Set 备份保留天数
     * @param RetainDays 备份保留天数
     */
    public void setRetainDays(Long RetainDays) {
        this.RetainDays = RetainDays;
    }

    /**
     * Get 备份的天 
     * @return WeekDays 备份的天
     */
    public String getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set 备份的天
     * @param WeekDays 备份的天
     */
    public void setWeekDays(String WeekDays) {
        this.WeekDays = WeekDays;
    }

    /**
     * Get 备份小时 
     * @return ExecuteHour 备份小时
     */
    public Long getExecuteHour() {
        return this.ExecuteHour;
    }

    /**
     * Set 备份小时
     * @param ExecuteHour 备份小时
     */
    public void setExecuteHour(Long ExecuteHour) {
        this.ExecuteHour = ExecuteHour;
    }

    /**
     * Get 策略id 
     * @return ScheduleId 策略id
     */
    public Long getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set 策略id
     * @param ScheduleId 策略id
     */
    public void setScheduleId(Long ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    /**
     * Get 下次备份时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextBackupTime 下次备份时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextBackupTime() {
        return this.NextBackupTime;
    }

    /**
     * Set 下次备份时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextBackupTime 下次备份时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextBackupTime(String NextBackupTime) {
        this.NextBackupTime = NextBackupTime;
    }

    public ScheduleStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduleStrategy(ScheduleStrategy source) {
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.RetainDays != null) {
            this.RetainDays = new Long(source.RetainDays);
        }
        if (source.WeekDays != null) {
            this.WeekDays = new String(source.WeekDays);
        }
        if (source.ExecuteHour != null) {
            this.ExecuteHour = new Long(source.ExecuteHour);
        }
        if (source.ScheduleId != null) {
            this.ScheduleId = new Long(source.ScheduleId);
        }
        if (source.NextBackupTime != null) {
            this.NextBackupTime = new String(source.NextBackupTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "RetainDays", this.RetainDays);
        this.setParamSimple(map, prefix + "WeekDays", this.WeekDays);
        this.setParamSimple(map, prefix + "ExecuteHour", this.ExecuteHour);
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);
        this.setParamSimple(map, prefix + "NextBackupTime", this.NextBackupTime);

    }
}


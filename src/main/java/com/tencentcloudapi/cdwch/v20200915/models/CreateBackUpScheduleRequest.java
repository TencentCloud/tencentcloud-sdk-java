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

public class CreateBackUpScheduleRequest extends AbstractModel{

    /**
    * 编辑时需要传
    */
    @SerializedName("ScheduleId")
    @Expose
    private Long ScheduleId;

    /**
    * 选择的星期 逗号分隔，例如 2 代表周二
    */
    @SerializedName("WeekDays")
    @Expose
    private String WeekDays;

    /**
    * 执行小时
    */
    @SerializedName("ExecuteHour")
    @Expose
    private Long ExecuteHour;

    /**
    * 备份表列表
    */
    @SerializedName("BackUpTables")
    @Expose
    private BackupTableContent [] BackUpTables;

    /**
     * Get 编辑时需要传 
     * @return ScheduleId 编辑时需要传
     */
    public Long getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set 编辑时需要传
     * @param ScheduleId 编辑时需要传
     */
    public void setScheduleId(Long ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    /**
     * Get 选择的星期 逗号分隔，例如 2 代表周二 
     * @return WeekDays 选择的星期 逗号分隔，例如 2 代表周二
     */
    public String getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set 选择的星期 逗号分隔，例如 2 代表周二
     * @param WeekDays 选择的星期 逗号分隔，例如 2 代表周二
     */
    public void setWeekDays(String WeekDays) {
        this.WeekDays = WeekDays;
    }

    /**
     * Get 执行小时 
     * @return ExecuteHour 执行小时
     */
    public Long getExecuteHour() {
        return this.ExecuteHour;
    }

    /**
     * Set 执行小时
     * @param ExecuteHour 执行小时
     */
    public void setExecuteHour(Long ExecuteHour) {
        this.ExecuteHour = ExecuteHour;
    }

    /**
     * Get 备份表列表 
     * @return BackUpTables 备份表列表
     */
    public BackupTableContent [] getBackUpTables() {
        return this.BackUpTables;
    }

    /**
     * Set 备份表列表
     * @param BackUpTables 备份表列表
     */
    public void setBackUpTables(BackupTableContent [] BackUpTables) {
        this.BackUpTables = BackUpTables;
    }

    public CreateBackUpScheduleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackUpScheduleRequest(CreateBackUpScheduleRequest source) {
        if (source.ScheduleId != null) {
            this.ScheduleId = new Long(source.ScheduleId);
        }
        if (source.WeekDays != null) {
            this.WeekDays = new String(source.WeekDays);
        }
        if (source.ExecuteHour != null) {
            this.ExecuteHour = new Long(source.ExecuteHour);
        }
        if (source.BackUpTables != null) {
            this.BackUpTables = new BackupTableContent[source.BackUpTables.length];
            for (int i = 0; i < source.BackUpTables.length; i++) {
                this.BackUpTables[i] = new BackupTableContent(source.BackUpTables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);
        this.setParamSimple(map, prefix + "WeekDays", this.WeekDays);
        this.setParamSimple(map, prefix + "ExecuteHour", this.ExecuteHour);
        this.setParamArrayObj(map, prefix + "BackUpTables.", this.BackUpTables);

    }
}


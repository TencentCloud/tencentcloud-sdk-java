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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAutoBackupConfigRequest extends AbstractModel{

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份周期。可设置为 Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday，该参数暂不支持修改、
    */
    @SerializedName("WeekDays")
    @Expose
    private String [] WeekDays;

    /**
    * 备份任务执行时间段。
可设置的格式为一个整点到下一个整点。例如：00:00-01:00、01:00-02:00、21:00-22:00、23:00-00:00等。
    */
    @SerializedName("TimePeriod")
    @Expose
    private String TimePeriod;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 备份周期。可设置为 Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday，该参数暂不支持修改、 
     * @return WeekDays 备份周期。可设置为 Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday，该参数暂不支持修改、
     */
    public String [] getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set 备份周期。可设置为 Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday，该参数暂不支持修改、
     * @param WeekDays 备份周期。可设置为 Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday，该参数暂不支持修改、
     */
    public void setWeekDays(String [] WeekDays) {
        this.WeekDays = WeekDays;
    }

    /**
     * Get 备份任务执行时间段。
可设置的格式为一个整点到下一个整点。例如：00:00-01:00、01:00-02:00、21:00-22:00、23:00-00:00等。 
     * @return TimePeriod 备份任务执行时间段。
可设置的格式为一个整点到下一个整点。例如：00:00-01:00、01:00-02:00、21:00-22:00、23:00-00:00等。
     */
    public String getTimePeriod() {
        return this.TimePeriod;
    }

    /**
     * Set 备份任务执行时间段。
可设置的格式为一个整点到下一个整点。例如：00:00-01:00、01:00-02:00、21:00-22:00、23:00-00:00等。
     * @param TimePeriod 备份任务执行时间段。
可设置的格式为一个整点到下一个整点。例如：00:00-01:00、01:00-02:00、21:00-22:00、23:00-00:00等。
     */
    public void setTimePeriod(String TimePeriod) {
        this.TimePeriod = TimePeriod;
    }

    public ModifyAutoBackupConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAutoBackupConfigRequest(ModifyAutoBackupConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.WeekDays != null) {
            this.WeekDays = new String[source.WeekDays.length];
            for (int i = 0; i < source.WeekDays.length; i++) {
                this.WeekDays[i] = new String(source.WeekDays[i]);
            }
        }
        if (source.TimePeriod != null) {
            this.TimePeriod = new String(source.TimePeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "WeekDays.", this.WeekDays);
        this.setParamSimple(map, prefix + "TimePeriod", this.TimePeriod);

    }
}


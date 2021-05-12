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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMaintainPeriodConfigRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 维护开始时间，单位为秒，如3:00为10800
    */
    @SerializedName("MaintainStartTime")
    @Expose
    private Long MaintainStartTime;

    /**
    * 维护持续时间，单位为秒，如1小时为3600
    */
    @SerializedName("MaintainDuration")
    @Expose
    private Long MaintainDuration;

    /**
    * 每周维护日期
    */
    @SerializedName("MaintainWeekDays")
    @Expose
    private String [] MaintainWeekDays;

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
     * Get 维护开始时间，单位为秒，如3:00为10800 
     * @return MaintainStartTime 维护开始时间，单位为秒，如3:00为10800
     */
    public Long getMaintainStartTime() {
        return this.MaintainStartTime;
    }

    /**
     * Set 维护开始时间，单位为秒，如3:00为10800
     * @param MaintainStartTime 维护开始时间，单位为秒，如3:00为10800
     */
    public void setMaintainStartTime(Long MaintainStartTime) {
        this.MaintainStartTime = MaintainStartTime;
    }

    /**
     * Get 维护持续时间，单位为秒，如1小时为3600 
     * @return MaintainDuration 维护持续时间，单位为秒，如1小时为3600
     */
    public Long getMaintainDuration() {
        return this.MaintainDuration;
    }

    /**
     * Set 维护持续时间，单位为秒，如1小时为3600
     * @param MaintainDuration 维护持续时间，单位为秒，如1小时为3600
     */
    public void setMaintainDuration(Long MaintainDuration) {
        this.MaintainDuration = MaintainDuration;
    }

    /**
     * Get 每周维护日期 
     * @return MaintainWeekDays 每周维护日期
     */
    public String [] getMaintainWeekDays() {
        return this.MaintainWeekDays;
    }

    /**
     * Set 每周维护日期
     * @param MaintainWeekDays 每周维护日期
     */
    public void setMaintainWeekDays(String [] MaintainWeekDays) {
        this.MaintainWeekDays = MaintainWeekDays;
    }

    public ModifyMaintainPeriodConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMaintainPeriodConfigRequest(ModifyMaintainPeriodConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MaintainStartTime != null) {
            this.MaintainStartTime = new Long(source.MaintainStartTime);
        }
        if (source.MaintainDuration != null) {
            this.MaintainDuration = new Long(source.MaintainDuration);
        }
        if (source.MaintainWeekDays != null) {
            this.MaintainWeekDays = new String[source.MaintainWeekDays.length];
            for (int i = 0; i < source.MaintainWeekDays.length; i++) {
                this.MaintainWeekDays[i] = new String(source.MaintainWeekDays[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MaintainStartTime", this.MaintainStartTime);
        this.setParamSimple(map, prefix + "MaintainDuration", this.MaintainDuration);
        this.setParamArraySimple(map, prefix + "MaintainWeekDays.", this.MaintainWeekDays);

    }
}


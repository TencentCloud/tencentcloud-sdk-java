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
package com.tencentcloudapi.vdb.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceMaintenanceWindowRequest extends AbstractModel {

    /**
    * 指定需修改维护时间窗的实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 维护时间窗开始时间。取值范围为"00:00-23:00"的任意整点，如01:00。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 设置维护时间窗的时长。根据指定的维护时间窗开始时间与时长可确定维护时间窗的范围。
- 单位：小时。
- 取值范围：3、6、8、10、12。
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
     * Get 指定需修改维护时间窗的实例 ID。 
     * @return InstanceId 指定需修改维护时间窗的实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定需修改维护时间窗的实例 ID。
     * @param InstanceId 指定需修改维护时间窗的实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 维护时间窗开始时间。取值范围为"00:00-23:00"的任意整点，如01:00。 
     * @return StartTime 维护时间窗开始时间。取值范围为"00:00-23:00"的任意整点，如01:00。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 维护时间窗开始时间。取值范围为"00:00-23:00"的任意整点，如01:00。
     * @param StartTime 维护时间窗开始时间。取值范围为"00:00-23:00"的任意整点，如01:00。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 设置维护时间窗的时长。根据指定的维护时间窗开始时间与时长可确定维护时间窗的范围。
- 单位：小时。
- 取值范围：3、6、8、10、12。 
     * @return TimeSpan 设置维护时间窗的时长。根据指定的维护时间窗开始时间与时长可确定维护时间窗的范围。
- 单位：小时。
- 取值范围：3、6、8、10、12。
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 设置维护时间窗的时长。根据指定的维护时间窗开始时间与时长可确定维护时间窗的范围。
- 单位：小时。
- 取值范围：3、6、8、10、12。
     * @param TimeSpan 设置维护时间窗的时长。根据指定的维护时间窗开始时间与时长可确定维护时间窗的范围。
- 单位：小时。
- 取值范围：3、6、8、10、12。
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    public ModifyInstanceMaintenanceWindowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceMaintenanceWindowRequest(ModifyInstanceMaintenanceWindowRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);

    }
}


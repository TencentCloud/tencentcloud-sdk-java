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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogAlarmReq extends AbstractModel{

    /**
    * apm实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 检索条件信息
    */
    @SerializedName("Filter")
    @Expose
    private LogFilterInfo [] Filter;

    /**
    * 告警合并开启/暂停
    */
    @SerializedName("AlarmMerge")
    @Expose
    private String AlarmMerge;

    /**
    * 告警合并时间
    */
    @SerializedName("AlarmMergeTime")
    @Expose
    private String AlarmMergeTime;

    /**
     * Get apm实例id 
     * @return InstanceId apm实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set apm实例id
     * @param InstanceId apm实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 检索条件信息 
     * @return Filter 检索条件信息
     */
    public LogFilterInfo [] getFilter() {
        return this.Filter;
    }

    /**
     * Set 检索条件信息
     * @param Filter 检索条件信息
     */
    public void setFilter(LogFilterInfo [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 告警合并开启/暂停 
     * @return AlarmMerge 告警合并开启/暂停
     */
    public String getAlarmMerge() {
        return this.AlarmMerge;
    }

    /**
     * Set 告警合并开启/暂停
     * @param AlarmMerge 告警合并开启/暂停
     */
    public void setAlarmMerge(String AlarmMerge) {
        this.AlarmMerge = AlarmMerge;
    }

    /**
     * Get 告警合并时间 
     * @return AlarmMergeTime 告警合并时间
     */
    public String getAlarmMergeTime() {
        return this.AlarmMergeTime;
    }

    /**
     * Set 告警合并时间
     * @param AlarmMergeTime 告警合并时间
     */
    public void setAlarmMergeTime(String AlarmMergeTime) {
        this.AlarmMergeTime = AlarmMergeTime;
    }

    public LogAlarmReq() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogAlarmReq(LogAlarmReq source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Filter != null) {
            this.Filter = new LogFilterInfo[source.Filter.length];
            for (int i = 0; i < source.Filter.length; i++) {
                this.Filter[i] = new LogFilterInfo(source.Filter[i]);
            }
        }
        if (source.AlarmMerge != null) {
            this.AlarmMerge = new String(source.AlarmMerge);
        }
        if (source.AlarmMergeTime != null) {
            this.AlarmMergeTime = new String(source.AlarmMergeTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "AlarmMerge", this.AlarmMerge);
        this.setParamSimple(map, prefix + "AlarmMergeTime", this.AlarmMergeTime);

    }
}


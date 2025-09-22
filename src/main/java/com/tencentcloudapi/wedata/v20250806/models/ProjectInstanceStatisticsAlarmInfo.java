/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectInstanceStatisticsAlarmInfo extends AbstractModel {

    /**
    * 告警类型 

projectFailureInstanceUpwardFluctuationAlarm: 失败实例向上波动告警

projectSuccessInstanceDownwardFluctuationAlarm： 成功实例向下波动告警
    */
    @SerializedName("AlarmType")
    @Expose
    private String AlarmType;

    /**
    * 实例成功数向下波动比例告警阀值；实例失败数向上波动比例告警阀值
    */
    @SerializedName("InstanceThresholdCountPercent")
    @Expose
    private Long InstanceThresholdCountPercent;

    /**
    * 累计实例数波动阀值
    */
    @SerializedName("InstanceThresholdCount")
    @Expose
    private Long InstanceThresholdCount;

    /**
    * 稳定性次数阈值(防抖动配置统计周期数)
    */
    @SerializedName("StabilizeThreshold")
    @Expose
    private Long StabilizeThreshold;

    /**
    * 稳定性统计周期(防抖动配置统计周期数)
    */
    @SerializedName("StabilizeStatisticsCycle")
    @Expose
    private Long StabilizeStatisticsCycle;

    /**
    * 是否累计计算,false:连续,true:累计
    */
    @SerializedName("IsCumulant")
    @Expose
    private Boolean IsCumulant;

    /**
    * 当日累计实例数;
当天失败实例数向下波动量
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
     * Get 告警类型 

projectFailureInstanceUpwardFluctuationAlarm: 失败实例向上波动告警

projectSuccessInstanceDownwardFluctuationAlarm： 成功实例向下波动告警 
     * @return AlarmType 告警类型 

projectFailureInstanceUpwardFluctuationAlarm: 失败实例向上波动告警

projectSuccessInstanceDownwardFluctuationAlarm： 成功实例向下波动告警
     */
    public String getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set 告警类型 

projectFailureInstanceUpwardFluctuationAlarm: 失败实例向上波动告警

projectSuccessInstanceDownwardFluctuationAlarm： 成功实例向下波动告警
     * @param AlarmType 告警类型 

projectFailureInstanceUpwardFluctuationAlarm: 失败实例向上波动告警

projectSuccessInstanceDownwardFluctuationAlarm： 成功实例向下波动告警
     */
    public void setAlarmType(String AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get 实例成功数向下波动比例告警阀值；实例失败数向上波动比例告警阀值 
     * @return InstanceThresholdCountPercent 实例成功数向下波动比例告警阀值；实例失败数向上波动比例告警阀值
     */
    public Long getInstanceThresholdCountPercent() {
        return this.InstanceThresholdCountPercent;
    }

    /**
     * Set 实例成功数向下波动比例告警阀值；实例失败数向上波动比例告警阀值
     * @param InstanceThresholdCountPercent 实例成功数向下波动比例告警阀值；实例失败数向上波动比例告警阀值
     */
    public void setInstanceThresholdCountPercent(Long InstanceThresholdCountPercent) {
        this.InstanceThresholdCountPercent = InstanceThresholdCountPercent;
    }

    /**
     * Get 累计实例数波动阀值 
     * @return InstanceThresholdCount 累计实例数波动阀值
     */
    public Long getInstanceThresholdCount() {
        return this.InstanceThresholdCount;
    }

    /**
     * Set 累计实例数波动阀值
     * @param InstanceThresholdCount 累计实例数波动阀值
     */
    public void setInstanceThresholdCount(Long InstanceThresholdCount) {
        this.InstanceThresholdCount = InstanceThresholdCount;
    }

    /**
     * Get 稳定性次数阈值(防抖动配置统计周期数) 
     * @return StabilizeThreshold 稳定性次数阈值(防抖动配置统计周期数)
     */
    public Long getStabilizeThreshold() {
        return this.StabilizeThreshold;
    }

    /**
     * Set 稳定性次数阈值(防抖动配置统计周期数)
     * @param StabilizeThreshold 稳定性次数阈值(防抖动配置统计周期数)
     */
    public void setStabilizeThreshold(Long StabilizeThreshold) {
        this.StabilizeThreshold = StabilizeThreshold;
    }

    /**
     * Get 稳定性统计周期(防抖动配置统计周期数) 
     * @return StabilizeStatisticsCycle 稳定性统计周期(防抖动配置统计周期数)
     */
    public Long getStabilizeStatisticsCycle() {
        return this.StabilizeStatisticsCycle;
    }

    /**
     * Set 稳定性统计周期(防抖动配置统计周期数)
     * @param StabilizeStatisticsCycle 稳定性统计周期(防抖动配置统计周期数)
     */
    public void setStabilizeStatisticsCycle(Long StabilizeStatisticsCycle) {
        this.StabilizeStatisticsCycle = StabilizeStatisticsCycle;
    }

    /**
     * Get 是否累计计算,false:连续,true:累计 
     * @return IsCumulant 是否累计计算,false:连续,true:累计
     */
    public Boolean getIsCumulant() {
        return this.IsCumulant;
    }

    /**
     * Set 是否累计计算,false:连续,true:累计
     * @param IsCumulant 是否累计计算,false:连续,true:累计
     */
    public void setIsCumulant(Boolean IsCumulant) {
        this.IsCumulant = IsCumulant;
    }

    /**
     * Get 当日累计实例数;
当天失败实例数向下波动量 
     * @return InstanceCount 当日累计实例数;
当天失败实例数向下波动量
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 当日累计实例数;
当天失败实例数向下波动量
     * @param InstanceCount 当日累计实例数;
当天失败实例数向下波动量
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    public ProjectInstanceStatisticsAlarmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectInstanceStatisticsAlarmInfo(ProjectInstanceStatisticsAlarmInfo source) {
        if (source.AlarmType != null) {
            this.AlarmType = new String(source.AlarmType);
        }
        if (source.InstanceThresholdCountPercent != null) {
            this.InstanceThresholdCountPercent = new Long(source.InstanceThresholdCountPercent);
        }
        if (source.InstanceThresholdCount != null) {
            this.InstanceThresholdCount = new Long(source.InstanceThresholdCount);
        }
        if (source.StabilizeThreshold != null) {
            this.StabilizeThreshold = new Long(source.StabilizeThreshold);
        }
        if (source.StabilizeStatisticsCycle != null) {
            this.StabilizeStatisticsCycle = new Long(source.StabilizeStatisticsCycle);
        }
        if (source.IsCumulant != null) {
            this.IsCumulant = new Boolean(source.IsCumulant);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "InstanceThresholdCountPercent", this.InstanceThresholdCountPercent);
        this.setParamSimple(map, prefix + "InstanceThresholdCount", this.InstanceThresholdCount);
        this.setParamSimple(map, prefix + "StabilizeThreshold", this.StabilizeThreshold);
        this.setParamSimple(map, prefix + "StabilizeStatisticsCycle", this.StabilizeStatisticsCycle);
        this.setParamSimple(map, prefix + "IsCumulant", this.IsCumulant);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);

    }
}


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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateScalingPolicyRequest extends AbstractModel{

    /**
    * 伸缩组ID。
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 告警触发策略名称。
    */
    @SerializedName("ScalingPolicyName")
    @Expose
    private String ScalingPolicyName;

    /**
    * 告警触发策略类型，默认类型为SIMPLE。取值范围：<br><li>SIMPLE：简单策略</li><li>TARGET_TRACKING：目标追踪策略</li>
    */
    @SerializedName("ScalingPolicyType")
    @Expose
    private String ScalingPolicyType;

    /**
    * 告警触发后，期望实例数修改方式，仅适用于简单策略。取值范围：<br><li>CHANGE_IN_CAPACITY：增加或减少若干期望实例数</li><li>EXACT_CAPACITY：调整至指定期望实例数</li> <li>PERCENT_CHANGE_IN_CAPACITY：按百分比调整期望实例数</li>
    */
    @SerializedName("AdjustmentType")
    @Expose
    private String AdjustmentType;

    /**
    * 告警触发后，期望实例数的调整值，仅适用于简单策略。<br><li>当 AdjustmentType 为 CHANGE_IN_CAPACITY 时，AdjustmentValue 为正数表示告警触发后增加实例，为负数表示告警触发后减少实例 </li> <li> 当 AdjustmentType 为 EXACT_CAPACITY 时，AdjustmentValue 的值即为告警触发后新的期望实例数，需要大于或等于0 </li> <li> 当 AdjustmentType 为 PERCENT_CHANGE_IN_CAPACITY 时，AdjusmentValue 为正数表示告警触发后按百分比增加实例，为负数表示告警触发后按百分比减少实例，单位是：%。
    */
    @SerializedName("AdjustmentValue")
    @Expose
    private Long AdjustmentValue;

    /**
    * 冷却时间，单位为秒，仅适用于简单策略。默认冷却时间300秒。
    */
    @SerializedName("Cooldown")
    @Expose
    private Long Cooldown;

    /**
    * 告警监控指标，仅适用于简单策略。
    */
    @SerializedName("MetricAlarm")
    @Expose
    private MetricAlarm MetricAlarm;

    /**
    * 预定义监控项，仅适用于目标追踪策略。取值范围：<br><li>ASG_AVG_CPU_UTILIZATION：平均CPU使用率</li><li>ASG_AVG_LAN_TRAFFIC_OUT：平均内网出带宽</li><li>ASG_AVG_LAN_TRAFFIC_IN：平均内网入带宽</li><li>ASG_AVG_WAN_TRAFFIC_OUT：平均外网出带宽</li><li>ASG_AVG_WAN_TRAFFIC_IN：平均外网出带宽</li>
    */
    @SerializedName("PredefinedMetricType")
    @Expose
    private String PredefinedMetricType;

    /**
    * 目标值，仅适用于目标追踪策略。<br><li>ASG_AVG_CPU_UTILIZATION：[1, 100)，单位：%</li><li>ASG_AVG_LAN_TRAFFIC_OUT：>0，单位：Mbps</li><li>ASG_AVG_LAN_TRAFFIC_IN：>0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_OUT：>0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_IN：>0，单位：Mbps</li>
    */
    @SerializedName("TargetValue")
    @Expose
    private Long TargetValue;

    /**
    * 实例预热时间，单位为秒，仅适用于目标追踪策略。取值范围为0-3600，默认预热时间300秒。
    */
    @SerializedName("EstimatedInstanceWarmup")
    @Expose
    private Long EstimatedInstanceWarmup;

    /**
    * 是否禁用缩容，仅适用于目标追踪策略，默认值为 false。取值范围：<br><li>true：目标追踪策略仅触发扩容</li><li>false：目标追踪策略触发扩容和缩容</li>
    */
    @SerializedName("DisableScaleIn")
    @Expose
    private Boolean DisableScaleIn;

    /**
    * 此参数已不再生效，请使用[创建通知](https://cloud.tencent.com/document/api/377/33185)。
通知组ID，即为用户组ID集合。
    */
    @SerializedName("NotificationUserGroupIds")
    @Expose
    private String [] NotificationUserGroupIds;

    /**
     * Get 伸缩组ID。 
     * @return AutoScalingGroupId 伸缩组ID。
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set 伸缩组ID。
     * @param AutoScalingGroupId 伸缩组ID。
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get 告警触发策略名称。 
     * @return ScalingPolicyName 告警触发策略名称。
     */
    public String getScalingPolicyName() {
        return this.ScalingPolicyName;
    }

    /**
     * Set 告警触发策略名称。
     * @param ScalingPolicyName 告警触发策略名称。
     */
    public void setScalingPolicyName(String ScalingPolicyName) {
        this.ScalingPolicyName = ScalingPolicyName;
    }

    /**
     * Get 告警触发策略类型，默认类型为SIMPLE。取值范围：<br><li>SIMPLE：简单策略</li><li>TARGET_TRACKING：目标追踪策略</li> 
     * @return ScalingPolicyType 告警触发策略类型，默认类型为SIMPLE。取值范围：<br><li>SIMPLE：简单策略</li><li>TARGET_TRACKING：目标追踪策略</li>
     */
    public String getScalingPolicyType() {
        return this.ScalingPolicyType;
    }

    /**
     * Set 告警触发策略类型，默认类型为SIMPLE。取值范围：<br><li>SIMPLE：简单策略</li><li>TARGET_TRACKING：目标追踪策略</li>
     * @param ScalingPolicyType 告警触发策略类型，默认类型为SIMPLE。取值范围：<br><li>SIMPLE：简单策略</li><li>TARGET_TRACKING：目标追踪策略</li>
     */
    public void setScalingPolicyType(String ScalingPolicyType) {
        this.ScalingPolicyType = ScalingPolicyType;
    }

    /**
     * Get 告警触发后，期望实例数修改方式，仅适用于简单策略。取值范围：<br><li>CHANGE_IN_CAPACITY：增加或减少若干期望实例数</li><li>EXACT_CAPACITY：调整至指定期望实例数</li> <li>PERCENT_CHANGE_IN_CAPACITY：按百分比调整期望实例数</li> 
     * @return AdjustmentType 告警触发后，期望实例数修改方式，仅适用于简单策略。取值范围：<br><li>CHANGE_IN_CAPACITY：增加或减少若干期望实例数</li><li>EXACT_CAPACITY：调整至指定期望实例数</li> <li>PERCENT_CHANGE_IN_CAPACITY：按百分比调整期望实例数</li>
     */
    public String getAdjustmentType() {
        return this.AdjustmentType;
    }

    /**
     * Set 告警触发后，期望实例数修改方式，仅适用于简单策略。取值范围：<br><li>CHANGE_IN_CAPACITY：增加或减少若干期望实例数</li><li>EXACT_CAPACITY：调整至指定期望实例数</li> <li>PERCENT_CHANGE_IN_CAPACITY：按百分比调整期望实例数</li>
     * @param AdjustmentType 告警触发后，期望实例数修改方式，仅适用于简单策略。取值范围：<br><li>CHANGE_IN_CAPACITY：增加或减少若干期望实例数</li><li>EXACT_CAPACITY：调整至指定期望实例数</li> <li>PERCENT_CHANGE_IN_CAPACITY：按百分比调整期望实例数</li>
     */
    public void setAdjustmentType(String AdjustmentType) {
        this.AdjustmentType = AdjustmentType;
    }

    /**
     * Get 告警触发后，期望实例数的调整值，仅适用于简单策略。<br><li>当 AdjustmentType 为 CHANGE_IN_CAPACITY 时，AdjustmentValue 为正数表示告警触发后增加实例，为负数表示告警触发后减少实例 </li> <li> 当 AdjustmentType 为 EXACT_CAPACITY 时，AdjustmentValue 的值即为告警触发后新的期望实例数，需要大于或等于0 </li> <li> 当 AdjustmentType 为 PERCENT_CHANGE_IN_CAPACITY 时，AdjusmentValue 为正数表示告警触发后按百分比增加实例，为负数表示告警触发后按百分比减少实例，单位是：%。 
     * @return AdjustmentValue 告警触发后，期望实例数的调整值，仅适用于简单策略。<br><li>当 AdjustmentType 为 CHANGE_IN_CAPACITY 时，AdjustmentValue 为正数表示告警触发后增加实例，为负数表示告警触发后减少实例 </li> <li> 当 AdjustmentType 为 EXACT_CAPACITY 时，AdjustmentValue 的值即为告警触发后新的期望实例数，需要大于或等于0 </li> <li> 当 AdjustmentType 为 PERCENT_CHANGE_IN_CAPACITY 时，AdjusmentValue 为正数表示告警触发后按百分比增加实例，为负数表示告警触发后按百分比减少实例，单位是：%。
     */
    public Long getAdjustmentValue() {
        return this.AdjustmentValue;
    }

    /**
     * Set 告警触发后，期望实例数的调整值，仅适用于简单策略。<br><li>当 AdjustmentType 为 CHANGE_IN_CAPACITY 时，AdjustmentValue 为正数表示告警触发后增加实例，为负数表示告警触发后减少实例 </li> <li> 当 AdjustmentType 为 EXACT_CAPACITY 时，AdjustmentValue 的值即为告警触发后新的期望实例数，需要大于或等于0 </li> <li> 当 AdjustmentType 为 PERCENT_CHANGE_IN_CAPACITY 时，AdjusmentValue 为正数表示告警触发后按百分比增加实例，为负数表示告警触发后按百分比减少实例，单位是：%。
     * @param AdjustmentValue 告警触发后，期望实例数的调整值，仅适用于简单策略。<br><li>当 AdjustmentType 为 CHANGE_IN_CAPACITY 时，AdjustmentValue 为正数表示告警触发后增加实例，为负数表示告警触发后减少实例 </li> <li> 当 AdjustmentType 为 EXACT_CAPACITY 时，AdjustmentValue 的值即为告警触发后新的期望实例数，需要大于或等于0 </li> <li> 当 AdjustmentType 为 PERCENT_CHANGE_IN_CAPACITY 时，AdjusmentValue 为正数表示告警触发后按百分比增加实例，为负数表示告警触发后按百分比减少实例，单位是：%。
     */
    public void setAdjustmentValue(Long AdjustmentValue) {
        this.AdjustmentValue = AdjustmentValue;
    }

    /**
     * Get 冷却时间，单位为秒，仅适用于简单策略。默认冷却时间300秒。 
     * @return Cooldown 冷却时间，单位为秒，仅适用于简单策略。默认冷却时间300秒。
     */
    public Long getCooldown() {
        return this.Cooldown;
    }

    /**
     * Set 冷却时间，单位为秒，仅适用于简单策略。默认冷却时间300秒。
     * @param Cooldown 冷却时间，单位为秒，仅适用于简单策略。默认冷却时间300秒。
     */
    public void setCooldown(Long Cooldown) {
        this.Cooldown = Cooldown;
    }

    /**
     * Get 告警监控指标，仅适用于简单策略。 
     * @return MetricAlarm 告警监控指标，仅适用于简单策略。
     */
    public MetricAlarm getMetricAlarm() {
        return this.MetricAlarm;
    }

    /**
     * Set 告警监控指标，仅适用于简单策略。
     * @param MetricAlarm 告警监控指标，仅适用于简单策略。
     */
    public void setMetricAlarm(MetricAlarm MetricAlarm) {
        this.MetricAlarm = MetricAlarm;
    }

    /**
     * Get 预定义监控项，仅适用于目标追踪策略。取值范围：<br><li>ASG_AVG_CPU_UTILIZATION：平均CPU使用率</li><li>ASG_AVG_LAN_TRAFFIC_OUT：平均内网出带宽</li><li>ASG_AVG_LAN_TRAFFIC_IN：平均内网入带宽</li><li>ASG_AVG_WAN_TRAFFIC_OUT：平均外网出带宽</li><li>ASG_AVG_WAN_TRAFFIC_IN：平均外网出带宽</li> 
     * @return PredefinedMetricType 预定义监控项，仅适用于目标追踪策略。取值范围：<br><li>ASG_AVG_CPU_UTILIZATION：平均CPU使用率</li><li>ASG_AVG_LAN_TRAFFIC_OUT：平均内网出带宽</li><li>ASG_AVG_LAN_TRAFFIC_IN：平均内网入带宽</li><li>ASG_AVG_WAN_TRAFFIC_OUT：平均外网出带宽</li><li>ASG_AVG_WAN_TRAFFIC_IN：平均外网出带宽</li>
     */
    public String getPredefinedMetricType() {
        return this.PredefinedMetricType;
    }

    /**
     * Set 预定义监控项，仅适用于目标追踪策略。取值范围：<br><li>ASG_AVG_CPU_UTILIZATION：平均CPU使用率</li><li>ASG_AVG_LAN_TRAFFIC_OUT：平均内网出带宽</li><li>ASG_AVG_LAN_TRAFFIC_IN：平均内网入带宽</li><li>ASG_AVG_WAN_TRAFFIC_OUT：平均外网出带宽</li><li>ASG_AVG_WAN_TRAFFIC_IN：平均外网出带宽</li>
     * @param PredefinedMetricType 预定义监控项，仅适用于目标追踪策略。取值范围：<br><li>ASG_AVG_CPU_UTILIZATION：平均CPU使用率</li><li>ASG_AVG_LAN_TRAFFIC_OUT：平均内网出带宽</li><li>ASG_AVG_LAN_TRAFFIC_IN：平均内网入带宽</li><li>ASG_AVG_WAN_TRAFFIC_OUT：平均外网出带宽</li><li>ASG_AVG_WAN_TRAFFIC_IN：平均外网出带宽</li>
     */
    public void setPredefinedMetricType(String PredefinedMetricType) {
        this.PredefinedMetricType = PredefinedMetricType;
    }

    /**
     * Get 目标值，仅适用于目标追踪策略。<br><li>ASG_AVG_CPU_UTILIZATION：[1, 100)，单位：%</li><li>ASG_AVG_LAN_TRAFFIC_OUT：>0，单位：Mbps</li><li>ASG_AVG_LAN_TRAFFIC_IN：>0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_OUT：>0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_IN：>0，单位：Mbps</li> 
     * @return TargetValue 目标值，仅适用于目标追踪策略。<br><li>ASG_AVG_CPU_UTILIZATION：[1, 100)，单位：%</li><li>ASG_AVG_LAN_TRAFFIC_OUT：>0，单位：Mbps</li><li>ASG_AVG_LAN_TRAFFIC_IN：>0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_OUT：>0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_IN：>0，单位：Mbps</li>
     */
    public Long getTargetValue() {
        return this.TargetValue;
    }

    /**
     * Set 目标值，仅适用于目标追踪策略。<br><li>ASG_AVG_CPU_UTILIZATION：[1, 100)，单位：%</li><li>ASG_AVG_LAN_TRAFFIC_OUT：>0，单位：Mbps</li><li>ASG_AVG_LAN_TRAFFIC_IN：>0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_OUT：>0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_IN：>0，单位：Mbps</li>
     * @param TargetValue 目标值，仅适用于目标追踪策略。<br><li>ASG_AVG_CPU_UTILIZATION：[1, 100)，单位：%</li><li>ASG_AVG_LAN_TRAFFIC_OUT：>0，单位：Mbps</li><li>ASG_AVG_LAN_TRAFFIC_IN：>0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_OUT：>0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_IN：>0，单位：Mbps</li>
     */
    public void setTargetValue(Long TargetValue) {
        this.TargetValue = TargetValue;
    }

    /**
     * Get 实例预热时间，单位为秒，仅适用于目标追踪策略。取值范围为0-3600，默认预热时间300秒。 
     * @return EstimatedInstanceWarmup 实例预热时间，单位为秒，仅适用于目标追踪策略。取值范围为0-3600，默认预热时间300秒。
     */
    public Long getEstimatedInstanceWarmup() {
        return this.EstimatedInstanceWarmup;
    }

    /**
     * Set 实例预热时间，单位为秒，仅适用于目标追踪策略。取值范围为0-3600，默认预热时间300秒。
     * @param EstimatedInstanceWarmup 实例预热时间，单位为秒，仅适用于目标追踪策略。取值范围为0-3600，默认预热时间300秒。
     */
    public void setEstimatedInstanceWarmup(Long EstimatedInstanceWarmup) {
        this.EstimatedInstanceWarmup = EstimatedInstanceWarmup;
    }

    /**
     * Get 是否禁用缩容，仅适用于目标追踪策略，默认值为 false。取值范围：<br><li>true：目标追踪策略仅触发扩容</li><li>false：目标追踪策略触发扩容和缩容</li> 
     * @return DisableScaleIn 是否禁用缩容，仅适用于目标追踪策略，默认值为 false。取值范围：<br><li>true：目标追踪策略仅触发扩容</li><li>false：目标追踪策略触发扩容和缩容</li>
     */
    public Boolean getDisableScaleIn() {
        return this.DisableScaleIn;
    }

    /**
     * Set 是否禁用缩容，仅适用于目标追踪策略，默认值为 false。取值范围：<br><li>true：目标追踪策略仅触发扩容</li><li>false：目标追踪策略触发扩容和缩容</li>
     * @param DisableScaleIn 是否禁用缩容，仅适用于目标追踪策略，默认值为 false。取值范围：<br><li>true：目标追踪策略仅触发扩容</li><li>false：目标追踪策略触发扩容和缩容</li>
     */
    public void setDisableScaleIn(Boolean DisableScaleIn) {
        this.DisableScaleIn = DisableScaleIn;
    }

    /**
     * Get 此参数已不再生效，请使用[创建通知](https://cloud.tencent.com/document/api/377/33185)。
通知组ID，即为用户组ID集合。 
     * @return NotificationUserGroupIds 此参数已不再生效，请使用[创建通知](https://cloud.tencent.com/document/api/377/33185)。
通知组ID，即为用户组ID集合。
     */
    public String [] getNotificationUserGroupIds() {
        return this.NotificationUserGroupIds;
    }

    /**
     * Set 此参数已不再生效，请使用[创建通知](https://cloud.tencent.com/document/api/377/33185)。
通知组ID，即为用户组ID集合。
     * @param NotificationUserGroupIds 此参数已不再生效，请使用[创建通知](https://cloud.tencent.com/document/api/377/33185)。
通知组ID，即为用户组ID集合。
     */
    public void setNotificationUserGroupIds(String [] NotificationUserGroupIds) {
        this.NotificationUserGroupIds = NotificationUserGroupIds;
    }

    public CreateScalingPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateScalingPolicyRequest(CreateScalingPolicyRequest source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.ScalingPolicyName != null) {
            this.ScalingPolicyName = new String(source.ScalingPolicyName);
        }
        if (source.ScalingPolicyType != null) {
            this.ScalingPolicyType = new String(source.ScalingPolicyType);
        }
        if (source.AdjustmentType != null) {
            this.AdjustmentType = new String(source.AdjustmentType);
        }
        if (source.AdjustmentValue != null) {
            this.AdjustmentValue = new Long(source.AdjustmentValue);
        }
        if (source.Cooldown != null) {
            this.Cooldown = new Long(source.Cooldown);
        }
        if (source.MetricAlarm != null) {
            this.MetricAlarm = new MetricAlarm(source.MetricAlarm);
        }
        if (source.PredefinedMetricType != null) {
            this.PredefinedMetricType = new String(source.PredefinedMetricType);
        }
        if (source.TargetValue != null) {
            this.TargetValue = new Long(source.TargetValue);
        }
        if (source.EstimatedInstanceWarmup != null) {
            this.EstimatedInstanceWarmup = new Long(source.EstimatedInstanceWarmup);
        }
        if (source.DisableScaleIn != null) {
            this.DisableScaleIn = new Boolean(source.DisableScaleIn);
        }
        if (source.NotificationUserGroupIds != null) {
            this.NotificationUserGroupIds = new String[source.NotificationUserGroupIds.length];
            for (int i = 0; i < source.NotificationUserGroupIds.length; i++) {
                this.NotificationUserGroupIds[i] = new String(source.NotificationUserGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "ScalingPolicyName", this.ScalingPolicyName);
        this.setParamSimple(map, prefix + "ScalingPolicyType", this.ScalingPolicyType);
        this.setParamSimple(map, prefix + "AdjustmentType", this.AdjustmentType);
        this.setParamSimple(map, prefix + "AdjustmentValue", this.AdjustmentValue);
        this.setParamSimple(map, prefix + "Cooldown", this.Cooldown);
        this.setParamObj(map, prefix + "MetricAlarm.", this.MetricAlarm);
        this.setParamSimple(map, prefix + "PredefinedMetricType", this.PredefinedMetricType);
        this.setParamSimple(map, prefix + "TargetValue", this.TargetValue);
        this.setParamSimple(map, prefix + "EstimatedInstanceWarmup", this.EstimatedInstanceWarmup);
        this.setParamSimple(map, prefix + "DisableScaleIn", this.DisableScaleIn);
        this.setParamArraySimple(map, prefix + "NotificationUserGroupIds.", this.NotificationUserGroupIds);

    }
}


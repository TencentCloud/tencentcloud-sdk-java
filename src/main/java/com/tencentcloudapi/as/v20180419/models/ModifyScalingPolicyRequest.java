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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyScalingPolicyRequest extends AbstractModel {

    /**
    * <p>告警策略ID。可通过登录 <a href="https://console.cloud.tencent.com/autoscaling/group">控制台</a> 或调用接口 <a href="https://cloud.tencent.com/document/api/377/33178">DescribeScalingPolicies</a> ，取返回信息中的 AutoScalingPolicyId 获取告警策略ID。</p>
    */
    @SerializedName("AutoScalingPolicyId")
    @Expose
    private String AutoScalingPolicyId;

    /**
    * <p>告警策略名称，在您账号中必须唯一。名称长度不能超过60，名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点。</p>
    */
    @SerializedName("ScalingPolicyName")
    @Expose
    private String ScalingPolicyName;

    /**
    * <p>告警触发后，期望实例数修改方式，仅适用于简单策略。取值范围：<br><li>CHANGE_IN_CAPACITY：增加或减少若干期望实例数</li><li>EXACT_CAPACITY：调整至指定期望实例数</li> <li>PERCENT_CHANGE_IN_CAPACITY：按百分比调整期望实例数</li></p>
    */
    @SerializedName("AdjustmentType")
    @Expose
    private String AdjustmentType;

    /**
    * <p>告警触发后，期望实例数的调整值，仅适用于简单策略。<li>当 AdjustmentType 为 CHANGE_IN_CAPACITY 时，AdjustmentValue 为正数表示告警触发后增加实例，为负数表示告警触发后减少实例 </li> <li> 当 AdjustmentType 为 EXACT_CAPACITY 时，AdjustmentValue 的值即为告警触发后新的期望实例数，需要大于或等于0 </li> <li> 当 AdjustmentType 为 PERCENT_CHANGE_IN_CAPACITY 时，AdjusmentValue 为正数表示告警触发后按百分比增加实例，为负数表示告警触发后按百分比减少实例，单位是：%。</li></p>
    */
    @SerializedName("AdjustmentValue")
    @Expose
    private Long AdjustmentValue;

    /**
    * <p>冷却时间，仅适用于简单策略，单位为秒。</p>
    */
    @SerializedName("Cooldown")
    @Expose
    private Long Cooldown;

    /**
    * <p>告警监控指标，仅适用于简单策略。</p>
    */
    @SerializedName("MetricAlarm")
    @Expose
    private MetricAlarm MetricAlarm;

    /**
    * <p>预定义监控项，仅适用于目标追踪策略。取值范围：<br><li>ASG_AVG_CPU_UTILIZATION：平均CPU使用率</li><li>ASG_AVG_LAN_TRAFFIC_OUT：平均内网出带宽</li><li>ASG_AVG_LAN_TRAFFIC_IN：平均内网入带宽</li><li>ASG_AVG_WAN_TRAFFIC_OUT：平均外网出带宽</li><li>ASG_AVG_WAN_TRAFFIC_IN：平均外网出带宽</li>当前外网出入带宽属于 CLB 类指标，其他指标属于 CVM 类指标。修改指标名称时不允许跨类别修改。</p>枚举值：<ul><li> ASG_AVG_CPU_UTILIZATION： 平均CPU使用率</li></ul>
    */
    @SerializedName("PredefinedMetricType")
    @Expose
    private String PredefinedMetricType;

    /**
    * <p>目标值，仅适用于目标追踪策略。<br><li>ASG_AVG_CPU_UTILIZATION：[1, 100)，单位：%</li><li>ASG_AVG_LAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>ASG_AVG_LAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_IN：&gt;0，单位：Mbps</li></p>
    */
    @SerializedName("TargetValue")
    @Expose
    private Long TargetValue;

    /**
    * <p>实例预热时间，单位为秒，仅适用于目标追踪策略。取值范围为0-3600。</p>
    */
    @SerializedName("EstimatedInstanceWarmup")
    @Expose
    private Long EstimatedInstanceWarmup;

    /**
    * <p>是否禁用缩容，仅适用于目标追踪策略。取值范围：<br><li>true：目标追踪策略仅触发扩容</li><li>false：目标追踪策略触发扩容和缩容</li></p>
    */
    @SerializedName("DisableScaleIn")
    @Expose
    private Boolean DisableScaleIn;

    /**
    * <p>此参数已不再生效，请使用<a href="https://cloud.tencent.com/document/api/377/33185">创建通知</a>。通知组ID，即为用户组ID集合。</p>
    */
    @SerializedName("NotificationUserGroupIds")
    @Expose
    private String [] NotificationUserGroupIds;

    /**
     * Get <p>告警策略ID。可通过登录 <a href="https://console.cloud.tencent.com/autoscaling/group">控制台</a> 或调用接口 <a href="https://cloud.tencent.com/document/api/377/33178">DescribeScalingPolicies</a> ，取返回信息中的 AutoScalingPolicyId 获取告警策略ID。</p> 
     * @return AutoScalingPolicyId <p>告警策略ID。可通过登录 <a href="https://console.cloud.tencent.com/autoscaling/group">控制台</a> 或调用接口 <a href="https://cloud.tencent.com/document/api/377/33178">DescribeScalingPolicies</a> ，取返回信息中的 AutoScalingPolicyId 获取告警策略ID。</p>
     */
    public String getAutoScalingPolicyId() {
        return this.AutoScalingPolicyId;
    }

    /**
     * Set <p>告警策略ID。可通过登录 <a href="https://console.cloud.tencent.com/autoscaling/group">控制台</a> 或调用接口 <a href="https://cloud.tencent.com/document/api/377/33178">DescribeScalingPolicies</a> ，取返回信息中的 AutoScalingPolicyId 获取告警策略ID。</p>
     * @param AutoScalingPolicyId <p>告警策略ID。可通过登录 <a href="https://console.cloud.tencent.com/autoscaling/group">控制台</a> 或调用接口 <a href="https://cloud.tencent.com/document/api/377/33178">DescribeScalingPolicies</a> ，取返回信息中的 AutoScalingPolicyId 获取告警策略ID。</p>
     */
    public void setAutoScalingPolicyId(String AutoScalingPolicyId) {
        this.AutoScalingPolicyId = AutoScalingPolicyId;
    }

    /**
     * Get <p>告警策略名称，在您账号中必须唯一。名称长度不能超过60，名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点。</p> 
     * @return ScalingPolicyName <p>告警策略名称，在您账号中必须唯一。名称长度不能超过60，名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点。</p>
     */
    public String getScalingPolicyName() {
        return this.ScalingPolicyName;
    }

    /**
     * Set <p>告警策略名称，在您账号中必须唯一。名称长度不能超过60，名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点。</p>
     * @param ScalingPolicyName <p>告警策略名称，在您账号中必须唯一。名称长度不能超过60，名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点。</p>
     */
    public void setScalingPolicyName(String ScalingPolicyName) {
        this.ScalingPolicyName = ScalingPolicyName;
    }

    /**
     * Get <p>告警触发后，期望实例数修改方式，仅适用于简单策略。取值范围：<br><li>CHANGE_IN_CAPACITY：增加或减少若干期望实例数</li><li>EXACT_CAPACITY：调整至指定期望实例数</li> <li>PERCENT_CHANGE_IN_CAPACITY：按百分比调整期望实例数</li></p> 
     * @return AdjustmentType <p>告警触发后，期望实例数修改方式，仅适用于简单策略。取值范围：<br><li>CHANGE_IN_CAPACITY：增加或减少若干期望实例数</li><li>EXACT_CAPACITY：调整至指定期望实例数</li> <li>PERCENT_CHANGE_IN_CAPACITY：按百分比调整期望实例数</li></p>
     */
    public String getAdjustmentType() {
        return this.AdjustmentType;
    }

    /**
     * Set <p>告警触发后，期望实例数修改方式，仅适用于简单策略。取值范围：<br><li>CHANGE_IN_CAPACITY：增加或减少若干期望实例数</li><li>EXACT_CAPACITY：调整至指定期望实例数</li> <li>PERCENT_CHANGE_IN_CAPACITY：按百分比调整期望实例数</li></p>
     * @param AdjustmentType <p>告警触发后，期望实例数修改方式，仅适用于简单策略。取值范围：<br><li>CHANGE_IN_CAPACITY：增加或减少若干期望实例数</li><li>EXACT_CAPACITY：调整至指定期望实例数</li> <li>PERCENT_CHANGE_IN_CAPACITY：按百分比调整期望实例数</li></p>
     */
    public void setAdjustmentType(String AdjustmentType) {
        this.AdjustmentType = AdjustmentType;
    }

    /**
     * Get <p>告警触发后，期望实例数的调整值，仅适用于简单策略。<li>当 AdjustmentType 为 CHANGE_IN_CAPACITY 时，AdjustmentValue 为正数表示告警触发后增加实例，为负数表示告警触发后减少实例 </li> <li> 当 AdjustmentType 为 EXACT_CAPACITY 时，AdjustmentValue 的值即为告警触发后新的期望实例数，需要大于或等于0 </li> <li> 当 AdjustmentType 为 PERCENT_CHANGE_IN_CAPACITY 时，AdjusmentValue 为正数表示告警触发后按百分比增加实例，为负数表示告警触发后按百分比减少实例，单位是：%。</li></p> 
     * @return AdjustmentValue <p>告警触发后，期望实例数的调整值，仅适用于简单策略。<li>当 AdjustmentType 为 CHANGE_IN_CAPACITY 时，AdjustmentValue 为正数表示告警触发后增加实例，为负数表示告警触发后减少实例 </li> <li> 当 AdjustmentType 为 EXACT_CAPACITY 时，AdjustmentValue 的值即为告警触发后新的期望实例数，需要大于或等于0 </li> <li> 当 AdjustmentType 为 PERCENT_CHANGE_IN_CAPACITY 时，AdjusmentValue 为正数表示告警触发后按百分比增加实例，为负数表示告警触发后按百分比减少实例，单位是：%。</li></p>
     */
    public Long getAdjustmentValue() {
        return this.AdjustmentValue;
    }

    /**
     * Set <p>告警触发后，期望实例数的调整值，仅适用于简单策略。<li>当 AdjustmentType 为 CHANGE_IN_CAPACITY 时，AdjustmentValue 为正数表示告警触发后增加实例，为负数表示告警触发后减少实例 </li> <li> 当 AdjustmentType 为 EXACT_CAPACITY 时，AdjustmentValue 的值即为告警触发后新的期望实例数，需要大于或等于0 </li> <li> 当 AdjustmentType 为 PERCENT_CHANGE_IN_CAPACITY 时，AdjusmentValue 为正数表示告警触发后按百分比增加实例，为负数表示告警触发后按百分比减少实例，单位是：%。</li></p>
     * @param AdjustmentValue <p>告警触发后，期望实例数的调整值，仅适用于简单策略。<li>当 AdjustmentType 为 CHANGE_IN_CAPACITY 时，AdjustmentValue 为正数表示告警触发后增加实例，为负数表示告警触发后减少实例 </li> <li> 当 AdjustmentType 为 EXACT_CAPACITY 时，AdjustmentValue 的值即为告警触发后新的期望实例数，需要大于或等于0 </li> <li> 当 AdjustmentType 为 PERCENT_CHANGE_IN_CAPACITY 时，AdjusmentValue 为正数表示告警触发后按百分比增加实例，为负数表示告警触发后按百分比减少实例，单位是：%。</li></p>
     */
    public void setAdjustmentValue(Long AdjustmentValue) {
        this.AdjustmentValue = AdjustmentValue;
    }

    /**
     * Get <p>冷却时间，仅适用于简单策略，单位为秒。</p> 
     * @return Cooldown <p>冷却时间，仅适用于简单策略，单位为秒。</p>
     */
    public Long getCooldown() {
        return this.Cooldown;
    }

    /**
     * Set <p>冷却时间，仅适用于简单策略，单位为秒。</p>
     * @param Cooldown <p>冷却时间，仅适用于简单策略，单位为秒。</p>
     */
    public void setCooldown(Long Cooldown) {
        this.Cooldown = Cooldown;
    }

    /**
     * Get <p>告警监控指标，仅适用于简单策略。</p> 
     * @return MetricAlarm <p>告警监控指标，仅适用于简单策略。</p>
     */
    public MetricAlarm getMetricAlarm() {
        return this.MetricAlarm;
    }

    /**
     * Set <p>告警监控指标，仅适用于简单策略。</p>
     * @param MetricAlarm <p>告警监控指标，仅适用于简单策略。</p>
     */
    public void setMetricAlarm(MetricAlarm MetricAlarm) {
        this.MetricAlarm = MetricAlarm;
    }

    /**
     * Get <p>预定义监控项，仅适用于目标追踪策略。取值范围：<br><li>ASG_AVG_CPU_UTILIZATION：平均CPU使用率</li><li>ASG_AVG_LAN_TRAFFIC_OUT：平均内网出带宽</li><li>ASG_AVG_LAN_TRAFFIC_IN：平均内网入带宽</li><li>ASG_AVG_WAN_TRAFFIC_OUT：平均外网出带宽</li><li>ASG_AVG_WAN_TRAFFIC_IN：平均外网出带宽</li>当前外网出入带宽属于 CLB 类指标，其他指标属于 CVM 类指标。修改指标名称时不允许跨类别修改。</p>枚举值：<ul><li> ASG_AVG_CPU_UTILIZATION： 平均CPU使用率</li></ul> 
     * @return PredefinedMetricType <p>预定义监控项，仅适用于目标追踪策略。取值范围：<br><li>ASG_AVG_CPU_UTILIZATION：平均CPU使用率</li><li>ASG_AVG_LAN_TRAFFIC_OUT：平均内网出带宽</li><li>ASG_AVG_LAN_TRAFFIC_IN：平均内网入带宽</li><li>ASG_AVG_WAN_TRAFFIC_OUT：平均外网出带宽</li><li>ASG_AVG_WAN_TRAFFIC_IN：平均外网出带宽</li>当前外网出入带宽属于 CLB 类指标，其他指标属于 CVM 类指标。修改指标名称时不允许跨类别修改。</p>枚举值：<ul><li> ASG_AVG_CPU_UTILIZATION： 平均CPU使用率</li></ul>
     */
    public String getPredefinedMetricType() {
        return this.PredefinedMetricType;
    }

    /**
     * Set <p>预定义监控项，仅适用于目标追踪策略。取值范围：<br><li>ASG_AVG_CPU_UTILIZATION：平均CPU使用率</li><li>ASG_AVG_LAN_TRAFFIC_OUT：平均内网出带宽</li><li>ASG_AVG_LAN_TRAFFIC_IN：平均内网入带宽</li><li>ASG_AVG_WAN_TRAFFIC_OUT：平均外网出带宽</li><li>ASG_AVG_WAN_TRAFFIC_IN：平均外网出带宽</li>当前外网出入带宽属于 CLB 类指标，其他指标属于 CVM 类指标。修改指标名称时不允许跨类别修改。</p>枚举值：<ul><li> ASG_AVG_CPU_UTILIZATION： 平均CPU使用率</li></ul>
     * @param PredefinedMetricType <p>预定义监控项，仅适用于目标追踪策略。取值范围：<br><li>ASG_AVG_CPU_UTILIZATION：平均CPU使用率</li><li>ASG_AVG_LAN_TRAFFIC_OUT：平均内网出带宽</li><li>ASG_AVG_LAN_TRAFFIC_IN：平均内网入带宽</li><li>ASG_AVG_WAN_TRAFFIC_OUT：平均外网出带宽</li><li>ASG_AVG_WAN_TRAFFIC_IN：平均外网出带宽</li>当前外网出入带宽属于 CLB 类指标，其他指标属于 CVM 类指标。修改指标名称时不允许跨类别修改。</p>枚举值：<ul><li> ASG_AVG_CPU_UTILIZATION： 平均CPU使用率</li></ul>
     */
    public void setPredefinedMetricType(String PredefinedMetricType) {
        this.PredefinedMetricType = PredefinedMetricType;
    }

    /**
     * Get <p>目标值，仅适用于目标追踪策略。<br><li>ASG_AVG_CPU_UTILIZATION：[1, 100)，单位：%</li><li>ASG_AVG_LAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>ASG_AVG_LAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_IN：&gt;0，单位：Mbps</li></p> 
     * @return TargetValue <p>目标值，仅适用于目标追踪策略。<br><li>ASG_AVG_CPU_UTILIZATION：[1, 100)，单位：%</li><li>ASG_AVG_LAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>ASG_AVG_LAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_IN：&gt;0，单位：Mbps</li></p>
     */
    public Long getTargetValue() {
        return this.TargetValue;
    }

    /**
     * Set <p>目标值，仅适用于目标追踪策略。<br><li>ASG_AVG_CPU_UTILIZATION：[1, 100)，单位：%</li><li>ASG_AVG_LAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>ASG_AVG_LAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_IN：&gt;0，单位：Mbps</li></p>
     * @param TargetValue <p>目标值，仅适用于目标追踪策略。<br><li>ASG_AVG_CPU_UTILIZATION：[1, 100)，单位：%</li><li>ASG_AVG_LAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>ASG_AVG_LAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>ASG_AVG_WAN_TRAFFIC_IN：&gt;0，单位：Mbps</li></p>
     */
    public void setTargetValue(Long TargetValue) {
        this.TargetValue = TargetValue;
    }

    /**
     * Get <p>实例预热时间，单位为秒，仅适用于目标追踪策略。取值范围为0-3600。</p> 
     * @return EstimatedInstanceWarmup <p>实例预热时间，单位为秒，仅适用于目标追踪策略。取值范围为0-3600。</p>
     */
    public Long getEstimatedInstanceWarmup() {
        return this.EstimatedInstanceWarmup;
    }

    /**
     * Set <p>实例预热时间，单位为秒，仅适用于目标追踪策略。取值范围为0-3600。</p>
     * @param EstimatedInstanceWarmup <p>实例预热时间，单位为秒，仅适用于目标追踪策略。取值范围为0-3600。</p>
     */
    public void setEstimatedInstanceWarmup(Long EstimatedInstanceWarmup) {
        this.EstimatedInstanceWarmup = EstimatedInstanceWarmup;
    }

    /**
     * Get <p>是否禁用缩容，仅适用于目标追踪策略。取值范围：<br><li>true：目标追踪策略仅触发扩容</li><li>false：目标追踪策略触发扩容和缩容</li></p> 
     * @return DisableScaleIn <p>是否禁用缩容，仅适用于目标追踪策略。取值范围：<br><li>true：目标追踪策略仅触发扩容</li><li>false：目标追踪策略触发扩容和缩容</li></p>
     */
    public Boolean getDisableScaleIn() {
        return this.DisableScaleIn;
    }

    /**
     * Set <p>是否禁用缩容，仅适用于目标追踪策略。取值范围：<br><li>true：目标追踪策略仅触发扩容</li><li>false：目标追踪策略触发扩容和缩容</li></p>
     * @param DisableScaleIn <p>是否禁用缩容，仅适用于目标追踪策略。取值范围：<br><li>true：目标追踪策略仅触发扩容</li><li>false：目标追踪策略触发扩容和缩容</li></p>
     */
    public void setDisableScaleIn(Boolean DisableScaleIn) {
        this.DisableScaleIn = DisableScaleIn;
    }

    /**
     * Get <p>此参数已不再生效，请使用<a href="https://cloud.tencent.com/document/api/377/33185">创建通知</a>。通知组ID，即为用户组ID集合。</p> 
     * @return NotificationUserGroupIds <p>此参数已不再生效，请使用<a href="https://cloud.tencent.com/document/api/377/33185">创建通知</a>。通知组ID，即为用户组ID集合。</p>
     */
    public String [] getNotificationUserGroupIds() {
        return this.NotificationUserGroupIds;
    }

    /**
     * Set <p>此参数已不再生效，请使用<a href="https://cloud.tencent.com/document/api/377/33185">创建通知</a>。通知组ID，即为用户组ID集合。</p>
     * @param NotificationUserGroupIds <p>此参数已不再生效，请使用<a href="https://cloud.tencent.com/document/api/377/33185">创建通知</a>。通知组ID，即为用户组ID集合。</p>
     */
    public void setNotificationUserGroupIds(String [] NotificationUserGroupIds) {
        this.NotificationUserGroupIds = NotificationUserGroupIds;
    }

    public ModifyScalingPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyScalingPolicyRequest(ModifyScalingPolicyRequest source) {
        if (source.AutoScalingPolicyId != null) {
            this.AutoScalingPolicyId = new String(source.AutoScalingPolicyId);
        }
        if (source.ScalingPolicyName != null) {
            this.ScalingPolicyName = new String(source.ScalingPolicyName);
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
        this.setParamSimple(map, prefix + "AutoScalingPolicyId", this.AutoScalingPolicyId);
        this.setParamSimple(map, prefix + "ScalingPolicyName", this.ScalingPolicyName);
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


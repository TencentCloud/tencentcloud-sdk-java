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

public class ModifyScalingPolicyRequest  extends AbstractModel{

    /**
    * 告警策略ID。
    */
    @SerializedName("AutoScalingPolicyId")
    @Expose
    private String AutoScalingPolicyId;

    /**
    * 告警策略名称。
    */
    @SerializedName("ScalingPolicyName")
    @Expose
    private String ScalingPolicyName;

    /**
    * 告警触发后，期望实例数修改方式。取值 ：<br><li>CHANGE_IN_CAPACITY：增加或减少若干期望实例数</li><li>EXACT_CAPACITY：调整至指定期望实例数</li> <li>PERCENT_CHANGE_IN_CAPACITY：按百分比调整期望实例数</li>
    */
    @SerializedName("AdjustmentType")
    @Expose
    private String AdjustmentType;

    /**
    * 告警触发后，期望实例数的调整值。取值：<br><li>当 AdjustmentType 为 CHANGE_IN_CAPACITY 时，AdjustmentValue 为正数表示告警触发后增加实例，为负数表示告警触发后减少实例 </li> <li> 当 AdjustmentType 为 EXACT_CAPACITY 时，AdjustmentValue 的值即为告警触发后新的期望实例数，需要大于或等于0 </li> <li> 当 AdjustmentType 为 PERCENT_CHANGE_IN_CAPACITY 时，AdjusmentValue 为正数表示告警触发后按百分比增加实例，为负数表示告警触发后按百分比减少实例，单位是：%。
    */
    @SerializedName("AdjustmentValue")
    @Expose
    private Integer AdjustmentValue;

    /**
    * 冷却时间，单位为秒。
    */
    @SerializedName("Cooldown")
    @Expose
    private Integer Cooldown;

    /**
    * 告警监控指标。
    */
    @SerializedName("MetricAlarm")
    @Expose
    private MetricAlarm MetricAlarm;

    /**
    * 通知组ID，即为用户组ID集合，用户组ID可以通过[DescribeUserGroup](https://cloud.tencent.com/document/api/378/4404)查询。
如果需要清空通知用户组，需要在列表中传入特定字符串 "NULL"。
    */
    @SerializedName("NotificationUserGroupIds")
    @Expose
    private String [] NotificationUserGroupIds;

    /**
     * 获取告警策略ID。
     * @return AutoScalingPolicyId 告警策略ID。
     */
    public String getAutoScalingPolicyId() {
        return this.AutoScalingPolicyId;
    }

    /**
     * 设置告警策略ID。
     * @param AutoScalingPolicyId 告警策略ID。
     */
    public void setAutoScalingPolicyId(String AutoScalingPolicyId) {
        this.AutoScalingPolicyId = AutoScalingPolicyId;
    }

    /**
     * 获取告警策略名称。
     * @return ScalingPolicyName 告警策略名称。
     */
    public String getScalingPolicyName() {
        return this.ScalingPolicyName;
    }

    /**
     * 设置告警策略名称。
     * @param ScalingPolicyName 告警策略名称。
     */
    public void setScalingPolicyName(String ScalingPolicyName) {
        this.ScalingPolicyName = ScalingPolicyName;
    }

    /**
     * 获取告警触发后，期望实例数修改方式。取值 ：<br><li>CHANGE_IN_CAPACITY：增加或减少若干期望实例数</li><li>EXACT_CAPACITY：调整至指定期望实例数</li> <li>PERCENT_CHANGE_IN_CAPACITY：按百分比调整期望实例数</li>
     * @return AdjustmentType 告警触发后，期望实例数修改方式。取值 ：<br><li>CHANGE_IN_CAPACITY：增加或减少若干期望实例数</li><li>EXACT_CAPACITY：调整至指定期望实例数</li> <li>PERCENT_CHANGE_IN_CAPACITY：按百分比调整期望实例数</li>
     */
    public String getAdjustmentType() {
        return this.AdjustmentType;
    }

    /**
     * 设置告警触发后，期望实例数修改方式。取值 ：<br><li>CHANGE_IN_CAPACITY：增加或减少若干期望实例数</li><li>EXACT_CAPACITY：调整至指定期望实例数</li> <li>PERCENT_CHANGE_IN_CAPACITY：按百分比调整期望实例数</li>
     * @param AdjustmentType 告警触发后，期望实例数修改方式。取值 ：<br><li>CHANGE_IN_CAPACITY：增加或减少若干期望实例数</li><li>EXACT_CAPACITY：调整至指定期望实例数</li> <li>PERCENT_CHANGE_IN_CAPACITY：按百分比调整期望实例数</li>
     */
    public void setAdjustmentType(String AdjustmentType) {
        this.AdjustmentType = AdjustmentType;
    }

    /**
     * 获取告警触发后，期望实例数的调整值。取值：<br><li>当 AdjustmentType 为 CHANGE_IN_CAPACITY 时，AdjustmentValue 为正数表示告警触发后增加实例，为负数表示告警触发后减少实例 </li> <li> 当 AdjustmentType 为 EXACT_CAPACITY 时，AdjustmentValue 的值即为告警触发后新的期望实例数，需要大于或等于0 </li> <li> 当 AdjustmentType 为 PERCENT_CHANGE_IN_CAPACITY 时，AdjusmentValue 为正数表示告警触发后按百分比增加实例，为负数表示告警触发后按百分比减少实例，单位是：%。
     * @return AdjustmentValue 告警触发后，期望实例数的调整值。取值：<br><li>当 AdjustmentType 为 CHANGE_IN_CAPACITY 时，AdjustmentValue 为正数表示告警触发后增加实例，为负数表示告警触发后减少实例 </li> <li> 当 AdjustmentType 为 EXACT_CAPACITY 时，AdjustmentValue 的值即为告警触发后新的期望实例数，需要大于或等于0 </li> <li> 当 AdjustmentType 为 PERCENT_CHANGE_IN_CAPACITY 时，AdjusmentValue 为正数表示告警触发后按百分比增加实例，为负数表示告警触发后按百分比减少实例，单位是：%。
     */
    public Integer getAdjustmentValue() {
        return this.AdjustmentValue;
    }

    /**
     * 设置告警触发后，期望实例数的调整值。取值：<br><li>当 AdjustmentType 为 CHANGE_IN_CAPACITY 时，AdjustmentValue 为正数表示告警触发后增加实例，为负数表示告警触发后减少实例 </li> <li> 当 AdjustmentType 为 EXACT_CAPACITY 时，AdjustmentValue 的值即为告警触发后新的期望实例数，需要大于或等于0 </li> <li> 当 AdjustmentType 为 PERCENT_CHANGE_IN_CAPACITY 时，AdjusmentValue 为正数表示告警触发后按百分比增加实例，为负数表示告警触发后按百分比减少实例，单位是：%。
     * @param AdjustmentValue 告警触发后，期望实例数的调整值。取值：<br><li>当 AdjustmentType 为 CHANGE_IN_CAPACITY 时，AdjustmentValue 为正数表示告警触发后增加实例，为负数表示告警触发后减少实例 </li> <li> 当 AdjustmentType 为 EXACT_CAPACITY 时，AdjustmentValue 的值即为告警触发后新的期望实例数，需要大于或等于0 </li> <li> 当 AdjustmentType 为 PERCENT_CHANGE_IN_CAPACITY 时，AdjusmentValue 为正数表示告警触发后按百分比增加实例，为负数表示告警触发后按百分比减少实例，单位是：%。
     */
    public void setAdjustmentValue(Integer AdjustmentValue) {
        this.AdjustmentValue = AdjustmentValue;
    }

    /**
     * 获取冷却时间，单位为秒。
     * @return Cooldown 冷却时间，单位为秒。
     */
    public Integer getCooldown() {
        return this.Cooldown;
    }

    /**
     * 设置冷却时间，单位为秒。
     * @param Cooldown 冷却时间，单位为秒。
     */
    public void setCooldown(Integer Cooldown) {
        this.Cooldown = Cooldown;
    }

    /**
     * 获取告警监控指标。
     * @return MetricAlarm 告警监控指标。
     */
    public MetricAlarm getMetricAlarm() {
        return this.MetricAlarm;
    }

    /**
     * 设置告警监控指标。
     * @param MetricAlarm 告警监控指标。
     */
    public void setMetricAlarm(MetricAlarm MetricAlarm) {
        this.MetricAlarm = MetricAlarm;
    }

    /**
     * 获取通知组ID，即为用户组ID集合，用户组ID可以通过[DescribeUserGroup](https://cloud.tencent.com/document/api/378/4404)查询。
如果需要清空通知用户组，需要在列表中传入特定字符串 "NULL"。
     * @return NotificationUserGroupIds 通知组ID，即为用户组ID集合，用户组ID可以通过[DescribeUserGroup](https://cloud.tencent.com/document/api/378/4404)查询。
如果需要清空通知用户组，需要在列表中传入特定字符串 "NULL"。
     */
    public String [] getNotificationUserGroupIds() {
        return this.NotificationUserGroupIds;
    }

    /**
     * 设置通知组ID，即为用户组ID集合，用户组ID可以通过[DescribeUserGroup](https://cloud.tencent.com/document/api/378/4404)查询。
如果需要清空通知用户组，需要在列表中传入特定字符串 "NULL"。
     * @param NotificationUserGroupIds 通知组ID，即为用户组ID集合，用户组ID可以通过[DescribeUserGroup](https://cloud.tencent.com/document/api/378/4404)查询。
如果需要清空通知用户组，需要在列表中传入特定字符串 "NULL"。
     */
    public void setNotificationUserGroupIds(String [] NotificationUserGroupIds) {
        this.NotificationUserGroupIds = NotificationUserGroupIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingPolicyId", this.AutoScalingPolicyId);
        this.setParamSimple(map, prefix + "ScalingPolicyName", this.ScalingPolicyName);
        this.setParamSimple(map, prefix + "AdjustmentType", this.AdjustmentType);
        this.setParamSimple(map, prefix + "AdjustmentValue", this.AdjustmentValue);
        this.setParamSimple(map, prefix + "Cooldown", this.Cooldown);
        this.setParamObj(map, prefix + "MetricAlarm.", this.MetricAlarm);
        this.setParamArraySimple(map, prefix + "NotificationUserGroupIds.", this.NotificationUserGroupIds);

    }
}


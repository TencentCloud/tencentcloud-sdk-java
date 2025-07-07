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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdatePrometheusAlertGroupRequest extends AbstractModel {

    /**
    * prometheus实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 告警分组ID，形如alert-xxxx
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 告警分组名称，不能与其他告警分组重名
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 告警分组状态：
2 -- 启用
3 -- 禁用
不为空时会覆盖 `Rules`字段下所有告警规则状态
    */
    @SerializedName("GroupState")
    @Expose
    private Long GroupState;

    /**
    * 云监控告警通知模板ID列表，形如Consumer-xxxx或notice-xxxx
    */
    @SerializedName("AMPReceivers")
    @Expose
    private String [] AMPReceivers;

    /**
    * 自定义告警通知模板
    */
    @SerializedName("CustomReceiver")
    @Expose
    private PrometheusAlertCustomReceiver CustomReceiver;

    /**
    * 告警通知周期（收敛时间），为空默认1h
    */
    @SerializedName("RepeatInterval")
    @Expose
    private String RepeatInterval;

    /**
    * 要创建的告警规则列表
    */
    @SerializedName("Rules")
    @Expose
    private PrometheusAlertGroupRuleSet [] Rules;

    /**
     * Get prometheus实例ID 
     * @return InstanceId prometheus实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set prometheus实例ID
     * @param InstanceId prometheus实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 告警分组ID，形如alert-xxxx 
     * @return GroupId 告警分组ID，形如alert-xxxx
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 告警分组ID，形如alert-xxxx
     * @param GroupId 告警分组ID，形如alert-xxxx
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 告警分组名称，不能与其他告警分组重名 
     * @return GroupName 告警分组名称，不能与其他告警分组重名
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 告警分组名称，不能与其他告警分组重名
     * @param GroupName 告警分组名称，不能与其他告警分组重名
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 告警分组状态：
2 -- 启用
3 -- 禁用
不为空时会覆盖 `Rules`字段下所有告警规则状态 
     * @return GroupState 告警分组状态：
2 -- 启用
3 -- 禁用
不为空时会覆盖 `Rules`字段下所有告警规则状态
     */
    public Long getGroupState() {
        return this.GroupState;
    }

    /**
     * Set 告警分组状态：
2 -- 启用
3 -- 禁用
不为空时会覆盖 `Rules`字段下所有告警规则状态
     * @param GroupState 告警分组状态：
2 -- 启用
3 -- 禁用
不为空时会覆盖 `Rules`字段下所有告警规则状态
     */
    public void setGroupState(Long GroupState) {
        this.GroupState = GroupState;
    }

    /**
     * Get 云监控告警通知模板ID列表，形如Consumer-xxxx或notice-xxxx 
     * @return AMPReceivers 云监控告警通知模板ID列表，形如Consumer-xxxx或notice-xxxx
     */
    public String [] getAMPReceivers() {
        return this.AMPReceivers;
    }

    /**
     * Set 云监控告警通知模板ID列表，形如Consumer-xxxx或notice-xxxx
     * @param AMPReceivers 云监控告警通知模板ID列表，形如Consumer-xxxx或notice-xxxx
     */
    public void setAMPReceivers(String [] AMPReceivers) {
        this.AMPReceivers = AMPReceivers;
    }

    /**
     * Get 自定义告警通知模板 
     * @return CustomReceiver 自定义告警通知模板
     */
    public PrometheusAlertCustomReceiver getCustomReceiver() {
        return this.CustomReceiver;
    }

    /**
     * Set 自定义告警通知模板
     * @param CustomReceiver 自定义告警通知模板
     */
    public void setCustomReceiver(PrometheusAlertCustomReceiver CustomReceiver) {
        this.CustomReceiver = CustomReceiver;
    }

    /**
     * Get 告警通知周期（收敛时间），为空默认1h 
     * @return RepeatInterval 告警通知周期（收敛时间），为空默认1h
     */
    public String getRepeatInterval() {
        return this.RepeatInterval;
    }

    /**
     * Set 告警通知周期（收敛时间），为空默认1h
     * @param RepeatInterval 告警通知周期（收敛时间），为空默认1h
     */
    public void setRepeatInterval(String RepeatInterval) {
        this.RepeatInterval = RepeatInterval;
    }

    /**
     * Get 要创建的告警规则列表 
     * @return Rules 要创建的告警规则列表
     */
    public PrometheusAlertGroupRuleSet [] getRules() {
        return this.Rules;
    }

    /**
     * Set 要创建的告警规则列表
     * @param Rules 要创建的告警规则列表
     */
    public void setRules(PrometheusAlertGroupRuleSet [] Rules) {
        this.Rules = Rules;
    }

    public UpdatePrometheusAlertGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdatePrometheusAlertGroupRequest(UpdatePrometheusAlertGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupState != null) {
            this.GroupState = new Long(source.GroupState);
        }
        if (source.AMPReceivers != null) {
            this.AMPReceivers = new String[source.AMPReceivers.length];
            for (int i = 0; i < source.AMPReceivers.length; i++) {
                this.AMPReceivers[i] = new String(source.AMPReceivers[i]);
            }
        }
        if (source.CustomReceiver != null) {
            this.CustomReceiver = new PrometheusAlertCustomReceiver(source.CustomReceiver);
        }
        if (source.RepeatInterval != null) {
            this.RepeatInterval = new String(source.RepeatInterval);
        }
        if (source.Rules != null) {
            this.Rules = new PrometheusAlertGroupRuleSet[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new PrometheusAlertGroupRuleSet(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupState", this.GroupState);
        this.setParamArraySimple(map, prefix + "AMPReceivers.", this.AMPReceivers);
        this.setParamObj(map, prefix + "CustomReceiver.", this.CustomReceiver);
        this.setParamSimple(map, prefix + "RepeatInterval", this.RepeatInterval);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}


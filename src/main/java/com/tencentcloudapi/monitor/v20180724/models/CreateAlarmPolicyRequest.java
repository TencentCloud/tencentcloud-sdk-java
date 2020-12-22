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

public class CreateAlarmPolicyRequest extends AbstractModel{

    /**
    * 固定值，为"monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 策略名称，不超过20字符
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 监控类型 MT_QCE=云产品监控
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * 告警策略类型，由 DescribeAllNamespaces 获得，例如 cvm_device
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 备注，不超过100字符，仅支持中英文、数字、下划线、-
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否启用 0=停用 1=启用，可不传 默认为1
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 项目 Id -1=无项目 0=默认项目，可不传 默认为-1
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 指标触发条件
    */
    @SerializedName("Condition")
    @Expose
    private AlarmPolicyCondition Condition;

    /**
    * 事件触发条件
    */
    @SerializedName("EventCondition")
    @Expose
    private AlarmPolicyEventCondition EventCondition;

    /**
    * 通知规则 Id 列表，由 DescribeAlarmNotices 获得
    */
    @SerializedName("NoticeIds")
    @Expose
    private String [] NoticeIds;

    /**
    * 触发任务列表
    */
    @SerializedName("TriggerTasks")
    @Expose
    private AlarmPolicyTriggerTask [] TriggerTasks;

    /**
     * Get 固定值，为"monitor" 
     * @return Module 固定值，为"monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 固定值，为"monitor"
     * @param Module 固定值，为"monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 策略名称，不超过20字符 
     * @return PolicyName 策略名称，不超过20字符
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名称，不超过20字符
     * @param PolicyName 策略名称，不超过20字符
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 监控类型 MT_QCE=云产品监控 
     * @return MonitorType 监控类型 MT_QCE=云产品监控
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 监控类型 MT_QCE=云产品监控
     * @param MonitorType 监控类型 MT_QCE=云产品监控
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get 告警策略类型，由 DescribeAllNamespaces 获得，例如 cvm_device 
     * @return Namespace 告警策略类型，由 DescribeAllNamespaces 获得，例如 cvm_device
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 告警策略类型，由 DescribeAllNamespaces 获得，例如 cvm_device
     * @param Namespace 告警策略类型，由 DescribeAllNamespaces 获得，例如 cvm_device
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 备注，不超过100字符，仅支持中英文、数字、下划线、- 
     * @return Remark 备注，不超过100字符，仅支持中英文、数字、下划线、-
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注，不超过100字符，仅支持中英文、数字、下划线、-
     * @param Remark 备注，不超过100字符，仅支持中英文、数字、下划线、-
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 是否启用 0=停用 1=启用，可不传 默认为1 
     * @return Enable 是否启用 0=停用 1=启用，可不传 默认为1
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用 0=停用 1=启用，可不传 默认为1
     * @param Enable 是否启用 0=停用 1=启用，可不传 默认为1
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 项目 Id -1=无项目 0=默认项目，可不传 默认为-1 
     * @return ProjectId 项目 Id -1=无项目 0=默认项目，可不传 默认为-1
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 Id -1=无项目 0=默认项目，可不传 默认为-1
     * @param ProjectId 项目 Id -1=无项目 0=默认项目，可不传 默认为-1
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 指标触发条件 
     * @return Condition 指标触发条件
     */
    public AlarmPolicyCondition getCondition() {
        return this.Condition;
    }

    /**
     * Set 指标触发条件
     * @param Condition 指标触发条件
     */
    public void setCondition(AlarmPolicyCondition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 事件触发条件 
     * @return EventCondition 事件触发条件
     */
    public AlarmPolicyEventCondition getEventCondition() {
        return this.EventCondition;
    }

    /**
     * Set 事件触发条件
     * @param EventCondition 事件触发条件
     */
    public void setEventCondition(AlarmPolicyEventCondition EventCondition) {
        this.EventCondition = EventCondition;
    }

    /**
     * Get 通知规则 Id 列表，由 DescribeAlarmNotices 获得 
     * @return NoticeIds 通知规则 Id 列表，由 DescribeAlarmNotices 获得
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set 通知规则 Id 列表，由 DescribeAlarmNotices 获得
     * @param NoticeIds 通知规则 Id 列表，由 DescribeAlarmNotices 获得
     */
    public void setNoticeIds(String [] NoticeIds) {
        this.NoticeIds = NoticeIds;
    }

    /**
     * Get 触发任务列表 
     * @return TriggerTasks 触发任务列表
     */
    public AlarmPolicyTriggerTask [] getTriggerTasks() {
        return this.TriggerTasks;
    }

    /**
     * Set 触发任务列表
     * @param TriggerTasks 触发任务列表
     */
    public void setTriggerTasks(AlarmPolicyTriggerTask [] TriggerTasks) {
        this.TriggerTasks = TriggerTasks;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamObj(map, prefix + "EventCondition.", this.EventCondition);
        this.setParamArraySimple(map, prefix + "NoticeIds.", this.NoticeIds);
        this.setParamArrayObj(map, prefix + "TriggerTasks.", this.TriggerTasks);

    }
}


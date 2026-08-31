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

public class CreateAlarmPolicyRequest extends AbstractModel {

    /**
    * <p>固定值，为&quot;monitor&quot;</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>策略名称，不超过60字符</p>
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * <p>监控类型 MT_QCE=云产品监控</p>
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * <p>告警策略类型，由 <a href="https://cloud.tencent.com/document/product/248/48683">DescribeAllNamespaces</a> 获得。对于云产品监控，取接口出参的 QceNamespacesNew.N.Id，例如 cvm_device</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>备注，不超过100字符，仅支持中英文、数字、下划线、-</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>是否启用 0=停用 1=启用，可不传 默认为1</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>项目 Id，对于区分项目的产品必须传入非 -1 的值。 -1=无项目 0=默认项目，如不传 默认为 -1。支持的项目 Id 可以在控制台 <a href="https://console.cloud.tencent.com/project">账号中心-项目管理</a> 中查看。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>触发条件模板 Id，该参数与 Condition 参数二选一。如果策略绑定触发条件模板，则传该参数；否则不传该参数，而是传 Condition 参数。触发条件模板 Id 可以从 <a href="https://cloud.tencent.com/document/api/248/70250">DescribeConditionsTemplateList</a> 接口获取。</p>
    */
    @SerializedName("ConditionTemplateId")
    @Expose
    private Long ConditionTemplateId;

    /**
    * <p>指标触发条件，支持的指标可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p>
    */
    @SerializedName("Condition")
    @Expose
    private AlarmPolicyCondition Condition;

    /**
    * <p>事件触发条件，支持的事件可以从 <a href="https://cloud.tencent.com/document/product/248/51284">DescribeAlarmEvents</a> 查询。</p>
    */
    @SerializedName("EventCondition")
    @Expose
    private AlarmPolicyEventCondition EventCondition;

    /**
    * <p>通知规则 Id 列表，由 <a href="https://cloud.tencent.com/document/product/248/51280">DescribeAlarmNotices</a> 获得</p>
    */
    @SerializedName("NoticeIds")
    @Expose
    private String [] NoticeIds;

    /**
    * <p>触发任务列表</p>
    */
    @SerializedName("TriggerTasks")
    @Expose
    private AlarmPolicyTriggerTask [] TriggerTasks;

    /**
    * <p>全局过滤条件</p>
    */
    @SerializedName("Filter")
    @Expose
    private AlarmPolicyFilter Filter;

    /**
    * <p>聚合维度列表，指定按哪些维度 key 来做 group by</p>
    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

    /**
    * <p>是否绑定全部对象。如果是的话，不需要再传filter或者调用BindPolicyObject，0=否，1=是，默认为否</p><p>取值范围：[0, 1]</p><p>默认值：0</p><p>不是所有策略类型都支持绑定全部对象</p>
    */
    @SerializedName("IsBindAll")
    @Expose
    private Long IsBindAll;

    /**
    * <p>模板绑定的标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>日志告警信息</p>
    */
    @SerializedName("LogAlarmReqInfo")
    @Expose
    private LogAlarmReq LogAlarmReqInfo;

    /**
    * <p>告警分级通知规则配置</p>
    */
    @SerializedName("HierarchicalNotices")
    @Expose
    private AlarmHierarchicalNotice [] HierarchicalNotices;

    /**
    * <p>迁移策略专用字段，0-走鉴权逻辑，1-跳过鉴权逻辑</p>
    */
    @SerializedName("MigrateFlag")
    @Expose
    private Long MigrateFlag;

    /**
    * <p>事件配置的告警</p>
    */
    @SerializedName("EbSubject")
    @Expose
    private String EbSubject;

    /**
    * <p>附加告警内容</p>
    */
    @SerializedName("AdditionalAlarmContent")
    @Expose
    private String AdditionalAlarmContent;

    /**
    * <p>通知模板绑定信息</p>
    */
    @SerializedName("NoticeContentTmplBindInfos")
    @Expose
    private NoticeContentTmplBindInfo [] NoticeContentTmplBindInfos;

    /**
     * Get <p>固定值，为&quot;monitor&quot;</p> 
     * @return Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>固定值，为&quot;monitor&quot;</p>
     * @param Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>策略名称，不超过60字符</p> 
     * @return PolicyName <p>策略名称，不超过60字符</p>
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set <p>策略名称，不超过60字符</p>
     * @param PolicyName <p>策略名称，不超过60字符</p>
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get <p>监控类型 MT_QCE=云产品监控</p> 
     * @return MonitorType <p>监控类型 MT_QCE=云产品监控</p>
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set <p>监控类型 MT_QCE=云产品监控</p>
     * @param MonitorType <p>监控类型 MT_QCE=云产品监控</p>
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get <p>告警策略类型，由 <a href="https://cloud.tencent.com/document/product/248/48683">DescribeAllNamespaces</a> 获得。对于云产品监控，取接口出参的 QceNamespacesNew.N.Id，例如 cvm_device</p> 
     * @return Namespace <p>告警策略类型，由 <a href="https://cloud.tencent.com/document/product/248/48683">DescribeAllNamespaces</a> 获得。对于云产品监控，取接口出参的 QceNamespacesNew.N.Id，例如 cvm_device</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>告警策略类型，由 <a href="https://cloud.tencent.com/document/product/248/48683">DescribeAllNamespaces</a> 获得。对于云产品监控，取接口出参的 QceNamespacesNew.N.Id，例如 cvm_device</p>
     * @param Namespace <p>告警策略类型，由 <a href="https://cloud.tencent.com/document/product/248/48683">DescribeAllNamespaces</a> 获得。对于云产品监控，取接口出参的 QceNamespacesNew.N.Id，例如 cvm_device</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>备注，不超过100字符，仅支持中英文、数字、下划线、-</p> 
     * @return Remark <p>备注，不超过100字符，仅支持中英文、数字、下划线、-</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注，不超过100字符，仅支持中英文、数字、下划线、-</p>
     * @param Remark <p>备注，不超过100字符，仅支持中英文、数字、下划线、-</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>是否启用 0=停用 1=启用，可不传 默认为1</p> 
     * @return Enable <p>是否启用 0=停用 1=启用，可不传 默认为1</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否启用 0=停用 1=启用，可不传 默认为1</p>
     * @param Enable <p>是否启用 0=停用 1=启用，可不传 默认为1</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>项目 Id，对于区分项目的产品必须传入非 -1 的值。 -1=无项目 0=默认项目，如不传 默认为 -1。支持的项目 Id 可以在控制台 <a href="https://console.cloud.tencent.com/project">账号中心-项目管理</a> 中查看。</p> 
     * @return ProjectId <p>项目 Id，对于区分项目的产品必须传入非 -1 的值。 -1=无项目 0=默认项目，如不传 默认为 -1。支持的项目 Id 可以在控制台 <a href="https://console.cloud.tencent.com/project">账号中心-项目管理</a> 中查看。</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目 Id，对于区分项目的产品必须传入非 -1 的值。 -1=无项目 0=默认项目，如不传 默认为 -1。支持的项目 Id 可以在控制台 <a href="https://console.cloud.tencent.com/project">账号中心-项目管理</a> 中查看。</p>
     * @param ProjectId <p>项目 Id，对于区分项目的产品必须传入非 -1 的值。 -1=无项目 0=默认项目，如不传 默认为 -1。支持的项目 Id 可以在控制台 <a href="https://console.cloud.tencent.com/project">账号中心-项目管理</a> 中查看。</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>触发条件模板 Id，该参数与 Condition 参数二选一。如果策略绑定触发条件模板，则传该参数；否则不传该参数，而是传 Condition 参数。触发条件模板 Id 可以从 <a href="https://cloud.tencent.com/document/api/248/70250">DescribeConditionsTemplateList</a> 接口获取。</p> 
     * @return ConditionTemplateId <p>触发条件模板 Id，该参数与 Condition 参数二选一。如果策略绑定触发条件模板，则传该参数；否则不传该参数，而是传 Condition 参数。触发条件模板 Id 可以从 <a href="https://cloud.tencent.com/document/api/248/70250">DescribeConditionsTemplateList</a> 接口获取。</p>
     */
    public Long getConditionTemplateId() {
        return this.ConditionTemplateId;
    }

    /**
     * Set <p>触发条件模板 Id，该参数与 Condition 参数二选一。如果策略绑定触发条件模板，则传该参数；否则不传该参数，而是传 Condition 参数。触发条件模板 Id 可以从 <a href="https://cloud.tencent.com/document/api/248/70250">DescribeConditionsTemplateList</a> 接口获取。</p>
     * @param ConditionTemplateId <p>触发条件模板 Id，该参数与 Condition 参数二选一。如果策略绑定触发条件模板，则传该参数；否则不传该参数，而是传 Condition 参数。触发条件模板 Id 可以从 <a href="https://cloud.tencent.com/document/api/248/70250">DescribeConditionsTemplateList</a> 接口获取。</p>
     */
    public void setConditionTemplateId(Long ConditionTemplateId) {
        this.ConditionTemplateId = ConditionTemplateId;
    }

    /**
     * Get <p>指标触发条件，支持的指标可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p> 
     * @return Condition <p>指标触发条件，支持的指标可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p>
     */
    public AlarmPolicyCondition getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>指标触发条件，支持的指标可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p>
     * @param Condition <p>指标触发条件，支持的指标可以从 <a href="https://cloud.tencent.com/document/product/248/51283">DescribeAlarmMetrics</a> 查询。</p>
     */
    public void setCondition(AlarmPolicyCondition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>事件触发条件，支持的事件可以从 <a href="https://cloud.tencent.com/document/product/248/51284">DescribeAlarmEvents</a> 查询。</p> 
     * @return EventCondition <p>事件触发条件，支持的事件可以从 <a href="https://cloud.tencent.com/document/product/248/51284">DescribeAlarmEvents</a> 查询。</p>
     */
    public AlarmPolicyEventCondition getEventCondition() {
        return this.EventCondition;
    }

    /**
     * Set <p>事件触发条件，支持的事件可以从 <a href="https://cloud.tencent.com/document/product/248/51284">DescribeAlarmEvents</a> 查询。</p>
     * @param EventCondition <p>事件触发条件，支持的事件可以从 <a href="https://cloud.tencent.com/document/product/248/51284">DescribeAlarmEvents</a> 查询。</p>
     */
    public void setEventCondition(AlarmPolicyEventCondition EventCondition) {
        this.EventCondition = EventCondition;
    }

    /**
     * Get <p>通知规则 Id 列表，由 <a href="https://cloud.tencent.com/document/product/248/51280">DescribeAlarmNotices</a> 获得</p> 
     * @return NoticeIds <p>通知规则 Id 列表，由 <a href="https://cloud.tencent.com/document/product/248/51280">DescribeAlarmNotices</a> 获得</p>
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set <p>通知规则 Id 列表，由 <a href="https://cloud.tencent.com/document/product/248/51280">DescribeAlarmNotices</a> 获得</p>
     * @param NoticeIds <p>通知规则 Id 列表，由 <a href="https://cloud.tencent.com/document/product/248/51280">DescribeAlarmNotices</a> 获得</p>
     */
    public void setNoticeIds(String [] NoticeIds) {
        this.NoticeIds = NoticeIds;
    }

    /**
     * Get <p>触发任务列表</p> 
     * @return TriggerTasks <p>触发任务列表</p>
     */
    public AlarmPolicyTriggerTask [] getTriggerTasks() {
        return this.TriggerTasks;
    }

    /**
     * Set <p>触发任务列表</p>
     * @param TriggerTasks <p>触发任务列表</p>
     */
    public void setTriggerTasks(AlarmPolicyTriggerTask [] TriggerTasks) {
        this.TriggerTasks = TriggerTasks;
    }

    /**
     * Get <p>全局过滤条件</p> 
     * @return Filter <p>全局过滤条件</p>
     */
    public AlarmPolicyFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>全局过滤条件</p>
     * @param Filter <p>全局过滤条件</p>
     */
    public void setFilter(AlarmPolicyFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>聚合维度列表，指定按哪些维度 key 来做 group by</p> 
     * @return GroupBy <p>聚合维度列表，指定按哪些维度 key 来做 group by</p>
     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set <p>聚合维度列表，指定按哪些维度 key 来做 group by</p>
     * @param GroupBy <p>聚合维度列表，指定按哪些维度 key 来做 group by</p>
     */
    public void setGroupBy(String [] GroupBy) {
        this.GroupBy = GroupBy;
    }

    /**
     * Get <p>是否绑定全部对象。如果是的话，不需要再传filter或者调用BindPolicyObject，0=否，1=是，默认为否</p><p>取值范围：[0, 1]</p><p>默认值：0</p><p>不是所有策略类型都支持绑定全部对象</p> 
     * @return IsBindAll <p>是否绑定全部对象。如果是的话，不需要再传filter或者调用BindPolicyObject，0=否，1=是，默认为否</p><p>取值范围：[0, 1]</p><p>默认值：0</p><p>不是所有策略类型都支持绑定全部对象</p>
     */
    public Long getIsBindAll() {
        return this.IsBindAll;
    }

    /**
     * Set <p>是否绑定全部对象。如果是的话，不需要再传filter或者调用BindPolicyObject，0=否，1=是，默认为否</p><p>取值范围：[0, 1]</p><p>默认值：0</p><p>不是所有策略类型都支持绑定全部对象</p>
     * @param IsBindAll <p>是否绑定全部对象。如果是的话，不需要再传filter或者调用BindPolicyObject，0=否，1=是，默认为否</p><p>取值范围：[0, 1]</p><p>默认值：0</p><p>不是所有策略类型都支持绑定全部对象</p>
     */
    public void setIsBindAll(Long IsBindAll) {
        this.IsBindAll = IsBindAll;
    }

    /**
     * Get <p>模板绑定的标签</p> 
     * @return Tags <p>模板绑定的标签</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>模板绑定的标签</p>
     * @param Tags <p>模板绑定的标签</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>日志告警信息</p> 
     * @return LogAlarmReqInfo <p>日志告警信息</p>
     */
    public LogAlarmReq getLogAlarmReqInfo() {
        return this.LogAlarmReqInfo;
    }

    /**
     * Set <p>日志告警信息</p>
     * @param LogAlarmReqInfo <p>日志告警信息</p>
     */
    public void setLogAlarmReqInfo(LogAlarmReq LogAlarmReqInfo) {
        this.LogAlarmReqInfo = LogAlarmReqInfo;
    }

    /**
     * Get <p>告警分级通知规则配置</p> 
     * @return HierarchicalNotices <p>告警分级通知规则配置</p>
     */
    public AlarmHierarchicalNotice [] getHierarchicalNotices() {
        return this.HierarchicalNotices;
    }

    /**
     * Set <p>告警分级通知规则配置</p>
     * @param HierarchicalNotices <p>告警分级通知规则配置</p>
     */
    public void setHierarchicalNotices(AlarmHierarchicalNotice [] HierarchicalNotices) {
        this.HierarchicalNotices = HierarchicalNotices;
    }

    /**
     * Get <p>迁移策略专用字段，0-走鉴权逻辑，1-跳过鉴权逻辑</p> 
     * @return MigrateFlag <p>迁移策略专用字段，0-走鉴权逻辑，1-跳过鉴权逻辑</p>
     */
    public Long getMigrateFlag() {
        return this.MigrateFlag;
    }

    /**
     * Set <p>迁移策略专用字段，0-走鉴权逻辑，1-跳过鉴权逻辑</p>
     * @param MigrateFlag <p>迁移策略专用字段，0-走鉴权逻辑，1-跳过鉴权逻辑</p>
     */
    public void setMigrateFlag(Long MigrateFlag) {
        this.MigrateFlag = MigrateFlag;
    }

    /**
     * Get <p>事件配置的告警</p> 
     * @return EbSubject <p>事件配置的告警</p>
     */
    public String getEbSubject() {
        return this.EbSubject;
    }

    /**
     * Set <p>事件配置的告警</p>
     * @param EbSubject <p>事件配置的告警</p>
     */
    public void setEbSubject(String EbSubject) {
        this.EbSubject = EbSubject;
    }

    /**
     * Get <p>附加告警内容</p> 
     * @return AdditionalAlarmContent <p>附加告警内容</p>
     */
    public String getAdditionalAlarmContent() {
        return this.AdditionalAlarmContent;
    }

    /**
     * Set <p>附加告警内容</p>
     * @param AdditionalAlarmContent <p>附加告警内容</p>
     */
    public void setAdditionalAlarmContent(String AdditionalAlarmContent) {
        this.AdditionalAlarmContent = AdditionalAlarmContent;
    }

    /**
     * Get <p>通知模板绑定信息</p> 
     * @return NoticeContentTmplBindInfos <p>通知模板绑定信息</p>
     */
    public NoticeContentTmplBindInfo [] getNoticeContentTmplBindInfos() {
        return this.NoticeContentTmplBindInfos;
    }

    /**
     * Set <p>通知模板绑定信息</p>
     * @param NoticeContentTmplBindInfos <p>通知模板绑定信息</p>
     */
    public void setNoticeContentTmplBindInfos(NoticeContentTmplBindInfo [] NoticeContentTmplBindInfos) {
        this.NoticeContentTmplBindInfos = NoticeContentTmplBindInfos;
    }

    public CreateAlarmPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlarmPolicyRequest(CreateAlarmPolicyRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new String(source.MonitorType);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ConditionTemplateId != null) {
            this.ConditionTemplateId = new Long(source.ConditionTemplateId);
        }
        if (source.Condition != null) {
            this.Condition = new AlarmPolicyCondition(source.Condition);
        }
        if (source.EventCondition != null) {
            this.EventCondition = new AlarmPolicyEventCondition(source.EventCondition);
        }
        if (source.NoticeIds != null) {
            this.NoticeIds = new String[source.NoticeIds.length];
            for (int i = 0; i < source.NoticeIds.length; i++) {
                this.NoticeIds[i] = new String(source.NoticeIds[i]);
            }
        }
        if (source.TriggerTasks != null) {
            this.TriggerTasks = new AlarmPolicyTriggerTask[source.TriggerTasks.length];
            for (int i = 0; i < source.TriggerTasks.length; i++) {
                this.TriggerTasks[i] = new AlarmPolicyTriggerTask(source.TriggerTasks[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new AlarmPolicyFilter(source.Filter);
        }
        if (source.GroupBy != null) {
            this.GroupBy = new String[source.GroupBy.length];
            for (int i = 0; i < source.GroupBy.length; i++) {
                this.GroupBy[i] = new String(source.GroupBy[i]);
            }
        }
        if (source.IsBindAll != null) {
            this.IsBindAll = new Long(source.IsBindAll);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.LogAlarmReqInfo != null) {
            this.LogAlarmReqInfo = new LogAlarmReq(source.LogAlarmReqInfo);
        }
        if (source.HierarchicalNotices != null) {
            this.HierarchicalNotices = new AlarmHierarchicalNotice[source.HierarchicalNotices.length];
            for (int i = 0; i < source.HierarchicalNotices.length; i++) {
                this.HierarchicalNotices[i] = new AlarmHierarchicalNotice(source.HierarchicalNotices[i]);
            }
        }
        if (source.MigrateFlag != null) {
            this.MigrateFlag = new Long(source.MigrateFlag);
        }
        if (source.EbSubject != null) {
            this.EbSubject = new String(source.EbSubject);
        }
        if (source.AdditionalAlarmContent != null) {
            this.AdditionalAlarmContent = new String(source.AdditionalAlarmContent);
        }
        if (source.NoticeContentTmplBindInfos != null) {
            this.NoticeContentTmplBindInfos = new NoticeContentTmplBindInfo[source.NoticeContentTmplBindInfos.length];
            for (int i = 0; i < source.NoticeContentTmplBindInfos.length; i++) {
                this.NoticeContentTmplBindInfos[i] = new NoticeContentTmplBindInfo(source.NoticeContentTmplBindInfos[i]);
            }
        }
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
        this.setParamSimple(map, prefix + "ConditionTemplateId", this.ConditionTemplateId);
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamObj(map, prefix + "EventCondition.", this.EventCondition);
        this.setParamArraySimple(map, prefix + "NoticeIds.", this.NoticeIds);
        this.setParamArrayObj(map, prefix + "TriggerTasks.", this.TriggerTasks);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamArraySimple(map, prefix + "GroupBy.", this.GroupBy);
        this.setParamSimple(map, prefix + "IsBindAll", this.IsBindAll);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "LogAlarmReqInfo.", this.LogAlarmReqInfo);
        this.setParamArrayObj(map, prefix + "HierarchicalNotices.", this.HierarchicalNotices);
        this.setParamSimple(map, prefix + "MigrateFlag", this.MigrateFlag);
        this.setParamSimple(map, prefix + "EbSubject", this.EbSubject);
        this.setParamSimple(map, prefix + "AdditionalAlarmContent", this.AdditionalAlarmContent);
        this.setParamArrayObj(map, prefix + "NoticeContentTmplBindInfos.", this.NoticeContentTmplBindInfos);

    }
}


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

public class ModifyAlarmPolicyConditionRequest extends AbstractModel {

    /**
    * <p>模块名，固定值 monitor</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>告警策略 ID</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>触发条件模板 Id，可不传</p>
    */
    @SerializedName("ConditionTemplateId")
    @Expose
    private Long ConditionTemplateId;

    /**
    * <p>指标触发条件</p>
    */
    @SerializedName("Condition")
    @Expose
    private AlarmPolicyCondition Condition;

    /**
    * <p>事件触发条件</p>
    */
    @SerializedName("EventCondition")
    @Expose
    private AlarmPolicyEventCondition EventCondition;

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
    * <p>日志告警创建请求参数信息</p>
    */
    @SerializedName("LogAlarmReqInfo")
    @Expose
    private LogAlarmReq LogAlarmReqInfo;

    /**
    * <p>模板id，专供prom使用</p>
    */
    @SerializedName("NoticeIds")
    @Expose
    private String [] NoticeIds;

    /**
    * <p>启停状态，0=停用，1=启用</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>专供prom策略名称</p>
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * <p>事件配置的告警</p>
    */
    @SerializedName("EbSubject")
    @Expose
    private String EbSubject;

    /**
     * Get <p>模块名，固定值 monitor</p> 
     * @return Module <p>模块名，固定值 monitor</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>模块名，固定值 monitor</p>
     * @param Module <p>模块名，固定值 monitor</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>告警策略 ID</p> 
     * @return PolicyId <p>告警策略 ID</p>
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>告警策略 ID</p>
     * @param PolicyId <p>告警策略 ID</p>
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>触发条件模板 Id，可不传</p> 
     * @return ConditionTemplateId <p>触发条件模板 Id，可不传</p>
     */
    public Long getConditionTemplateId() {
        return this.ConditionTemplateId;
    }

    /**
     * Set <p>触发条件模板 Id，可不传</p>
     * @param ConditionTemplateId <p>触发条件模板 Id，可不传</p>
     */
    public void setConditionTemplateId(Long ConditionTemplateId) {
        this.ConditionTemplateId = ConditionTemplateId;
    }

    /**
     * Get <p>指标触发条件</p> 
     * @return Condition <p>指标触发条件</p>
     */
    public AlarmPolicyCondition getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>指标触发条件</p>
     * @param Condition <p>指标触发条件</p>
     */
    public void setCondition(AlarmPolicyCondition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>事件触发条件</p> 
     * @return EventCondition <p>事件触发条件</p>
     */
    public AlarmPolicyEventCondition getEventCondition() {
        return this.EventCondition;
    }

    /**
     * Set <p>事件触发条件</p>
     * @param EventCondition <p>事件触发条件</p>
     */
    public void setEventCondition(AlarmPolicyEventCondition EventCondition) {
        this.EventCondition = EventCondition;
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
     * Get <p>日志告警创建请求参数信息</p> 
     * @return LogAlarmReqInfo <p>日志告警创建请求参数信息</p>
     */
    public LogAlarmReq getLogAlarmReqInfo() {
        return this.LogAlarmReqInfo;
    }

    /**
     * Set <p>日志告警创建请求参数信息</p>
     * @param LogAlarmReqInfo <p>日志告警创建请求参数信息</p>
     */
    public void setLogAlarmReqInfo(LogAlarmReq LogAlarmReqInfo) {
        this.LogAlarmReqInfo = LogAlarmReqInfo;
    }

    /**
     * Get <p>模板id，专供prom使用</p> 
     * @return NoticeIds <p>模板id，专供prom使用</p>
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set <p>模板id，专供prom使用</p>
     * @param NoticeIds <p>模板id，专供prom使用</p>
     */
    public void setNoticeIds(String [] NoticeIds) {
        this.NoticeIds = NoticeIds;
    }

    /**
     * Get <p>启停状态，0=停用，1=启用</p> 
     * @return Enable <p>启停状态，0=停用，1=启用</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>启停状态，0=停用，1=启用</p>
     * @param Enable <p>启停状态，0=停用，1=启用</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>专供prom策略名称</p> 
     * @return PolicyName <p>专供prom策略名称</p>
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set <p>专供prom策略名称</p>
     * @param PolicyName <p>专供prom策略名称</p>
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
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

    public ModifyAlarmPolicyConditionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmPolicyConditionRequest(ModifyAlarmPolicyConditionRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
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
        if (source.Filter != null) {
            this.Filter = new AlarmPolicyFilter(source.Filter);
        }
        if (source.GroupBy != null) {
            this.GroupBy = new String[source.GroupBy.length];
            for (int i = 0; i < source.GroupBy.length; i++) {
                this.GroupBy[i] = new String(source.GroupBy[i]);
            }
        }
        if (source.LogAlarmReqInfo != null) {
            this.LogAlarmReqInfo = new LogAlarmReq(source.LogAlarmReqInfo);
        }
        if (source.NoticeIds != null) {
            this.NoticeIds = new String[source.NoticeIds.length];
            for (int i = 0; i < source.NoticeIds.length; i++) {
                this.NoticeIds[i] = new String(source.NoticeIds[i]);
            }
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.EbSubject != null) {
            this.EbSubject = new String(source.EbSubject);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "ConditionTemplateId", this.ConditionTemplateId);
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamObj(map, prefix + "EventCondition.", this.EventCondition);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamArraySimple(map, prefix + "GroupBy.", this.GroupBy);
        this.setParamObj(map, prefix + "LogAlarmReqInfo.", this.LogAlarmReqInfo);
        this.setParamArraySimple(map, prefix + "NoticeIds.", this.NoticeIds);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "EbSubject", this.EbSubject);

    }
}


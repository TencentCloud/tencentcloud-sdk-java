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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAlarmRuleRequest extends AbstractModel{

    /**
    * 告警id
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * 规则名字
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 监控类型,1.task、2.workflow、3.project、4.baseline（默认为1.任务）
    */
    @SerializedName("MonitorType")
    @Expose
    private Long MonitorType;

    /**
    * 监控对象
    */
    @SerializedName("MonitorObjectIds")
    @Expose
    private String [] MonitorObjectIds;

    /**
    * 告警类型，1.失败告警、2.超时告警、3.成功告警、4.基线破线、5.基线预警、6.基线任务失败（默认1.失败告警）
    */
    @SerializedName("AlarmTypes")
    @Expose
    private String [] AlarmTypes;

    /**
    * 告警级别，1.普通、2.重要、3.紧急（默认1.普通）
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * 告警方式,1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群；告警方式code列表（默认1.邮件）
    */
    @SerializedName("AlarmWays")
    @Expose
    private String [] AlarmWays;

    /**
    * 告警接收人类型：1.指定人员，2.任务责任人，3.值班表（默认1.指定人员）
    */
    @SerializedName("AlarmRecipientType")
    @Expose
    private Long AlarmRecipientType;

    /**
    * 告警接收人
    */
    @SerializedName("AlarmRecipients")
    @Expose
    private String [] AlarmRecipients;

    /**
    * 告警接收人ID
    */
    @SerializedName("AlarmRecipientIds")
    @Expose
    private String [] AlarmRecipientIds;

    /**
    * 扩展信息, 1.预计运行耗时（默认），2.预计完成时间，3.预计调度时间，4.周期内未完成；取值类型：1.指定指，2.历史均值（默认1.指定指）
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get 告警id 
     * @return AlarmId 告警id
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set 告警id
     * @param AlarmId 告警id
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get 规则名字 
     * @return RuleName 规则名字
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名字
     * @param RuleName 规则名字
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 监控类型,1.task、2.workflow、3.project、4.baseline（默认为1.任务） 
     * @return MonitorType 监控类型,1.task、2.workflow、3.project、4.baseline（默认为1.任务）
     */
    public Long getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 监控类型,1.task、2.workflow、3.project、4.baseline（默认为1.任务）
     * @param MonitorType 监控类型,1.task、2.workflow、3.project、4.baseline（默认为1.任务）
     */
    public void setMonitorType(Long MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get 监控对象 
     * @return MonitorObjectIds 监控对象
     */
    public String [] getMonitorObjectIds() {
        return this.MonitorObjectIds;
    }

    /**
     * Set 监控对象
     * @param MonitorObjectIds 监控对象
     */
    public void setMonitorObjectIds(String [] MonitorObjectIds) {
        this.MonitorObjectIds = MonitorObjectIds;
    }

    /**
     * Get 告警类型，1.失败告警、2.超时告警、3.成功告警、4.基线破线、5.基线预警、6.基线任务失败（默认1.失败告警） 
     * @return AlarmTypes 告警类型，1.失败告警、2.超时告警、3.成功告警、4.基线破线、5.基线预警、6.基线任务失败（默认1.失败告警）
     */
    public String [] getAlarmTypes() {
        return this.AlarmTypes;
    }

    /**
     * Set 告警类型，1.失败告警、2.超时告警、3.成功告警、4.基线破线、5.基线预警、6.基线任务失败（默认1.失败告警）
     * @param AlarmTypes 告警类型，1.失败告警、2.超时告警、3.成功告警、4.基线破线、5.基线预警、6.基线任务失败（默认1.失败告警）
     */
    public void setAlarmTypes(String [] AlarmTypes) {
        this.AlarmTypes = AlarmTypes;
    }

    /**
     * Get 告警级别，1.普通、2.重要、3.紧急（默认1.普通） 
     * @return AlarmLevel 告警级别，1.普通、2.重要、3.紧急（默认1.普通）
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 告警级别，1.普通、2.重要、3.紧急（默认1.普通）
     * @param AlarmLevel 告警级别，1.普通、2.重要、3.紧急（默认1.普通）
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get 告警方式,1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群；告警方式code列表（默认1.邮件） 
     * @return AlarmWays 告警方式,1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群；告警方式code列表（默认1.邮件）
     */
    public String [] getAlarmWays() {
        return this.AlarmWays;
    }

    /**
     * Set 告警方式,1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群；告警方式code列表（默认1.邮件）
     * @param AlarmWays 告警方式,1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群；告警方式code列表（默认1.邮件）
     */
    public void setAlarmWays(String [] AlarmWays) {
        this.AlarmWays = AlarmWays;
    }

    /**
     * Get 告警接收人类型：1.指定人员，2.任务责任人，3.值班表（默认1.指定人员） 
     * @return AlarmRecipientType 告警接收人类型：1.指定人员，2.任务责任人，3.值班表（默认1.指定人员）
     */
    public Long getAlarmRecipientType() {
        return this.AlarmRecipientType;
    }

    /**
     * Set 告警接收人类型：1.指定人员，2.任务责任人，3.值班表（默认1.指定人员）
     * @param AlarmRecipientType 告警接收人类型：1.指定人员，2.任务责任人，3.值班表（默认1.指定人员）
     */
    public void setAlarmRecipientType(Long AlarmRecipientType) {
        this.AlarmRecipientType = AlarmRecipientType;
    }

    /**
     * Get 告警接收人 
     * @return AlarmRecipients 告警接收人
     */
    public String [] getAlarmRecipients() {
        return this.AlarmRecipients;
    }

    /**
     * Set 告警接收人
     * @param AlarmRecipients 告警接收人
     */
    public void setAlarmRecipients(String [] AlarmRecipients) {
        this.AlarmRecipients = AlarmRecipients;
    }

    /**
     * Get 告警接收人ID 
     * @return AlarmRecipientIds 告警接收人ID
     */
    public String [] getAlarmRecipientIds() {
        return this.AlarmRecipientIds;
    }

    /**
     * Set 告警接收人ID
     * @param AlarmRecipientIds 告警接收人ID
     */
    public void setAlarmRecipientIds(String [] AlarmRecipientIds) {
        this.AlarmRecipientIds = AlarmRecipientIds;
    }

    /**
     * Get 扩展信息, 1.预计运行耗时（默认），2.预计完成时间，3.预计调度时间，4.周期内未完成；取值类型：1.指定指，2.历史均值（默认1.指定指） 
     * @return ExtInfo 扩展信息, 1.预计运行耗时（默认），2.预计完成时间，3.预计调度时间，4.周期内未完成；取值类型：1.指定指，2.历史均值（默认1.指定指）
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 扩展信息, 1.预计运行耗时（默认），2.预计完成时间，3.预计调度时间，4.周期内未完成；取值类型：1.指定指，2.历史均值（默认1.指定指）
     * @param ExtInfo 扩展信息, 1.预计运行耗时（默认），2.预计完成时间，3.预计调度时间，4.周期内未完成；取值类型：1.指定指，2.历史均值（默认1.指定指）
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public ModifyAlarmRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmRuleRequest(ModifyAlarmRuleRequest source) {
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new Long(source.MonitorType);
        }
        if (source.MonitorObjectIds != null) {
            this.MonitorObjectIds = new String[source.MonitorObjectIds.length];
            for (int i = 0; i < source.MonitorObjectIds.length; i++) {
                this.MonitorObjectIds[i] = new String(source.MonitorObjectIds[i]);
            }
        }
        if (source.AlarmTypes != null) {
            this.AlarmTypes = new String[source.AlarmTypes.length];
            for (int i = 0; i < source.AlarmTypes.length; i++) {
                this.AlarmTypes[i] = new String(source.AlarmTypes[i]);
            }
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmWays != null) {
            this.AlarmWays = new String[source.AlarmWays.length];
            for (int i = 0; i < source.AlarmWays.length; i++) {
                this.AlarmWays[i] = new String(source.AlarmWays[i]);
            }
        }
        if (source.AlarmRecipientType != null) {
            this.AlarmRecipientType = new Long(source.AlarmRecipientType);
        }
        if (source.AlarmRecipients != null) {
            this.AlarmRecipients = new String[source.AlarmRecipients.length];
            for (int i = 0; i < source.AlarmRecipients.length; i++) {
                this.AlarmRecipients[i] = new String(source.AlarmRecipients[i]);
            }
        }
        if (source.AlarmRecipientIds != null) {
            this.AlarmRecipientIds = new String[source.AlarmRecipientIds.length];
            for (int i = 0; i < source.AlarmRecipientIds.length; i++) {
                this.AlarmRecipientIds[i] = new String(source.AlarmRecipientIds[i]);
            }
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamArraySimple(map, prefix + "MonitorObjectIds.", this.MonitorObjectIds);
        this.setParamArraySimple(map, prefix + "AlarmTypes.", this.AlarmTypes);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamArraySimple(map, prefix + "AlarmWays.", this.AlarmWays);
        this.setParamSimple(map, prefix + "AlarmRecipientType", this.AlarmRecipientType);
        this.setParamArraySimple(map, prefix + "AlarmRecipients.", this.AlarmRecipients);
        this.setParamArraySimple(map, prefix + "AlarmRecipientIds.", this.AlarmRecipientIds);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}


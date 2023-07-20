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

public class CreateAlarmRuleRequest extends AbstractModel{

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 创建人名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * 创建人uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 规则名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 监控类型,1.task、2.workflow、3.project、4.baseline（默认为1.任务）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorType")
    @Expose
    private Long MonitorType;

    /**
    * 监控对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorObjectIds")
    @Expose
    private String [] MonitorObjectIds;

    /**
    * 告警类型，1.失败告警、2.超时告警、3.成功告警、4.基线破线、5.基线预警、6.基线任务失败（默认1.失败告警）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmTypes")
    @Expose
    private String [] AlarmTypes;

    /**
    * 告警级别，1.普通、2.重要、3.紧急（默认1.普通）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * 告警方式,1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群；告警方式code列表（默认1.邮件）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmWays")
    @Expose
    private String [] AlarmWays;

    /**
    * 告警接收人类型：1.指定人员，2.任务责任人，3.值班表（默认1.指定人员）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmRecipientType")
    @Expose
    private Long AlarmRecipientType;

    /**
    * 告警接收人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmRecipients")
    @Expose
    private String [] AlarmRecipients;

    /**
    * 告警接收人ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmRecipientIds")
    @Expose
    private String [] AlarmRecipientIds;

    /**
    * 扩展信息, 1.预计运行耗时（默认），2.预计完成时间，3.预计调度时间，4.周期内未完成；取值类型：1.指定指，2.历史均值（默认1.指定指）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get 项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 创建人名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorId 创建人名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set 创建人名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorId 创建人名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }

    /**
     * Get 创建人uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator 创建人uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建人uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator 创建人uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 规则名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName 规则名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName 规则名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 监控类型,1.task、2.workflow、3.project、4.baseline（默认为1.任务）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorType 监控类型,1.task、2.workflow、3.project、4.baseline（默认为1.任务）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 监控类型,1.task、2.workflow、3.project、4.baseline（默认为1.任务）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorType 监控类型,1.task、2.workflow、3.project、4.baseline（默认为1.任务）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorType(Long MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get 监控对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorObjectIds 监控对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMonitorObjectIds() {
        return this.MonitorObjectIds;
    }

    /**
     * Set 监控对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorObjectIds 监控对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorObjectIds(String [] MonitorObjectIds) {
        this.MonitorObjectIds = MonitorObjectIds;
    }

    /**
     * Get 告警类型，1.失败告警、2.超时告警、3.成功告警、4.基线破线、5.基线预警、6.基线任务失败（默认1.失败告警）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmTypes 告警类型，1.失败告警、2.超时告警、3.成功告警、4.基线破线、5.基线预警、6.基线任务失败（默认1.失败告警）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAlarmTypes() {
        return this.AlarmTypes;
    }

    /**
     * Set 告警类型，1.失败告警、2.超时告警、3.成功告警、4.基线破线、5.基线预警、6.基线任务失败（默认1.失败告警）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmTypes 告警类型，1.失败告警、2.超时告警、3.成功告警、4.基线破线、5.基线预警、6.基线任务失败（默认1.失败告警）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmTypes(String [] AlarmTypes) {
        this.AlarmTypes = AlarmTypes;
    }

    /**
     * Get 告警级别，1.普通、2.重要、3.紧急（默认1.普通）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmLevel 告警级别，1.普通、2.重要、3.紧急（默认1.普通）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 告警级别，1.普通、2.重要、3.紧急（默认1.普通）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmLevel 告警级别，1.普通、2.重要、3.紧急（默认1.普通）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get 告警方式,1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群；告警方式code列表（默认1.邮件）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmWays 告警方式,1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群；告警方式code列表（默认1.邮件）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAlarmWays() {
        return this.AlarmWays;
    }

    /**
     * Set 告警方式,1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群；告警方式code列表（默认1.邮件）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmWays 告警方式,1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群；告警方式code列表（默认1.邮件）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmWays(String [] AlarmWays) {
        this.AlarmWays = AlarmWays;
    }

    /**
     * Get 告警接收人类型：1.指定人员，2.任务责任人，3.值班表（默认1.指定人员）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmRecipientType 告警接收人类型：1.指定人员，2.任务责任人，3.值班表（默认1.指定人员）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAlarmRecipientType() {
        return this.AlarmRecipientType;
    }

    /**
     * Set 告警接收人类型：1.指定人员，2.任务责任人，3.值班表（默认1.指定人员）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmRecipientType 告警接收人类型：1.指定人员，2.任务责任人，3.值班表（默认1.指定人员）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmRecipientType(Long AlarmRecipientType) {
        this.AlarmRecipientType = AlarmRecipientType;
    }

    /**
     * Get 告警接收人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmRecipients 告警接收人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAlarmRecipients() {
        return this.AlarmRecipients;
    }

    /**
     * Set 告警接收人
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmRecipients 告警接收人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmRecipients(String [] AlarmRecipients) {
        this.AlarmRecipients = AlarmRecipients;
    }

    /**
     * Get 告警接收人ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmRecipientIds 告警接收人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAlarmRecipientIds() {
        return this.AlarmRecipientIds;
    }

    /**
     * Set 告警接收人ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmRecipientIds 告警接收人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmRecipientIds(String [] AlarmRecipientIds) {
        this.AlarmRecipientIds = AlarmRecipientIds;
    }

    /**
     * Get 扩展信息, 1.预计运行耗时（默认），2.预计完成时间，3.预计调度时间，4.周期内未完成；取值类型：1.指定指，2.历史均值（默认1.指定指）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtInfo 扩展信息, 1.预计运行耗时（默认），2.预计完成时间，3.预计调度时间，4.周期内未完成；取值类型：1.指定指，2.历史均值（默认1.指定指）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 扩展信息, 1.预计运行耗时（默认），2.预计完成时间，3.预计调度时间，4.周期内未完成；取值类型：1.指定指，2.历史均值（默认1.指定指）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtInfo 扩展信息, 1.预计运行耗时（默认），2.预计完成时间，3.预计调度时间，4.周期内未完成；取值类型：1.指定指，2.历史均值（默认1.指定指）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public CreateAlarmRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlarmRuleRequest(CreateAlarmRuleRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CreatorId != null) {
            this.CreatorId = new String(source.CreatorId);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
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
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreatorId", this.CreatorId);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
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


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

public class CreateBaselineRequest extends AbstractModel{

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 基线名称
    */
    @SerializedName("BaselineName")
    @Expose
    private String BaselineName;

    /**
    * D或者H；分别表示天基线和小时基线
    */
    @SerializedName("BaselineType")
    @Expose
    private String BaselineType;

    /**
    * 创建人id
    */
    @SerializedName("CreateUin")
    @Expose
    private String CreateUin;

    /**
    * 创建人名称
    */
    @SerializedName("CreateName")
    @Expose
    private String CreateName;

    /**
    * 基线负责人id
    */
    @SerializedName("InChargeUin")
    @Expose
    private String InChargeUin;

    /**
    * 基线负责人名称
    */
    @SerializedName("InChargeName")
    @Expose
    private String InChargeName;

    /**
    * 保障任务
    */
    @SerializedName("PromiseTasks")
    @Expose
    private BaselineTaskInfo [] PromiseTasks;

    /**
    * 保障时间
    */
    @SerializedName("PromiseTime")
    @Expose
    private String PromiseTime;

    /**
    * 告警余量/分钟
    */
    @SerializedName("WarningMargin")
    @Expose
    private Long WarningMargin;

    /**
    * 1
    */
    @SerializedName("IsNewAlarm")
    @Expose
    private Boolean IsNewAlarm;

    /**
    * 现有告警规则信息
    */
    @SerializedName("AlarmRuleDto")
    @Expose
    private AlarmRuleDto AlarmRuleDto;

    /**
    * 新增告警规则描述
    */
    @SerializedName("BaselineCreateAlarmRuleRequest")
    @Expose
    private CreateAlarmRuleRequest BaselineCreateAlarmRuleRequest;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 基线名称 
     * @return BaselineName 基线名称
     */
    public String getBaselineName() {
        return this.BaselineName;
    }

    /**
     * Set 基线名称
     * @param BaselineName 基线名称
     */
    public void setBaselineName(String BaselineName) {
        this.BaselineName = BaselineName;
    }

    /**
     * Get D或者H；分别表示天基线和小时基线 
     * @return BaselineType D或者H；分别表示天基线和小时基线
     */
    public String getBaselineType() {
        return this.BaselineType;
    }

    /**
     * Set D或者H；分别表示天基线和小时基线
     * @param BaselineType D或者H；分别表示天基线和小时基线
     */
    public void setBaselineType(String BaselineType) {
        this.BaselineType = BaselineType;
    }

    /**
     * Get 创建人id 
     * @return CreateUin 创建人id
     */
    public String getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set 创建人id
     * @param CreateUin 创建人id
     */
    public void setCreateUin(String CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get 创建人名称 
     * @return CreateName 创建人名称
     */
    public String getCreateName() {
        return this.CreateName;
    }

    /**
     * Set 创建人名称
     * @param CreateName 创建人名称
     */
    public void setCreateName(String CreateName) {
        this.CreateName = CreateName;
    }

    /**
     * Get 基线负责人id 
     * @return InChargeUin 基线负责人id
     */
    public String getInChargeUin() {
        return this.InChargeUin;
    }

    /**
     * Set 基线负责人id
     * @param InChargeUin 基线负责人id
     */
    public void setInChargeUin(String InChargeUin) {
        this.InChargeUin = InChargeUin;
    }

    /**
     * Get 基线负责人名称 
     * @return InChargeName 基线负责人名称
     */
    public String getInChargeName() {
        return this.InChargeName;
    }

    /**
     * Set 基线负责人名称
     * @param InChargeName 基线负责人名称
     */
    public void setInChargeName(String InChargeName) {
        this.InChargeName = InChargeName;
    }

    /**
     * Get 保障任务 
     * @return PromiseTasks 保障任务
     */
    public BaselineTaskInfo [] getPromiseTasks() {
        return this.PromiseTasks;
    }

    /**
     * Set 保障任务
     * @param PromiseTasks 保障任务
     */
    public void setPromiseTasks(BaselineTaskInfo [] PromiseTasks) {
        this.PromiseTasks = PromiseTasks;
    }

    /**
     * Get 保障时间 
     * @return PromiseTime 保障时间
     */
    public String getPromiseTime() {
        return this.PromiseTime;
    }

    /**
     * Set 保障时间
     * @param PromiseTime 保障时间
     */
    public void setPromiseTime(String PromiseTime) {
        this.PromiseTime = PromiseTime;
    }

    /**
     * Get 告警余量/分钟 
     * @return WarningMargin 告警余量/分钟
     */
    public Long getWarningMargin() {
        return this.WarningMargin;
    }

    /**
     * Set 告警余量/分钟
     * @param WarningMargin 告警余量/分钟
     */
    public void setWarningMargin(Long WarningMargin) {
        this.WarningMargin = WarningMargin;
    }

    /**
     * Get 1 
     * @return IsNewAlarm 1
     */
    public Boolean getIsNewAlarm() {
        return this.IsNewAlarm;
    }

    /**
     * Set 1
     * @param IsNewAlarm 1
     */
    public void setIsNewAlarm(Boolean IsNewAlarm) {
        this.IsNewAlarm = IsNewAlarm;
    }

    /**
     * Get 现有告警规则信息 
     * @return AlarmRuleDto 现有告警规则信息
     */
    public AlarmRuleDto getAlarmRuleDto() {
        return this.AlarmRuleDto;
    }

    /**
     * Set 现有告警规则信息
     * @param AlarmRuleDto 现有告警规则信息
     */
    public void setAlarmRuleDto(AlarmRuleDto AlarmRuleDto) {
        this.AlarmRuleDto = AlarmRuleDto;
    }

    /**
     * Get 新增告警规则描述 
     * @return BaselineCreateAlarmRuleRequest 新增告警规则描述
     */
    public CreateAlarmRuleRequest getBaselineCreateAlarmRuleRequest() {
        return this.BaselineCreateAlarmRuleRequest;
    }

    /**
     * Set 新增告警规则描述
     * @param BaselineCreateAlarmRuleRequest 新增告警规则描述
     */
    public void setBaselineCreateAlarmRuleRequest(CreateAlarmRuleRequest BaselineCreateAlarmRuleRequest) {
        this.BaselineCreateAlarmRuleRequest = BaselineCreateAlarmRuleRequest;
    }

    public CreateBaselineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBaselineRequest(CreateBaselineRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.BaselineName != null) {
            this.BaselineName = new String(source.BaselineName);
        }
        if (source.BaselineType != null) {
            this.BaselineType = new String(source.BaselineType);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new String(source.CreateUin);
        }
        if (source.CreateName != null) {
            this.CreateName = new String(source.CreateName);
        }
        if (source.InChargeUin != null) {
            this.InChargeUin = new String(source.InChargeUin);
        }
        if (source.InChargeName != null) {
            this.InChargeName = new String(source.InChargeName);
        }
        if (source.PromiseTasks != null) {
            this.PromiseTasks = new BaselineTaskInfo[source.PromiseTasks.length];
            for (int i = 0; i < source.PromiseTasks.length; i++) {
                this.PromiseTasks[i] = new BaselineTaskInfo(source.PromiseTasks[i]);
            }
        }
        if (source.PromiseTime != null) {
            this.PromiseTime = new String(source.PromiseTime);
        }
        if (source.WarningMargin != null) {
            this.WarningMargin = new Long(source.WarningMargin);
        }
        if (source.IsNewAlarm != null) {
            this.IsNewAlarm = new Boolean(source.IsNewAlarm);
        }
        if (source.AlarmRuleDto != null) {
            this.AlarmRuleDto = new AlarmRuleDto(source.AlarmRuleDto);
        }
        if (source.BaselineCreateAlarmRuleRequest != null) {
            this.BaselineCreateAlarmRuleRequest = new CreateAlarmRuleRequest(source.BaselineCreateAlarmRuleRequest);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "BaselineName", this.BaselineName);
        this.setParamSimple(map, prefix + "BaselineType", this.BaselineType);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "CreateName", this.CreateName);
        this.setParamSimple(map, prefix + "InChargeUin", this.InChargeUin);
        this.setParamSimple(map, prefix + "InChargeName", this.InChargeName);
        this.setParamArrayObj(map, prefix + "PromiseTasks.", this.PromiseTasks);
        this.setParamSimple(map, prefix + "PromiseTime", this.PromiseTime);
        this.setParamSimple(map, prefix + "WarningMargin", this.WarningMargin);
        this.setParamSimple(map, prefix + "IsNewAlarm", this.IsNewAlarm);
        this.setParamObj(map, prefix + "AlarmRuleDto.", this.AlarmRuleDto);
        this.setParamObj(map, prefix + "BaselineCreateAlarmRuleRequest.", this.BaselineCreateAlarmRuleRequest);

    }
}


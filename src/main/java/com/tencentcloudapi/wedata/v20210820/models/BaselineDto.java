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

public class BaselineDto extends AbstractModel{

    /**
    * 基线id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 基线名称
    */
    @SerializedName("BaselineName")
    @Expose
    private String BaselineName;

    /**
    * 天基线/小时基线
    */
    @SerializedName("BaselineType")
    @Expose
    private String BaselineType;

    /**
    * 基线创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 保障任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PromiseTasks")
    @Expose
    private BaselineTaskDto [] PromiseTasks;

    /**
    * 告警规则
    */
    @SerializedName("AlarmRule")
    @Expose
    private AlarmRuleDto AlarmRule;

    /**
    * 基线状态，待提交, 运行中，停止
    */
    @SerializedName("BaselineStatus")
    @Expose
    private String BaselineStatus;

    /**
    * 最新基线实例运行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestBaselineInstanceStatus")
    @Expose
    private String LatestBaselineInstanceStatus;

    /**
    * 预警余量/单位分钟
    */
    @SerializedName("WarningMargin")
    @Expose
    private Long WarningMargin;

    /**
    * 承诺时间
    */
    @SerializedName("PromiseTime")
    @Expose
    private String PromiseTime;

    /**
    * 责任人uin
    */
    @SerializedName("InChargeUin")
    @Expose
    private String InChargeUin;

    /**
    * 责任人名称
    */
    @SerializedName("InChargeName")
    @Expose
    private String InChargeName;

    /**
    * 当前用户uin
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * 当前用户名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 主账号uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 租户id
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 基线id 
     * @return Id 基线id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 基线id
     * @param Id 基线id
     */
    public void setId(Long Id) {
        this.Id = Id;
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
     * Get 天基线/小时基线 
     * @return BaselineType 天基线/小时基线
     */
    public String getBaselineType() {
        return this.BaselineType;
    }

    /**
     * Set 天基线/小时基线
     * @param BaselineType 天基线/小时基线
     */
    public void setBaselineType(String BaselineType) {
        this.BaselineType = BaselineType;
    }

    /**
     * Get 基线创建时间 
     * @return CreateTime 基线创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 基线创建时间
     * @param CreateTime 基线创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 保障任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PromiseTasks 保障任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineTaskDto [] getPromiseTasks() {
        return this.PromiseTasks;
    }

    /**
     * Set 保障任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param PromiseTasks 保障任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPromiseTasks(BaselineTaskDto [] PromiseTasks) {
        this.PromiseTasks = PromiseTasks;
    }

    /**
     * Get 告警规则 
     * @return AlarmRule 告警规则
     */
    public AlarmRuleDto getAlarmRule() {
        return this.AlarmRule;
    }

    /**
     * Set 告警规则
     * @param AlarmRule 告警规则
     */
    public void setAlarmRule(AlarmRuleDto AlarmRule) {
        this.AlarmRule = AlarmRule;
    }

    /**
     * Get 基线状态，待提交, 运行中，停止 
     * @return BaselineStatus 基线状态，待提交, 运行中，停止
     */
    public String getBaselineStatus() {
        return this.BaselineStatus;
    }

    /**
     * Set 基线状态，待提交, 运行中，停止
     * @param BaselineStatus 基线状态，待提交, 运行中，停止
     */
    public void setBaselineStatus(String BaselineStatus) {
        this.BaselineStatus = BaselineStatus;
    }

    /**
     * Get 最新基线实例运行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestBaselineInstanceStatus 最新基线实例运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestBaselineInstanceStatus() {
        return this.LatestBaselineInstanceStatus;
    }

    /**
     * Set 最新基线实例运行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestBaselineInstanceStatus 最新基线实例运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestBaselineInstanceStatus(String LatestBaselineInstanceStatus) {
        this.LatestBaselineInstanceStatus = LatestBaselineInstanceStatus;
    }

    /**
     * Get 预警余量/单位分钟 
     * @return WarningMargin 预警余量/单位分钟
     */
    public Long getWarningMargin() {
        return this.WarningMargin;
    }

    /**
     * Set 预警余量/单位分钟
     * @param WarningMargin 预警余量/单位分钟
     */
    public void setWarningMargin(Long WarningMargin) {
        this.WarningMargin = WarningMargin;
    }

    /**
     * Get 承诺时间 
     * @return PromiseTime 承诺时间
     */
    public String getPromiseTime() {
        return this.PromiseTime;
    }

    /**
     * Set 承诺时间
     * @param PromiseTime 承诺时间
     */
    public void setPromiseTime(String PromiseTime) {
        this.PromiseTime = PromiseTime;
    }

    /**
     * Get 责任人uin 
     * @return InChargeUin 责任人uin
     */
    public String getInChargeUin() {
        return this.InChargeUin;
    }

    /**
     * Set 责任人uin
     * @param InChargeUin 责任人uin
     */
    public void setInChargeUin(String InChargeUin) {
        this.InChargeUin = InChargeUin;
    }

    /**
     * Get 责任人名称 
     * @return InChargeName 责任人名称
     */
    public String getInChargeName() {
        return this.InChargeName;
    }

    /**
     * Set 责任人名称
     * @param InChargeName 责任人名称
     */
    public void setInChargeName(String InChargeName) {
        this.InChargeName = InChargeName;
    }

    /**
     * Get 当前用户uin 
     * @return UserUin 当前用户uin
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 当前用户uin
     * @param UserUin 当前用户uin
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get 当前用户名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 当前用户名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 当前用户名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 当前用户名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 主账号uin 
     * @return OwnerUin 主账号uin
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 主账号uin
     * @param OwnerUin 主账号uin
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

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
     * Get 租户id 
     * @return AppId 租户id
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 租户id
     * @param AppId 租户id
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public BaselineDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineDto(BaselineDto source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.BaselineName != null) {
            this.BaselineName = new String(source.BaselineName);
        }
        if (source.BaselineType != null) {
            this.BaselineType = new String(source.BaselineType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.PromiseTasks != null) {
            this.PromiseTasks = new BaselineTaskDto[source.PromiseTasks.length];
            for (int i = 0; i < source.PromiseTasks.length; i++) {
                this.PromiseTasks[i] = new BaselineTaskDto(source.PromiseTasks[i]);
            }
        }
        if (source.AlarmRule != null) {
            this.AlarmRule = new AlarmRuleDto(source.AlarmRule);
        }
        if (source.BaselineStatus != null) {
            this.BaselineStatus = new String(source.BaselineStatus);
        }
        if (source.LatestBaselineInstanceStatus != null) {
            this.LatestBaselineInstanceStatus = new String(source.LatestBaselineInstanceStatus);
        }
        if (source.WarningMargin != null) {
            this.WarningMargin = new Long(source.WarningMargin);
        }
        if (source.PromiseTime != null) {
            this.PromiseTime = new String(source.PromiseTime);
        }
        if (source.InChargeUin != null) {
            this.InChargeUin = new String(source.InChargeUin);
        }
        if (source.InChargeName != null) {
            this.InChargeName = new String(source.InChargeName);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "BaselineName", this.BaselineName);
        this.setParamSimple(map, prefix + "BaselineType", this.BaselineType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "PromiseTasks.", this.PromiseTasks);
        this.setParamObj(map, prefix + "AlarmRule.", this.AlarmRule);
        this.setParamSimple(map, prefix + "BaselineStatus", this.BaselineStatus);
        this.setParamSimple(map, prefix + "LatestBaselineInstanceStatus", this.LatestBaselineInstanceStatus);
        this.setParamSimple(map, prefix + "WarningMargin", this.WarningMargin);
        this.setParamSimple(map, prefix + "PromiseTime", this.PromiseTime);
        this.setParamSimple(map, prefix + "InChargeUin", this.InChargeUin);
        this.setParamSimple(map, prefix + "InChargeName", this.InChargeName);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}


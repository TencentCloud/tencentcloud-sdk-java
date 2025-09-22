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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmRuleData extends AbstractModel {

    /**
    * 告警规则id
    */
    @SerializedName("AlarmRuleId")
    @Expose
    private String AlarmRuleId;

    /**
    * 告警规则名称
    */
    @SerializedName("AlarmRuleName")
    @Expose
    private String AlarmRuleName;

    /**
    * 告警规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 监控对象类型,
任务维度监控： 可按照任务/工作流/项目来配置：1.任务、2.工作流、3.项目（默认为1.任务） 
项目维度监控： 项目整体任务波动告警， 7：项目波动监控告警
    */
    @SerializedName("MonitorObjectType")
    @Expose
    private Long MonitorObjectType;

    /**
    * 根据MonitorType 的设置传入不同的业务id，如下1（任务）： MonitorObjectIds为任务id列表2（工作流）： MonitorObjectIds 为工作流id列表(工作流id可从接口ListWorkflows获取)3（项目）： MonitorObjectIds为项目id列表
    */
    @SerializedName("MonitorObjectIds")
    @Expose
    private String [] MonitorObjectIds;

    /**
    * 告警规则监控类型
failure：失败告警 ；overtime：超时告警 success：成功告警; backTrackingOrRerunSuccess: 补录重跑成功告警 backTrackingOrRerunFailure：补录重跑失败告警；
项目波动告警
projectFailureInstanceUpwardFluctuationAlarm： 当天失败实例数向上波动率超过阀值告警；
projectSuccessInstanceDownwardFluctuationAlarm：当天成功实例数向下波动率超过阀值告警；

离线集成任务对账告警：
reconciliationFailure： 离线对账任务失败告警
reconciliationOvertime： 离线对账任务运行超时告警
reconciliationMismatch： 数据对账任务不一致条数超过阀值告警

    */
    @SerializedName("AlarmTypes")
    @Expose
    private String [] AlarmTypes;

    /**
    * 告警规则是否启用
0-- 禁用 1--启用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 告警规则配置信息 成功告警无需配置；失败告警可以配置首次失败告警或者所有重试失败告警；超时配置需要配置超时类型及超时阀值；项目波动告警需要配置波动率及防抖周期配置
    */
    @SerializedName("AlarmRuleDetail")
    @Expose
    private AlarmRuleDetail AlarmRuleDetail;

    /**
    * 告警级别 1.普通、2.重要、3.紧急
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * 告警规则创建人uid
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * bundle 客户端绑定的告警规则:  为空是正常的告警规则，不为空则是对应bundle客户端绑定的规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * bundleId不为空 则表示绑定的bundle客户端名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
    * 告警接收人配置列表
    */
    @SerializedName("AlarmGroups")
    @Expose
    private AlarmGroup [] AlarmGroups;

    /**
     * Get 告警规则id 
     * @return AlarmRuleId 告警规则id
     */
    public String getAlarmRuleId() {
        return this.AlarmRuleId;
    }

    /**
     * Set 告警规则id
     * @param AlarmRuleId 告警规则id
     */
    public void setAlarmRuleId(String AlarmRuleId) {
        this.AlarmRuleId = AlarmRuleId;
    }

    /**
     * Get 告警规则名称 
     * @return AlarmRuleName 告警规则名称
     */
    public String getAlarmRuleName() {
        return this.AlarmRuleName;
    }

    /**
     * Set 告警规则名称
     * @param AlarmRuleName 告警规则名称
     */
    public void setAlarmRuleName(String AlarmRuleName) {
        this.AlarmRuleName = AlarmRuleName;
    }

    /**
     * Get 告警规则描述 
     * @return Description 告警规则描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 告警规则描述
     * @param Description 告警规则描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 监控对象类型,
任务维度监控： 可按照任务/工作流/项目来配置：1.任务、2.工作流、3.项目（默认为1.任务） 
项目维度监控： 项目整体任务波动告警， 7：项目波动监控告警 
     * @return MonitorObjectType 监控对象类型,
任务维度监控： 可按照任务/工作流/项目来配置：1.任务、2.工作流、3.项目（默认为1.任务） 
项目维度监控： 项目整体任务波动告警， 7：项目波动监控告警
     */
    public Long getMonitorObjectType() {
        return this.MonitorObjectType;
    }

    /**
     * Set 监控对象类型,
任务维度监控： 可按照任务/工作流/项目来配置：1.任务、2.工作流、3.项目（默认为1.任务） 
项目维度监控： 项目整体任务波动告警， 7：项目波动监控告警
     * @param MonitorObjectType 监控对象类型,
任务维度监控： 可按照任务/工作流/项目来配置：1.任务、2.工作流、3.项目（默认为1.任务） 
项目维度监控： 项目整体任务波动告警， 7：项目波动监控告警
     */
    public void setMonitorObjectType(Long MonitorObjectType) {
        this.MonitorObjectType = MonitorObjectType;
    }

    /**
     * Get 根据MonitorType 的设置传入不同的业务id，如下1（任务）： MonitorObjectIds为任务id列表2（工作流）： MonitorObjectIds 为工作流id列表(工作流id可从接口ListWorkflows获取)3（项目）： MonitorObjectIds为项目id列表 
     * @return MonitorObjectIds 根据MonitorType 的设置传入不同的业务id，如下1（任务）： MonitorObjectIds为任务id列表2（工作流）： MonitorObjectIds 为工作流id列表(工作流id可从接口ListWorkflows获取)3（项目）： MonitorObjectIds为项目id列表
     */
    public String [] getMonitorObjectIds() {
        return this.MonitorObjectIds;
    }

    /**
     * Set 根据MonitorType 的设置传入不同的业务id，如下1（任务）： MonitorObjectIds为任务id列表2（工作流）： MonitorObjectIds 为工作流id列表(工作流id可从接口ListWorkflows获取)3（项目）： MonitorObjectIds为项目id列表
     * @param MonitorObjectIds 根据MonitorType 的设置传入不同的业务id，如下1（任务）： MonitorObjectIds为任务id列表2（工作流）： MonitorObjectIds 为工作流id列表(工作流id可从接口ListWorkflows获取)3（项目）： MonitorObjectIds为项目id列表
     */
    public void setMonitorObjectIds(String [] MonitorObjectIds) {
        this.MonitorObjectIds = MonitorObjectIds;
    }

    /**
     * Get 告警规则监控类型
failure：失败告警 ；overtime：超时告警 success：成功告警; backTrackingOrRerunSuccess: 补录重跑成功告警 backTrackingOrRerunFailure：补录重跑失败告警；
项目波动告警
projectFailureInstanceUpwardFluctuationAlarm： 当天失败实例数向上波动率超过阀值告警；
projectSuccessInstanceDownwardFluctuationAlarm：当天成功实例数向下波动率超过阀值告警；

离线集成任务对账告警：
reconciliationFailure： 离线对账任务失败告警
reconciliationOvertime： 离线对账任务运行超时告警
reconciliationMismatch： 数据对账任务不一致条数超过阀值告警
 
     * @return AlarmTypes 告警规则监控类型
failure：失败告警 ；overtime：超时告警 success：成功告警; backTrackingOrRerunSuccess: 补录重跑成功告警 backTrackingOrRerunFailure：补录重跑失败告警；
项目波动告警
projectFailureInstanceUpwardFluctuationAlarm： 当天失败实例数向上波动率超过阀值告警；
projectSuccessInstanceDownwardFluctuationAlarm：当天成功实例数向下波动率超过阀值告警；

离线集成任务对账告警：
reconciliationFailure： 离线对账任务失败告警
reconciliationOvertime： 离线对账任务运行超时告警
reconciliationMismatch： 数据对账任务不一致条数超过阀值告警

     */
    public String [] getAlarmTypes() {
        return this.AlarmTypes;
    }

    /**
     * Set 告警规则监控类型
failure：失败告警 ；overtime：超时告警 success：成功告警; backTrackingOrRerunSuccess: 补录重跑成功告警 backTrackingOrRerunFailure：补录重跑失败告警；
项目波动告警
projectFailureInstanceUpwardFluctuationAlarm： 当天失败实例数向上波动率超过阀值告警；
projectSuccessInstanceDownwardFluctuationAlarm：当天成功实例数向下波动率超过阀值告警；

离线集成任务对账告警：
reconciliationFailure： 离线对账任务失败告警
reconciliationOvertime： 离线对账任务运行超时告警
reconciliationMismatch： 数据对账任务不一致条数超过阀值告警

     * @param AlarmTypes 告警规则监控类型
failure：失败告警 ；overtime：超时告警 success：成功告警; backTrackingOrRerunSuccess: 补录重跑成功告警 backTrackingOrRerunFailure：补录重跑失败告警；
项目波动告警
projectFailureInstanceUpwardFluctuationAlarm： 当天失败实例数向上波动率超过阀值告警；
projectSuccessInstanceDownwardFluctuationAlarm：当天成功实例数向下波动率超过阀值告警；

离线集成任务对账告警：
reconciliationFailure： 离线对账任务失败告警
reconciliationOvertime： 离线对账任务运行超时告警
reconciliationMismatch： 数据对账任务不一致条数超过阀值告警

     */
    public void setAlarmTypes(String [] AlarmTypes) {
        this.AlarmTypes = AlarmTypes;
    }

    /**
     * Get 告警规则是否启用
0-- 禁用 1--启用 
     * @return Status 告警规则是否启用
0-- 禁用 1--启用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 告警规则是否启用
0-- 禁用 1--启用
     * @param Status 告警规则是否启用
0-- 禁用 1--启用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 告警规则配置信息 成功告警无需配置；失败告警可以配置首次失败告警或者所有重试失败告警；超时配置需要配置超时类型及超时阀值；项目波动告警需要配置波动率及防抖周期配置 
     * @return AlarmRuleDetail 告警规则配置信息 成功告警无需配置；失败告警可以配置首次失败告警或者所有重试失败告警；超时配置需要配置超时类型及超时阀值；项目波动告警需要配置波动率及防抖周期配置
     */
    public AlarmRuleDetail getAlarmRuleDetail() {
        return this.AlarmRuleDetail;
    }

    /**
     * Set 告警规则配置信息 成功告警无需配置；失败告警可以配置首次失败告警或者所有重试失败告警；超时配置需要配置超时类型及超时阀值；项目波动告警需要配置波动率及防抖周期配置
     * @param AlarmRuleDetail 告警规则配置信息 成功告警无需配置；失败告警可以配置首次失败告警或者所有重试失败告警；超时配置需要配置超时类型及超时阀值；项目波动告警需要配置波动率及防抖周期配置
     */
    public void setAlarmRuleDetail(AlarmRuleDetail AlarmRuleDetail) {
        this.AlarmRuleDetail = AlarmRuleDetail;
    }

    /**
     * Get 告警级别 1.普通、2.重要、3.紧急 
     * @return AlarmLevel 告警级别 1.普通、2.重要、3.紧急
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 告警级别 1.普通、2.重要、3.紧急
     * @param AlarmLevel 告警级别 1.普通、2.重要、3.紧急
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get 告警规则创建人uid 
     * @return OwnerUin 告警规则创建人uid
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 告警规则创建人uid
     * @param OwnerUin 告警规则创建人uid
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get bundle 客户端绑定的告警规则:  为空是正常的告警规则，不为空则是对应bundle客户端绑定的规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleId bundle 客户端绑定的告警规则:  为空是正常的告警规则，不为空则是对应bundle客户端绑定的规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set bundle 客户端绑定的告警规则:  为空是正常的告警规则，不为空则是对应bundle客户端绑定的规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleId bundle 客户端绑定的告警规则:  为空是正常的告警规则，不为空则是对应bundle客户端绑定的规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get bundleId不为空 则表示绑定的bundle客户端名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleInfo bundleId不为空 则表示绑定的bundle客户端名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set bundleId不为空 则表示绑定的bundle客户端名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleInfo bundleId不为空 则表示绑定的bundle客户端名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    /**
     * Get 告警接收人配置列表 
     * @return AlarmGroups 告警接收人配置列表
     */
    public AlarmGroup [] getAlarmGroups() {
        return this.AlarmGroups;
    }

    /**
     * Set 告警接收人配置列表
     * @param AlarmGroups 告警接收人配置列表
     */
    public void setAlarmGroups(AlarmGroup [] AlarmGroups) {
        this.AlarmGroups = AlarmGroups;
    }

    public AlarmRuleData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmRuleData(AlarmRuleData source) {
        if (source.AlarmRuleId != null) {
            this.AlarmRuleId = new String(source.AlarmRuleId);
        }
        if (source.AlarmRuleName != null) {
            this.AlarmRuleName = new String(source.AlarmRuleName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.MonitorObjectType != null) {
            this.MonitorObjectType = new Long(source.MonitorObjectType);
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AlarmRuleDetail != null) {
            this.AlarmRuleDetail = new AlarmRuleDetail(source.AlarmRuleDetail);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
        if (source.AlarmGroups != null) {
            this.AlarmGroups = new AlarmGroup[source.AlarmGroups.length];
            for (int i = 0; i < source.AlarmGroups.length; i++) {
                this.AlarmGroups[i] = new AlarmGroup(source.AlarmGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmRuleId", this.AlarmRuleId);
        this.setParamSimple(map, prefix + "AlarmRuleName", this.AlarmRuleName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MonitorObjectType", this.MonitorObjectType);
        this.setParamArraySimple(map, prefix + "MonitorObjectIds.", this.MonitorObjectIds);
        this.setParamArraySimple(map, prefix + "AlarmTypes.", this.AlarmTypes);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "AlarmRuleDetail.", this.AlarmRuleDetail);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);
        this.setParamArrayObj(map, prefix + "AlarmGroups.", this.AlarmGroups);

    }
}


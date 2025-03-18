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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Template extends AbstractModel {

    /**
    * 经验库ID
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 经验库标题
    */
    @SerializedName("TemplateTitle")
    @Expose
    private String TemplateTitle;

    /**
    * 经验库描述
    */
    @SerializedName("TemplateDescription")
    @Expose
    private String TemplateDescription;

    /**
    * 自定义标签
    */
    @SerializedName("TemplateTag")
    @Expose
    private String TemplateTag;

    /**
    * 使用状态。1 ---- 使用中，2 --- 停用
    */
    @SerializedName("TemplateIsUsed")
    @Expose
    private Long TemplateIsUsed;

    /**
    * 经验库创建时间
    */
    @SerializedName("TemplateCreateTime")
    @Expose
    private String TemplateCreateTime;

    /**
    * 经验库更新时间
    */
    @SerializedName("TemplateUpdateTime")
    @Expose
    private String TemplateUpdateTime;

    /**
    * 经验库模式。1:手工执行，2:自动执行
    */
    @SerializedName("TemplateMode")
    @Expose
    private Long TemplateMode;

    /**
    * 自动暂停时长。单位分钟
    */
    @SerializedName("TemplatePauseDuration")
    @Expose
    private Long TemplatePauseDuration;

    /**
    * 演练创建者Uin
    */
    @SerializedName("TemplateOwnerUin")
    @Expose
    private String TemplateOwnerUin;

    /**
    * 地域ID
    */
    @SerializedName("TemplateRegionId")
    @Expose
    private Long TemplateRegionId;

    /**
    * 动作组
    */
    @SerializedName("TemplateGroups")
    @Expose
    private TemplateGroup [] TemplateGroups;

    /**
    * 监控指标
    */
    @SerializedName("TemplateMonitors")
    @Expose
    private TemplateMonitor [] TemplateMonitors;

    /**
    * 护栏监控
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplatePolicy")
    @Expose
    private TemplatePolicy TemplatePolicy;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private TagWithDescribe [] Tags;

    /**
    * 经验来源 0-自建 1-专家推荐
    */
    @SerializedName("TemplateSource")
    @Expose
    private Long TemplateSource;

    /**
    * apm应用信息
    */
    @SerializedName("ApmServiceList")
    @Expose
    private ApmServiceInfo [] ApmServiceList;

    /**
    * 告警指标
    */
    @SerializedName("AlarmPolicy")
    @Expose
    private String [] AlarmPolicy;

    /**
    * 护栏处理方式，1--顺序回滚，2--演练暂停
    */
    @SerializedName("PolicyDealType")
    @Expose
    private Long PolicyDealType;

    /**
     * Get 经验库ID 
     * @return TemplateId 经验库ID
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 经验库ID
     * @param TemplateId 经验库ID
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 经验库标题 
     * @return TemplateTitle 经验库标题
     */
    public String getTemplateTitle() {
        return this.TemplateTitle;
    }

    /**
     * Set 经验库标题
     * @param TemplateTitle 经验库标题
     */
    public void setTemplateTitle(String TemplateTitle) {
        this.TemplateTitle = TemplateTitle;
    }

    /**
     * Get 经验库描述 
     * @return TemplateDescription 经验库描述
     */
    public String getTemplateDescription() {
        return this.TemplateDescription;
    }

    /**
     * Set 经验库描述
     * @param TemplateDescription 经验库描述
     */
    public void setTemplateDescription(String TemplateDescription) {
        this.TemplateDescription = TemplateDescription;
    }

    /**
     * Get 自定义标签 
     * @return TemplateTag 自定义标签
     */
    public String getTemplateTag() {
        return this.TemplateTag;
    }

    /**
     * Set 自定义标签
     * @param TemplateTag 自定义标签
     */
    public void setTemplateTag(String TemplateTag) {
        this.TemplateTag = TemplateTag;
    }

    /**
     * Get 使用状态。1 ---- 使用中，2 --- 停用 
     * @return TemplateIsUsed 使用状态。1 ---- 使用中，2 --- 停用
     */
    public Long getTemplateIsUsed() {
        return this.TemplateIsUsed;
    }

    /**
     * Set 使用状态。1 ---- 使用中，2 --- 停用
     * @param TemplateIsUsed 使用状态。1 ---- 使用中，2 --- 停用
     */
    public void setTemplateIsUsed(Long TemplateIsUsed) {
        this.TemplateIsUsed = TemplateIsUsed;
    }

    /**
     * Get 经验库创建时间 
     * @return TemplateCreateTime 经验库创建时间
     */
    public String getTemplateCreateTime() {
        return this.TemplateCreateTime;
    }

    /**
     * Set 经验库创建时间
     * @param TemplateCreateTime 经验库创建时间
     */
    public void setTemplateCreateTime(String TemplateCreateTime) {
        this.TemplateCreateTime = TemplateCreateTime;
    }

    /**
     * Get 经验库更新时间 
     * @return TemplateUpdateTime 经验库更新时间
     */
    public String getTemplateUpdateTime() {
        return this.TemplateUpdateTime;
    }

    /**
     * Set 经验库更新时间
     * @param TemplateUpdateTime 经验库更新时间
     */
    public void setTemplateUpdateTime(String TemplateUpdateTime) {
        this.TemplateUpdateTime = TemplateUpdateTime;
    }

    /**
     * Get 经验库模式。1:手工执行，2:自动执行 
     * @return TemplateMode 经验库模式。1:手工执行，2:自动执行
     */
    public Long getTemplateMode() {
        return this.TemplateMode;
    }

    /**
     * Set 经验库模式。1:手工执行，2:自动执行
     * @param TemplateMode 经验库模式。1:手工执行，2:自动执行
     */
    public void setTemplateMode(Long TemplateMode) {
        this.TemplateMode = TemplateMode;
    }

    /**
     * Get 自动暂停时长。单位分钟 
     * @return TemplatePauseDuration 自动暂停时长。单位分钟
     */
    public Long getTemplatePauseDuration() {
        return this.TemplatePauseDuration;
    }

    /**
     * Set 自动暂停时长。单位分钟
     * @param TemplatePauseDuration 自动暂停时长。单位分钟
     */
    public void setTemplatePauseDuration(Long TemplatePauseDuration) {
        this.TemplatePauseDuration = TemplatePauseDuration;
    }

    /**
     * Get 演练创建者Uin 
     * @return TemplateOwnerUin 演练创建者Uin
     */
    public String getTemplateOwnerUin() {
        return this.TemplateOwnerUin;
    }

    /**
     * Set 演练创建者Uin
     * @param TemplateOwnerUin 演练创建者Uin
     */
    public void setTemplateOwnerUin(String TemplateOwnerUin) {
        this.TemplateOwnerUin = TemplateOwnerUin;
    }

    /**
     * Get 地域ID 
     * @return TemplateRegionId 地域ID
     */
    public Long getTemplateRegionId() {
        return this.TemplateRegionId;
    }

    /**
     * Set 地域ID
     * @param TemplateRegionId 地域ID
     */
    public void setTemplateRegionId(Long TemplateRegionId) {
        this.TemplateRegionId = TemplateRegionId;
    }

    /**
     * Get 动作组 
     * @return TemplateGroups 动作组
     */
    public TemplateGroup [] getTemplateGroups() {
        return this.TemplateGroups;
    }

    /**
     * Set 动作组
     * @param TemplateGroups 动作组
     */
    public void setTemplateGroups(TemplateGroup [] TemplateGroups) {
        this.TemplateGroups = TemplateGroups;
    }

    /**
     * Get 监控指标 
     * @return TemplateMonitors 监控指标
     */
    public TemplateMonitor [] getTemplateMonitors() {
        return this.TemplateMonitors;
    }

    /**
     * Set 监控指标
     * @param TemplateMonitors 监控指标
     */
    public void setTemplateMonitors(TemplateMonitor [] TemplateMonitors) {
        this.TemplateMonitors = TemplateMonitors;
    }

    /**
     * Get 护栏监控
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplatePolicy 护栏监控
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TemplatePolicy getTemplatePolicy() {
        return this.TemplatePolicy;
    }

    /**
     * Set 护栏监控
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplatePolicy 护栏监控
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplatePolicy(TemplatePolicy TemplatePolicy) {
        this.TemplatePolicy = TemplatePolicy;
    }

    /**
     * Get 标签列表 
     * @return Tags 标签列表
     */
    public TagWithDescribe [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
     * @param Tags 标签列表
     */
    public void setTags(TagWithDescribe [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 经验来源 0-自建 1-专家推荐 
     * @return TemplateSource 经验来源 0-自建 1-专家推荐
     */
    public Long getTemplateSource() {
        return this.TemplateSource;
    }

    /**
     * Set 经验来源 0-自建 1-专家推荐
     * @param TemplateSource 经验来源 0-自建 1-专家推荐
     */
    public void setTemplateSource(Long TemplateSource) {
        this.TemplateSource = TemplateSource;
    }

    /**
     * Get apm应用信息 
     * @return ApmServiceList apm应用信息
     */
    public ApmServiceInfo [] getApmServiceList() {
        return this.ApmServiceList;
    }

    /**
     * Set apm应用信息
     * @param ApmServiceList apm应用信息
     */
    public void setApmServiceList(ApmServiceInfo [] ApmServiceList) {
        this.ApmServiceList = ApmServiceList;
    }

    /**
     * Get 告警指标 
     * @return AlarmPolicy 告警指标
     */
    public String [] getAlarmPolicy() {
        return this.AlarmPolicy;
    }

    /**
     * Set 告警指标
     * @param AlarmPolicy 告警指标
     */
    public void setAlarmPolicy(String [] AlarmPolicy) {
        this.AlarmPolicy = AlarmPolicy;
    }

    /**
     * Get 护栏处理方式，1--顺序回滚，2--演练暂停 
     * @return PolicyDealType 护栏处理方式，1--顺序回滚，2--演练暂停
     */
    public Long getPolicyDealType() {
        return this.PolicyDealType;
    }

    /**
     * Set 护栏处理方式，1--顺序回滚，2--演练暂停
     * @param PolicyDealType 护栏处理方式，1--顺序回滚，2--演练暂停
     */
    public void setPolicyDealType(Long PolicyDealType) {
        this.PolicyDealType = PolicyDealType;
    }

    public Template() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Template(Template source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.TemplateTitle != null) {
            this.TemplateTitle = new String(source.TemplateTitle);
        }
        if (source.TemplateDescription != null) {
            this.TemplateDescription = new String(source.TemplateDescription);
        }
        if (source.TemplateTag != null) {
            this.TemplateTag = new String(source.TemplateTag);
        }
        if (source.TemplateIsUsed != null) {
            this.TemplateIsUsed = new Long(source.TemplateIsUsed);
        }
        if (source.TemplateCreateTime != null) {
            this.TemplateCreateTime = new String(source.TemplateCreateTime);
        }
        if (source.TemplateUpdateTime != null) {
            this.TemplateUpdateTime = new String(source.TemplateUpdateTime);
        }
        if (source.TemplateMode != null) {
            this.TemplateMode = new Long(source.TemplateMode);
        }
        if (source.TemplatePauseDuration != null) {
            this.TemplatePauseDuration = new Long(source.TemplatePauseDuration);
        }
        if (source.TemplateOwnerUin != null) {
            this.TemplateOwnerUin = new String(source.TemplateOwnerUin);
        }
        if (source.TemplateRegionId != null) {
            this.TemplateRegionId = new Long(source.TemplateRegionId);
        }
        if (source.TemplateGroups != null) {
            this.TemplateGroups = new TemplateGroup[source.TemplateGroups.length];
            for (int i = 0; i < source.TemplateGroups.length; i++) {
                this.TemplateGroups[i] = new TemplateGroup(source.TemplateGroups[i]);
            }
        }
        if (source.TemplateMonitors != null) {
            this.TemplateMonitors = new TemplateMonitor[source.TemplateMonitors.length];
            for (int i = 0; i < source.TemplateMonitors.length; i++) {
                this.TemplateMonitors[i] = new TemplateMonitor(source.TemplateMonitors[i]);
            }
        }
        if (source.TemplatePolicy != null) {
            this.TemplatePolicy = new TemplatePolicy(source.TemplatePolicy);
        }
        if (source.Tags != null) {
            this.Tags = new TagWithDescribe[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagWithDescribe(source.Tags[i]);
            }
        }
        if (source.TemplateSource != null) {
            this.TemplateSource = new Long(source.TemplateSource);
        }
        if (source.ApmServiceList != null) {
            this.ApmServiceList = new ApmServiceInfo[source.ApmServiceList.length];
            for (int i = 0; i < source.ApmServiceList.length; i++) {
                this.ApmServiceList[i] = new ApmServiceInfo(source.ApmServiceList[i]);
            }
        }
        if (source.AlarmPolicy != null) {
            this.AlarmPolicy = new String[source.AlarmPolicy.length];
            for (int i = 0; i < source.AlarmPolicy.length; i++) {
                this.AlarmPolicy[i] = new String(source.AlarmPolicy[i]);
            }
        }
        if (source.PolicyDealType != null) {
            this.PolicyDealType = new Long(source.PolicyDealType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateTitle", this.TemplateTitle);
        this.setParamSimple(map, prefix + "TemplateDescription", this.TemplateDescription);
        this.setParamSimple(map, prefix + "TemplateTag", this.TemplateTag);
        this.setParamSimple(map, prefix + "TemplateIsUsed", this.TemplateIsUsed);
        this.setParamSimple(map, prefix + "TemplateCreateTime", this.TemplateCreateTime);
        this.setParamSimple(map, prefix + "TemplateUpdateTime", this.TemplateUpdateTime);
        this.setParamSimple(map, prefix + "TemplateMode", this.TemplateMode);
        this.setParamSimple(map, prefix + "TemplatePauseDuration", this.TemplatePauseDuration);
        this.setParamSimple(map, prefix + "TemplateOwnerUin", this.TemplateOwnerUin);
        this.setParamSimple(map, prefix + "TemplateRegionId", this.TemplateRegionId);
        this.setParamArrayObj(map, prefix + "TemplateGroups.", this.TemplateGroups);
        this.setParamArrayObj(map, prefix + "TemplateMonitors.", this.TemplateMonitors);
        this.setParamObj(map, prefix + "TemplatePolicy.", this.TemplatePolicy);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "TemplateSource", this.TemplateSource);
        this.setParamArrayObj(map, prefix + "ApmServiceList.", this.ApmServiceList);
        this.setParamArraySimple(map, prefix + "AlarmPolicy.", this.AlarmPolicy);
        this.setParamSimple(map, prefix + "PolicyDealType", this.PolicyDealType);

    }
}


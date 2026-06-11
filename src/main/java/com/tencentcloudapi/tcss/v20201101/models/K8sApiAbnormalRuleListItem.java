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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class K8sApiAbnormalRuleListItem extends AbstractModel {

    /**
    * 是否全部集群生效。true表示全部集群生效，false表示仅指定集群生效
    */
    @SerializedName("EffectAllCluster")
    @Expose
    private Boolean EffectAllCluster;

    /**
    * 受影响集群总数
    */
    @SerializedName("EffectClusterCount")
    @Expose
    private Long EffectClusterCount;

    /**
    * 编辑账号
    */
    @SerializedName("OprUin")
    @Expose
    private String OprUin;

    /**
    * 规则组中所有执行动作的去重列表。当前黑名单仅包含 RULE_MODE_ALERT（告警）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleActions")
    @Expose
    private String [] RuleActions;

    /**
    * 规则ID
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * 子规则内容列表，从 rule_details JSON 反序列化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleInfoList")
    @Expose
    private K8sApiAbnormalRuleScopeInfo [] RuleInfoList;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则类型
RT_SYSTEM 系统规则
RT_USER 用户自定义
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 是否全部集群生效。true表示全部集群生效，false表示仅指定集群生效 
     * @return EffectAllCluster 是否全部集群生效。true表示全部集群生效，false表示仅指定集群生效
     */
    public Boolean getEffectAllCluster() {
        return this.EffectAllCluster;
    }

    /**
     * Set 是否全部集群生效。true表示全部集群生效，false表示仅指定集群生效
     * @param EffectAllCluster 是否全部集群生效。true表示全部集群生效，false表示仅指定集群生效
     */
    public void setEffectAllCluster(Boolean EffectAllCluster) {
        this.EffectAllCluster = EffectAllCluster;
    }

    /**
     * Get 受影响集群总数 
     * @return EffectClusterCount 受影响集群总数
     */
    public Long getEffectClusterCount() {
        return this.EffectClusterCount;
    }

    /**
     * Set 受影响集群总数
     * @param EffectClusterCount 受影响集群总数
     */
    public void setEffectClusterCount(Long EffectClusterCount) {
        this.EffectClusterCount = EffectClusterCount;
    }

    /**
     * Get 编辑账号 
     * @return OprUin 编辑账号
     */
    public String getOprUin() {
        return this.OprUin;
    }

    /**
     * Set 编辑账号
     * @param OprUin 编辑账号
     */
    public void setOprUin(String OprUin) {
        this.OprUin = OprUin;
    }

    /**
     * Get 规则组中所有执行动作的去重列表。当前黑名单仅包含 RULE_MODE_ALERT（告警）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleActions 规则组中所有执行动作的去重列表。当前黑名单仅包含 RULE_MODE_ALERT（告警）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRuleActions() {
        return this.RuleActions;
    }

    /**
     * Set 规则组中所有执行动作的去重列表。当前黑名单仅包含 RULE_MODE_ALERT（告警）
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleActions 规则组中所有执行动作的去重列表。当前黑名单仅包含 RULE_MODE_ALERT（告警）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleActions(String [] RuleActions) {
        this.RuleActions = RuleActions;
    }

    /**
     * Get 规则ID 
     * @return RuleID 规则ID
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 规则ID
     * @param RuleID 规则ID
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 子规则内容列表，从 rule_details JSON 反序列化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleInfoList 子规则内容列表，从 rule_details JSON 反序列化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public K8sApiAbnormalRuleScopeInfo [] getRuleInfoList() {
        return this.RuleInfoList;
    }

    /**
     * Set 子规则内容列表，从 rule_details JSON 反序列化
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleInfoList 子规则内容列表，从 rule_details JSON 反序列化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleInfoList(K8sApiAbnormalRuleScopeInfo [] RuleInfoList) {
        this.RuleInfoList = RuleInfoList;
    }

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则类型
RT_SYSTEM 系统规则
RT_USER 用户自定义 
     * @return RuleType 规则类型
RT_SYSTEM 系统规则
RT_USER 用户自定义
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型
RT_SYSTEM 系统规则
RT_USER 用户自定义
     * @param RuleType 规则类型
RT_SYSTEM 系统规则
RT_USER 用户自定义
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public K8sApiAbnormalRuleListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8sApiAbnormalRuleListItem(K8sApiAbnormalRuleListItem source) {
        if (source.EffectAllCluster != null) {
            this.EffectAllCluster = new Boolean(source.EffectAllCluster);
        }
        if (source.EffectClusterCount != null) {
            this.EffectClusterCount = new Long(source.EffectClusterCount);
        }
        if (source.OprUin != null) {
            this.OprUin = new String(source.OprUin);
        }
        if (source.RuleActions != null) {
            this.RuleActions = new String[source.RuleActions.length];
            for (int i = 0; i < source.RuleActions.length; i++) {
                this.RuleActions[i] = new String(source.RuleActions[i]);
            }
        }
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.RuleInfoList != null) {
            this.RuleInfoList = new K8sApiAbnormalRuleScopeInfo[source.RuleInfoList.length];
            for (int i = 0; i < source.RuleInfoList.length; i++) {
                this.RuleInfoList[i] = new K8sApiAbnormalRuleScopeInfo(source.RuleInfoList[i]);
            }
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EffectAllCluster", this.EffectAllCluster);
        this.setParamSimple(map, prefix + "EffectClusterCount", this.EffectClusterCount);
        this.setParamSimple(map, prefix + "OprUin", this.OprUin);
        this.setParamArraySimple(map, prefix + "RuleActions.", this.RuleActions);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamArrayObj(map, prefix + "RuleInfoList.", this.RuleInfoList);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}


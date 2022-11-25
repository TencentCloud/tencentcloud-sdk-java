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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class K8sApiAbnormalRuleInfo extends AbstractModel{

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 规则信息列表
    */
    @SerializedName("RuleInfoList")
    @Expose
    private K8sApiAbnormalRuleScopeInfo [] RuleInfoList;

    /**
    * 生效集群IDSet
    */
    @SerializedName("EffectClusterIDSet")
    @Expose
    private String [] EffectClusterIDSet;

    /**
    * 规则类型
RT_SYSTEM 系统规则
RT_USER 用户自定义
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 是否所有集群生效
    */
    @SerializedName("EffectAllCluster")
    @Expose
    private Boolean EffectAllCluster;

    /**
    * 规则ID
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

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
     * Get 规则信息列表 
     * @return RuleInfoList 规则信息列表
     */
    public K8sApiAbnormalRuleScopeInfo [] getRuleInfoList() {
        return this.RuleInfoList;
    }

    /**
     * Set 规则信息列表
     * @param RuleInfoList 规则信息列表
     */
    public void setRuleInfoList(K8sApiAbnormalRuleScopeInfo [] RuleInfoList) {
        this.RuleInfoList = RuleInfoList;
    }

    /**
     * Get 生效集群IDSet 
     * @return EffectClusterIDSet 生效集群IDSet
     */
    public String [] getEffectClusterIDSet() {
        return this.EffectClusterIDSet;
    }

    /**
     * Set 生效集群IDSet
     * @param EffectClusterIDSet 生效集群IDSet
     */
    public void setEffectClusterIDSet(String [] EffectClusterIDSet) {
        this.EffectClusterIDSet = EffectClusterIDSet;
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
     * Get 是否所有集群生效 
     * @return EffectAllCluster 是否所有集群生效
     */
    public Boolean getEffectAllCluster() {
        return this.EffectAllCluster;
    }

    /**
     * Set 是否所有集群生效
     * @param EffectAllCluster 是否所有集群生效
     */
    public void setEffectAllCluster(Boolean EffectAllCluster) {
        this.EffectAllCluster = EffectAllCluster;
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

    public K8sApiAbnormalRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8sApiAbnormalRuleInfo(K8sApiAbnormalRuleInfo source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.RuleInfoList != null) {
            this.RuleInfoList = new K8sApiAbnormalRuleScopeInfo[source.RuleInfoList.length];
            for (int i = 0; i < source.RuleInfoList.length; i++) {
                this.RuleInfoList[i] = new K8sApiAbnormalRuleScopeInfo(source.RuleInfoList[i]);
            }
        }
        if (source.EffectClusterIDSet != null) {
            this.EffectClusterIDSet = new String[source.EffectClusterIDSet.length];
            for (int i = 0; i < source.EffectClusterIDSet.length; i++) {
                this.EffectClusterIDSet[i] = new String(source.EffectClusterIDSet[i]);
            }
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.EffectAllCluster != null) {
            this.EffectAllCluster = new Boolean(source.EffectAllCluster);
        }
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "RuleInfoList.", this.RuleInfoList);
        this.setParamArraySimple(map, prefix + "EffectClusterIDSet.", this.EffectClusterIDSet);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "EffectAllCluster", this.EffectAllCluster);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);

    }
}


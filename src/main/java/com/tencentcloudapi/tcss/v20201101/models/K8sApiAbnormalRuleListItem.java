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

public class K8sApiAbnormalRuleListItem extends AbstractModel{

    /**
    * 规则ID
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

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
    * 受影响集群总数
    */
    @SerializedName("EffectClusterCount")
    @Expose
    private Long EffectClusterCount;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 编辑账号
    */
    @SerializedName("OprUin")
    @Expose
    private String OprUin;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

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

    public K8sApiAbnormalRuleListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8sApiAbnormalRuleListItem(K8sApiAbnormalRuleListItem source) {
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.EffectClusterCount != null) {
            this.EffectClusterCount = new Long(source.EffectClusterCount);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.OprUin != null) {
            this.OprUin = new String(source.OprUin);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "EffectClusterCount", this.EffectClusterCount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OprUin", this.OprUin);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}


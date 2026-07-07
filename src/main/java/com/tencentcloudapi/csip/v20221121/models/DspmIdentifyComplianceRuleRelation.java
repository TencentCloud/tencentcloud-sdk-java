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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmIdentifyComplianceRuleRelation extends AbstractModel {

    /**
    * <p>数据项ID</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>数据项名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>级别ID</p>
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * <p>级别名称</p>
    */
    @SerializedName("LevelName")
    @Expose
    private String LevelName;

    /**
    * <p>级别程度</p><p>单位：分数</p>
    */
    @SerializedName("LevelScore")
    @Expose
    private Long LevelScore;

    /**
    * <p>结构化规则状态</p><p>枚举值：</p><ul><li>0： 未配置</li><li>1： 已配置</li></ul>
    */
    @SerializedName("StructuredStatus")
    @Expose
    private Long StructuredStatus;

    /**
    * <p>非结构化规则状态</p><p>枚举值：</p><ul><li>0： 未配置</li><li>1： 已配置</li></ul>
    */
    @SerializedName("UnStructuredStatus")
    @Expose
    private Long UnStructuredStatus;

    /**
    * <p>数据项开启状态</p><p>枚举值：</p><ul><li>0： 未开启</li><li>1： 已开启</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>数据项ID</p> 
     * @return RuleId <p>数据项ID</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>数据项ID</p>
     * @param RuleId <p>数据项ID</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>数据项名称</p> 
     * @return RuleName <p>数据项名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>数据项名称</p>
     * @param RuleName <p>数据项名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>级别ID</p> 
     * @return LevelId <p>级别ID</p>
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set <p>级别ID</p>
     * @param LevelId <p>级别ID</p>
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get <p>级别名称</p> 
     * @return LevelName <p>级别名称</p>
     */
    public String getLevelName() {
        return this.LevelName;
    }

    /**
     * Set <p>级别名称</p>
     * @param LevelName <p>级别名称</p>
     */
    public void setLevelName(String LevelName) {
        this.LevelName = LevelName;
    }

    /**
     * Get <p>级别程度</p><p>单位：分数</p> 
     * @return LevelScore <p>级别程度</p><p>单位：分数</p>
     */
    public Long getLevelScore() {
        return this.LevelScore;
    }

    /**
     * Set <p>级别程度</p><p>单位：分数</p>
     * @param LevelScore <p>级别程度</p><p>单位：分数</p>
     */
    public void setLevelScore(Long LevelScore) {
        this.LevelScore = LevelScore;
    }

    /**
     * Get <p>结构化规则状态</p><p>枚举值：</p><ul><li>0： 未配置</li><li>1： 已配置</li></ul> 
     * @return StructuredStatus <p>结构化规则状态</p><p>枚举值：</p><ul><li>0： 未配置</li><li>1： 已配置</li></ul>
     */
    public Long getStructuredStatus() {
        return this.StructuredStatus;
    }

    /**
     * Set <p>结构化规则状态</p><p>枚举值：</p><ul><li>0： 未配置</li><li>1： 已配置</li></ul>
     * @param StructuredStatus <p>结构化规则状态</p><p>枚举值：</p><ul><li>0： 未配置</li><li>1： 已配置</li></ul>
     */
    public void setStructuredStatus(Long StructuredStatus) {
        this.StructuredStatus = StructuredStatus;
    }

    /**
     * Get <p>非结构化规则状态</p><p>枚举值：</p><ul><li>0： 未配置</li><li>1： 已配置</li></ul> 
     * @return UnStructuredStatus <p>非结构化规则状态</p><p>枚举值：</p><ul><li>0： 未配置</li><li>1： 已配置</li></ul>
     */
    public Long getUnStructuredStatus() {
        return this.UnStructuredStatus;
    }

    /**
     * Set <p>非结构化规则状态</p><p>枚举值：</p><ul><li>0： 未配置</li><li>1： 已配置</li></ul>
     * @param UnStructuredStatus <p>非结构化规则状态</p><p>枚举值：</p><ul><li>0： 未配置</li><li>1： 已配置</li></ul>
     */
    public void setUnStructuredStatus(Long UnStructuredStatus) {
        this.UnStructuredStatus = UnStructuredStatus;
    }

    /**
     * Get <p>数据项开启状态</p><p>枚举值：</p><ul><li>0： 未开启</li><li>1： 已开启</li></ul> 
     * @return Status <p>数据项开启状态</p><p>枚举值：</p><ul><li>0： 未开启</li><li>1： 已开启</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>数据项开启状态</p><p>枚举值：</p><ul><li>0： 未开启</li><li>1： 已开启</li></ul>
     * @param Status <p>数据项开启状态</p><p>枚举值：</p><ul><li>0： 未开启</li><li>1： 已开启</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public DspmIdentifyComplianceRuleRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyComplianceRuleRelation(DspmIdentifyComplianceRuleRelation source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
        if (source.LevelName != null) {
            this.LevelName = new String(source.LevelName);
        }
        if (source.LevelScore != null) {
            this.LevelScore = new Long(source.LevelScore);
        }
        if (source.StructuredStatus != null) {
            this.StructuredStatus = new Long(source.StructuredStatus);
        }
        if (source.UnStructuredStatus != null) {
            this.UnStructuredStatus = new Long(source.UnStructuredStatus);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);
        this.setParamSimple(map, prefix + "LevelName", this.LevelName);
        this.setParamSimple(map, prefix + "LevelScore", this.LevelScore);
        this.setParamSimple(map, prefix + "StructuredStatus", this.StructuredStatus);
        this.setParamSimple(map, prefix + "UnStructuredStatus", this.UnStructuredStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}


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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLaneRuleRequest extends AbstractModel {

    /**
    * 泳道规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 泳道规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 泳道规则备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 泳道规则标签列表
    */
    @SerializedName("RuleTagList")
    @Expose
    private LaneRuleTag [] RuleTagList;

    /**
    * 泳道规则标签关系
    */
    @SerializedName("RuleTagRelationship")
    @Expose
    private String RuleTagRelationship;

    /**
    * 泳道ID
    */
    @SerializedName("LaneId")
    @Expose
    private String LaneId;

    /**
    * 开启状态
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
     * Get 泳道规则ID 
     * @return RuleId 泳道规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 泳道规则ID
     * @param RuleId 泳道规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 泳道规则名称 
     * @return RuleName 泳道规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 泳道规则名称
     * @param RuleName 泳道规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 泳道规则备注 
     * @return Remark 泳道规则备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 泳道规则备注
     * @param Remark 泳道规则备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 泳道规则标签列表 
     * @return RuleTagList 泳道规则标签列表
     */
    public LaneRuleTag [] getRuleTagList() {
        return this.RuleTagList;
    }

    /**
     * Set 泳道规则标签列表
     * @param RuleTagList 泳道规则标签列表
     */
    public void setRuleTagList(LaneRuleTag [] RuleTagList) {
        this.RuleTagList = RuleTagList;
    }

    /**
     * Get 泳道规则标签关系 
     * @return RuleTagRelationship 泳道规则标签关系
     */
    public String getRuleTagRelationship() {
        return this.RuleTagRelationship;
    }

    /**
     * Set 泳道规则标签关系
     * @param RuleTagRelationship 泳道规则标签关系
     */
    public void setRuleTagRelationship(String RuleTagRelationship) {
        this.RuleTagRelationship = RuleTagRelationship;
    }

    /**
     * Get 泳道ID 
     * @return LaneId 泳道ID
     */
    public String getLaneId() {
        return this.LaneId;
    }

    /**
     * Set 泳道ID
     * @param LaneId 泳道ID
     */
    public void setLaneId(String LaneId) {
        this.LaneId = LaneId;
    }

    /**
     * Get 开启状态 
     * @return Enable 开启状态
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 开启状态
     * @param Enable 开启状态
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    public ModifyLaneRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLaneRuleRequest(ModifyLaneRuleRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.RuleTagList != null) {
            this.RuleTagList = new LaneRuleTag[source.RuleTagList.length];
            for (int i = 0; i < source.RuleTagList.length; i++) {
                this.RuleTagList[i] = new LaneRuleTag(source.RuleTagList[i]);
            }
        }
        if (source.RuleTagRelationship != null) {
            this.RuleTagRelationship = new String(source.RuleTagRelationship);
        }
        if (source.LaneId != null) {
            this.LaneId = new String(source.LaneId);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "RuleTagList.", this.RuleTagList);
        this.setParamSimple(map, prefix + "RuleTagRelationship", this.RuleTagRelationship);
        this.setParamSimple(map, prefix + "LaneId", this.LaneId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}


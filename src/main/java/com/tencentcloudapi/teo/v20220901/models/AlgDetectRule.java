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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlgDetectRule extends AbstractModel{

    /**
    * 规则id。
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * 规则名。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则开关。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 自定义规则。
    */
    @SerializedName("AlgConditions")
    @Expose
    private AclCondition [] AlgConditions;

    /**
    * Cookie校验和会话行为分析。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlgDetectSession")
    @Expose
    private AlgDetectSession AlgDetectSession;

    /**
    * 客户端行为校验。
    */
    @SerializedName("AlgDetectJS")
    @Expose
    private AlgDetectJS [] AlgDetectJS;

    /**
    * 更新时间。仅出参使用。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 规则id。 
     * @return RuleID 规则id。
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 规则id。
     * @param RuleID 规则id。
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 规则名。 
     * @return RuleName 规则名。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名。
     * @param RuleName 规则名。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则开关。 
     * @return Switch 规则开关。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 规则开关。
     * @param Switch 规则开关。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 自定义规则。 
     * @return AlgConditions 自定义规则。
     */
    public AclCondition [] getAlgConditions() {
        return this.AlgConditions;
    }

    /**
     * Set 自定义规则。
     * @param AlgConditions 自定义规则。
     */
    public void setAlgConditions(AclCondition [] AlgConditions) {
        this.AlgConditions = AlgConditions;
    }

    /**
     * Get Cookie校验和会话行为分析。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlgDetectSession Cookie校验和会话行为分析。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlgDetectSession getAlgDetectSession() {
        return this.AlgDetectSession;
    }

    /**
     * Set Cookie校验和会话行为分析。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlgDetectSession Cookie校验和会话行为分析。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlgDetectSession(AlgDetectSession AlgDetectSession) {
        this.AlgDetectSession = AlgDetectSession;
    }

    /**
     * Get 客户端行为校验。 
     * @return AlgDetectJS 客户端行为校验。
     */
    public AlgDetectJS [] getAlgDetectJS() {
        return this.AlgDetectJS;
    }

    /**
     * Set 客户端行为校验。
     * @param AlgDetectJS 客户端行为校验。
     */
    public void setAlgDetectJS(AlgDetectJS [] AlgDetectJS) {
        this.AlgDetectJS = AlgDetectJS;
    }

    /**
     * Get 更新时间。仅出参使用。 
     * @return UpdateTime 更新时间。仅出参使用。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。仅出参使用。
     * @param UpdateTime 更新时间。仅出参使用。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AlgDetectRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlgDetectRule(AlgDetectRule source) {
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.AlgConditions != null) {
            this.AlgConditions = new AclCondition[source.AlgConditions.length];
            for (int i = 0; i < source.AlgConditions.length; i++) {
                this.AlgConditions[i] = new AclCondition(source.AlgConditions[i]);
            }
        }
        if (source.AlgDetectSession != null) {
            this.AlgDetectSession = new AlgDetectSession(source.AlgDetectSession);
        }
        if (source.AlgDetectJS != null) {
            this.AlgDetectJS = new AlgDetectJS[source.AlgDetectJS.length];
            for (int i = 0; i < source.AlgDetectJS.length; i++) {
                this.AlgDetectJS[i] = new AlgDetectJS(source.AlgDetectJS[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "AlgConditions.", this.AlgConditions);
        this.setParamObj(map, prefix + "AlgDetectSession.", this.AlgDetectSession);
        this.setParamArrayObj(map, prefix + "AlgDetectJS.", this.AlgDetectJS);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}


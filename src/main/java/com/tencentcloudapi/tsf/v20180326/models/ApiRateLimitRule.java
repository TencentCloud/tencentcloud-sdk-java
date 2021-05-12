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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiRateLimitRule extends AbstractModel{

    /**
    * rule Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * API ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * 限流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 最大限流qps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxQps")
    @Expose
    private Long MaxQps;

    /**
    * 生效/禁用, enabled/disabled
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsableStatus")
    @Expose
    private String UsableStatus;

    /**
    * 规则内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleContent")
    @Expose
    private String RuleContent;

    /**
    * Tsf Rule ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TsfRuleId")
    @Expose
    private String TsfRuleId;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
     * Get rule Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId rule Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set rule Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId rule Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get API ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiId API ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiId API ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get 限流名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName 限流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 限流名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName 限流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 最大限流qps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxQps 最大限流qps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxQps() {
        return this.MaxQps;
    }

    /**
     * Set 最大限流qps
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxQps 最大限流qps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxQps(Long MaxQps) {
        this.MaxQps = MaxQps;
    }

    /**
     * Get 生效/禁用, enabled/disabled
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsableStatus 生效/禁用, enabled/disabled
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsableStatus() {
        return this.UsableStatus;
    }

    /**
     * Set 生效/禁用, enabled/disabled
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsableStatus 生效/禁用, enabled/disabled
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsableStatus(String UsableStatus) {
        this.UsableStatus = UsableStatus;
    }

    /**
     * Get 规则内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleContent 规则内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleContent() {
        return this.RuleContent;
    }

    /**
     * Set 规则内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleContent 规则内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleContent(String RuleContent) {
        this.RuleContent = RuleContent;
    }

    /**
     * Get Tsf Rule ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TsfRuleId Tsf Rule ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTsfRuleId() {
        return this.TsfRuleId;
    }

    /**
     * Set Tsf Rule ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TsfRuleId Tsf Rule ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTsfRuleId(String TsfRuleId) {
        this.TsfRuleId = TsfRuleId;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    public ApiRateLimitRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiRateLimitRule(ApiRateLimitRule source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.MaxQps != null) {
            this.MaxQps = new Long(source.MaxQps);
        }
        if (source.UsableStatus != null) {
            this.UsableStatus = new String(source.UsableStatus);
        }
        if (source.RuleContent != null) {
            this.RuleContent = new String(source.RuleContent);
        }
        if (source.TsfRuleId != null) {
            this.TsfRuleId = new String(source.TsfRuleId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "MaxQps", this.MaxQps);
        this.setParamSimple(map, prefix + "UsableStatus", this.UsableStatus);
        this.setParamSimple(map, prefix + "RuleContent", this.RuleContent);
        this.setParamSimple(map, prefix + "TsfRuleId", this.TsfRuleId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);

    }
}


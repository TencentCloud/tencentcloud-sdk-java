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

public class ApiRateLimitRule extends AbstractModel {

    /**
    * <p>rule Id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>API ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * <p>限流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>最大限流qps</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxQps")
    @Expose
    private Long MaxQps;

    /**
    * <p>生效/禁用, enabled/disabled</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsableStatus")
    @Expose
    private String UsableStatus;

    /**
    * <p>规则内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleContent")
    @Expose
    private String RuleContent;

    /**
    * <p>Tsf Rule ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TsfRuleId")
    @Expose
    private String TsfRuleId;

    /**
    * <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * <p>分页参数limit</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页参数offset</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>旧格式 method 与 path 分开，新格式 path-Method,如 /checkToken-GET，默认为新格式</p>
    */
    @SerializedName("UsePathAndMethodFormat")
    @Expose
    private Boolean UsePathAndMethodFormat;

    /**
     * Get <p>rule Id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId <p>rule Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>rule Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId <p>rule Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>API ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiId <p>API ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set <p>API ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiId <p>API ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get <p>限流名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName <p>限流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>限流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName <p>限流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>最大限流qps</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxQps <p>最大限流qps</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxQps() {
        return this.MaxQps;
    }

    /**
     * Set <p>最大限流qps</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxQps <p>最大限流qps</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxQps(Long MaxQps) {
        this.MaxQps = MaxQps;
    }

    /**
     * Get <p>生效/禁用, enabled/disabled</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsableStatus <p>生效/禁用, enabled/disabled</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsableStatus() {
        return this.UsableStatus;
    }

    /**
     * Set <p>生效/禁用, enabled/disabled</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsableStatus <p>生效/禁用, enabled/disabled</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsableStatus(String UsableStatus) {
        this.UsableStatus = UsableStatus;
    }

    /**
     * Get <p>规则内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleContent <p>规则内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleContent() {
        return this.RuleContent;
    }

    /**
     * Set <p>规则内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleContent <p>规则内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleContent(String RuleContent) {
        this.RuleContent = RuleContent;
    }

    /**
     * Get <p>Tsf Rule ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TsfRuleId <p>Tsf Rule ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTsfRuleId() {
        return this.TsfRuleId;
    }

    /**
     * Set <p>Tsf Rule ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TsfRuleId <p>Tsf Rule ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTsfRuleId(String TsfRuleId) {
        this.TsfRuleId = TsfRuleId;
    }

    /**
     * Get <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get <p>分页参数limit</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Limit <p>分页参数limit</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页参数limit</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Limit <p>分页参数limit</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页参数offset</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Offset <p>分页参数offset</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页参数offset</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Offset <p>分页参数offset</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>AppId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>旧格式 method 与 path 分开，新格式 path-Method,如 /checkToken-GET，默认为新格式</p> 
     * @return UsePathAndMethodFormat <p>旧格式 method 与 path 分开，新格式 path-Method,如 /checkToken-GET，默认为新格式</p>
     */
    public Boolean getUsePathAndMethodFormat() {
        return this.UsePathAndMethodFormat;
    }

    /**
     * Set <p>旧格式 method 与 path 分开，新格式 path-Method,如 /checkToken-GET，默认为新格式</p>
     * @param UsePathAndMethodFormat <p>旧格式 method 与 path 分开，新格式 path-Method,如 /checkToken-GET，默认为新格式</p>
     */
    public void setUsePathAndMethodFormat(Boolean UsePathAndMethodFormat) {
        this.UsePathAndMethodFormat = UsePathAndMethodFormat;
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
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.UsePathAndMethodFormat != null) {
            this.UsePathAndMethodFormat = new Boolean(source.UsePathAndMethodFormat);
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "UsePathAndMethodFormat", this.UsePathAndMethodFormat);

    }
}


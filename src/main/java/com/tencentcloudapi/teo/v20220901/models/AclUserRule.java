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

public class AclUserRule extends AbstractModel{

    /**
    * 规则名。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 处罚动作，取值有：
<li>trans：放行；</li>
<li>drop：拦截；</li>
<li>monitor：观察；</li>
<li>ban：IP封禁；</li>
<li>redirect：重定向；</li>
<li>page：指定页面；</li>
<li>alg：Javascript挑战。</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 规则状态，取值有：
<li>on：生效；</li>
<li>off：失效。</li>
    */
    @SerializedName("RuleStatus")
    @Expose
    private String RuleStatus;

    /**
    * 自定义规则。
    */
    @SerializedName("AclConditions")
    @Expose
    private AclCondition [] AclConditions;

    /**
    * 规则优先级，取值范围0-100。
    */
    @SerializedName("RulePriority")
    @Expose
    private Long RulePriority;

    /**
    * 规则Id。仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * 更新时间。仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * ip封禁的惩罚时间，取值范围0-2天。默认为0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PunishTime")
    @Expose
    private Long PunishTime;

    /**
    * ip封禁的惩罚时间单位，取值有：
<li>second：秒；</li>
<li>minutes：分；</li>
<li>hour：小时。</li>默认为second。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PunishTimeUnit")
    @Expose
    private String PunishTimeUnit;

    /**
    * 自定义返回页面的名称。默认为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 自定义返回页面的实例id。默认为0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageId")
    @Expose
    private Long PageId;

    /**
    * 重定向时候的地址，必须为本用户接入的站点子域名。默认为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
    * 重定向时候的返回码。默认为0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseCode")
    @Expose
    private Long ResponseCode;

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
     * Get 处罚动作，取值有：
<li>trans：放行；</li>
<li>drop：拦截；</li>
<li>monitor：观察；</li>
<li>ban：IP封禁；</li>
<li>redirect：重定向；</li>
<li>page：指定页面；</li>
<li>alg：Javascript挑战。</li> 
     * @return Action 处罚动作，取值有：
<li>trans：放行；</li>
<li>drop：拦截；</li>
<li>monitor：观察；</li>
<li>ban：IP封禁；</li>
<li>redirect：重定向；</li>
<li>page：指定页面；</li>
<li>alg：Javascript挑战。</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 处罚动作，取值有：
<li>trans：放行；</li>
<li>drop：拦截；</li>
<li>monitor：观察；</li>
<li>ban：IP封禁；</li>
<li>redirect：重定向；</li>
<li>page：指定页面；</li>
<li>alg：Javascript挑战。</li>
     * @param Action 处罚动作，取值有：
<li>trans：放行；</li>
<li>drop：拦截；</li>
<li>monitor：观察；</li>
<li>ban：IP封禁；</li>
<li>redirect：重定向；</li>
<li>page：指定页面；</li>
<li>alg：Javascript挑战。</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 规则状态，取值有：
<li>on：生效；</li>
<li>off：失效。</li> 
     * @return RuleStatus 规则状态，取值有：
<li>on：生效；</li>
<li>off：失效。</li>
     */
    public String getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set 规则状态，取值有：
<li>on：生效；</li>
<li>off：失效。</li>
     * @param RuleStatus 规则状态，取值有：
<li>on：生效；</li>
<li>off：失效。</li>
     */
    public void setRuleStatus(String RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get 自定义规则。 
     * @return AclConditions 自定义规则。
     */
    public AclCondition [] getAclConditions() {
        return this.AclConditions;
    }

    /**
     * Set 自定义规则。
     * @param AclConditions 自定义规则。
     */
    public void setAclConditions(AclCondition [] AclConditions) {
        this.AclConditions = AclConditions;
    }

    /**
     * Get 规则优先级，取值范围0-100。 
     * @return RulePriority 规则优先级，取值范围0-100。
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set 规则优先级，取值范围0-100。
     * @param RulePriority 规则优先级，取值范围0-100。
     */
    public void setRulePriority(Long RulePriority) {
        this.RulePriority = RulePriority;
    }

    /**
     * Get 规则Id。仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleID 规则Id。仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 规则Id。仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleID 规则Id。仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 更新时间。仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间。仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间。仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get ip封禁的惩罚时间，取值范围0-2天。默认为0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PunishTime ip封禁的惩罚时间，取值范围0-2天。默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPunishTime() {
        return this.PunishTime;
    }

    /**
     * Set ip封禁的惩罚时间，取值范围0-2天。默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PunishTime ip封禁的惩罚时间，取值范围0-2天。默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPunishTime(Long PunishTime) {
        this.PunishTime = PunishTime;
    }

    /**
     * Get ip封禁的惩罚时间单位，取值有：
<li>second：秒；</li>
<li>minutes：分；</li>
<li>hour：小时。</li>默认为second。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PunishTimeUnit ip封禁的惩罚时间单位，取值有：
<li>second：秒；</li>
<li>minutes：分；</li>
<li>hour：小时。</li>默认为second。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPunishTimeUnit() {
        return this.PunishTimeUnit;
    }

    /**
     * Set ip封禁的惩罚时间单位，取值有：
<li>second：秒；</li>
<li>minutes：分；</li>
<li>hour：小时。</li>默认为second。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PunishTimeUnit ip封禁的惩罚时间单位，取值有：
<li>second：秒；</li>
<li>minutes：分；</li>
<li>hour：小时。</li>默认为second。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPunishTimeUnit(String PunishTimeUnit) {
        this.PunishTimeUnit = PunishTimeUnit;
    }

    /**
     * Get 自定义返回页面的名称。默认为空字符串。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 自定义返回页面的名称。默认为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义返回页面的名称。默认为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 自定义返回页面的名称。默认为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 自定义返回页面的实例id。默认为0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageId 自定义返回页面的实例id。默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageId() {
        return this.PageId;
    }

    /**
     * Set 自定义返回页面的实例id。默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageId 自定义返回页面的实例id。默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageId(Long PageId) {
        this.PageId = PageId;
    }

    /**
     * Get 重定向时候的地址，必须为本用户接入的站点子域名。默认为空字符串。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedirectUrl 重定向时候的地址，必须为本用户接入的站点子域名。默认为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set 重定向时候的地址，必须为本用户接入的站点子域名。默认为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedirectUrl 重定向时候的地址，必须为本用户接入的站点子域名。默认为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Get 重定向时候的返回码。默认为0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseCode 重定向时候的返回码。默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResponseCode() {
        return this.ResponseCode;
    }

    /**
     * Set 重定向时候的返回码。默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseCode 重定向时候的返回码。默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseCode(Long ResponseCode) {
        this.ResponseCode = ResponseCode;
    }

    public AclUserRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AclUserRule(AclUserRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RuleStatus != null) {
            this.RuleStatus = new String(source.RuleStatus);
        }
        if (source.AclConditions != null) {
            this.AclConditions = new AclCondition[source.AclConditions.length];
            for (int i = 0; i < source.AclConditions.length; i++) {
                this.AclConditions[i] = new AclCondition(source.AclConditions[i]);
            }
        }
        if (source.RulePriority != null) {
            this.RulePriority = new Long(source.RulePriority);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.PunishTime != null) {
            this.PunishTime = new Long(source.PunishTime);
        }
        if (source.PunishTimeUnit != null) {
            this.PunishTimeUnit = new String(source.PunishTimeUnit);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PageId != null) {
            this.PageId = new Long(source.PageId);
        }
        if (source.RedirectUrl != null) {
            this.RedirectUrl = new String(source.RedirectUrl);
        }
        if (source.ResponseCode != null) {
            this.ResponseCode = new Long(source.ResponseCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamArrayObj(map, prefix + "AclConditions.", this.AclConditions);
        this.setParamSimple(map, prefix + "RulePriority", this.RulePriority);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "PunishTime", this.PunishTime);
        this.setParamSimple(map, prefix + "PunishTimeUnit", this.PunishTimeUnit);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);
        this.setParamSimple(map, prefix + "ResponseCode", this.ResponseCode);

    }
}


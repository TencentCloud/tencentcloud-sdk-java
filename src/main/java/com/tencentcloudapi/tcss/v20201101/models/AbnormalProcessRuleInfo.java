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

public class AbnormalProcessRuleInfo extends AbstractModel{

    /**
    * true:策略启用，false:策略禁用
    */
    @SerializedName("IsEnable")
    @Expose
    private Boolean IsEnable;

    /**
    * 生效镜像id，空数组代表全部镜像
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * 用户策略的子策略数组
    */
    @SerializedName("ChildRules")
    @Expose
    private AbnormalProcessChildRuleInfo [] ChildRules;

    /**
    * 策略名字
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 策略id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 系统策略的子策略数组
    */
    @SerializedName("SystemChildRules")
    @Expose
    private AbnormalProcessSystemChildRuleInfo [] SystemChildRules;

    /**
    * 是否是系统默认策略
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
     * Get true:策略启用，false:策略禁用 
     * @return IsEnable true:策略启用，false:策略禁用
     */
    public Boolean getIsEnable() {
        return this.IsEnable;
    }

    /**
     * Set true:策略启用，false:策略禁用
     * @param IsEnable true:策略启用，false:策略禁用
     */
    public void setIsEnable(Boolean IsEnable) {
        this.IsEnable = IsEnable;
    }

    /**
     * Get 生效镜像id，空数组代表全部镜像 
     * @return ImageIds 生效镜像id，空数组代表全部镜像
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set 生效镜像id，空数组代表全部镜像
     * @param ImageIds 生效镜像id，空数组代表全部镜像
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get 用户策略的子策略数组 
     * @return ChildRules 用户策略的子策略数组
     */
    public AbnormalProcessChildRuleInfo [] getChildRules() {
        return this.ChildRules;
    }

    /**
     * Set 用户策略的子策略数组
     * @param ChildRules 用户策略的子策略数组
     */
    public void setChildRules(AbnormalProcessChildRuleInfo [] ChildRules) {
        this.ChildRules = ChildRules;
    }

    /**
     * Get 策略名字 
     * @return RuleName 策略名字
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 策略名字
     * @param RuleName 策略名字
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 策略id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 策略id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 策略id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 策略id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 系统策略的子策略数组 
     * @return SystemChildRules 系统策略的子策略数组
     */
    public AbnormalProcessSystemChildRuleInfo [] getSystemChildRules() {
        return this.SystemChildRules;
    }

    /**
     * Set 系统策略的子策略数组
     * @param SystemChildRules 系统策略的子策略数组
     */
    public void setSystemChildRules(AbnormalProcessSystemChildRuleInfo [] SystemChildRules) {
        this.SystemChildRules = SystemChildRules;
    }

    /**
     * Get 是否是系统默认策略 
     * @return IsDefault 是否是系统默认策略
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否是系统默认策略
     * @param IsDefault 是否是系统默认策略
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    public AbnormalProcessRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbnormalProcessRuleInfo(AbnormalProcessRuleInfo source) {
        if (source.IsEnable != null) {
            this.IsEnable = new Boolean(source.IsEnable);
        }
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.ChildRules != null) {
            this.ChildRules = new AbnormalProcessChildRuleInfo[source.ChildRules.length];
            for (int i = 0; i < source.ChildRules.length; i++) {
                this.ChildRules[i] = new AbnormalProcessChildRuleInfo(source.ChildRules[i]);
            }
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.SystemChildRules != null) {
            this.SystemChildRules = new AbnormalProcessSystemChildRuleInfo[source.SystemChildRules.length];
            for (int i = 0; i < source.SystemChildRules.length; i++) {
                this.SystemChildRules[i] = new AbnormalProcessSystemChildRuleInfo(source.SystemChildRules[i]);
            }
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsEnable", this.IsEnable);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamArrayObj(map, prefix + "ChildRules.", this.ChildRules);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "SystemChildRules.", this.SystemChildRules);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}

